/**
 * 
 */
package com.ebiz.platform.base.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

public abstract class PlatformBaseDAOImpl extends BaseDAOImpl {

    @Autowired
    @Qualifier("platformSqlMapClientTemplate")
    private SqlMapClientTemplate sqlMapClientTemplate;

    protected SqlMapClientTemplate getSqlMapClientTemplate() {
        return this.sqlMapClientTemplate;
    }
}
