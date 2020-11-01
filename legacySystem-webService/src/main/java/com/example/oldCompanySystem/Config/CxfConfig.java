package com.example.oldCompanySystem.Config;


import com.example.oldCompanySystem.bl.*;
import com.example.oldCompanySystem.blImpl.*;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

@Configuration
@EnableAutoConfiguration
public class CxfConfig {

    @Bean
    public ServletRegistrationBean createServletRegistrationBean() {

        return new ServletRegistrationBean(new CXFServlet(), "/ws/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    OrderPort orderPort(){return new OrderPortImpl();}
    @Bean
    PersonnelPort personnelPort(){return new PersonnelPortImpl();
    }
    @Bean
    AttendancePort attendancePort(){return new AttendancePortImpl();
    }
    @Bean
    ErpPort erpPort(){return new ErpPortImpl();}

    @Bean
    BOMPort bomPort(){return new BOMPortImpl();
    }

    @Bean(name = "orderPortEndpoint")
    public Endpoint endpoint1() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), orderPort());
        endpoint.publish("/order");
        return endpoint;
    }

    @Bean(name = "personnelPortEndpoint")
    public Endpoint endpoint2() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), personnelPort());
        endpoint.publish("/personnel");
        return endpoint;
    }

    @Bean(name = "attendancePortEndpoint")
    public Endpoint endpoint3() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), attendancePort());
        endpoint.publish("/attendance");
        return endpoint;
    }

    @Bean(name = "erpPortEndpoint")
    public Endpoint endpoint4() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), erpPort());
        endpoint.publish("/erp");
        return endpoint;
    }

    @Bean(name = "bomPortEndpoint")
    public Endpoint endpoint5() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new EndpointImpl(springBus(), bomPort());
        endpoint.publish("/bom");
        return endpoint;
    }
}
