package com.prs.dps.service;


import java.util.List;

/**
 * Created by ffulauh on 2016/6/4.
 */
public interface IPoetService {
    List<String> getPoetById(Integer id) throws Exception;
}
