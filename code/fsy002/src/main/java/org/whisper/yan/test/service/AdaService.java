package org.whisper.yan.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.whisper.yan.test.dao.AdaJpaRepository;
import org.whisper.yan.test.entity.Ada;

/**
 * Created by yjw on 2017/1/12.
 */
@Service
public class AdaService {

    @Autowired
    AdaJpaRepository adaJpaRepository;

    public void saveAda(Ada ada) {
        adaJpaRepository.save(ada);
    }

    public Ada getAda() {
        String name = "我是谁";
        Ada firstAda = adaJpaRepository.findFirstAdaByName(name);
        return firstAda;
    }




}
