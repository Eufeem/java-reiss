package com.feem.reiss.model;

import org.springframework.data.domain.Pageable;

public class RolePageable {

    private String param;
    private Pageable pageable;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }
}
