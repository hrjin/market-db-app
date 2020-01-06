package org.paasta.sample.app.entity.mysql;

import lombok.Data;

import java.util.Date;

//@Entity
//@Table(name = "sample")
@Data
public class MysqlSample {

    private long id;

    private String name;

    private String email;

    private Date created;

}
