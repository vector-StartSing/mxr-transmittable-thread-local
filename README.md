# mxr-transmittable-thread-local

## 项目简介
`mxr-transmittable-thread-local` 是一个基于 `TransmittableThreadLocal` 的线程上下文管理工具库，封装了线程池的创建和上下文传递功能。它主要用于解决多线程环境下线程上下文无法正确传递的问题，确保在异步任务中能够正确获取和传递线程上下文数据。

## 技术栈
- **核心依赖**：`TransmittableThreadLocal`（阿里巴巴开源库）
- **框架支持**：Spring Boot
- **线程池管理**：`TtlExecutors`（TransmittableThreadLocal 提供的线程池包装工具）

## 功能模块
1. **线程上下文管理**：
   - 提供线程上下文的存储、传递和清除功能。
   - 支持父子线程间的上下文透传。
2. **线程池封装**：
   - 提供固定大小线程池、缓存线程池和调度线程池的创建方法。
   - 自动包装线程池以支持上下文传递。
3. **请求线程拦截器**：
   - 自动标记和清除请求线程，确保上下文在请求生命周期内有效。
4. **工具类**：
   - `TtlContextHolderUtil`：线程上下文管理工具类。
   - `TTLExecutorFactory`：线程池工厂类。

## 快速开始

### 环境准备
- JDK 8+~21
- Maven 3.x

