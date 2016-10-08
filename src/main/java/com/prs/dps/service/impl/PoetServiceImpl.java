package com.prs.dps.service.impl;

import com.prs.dps.dao.IPoetDao;
import com.prs.dps.domain.Poet;
import com.prs.dps.service.IPoetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ffulauh on 2016/6/4.
 */
@Service("poetService")
public class PoetServiceImpl implements IPoetService {
    @Autowired
    IPoetDao poetDao;
    public List<String> getPoetById(Integer id) throws Exception {
        return poetDao.getPoetById(1);
    }
}
