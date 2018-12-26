package cn.blackboss.eureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 新建项目选择 cloud discovery ==》 eureka server
 *
 * cap定理 最多只能实现2点
 * c 一致性  分布式数据在任何时刻保持一致   zookeeper
 * a 可用性  流量猛增的情况下也能保持服务，并且在能接受的范围内 eureka
 * p 分区容错  一个节点挂了，也不意向对外提供服务  必须满足
 * 注册中心  维护已经注册的服务列表
 * 1 心跳检测每个服务的状态，类似于ping每一个服务
 * 2 对集群服务响应时，检索可用的服务（即能ping通的）列表，
 *   通过负载均衡策略选取其中一个服务ip及端口给调用方
 *
 * 3 添加注解 @EnableEurekaServer 成为注册中心
 * 4 修改配置文件 application.yml
 *
 * 5 配置文件完成后，即可启动当前应用，浏览器访问 IP+端口（localhost:8761）
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}

}

