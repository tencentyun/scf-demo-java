# 腾讯云scf java demo

在根目录运行
```
mvn package
```
上传target文件夹中scf-demo-java-1.0-SNAPSHOT.jar包。

配置执行方法如下，即可测试4个trigger。

```
ckafka: example.Ckafka::mainHandler
cmq: example.Cmq::mainHandler
cos: example.Cos::mainHandler
http: example.Http::mainHandler
```
