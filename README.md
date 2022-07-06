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



### 3 SpringBoot基础配置

添加springboot web项目模版工程：springboot_xx_xxx

视频讲解







