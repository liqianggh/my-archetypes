#SpringBoot-MyBatis模板
  默认序列化命名策略是CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES，端口8080，支持jar和war两种启动方式。整合swagger接口文档插件，让交互更加方便；配置文件加密，防止账户泄露。
# 整合的依赖

* 日志打印
* 配置文件加密
* lombok
## swagger
接口文档生成插件，注意**生产环境请勿暴露**接口文件，权限认证可根据配置选择，默认是存在http请求header中的Authentication值。配置详情见SwaggerConfig。
 
默认访问路径：http://localhost:8080/demo/swagger-ui.html

生效环境： dev


# 项目启动
Tomcat | JavaSE两种方式
端口：8080
默认访问路径：
    Tomcat启动：http://localhost:8080/demo_war/system/status
    JavaSE启动：http://localhost:8080/demo/system/status
