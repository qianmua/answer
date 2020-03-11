package pres.hjc.entitymanage.config.driud;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2020/3/10
 * Time: 15:43
 * To change this template use File | Settings | File Templates.
 */
public class DruidConfig {

    @ConfigurationProperties( prefix = "spring.datasource")
    @Bean
    public DataSource druidSource(){
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");

        HashMap<String,String> initPram = new HashMap<>();

        initPram.put("loginUsername","hjc");
        initPram.put("loginPassword","123");

        initPram.put("allow","");

        bean.setInitParameters(initPram);

        return bean;
    }

    /**
     * 过滤器
     * @return
     */
    //filter
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();

        bean.setFilter(new WebStatFilter());

        Map<String,String> initPart = new HashMap<>();

        initPart.put("exclusions","*.js,*.css,*.jpeg");

        bean.setInitParameters(initPart);
        return bean;
    }
}
