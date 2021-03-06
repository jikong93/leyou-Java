package com.ly.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;


import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by HXin on 2019/4/3.
 */
@Table(name="tb_spec_group")
@Data
public class SpecGroup {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private Long cid;
    private String name;
}
