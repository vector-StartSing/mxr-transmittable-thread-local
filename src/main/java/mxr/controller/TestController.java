package mxr.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mxr.utils.R;
import mxr.utils.ttl.TTLExecutorFactory;
import mxr.utils.ttl.TtlContextHolderUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName TestController
 * @description: TODO
 * @author YuanJie
 * @date 2025/6/5 14:36
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    @GetMapping("/")
    public R test(){
        ExecutorService ttlExecutor = TTLExecutorFactory.getSharedTtlExecutor();

        log.info("========验证ttl工厂多线程传值(父传子)==========");
        TtlContextHolderUtil.getContext().addProperty("k","v");
        CompletableFuture<Object> t1 = CompletableFuture.supplyAsync(() -> {
            Object k = TtlContextHolderUtil.getContext().getProperty("k");
            log.info("子线程1结果: k -> {}", k);
            return k;
        }, ttlExecutor);

        CompletableFuture<Object> t2 = CompletableFuture.supplyAsync(() -> {
            Object k = TtlContextHolderUtil.getContext().getProperty("k");
            log.info("子线程2结果: k -> {}", k);
            return k;
        }, ttlExecutor);
        log.info("========验证常规线程传值(forkjoinPool 异常)==========");
        CompletableFuture<Object> t3 = CompletableFuture.supplyAsync(() -> {
            Object k = TtlContextHolderUtil.getContext().getProperty("k");
            log.info("子线程3结果: k -> {}", k);
            return k;
        });
        log.info("========验证常规线程传值(定长线程池 异常)==========");
        ExecutorService commonExecutor = Executors.newFixedThreadPool(2);
        CompletableFuture<Object> t4 = CompletableFuture.supplyAsync(() -> {
            Object k = TtlContextHolderUtil.getContext().getProperty("k");
            log.info("子线程4结果: k -> {}", k);
            return k;
        }, commonExecutor);
        try {
            CompletableFuture.allOf(t1,t2,t3,t4).get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            log.error("t3,t4抛出异常",e);
        }
        return R.okResult();
    }

}
