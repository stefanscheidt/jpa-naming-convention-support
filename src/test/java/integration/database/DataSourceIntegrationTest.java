package integration.database;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class DataSourceIntegrationTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void dataSource_notNull() throws Exception {
        assertNotNull(dataSource);
    }

    @Test
    public void select() throws Exception {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        assertEquals(0, jdbcTemplate.queryForList("select 1 from categories", Integer.class).size());
    }
}
