package com.prs.dps.domain;

import java.util.Date;

/**
 * Created by ffulauh on 2016/6/4.
 */
public class Muse {
    private Long id;
    private User user;
    private String message;
    private Date postedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
