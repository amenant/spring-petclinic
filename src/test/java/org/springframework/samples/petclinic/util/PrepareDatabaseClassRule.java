package org.springframework.samples.petclinic.util;

import org.junit.rules.ExternalResource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.jdbc.JdbcTestUtils;

import javax.sql.DataSource;

/**
 * Created by han on 20/7/16.
 */
public class PrepareDatabaseClassRule extends ExternalResource {

    private static final String INIT_DB_SCRIPT = "db/hsqldb/initDB.sql";
    private static final String POPULATE_DB_SCRIPT = "db/hsqldb/populateDB.sql";

    JdbcTemplate jdbcTemplate = jdbcTemplate();

    @Override
    protected void after() {

    }

    @Override
    protected void before() throws Throwable {
        JdbcTestUtils.executeSqlScript(jdbcTemplate, new ClassPathResource(INIT_DB_SCRIPT), false);
        JdbcTestUtils.executeSqlScript(jdbcTemplate, new ClassPathResource(POPULATE_DB_SCRIPT), false);
    }

    public DataSource dataSource() {

        return DataSourceBuilder
                .create()
                .username("sa")
                .password("")
                .url("jdbc:hsqldb:mem:petclinic")
                .driverClassName("org.hsqldb.jdbcDriver")
                .build();

    }

    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

}
