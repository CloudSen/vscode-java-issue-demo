# demo-service 项目骨架

该骨架基于 `${serviceName}` 服务名、`${productName}` 产品名生成五个模块：client、model、biz、boot、plugins，并预置 Kubernetes 与文档目录结构。

## 快速开始
1. 授予脚本执行权限 `chmod +x mvnw`
2. 初始化项目环境 `make install VERSION=${revision:-nightly-SNAPSHOT}`
3. 按需调整 `k8s/` 与 `docs/` 内容

## 模块说明
- `${serviceName}-client`：面向外部的接口契约与 Feign 客户端
- `${serviceName}-model`：核心业务数据结构（DTO/VO/Entity 等）
- `${serviceName}-biz`：业务实现、仓储层与多语言资源
- `${serviceName}-boot`：应用启动入口与多环境配置
- `${serviceName}-plugins`：低开平台插件扩展

## 常用命令
- `./mvnw clean package -DskipTests`
- `make format`
- `make deploy VERSION=${revision:-nightly-SNAPSHOT}`
