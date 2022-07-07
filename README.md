# springboot2

### 介绍
2022暑假 对springboot2进行一个全面学习

视频讲解：https://www.bilibili.com/video/BV15b4y1a7yG?p=1&vd_source=9a47b26e060b09ee3b6edc173c4809ea

代码保存在Code文件夹下

pdf等其他资料之后上传在飞书链接中



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

代码：

对Springboot + Mybatis + MP + Druid进行整合开发

+ 导入对应的starter
+ 配置对应的设置或采用默认配置

视频：p31-p32

