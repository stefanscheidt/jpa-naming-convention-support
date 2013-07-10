package jpa.namingsupport;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AliasNamingStrategyTest {

    @Test
    @Ignore
    public void columnName_givenAlias_retunsColumnNamePrefixedWithAlias() {
        AliasNamingStrategy aliasNamingStrategy = new AliasNamingStrategy();
        String alias = "alias";
        String columnName = "column";
        assertThat(aliasNamingStrategy.columnName(columnName), is(alias + "_" + columnName));
    }

}
