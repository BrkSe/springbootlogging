package com.burakkutbay.springbootlogging.service;

import com.burakkutbay.springbootlogging.model.Ogrenci;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Hasan Burak KUTBAY on 11/7/20.
 */
@Service
public class OgrenciService {
    private static final Logger logger = LoggerFactory.getLogger(OgrenciService.class);
    public List<Ogrenci> getOgrenci(){
        logger.info("getOgrenci() çalıştı.");
        return Arrays.asList(new Ogrenci(1, "burak"),new Ogrenci(2, "Ali"));
    }
}
