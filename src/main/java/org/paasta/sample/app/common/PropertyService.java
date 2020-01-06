package org.paasta.sample.app.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author hrjin
 * @version 1.0
 * @since 2019-12-18
 */
@Service
@Data
public class PropertyService {

    @Value("${datasource.dataType}")
    private String dataType;

    @Value("${datasource.hostname}")
    private String hostname;

    @Value("${datasource.db-name}")
    private String dbName;

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.port}")
    private String port;

}
