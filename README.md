# cloud

#### 项目介绍
spring cloud Demo
基于 spring cloud Finchley.SR1版本 --> 支持spring boot 2.0+

#### 软件架构
1. java 1.8
2. gradle 4.8+
3. spring boot 2.0.5
4. spring cloud Finchley.SR1版本


#### 安装教程

注：eureka server 使用公益的server：http://eureka.springcloud.cn/eureka/

#### 模块说明
1. client1 ：业务服务
2. client2 ：业务服务
3. gateway ：网关服务
4. config  ：配置中心

#### 使用说明

由于使用公益注册中心。  
先启动业务服务（顺序不分先后），最后启动网管服务  
使用配置中心后注意配置文件application.yml和bootstrap.yml，必须使用bootstrap.yml配置,否则找不到注册中心  
优先级 bootstrap.yml > application.yml 查看：[配置文件 application.yml和 bootstrap.yml区别](http://https://www.cnblogs.com/BlogNetSpace/p/8469033.html)  


#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


#### 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)