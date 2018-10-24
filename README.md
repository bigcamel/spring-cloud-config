# spring-cloud-config-demo

以post方式访问 配置中心,配置中心会通过 bus 通知 各个客户端更新配置
curl -X POST  http://localhost:8888/bus/refresh?destination=**

以post 方式访问 客户端  ,客户端会主动去 配置中心拉去配置,更新到本地
curl -X POST http://localhost:7031/refresh



