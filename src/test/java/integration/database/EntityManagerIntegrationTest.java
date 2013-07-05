package integration.database;

import integration.BaseSpringContextTests;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class EntityManagerIntegrationTest extends BaseSpringContextTests {

    @Test
    public void entityManager_notNull() throws Exception {
        assertNotNull(entityManager);
    }

}
