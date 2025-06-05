package mxr.interceptor;

import lombok.extern.slf4j.Slf4j;
import mxr.utils.ttl.TtlContextHolderUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求线程拦截器
 * <p>
 * 自动管理请求线程的标记和清除，确保TTL上下文能正确识别请求线程
 * </p>
 */
@Slf4j
@Component
public class RequestThreadInterceptor implements HandlerInterceptor {

    /**
     * 在请求处理之前执行，标记当前线程为请求线程
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // 标记当前线程为请求线程
        TtlContextHolderUtil.markAsRequestThread();
        log.debug("已标记线程 [{}] 为请求线程", Thread.currentThread().getName());
        return true;
    }

    /**
     * 在请求完成后执行，清除请求线程标记
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // 清除请求线程标记
        TtlContextHolderUtil.clearRequestThreadMark();
        log.debug("已清除线程 [{}] 的请求线程标记", Thread.currentThread().getName());
    }
}
