# cors
跨域问题，后台的解决办法：
一： @CrossOrigin(value = "http://localhost:8081") 不加（）中的value="http://localhost:8081"也可以，
    此种方法许在每一个请求方法上加@CrossOrigin
二：书写配置类MyWebMVCConfig类 implements WebMvcConfigurer 中 addCorsMapping(CorsRegistry registry) 方法。

  具体代码如下：

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //所有请求都允许跨域
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8081")
                //allowedMethods表示允许通过的请求数
                .allowedMethods("*")
                //allowedHeaders则表示允许的请求头
                .allowedHeaders("*");
    }
