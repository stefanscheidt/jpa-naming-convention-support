package orderentry.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;

public class DataSourceInitializer implements InitializingBean {

    private DataSource dataSource;

    private Resource script;

    public DataSourceInitializer() {
        System.out.println("Hello!");
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setScript(Resource script) {
        this.script = script;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello!");
    }

}
