# springboot2

## 介绍
2022暑假 对springboot2进行一个全面学习

主页：https://gitee.com/tianjiangyu/springboot2

b站视频讲解：https://www.bilibili.com/video/BV15b4y1a7yG?p=1&vd_source=9a47b26e060b09ee3b6edc173c4809ea

视频相关源代码地址 springboot2/resource/code ：[code](https://gitee.com/tianjiangyu/springboot2/tree/master/resource/code)

视频相关pdf讲义地址 springboot2/resource/*.pdf ：[resource](https://gitee.com/tianjiangyu/springboot2/tree/master/resource)

我的学习记录 springboot2/code ：[code](https://gitee.com/tianjiangyu/springboot2/tree/master/code)



## 1 - 基础篇

**讲义地址：**[SpringBoot基础版.pdf](https://gitee.com/tianjiangyu/springboot2/blob/master/resource/SpringBoot基础版.pdf)

### 1 springboot_01_01_quickstart

代码：https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_01_01_quickstart

spirngboot的入门应用搭建案例 - springboot用来简化Spring应用的**初始搭建**以及**开发过程**

视频讲解：p1-p11

**原理知识：**

+ p8 ：parent的springboot中起到的作用，负责依赖管理，减少依赖冲突。
+ p9 ：starter在springboot中起到的作用，减少依赖配置。

+ P10 : 引导类@SpringBootApplication，Boot工程的执行入口，负责初始化Spring容器并加载Bean。
+ p11:辅助功能，内嵌的Tomcat服务器功能讲解。



### 2 知识加油站 - RESTful知识讲解

视频讲解：p12-p14

原理知识：

+ p12 ：什么是Rest风格，隐藏了访问行为，使用访问资源时的**行为动作**对**资源操作**进行区分。

常用的行为动作：GET、POST、PUT、DELETE

+ p13 : 案例讲解 设置 RequestMapping(value = "users",method = ...) 以及

   函数中的参数@PathVariable Interger id 、@RequestBody User user

+ p14 Restful在开发中的不足和注意事项

控制器注解：@RestController = @Controller + @RequestBody 作用：设置当前控制器为RestFul开发风格

方法注解：@GetMapping @PostMapping @PutMapping @DeleteMapping



### 3 springboot_02_base_configuration

添加springboot web项目模版工程：springboot_xx_xxx

代码：https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_02_base_configuration

主要讲解Spring配置文件相关内容,推荐用**yml**配置springboot。需要掌握的关键点：

+ yml文件的配置格式
+ @Value + ${value}获取字段
+ @Autowired 自动注入
+ @Component + @ConfigurationProperties(prefix = "datasource")

视频讲解：p12 - p25



### 4 springboot_04_junit

代码：https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_04_junit

主要对springBoot和junit之间的技术整合进行了讲解，注意引导类和测试类的包含关系

视频：p26-p27



### 5 springboot_05_mybatis

代码：https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_05_mybatis

对SpringBoot以及mybatis的整合进行讲解

+ 使用@Mapper对实现接口进行扫描
+ 使用@Select编写sql语句
+ @Autowerid进行自动注入

视频：p28-p29



### 6 springboot_06_mybatis_plus

代码:https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_06_mybatis_plus

对SpringBoot以及mybatis-plus的整合开发

+ 手工添加Mybatis-Plus对应的Starter
+ 数据层接口使用BaseMapper简化开发

视频：p30



### 7 springboot_07_druid

代码：https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_07_druid

对Springboot + Mybatis + MP + Druid进行整合开发

+ 导入对应的starter
+ 配置对应的设置或采用默认配置

视频：p31



### 8 springboot_08_ssmp

代码：https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_08_ssmp

**可以将Vue作为补充内容进行学习，打算之后写自己的网页**

SSMP进行整合案例开发 - 可以看作是springboot应用的一个简单小例子

包括内容：

+ 前后端交互协议 + RestFul + PostMan

+ 后端springboot：实体类 + DAO + Service  + Controller 相关开发
+ 前端VUE+ElementUI：页面数据处理 + 页面消息处理
+ 项目异常处理

视频：p32-p50 基础篇结束



## 2 - 运维实用篇

**讲义地址：**[SpringBoot运维实用篇.pdf](https://gitee.com/tianjiangyu/springboot2/blob/master/resource/SpringBoot运维实用篇.pdf)

视频P54-p57:

+ 了解Maven的打包和运行原理
+ 如何在Windows和linex上分别部署服务器

视频p57-p58:

+ 如何在部署项目\idea编程时更换一个访问端口：--server.port

视频P59-p60:

+ 配置文件4级分类
+ 自定义配置文件

视频：p61-p65:

+ springboot多环境开发

视频：p66-p69:

+ 日志输出控制管理



## 3 - 开发实用篇

讲义地址：[SpringBoot开发实用篇.pptx](https://gitee.com/tianjiangyu/springboot2/blob/master/resource/SpringBoot开发实用篇.pptx)

### 3.1 热部署

代码：[springboot_12_hot_deploy](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_12_hot_deploy)

讲解了什么是热部署以及如何在IDEA中启动热部署

+ 手动启动热部署
+ 自动启动热部署
+ 热部署范围配置
+ 关闭热部署

视频：p70 - p73



### 3.2 配置高级

代码：[springboot_13_configuration](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_13_configuration)

讲解springboot2中存在的高级配置操作

+ ConfigurationProperties
+ 宽松绑定/松散绑定
+ 常用计量单位绑定
+ 数据校验

视频：p74-p78



### 3.3 测试

代码：[springboot_14_test](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_14_test)

测试属性、配置以及Web环境下的测试应用

+ 加载测试专用属性
+ 加载测试专用配置
+ Web环境模拟测试
+ 数据层测试回滚
+ 测试用例数据设定

视频：p79-p88



### 3.4 数据层解决方案

SQL - 关系型数据库； 

+ 数据源配置 HIkari
+ 持久化技术 JdbcTemplate
+ 数据库 H2

视频：p89 - p91

NOSQL：Redis,Mongo,ES 相关技术整合，有需要的时候再进行学习

视频：p92 - p106



### 3.5 整合第三方技术

模块分为缓存、任务、邮件、消息

**1 缓存：**

spirngboot提供了缓存技术 让程序变得高效，方便缓存使用

+ @EnableCaching
+ @Cacheable(value="cacheSpace",key="#id")

代码：[springboot_19_cache](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot)

+ EHcache + Redis + memcached+j2chache
+ JetCache：对spring cache进行了封装，在原有功能上实现了多级缓存、缓存统计、自动刷新、异步调用、数据报表。

JetCache代码：[springboot_20_jetcache](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_20_jetcache)

+ J2Cache是一个缓存整合框架，可以提供缓存的整合方案，使各种缓存搭配使用，自身不提供缓存功能。

J2Cache代码：[springboot_21_j2cache](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_21_j2cache)

视频讲解：p107-120 讲解了各种cache的使用方法，根据以后项目中的应用自行深入学习



**2 任务：**

定时任务是企业级应用中的常见操作，例如年度报表、缓存统计报告等

常见的定时任务技术：Quartz、Spring Task

代码：[springboot_22_task](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_22_task)

视频讲解：p121-p122



**3 邮件：**

springboot可以整合JavaMail，如SMTP、POP3、IMAP

代码：[springboot_23_mail](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_23_mail)

视频讲解：p119-p120



**4 消息：**

三种异步消息传递技术：JMS、AMQP、MQTT、KafKa（消息处理，高吞吐量分布式技术）

+ ActiveMQ
+ RabbitMQ
+ RocketMQ
+ Kafka

代码：[springboot_24_mq](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_24_mq)

视频讲解：p125-p135



### 3.6 监控

以后需要的时候再来继续学习...

+ 监控的意义
+ 可视化监控平台
+ 监控原理
+ 自定义监控指标

视频讲解：p136-142



## 4 - 原理篇

+ 看着讲义 + 视频进行学习
+ 讲义地址：[SpringBoot原理篇.pdf](https://gitee.com/tianjiangyu/springboot2/blob/master/resource/SpringBoot原理篇.pdf)



### 4.1 Bean加载方式

对于配置中Bean的配置原理和配置过程（xml + 注解），讲解了8种不同的Bean配置原理。

代码：[springboot_27_bean_init](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_27_bean_init)

视频：p143-p152



### 4.2 Bean加载控制

如何根据条件控制Bean的加载过程 @Conditional...。

代码：[springboot_28_bean_load](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_28_bean_load)

视频：p153-p154



### 4.3 Bean依赖属性配置

属性依赖配置指的是 ： 使用外部配置文件给Bean进行配置.

+ **@ConfigurationProperties**(prefix = "cartoon") + yml配置文件
+ **@EnableConfigurationProperties**(CartoonProperties.class) + class + yml配置文件

代码：[springboot_29_bean_properties](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/springboot_29_bean_properties)

视频：p155



### 4.4 自动配置原理

是对于自动配置的原理讲解和实际使用方法。

+ 自动配置原理
+ SpringBootApplication注解讲解
+ 如何使用之前讲过的注解方法 去理解SpringBoot的初始化自动配置过程

视频：p156-p159



### 4.5 变更自动配置

+ 自定义自动配置 META-INF/spring.factories
+ 控制SpringBoot内置自动配置类加载
+ 通过注解@EnableAutoConfiguration属性排除自动配置项

视频：p160



### 4.6 自定义Starter

+ 案例：统计独立Ip访问次数
+ 自定义starter
+ 辅助功能开发(设置定时任务 + 灵活配置控制 + **自动配置加载**)
+ 提取并使用自定义属性值（p165）
+ 拦截器开发（可用）
+ yml自动提示构建（json文件）

代码：[ip_spring_boot_starter](https://gitee.com/tianjiangyu/springboot2/tree/master/code/springboot/ip_spring_boot_starter)

修改springboot_08_ssmp,使用自动配置加载业务功能,切记使用之前先clean后install安装到maven仓库，确保资源更新.

视频：p161 - p167



### 4.7 核心原理 - Springboot程序启动流程

主要是对Springboot程序启动流程，跟着源码 + 断点的过程逐步分析底层原理。

+ Springboot启动流程
+ 容器类型选择
+ 监听器

视频：p168-p174
