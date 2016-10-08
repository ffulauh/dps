package com.prs.dps.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ffulauh on 2016/6/4.
 */
@Repository("poetDao")
public interface IPoetDao {
    List<String> getPoetById(Integer id) throws Exception;
}
