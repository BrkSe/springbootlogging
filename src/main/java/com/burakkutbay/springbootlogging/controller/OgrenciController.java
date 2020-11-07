package com.burakkutbay.springbootlogging.controller;

import com.burakkutbay.springbootlogging.model.Ogrenci;
import com.burakkutbay.springbootlogging.service.OgrenciService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Hasan Burak KUTBAY on 11/7/20.
 */
@RestController
public class OgrenciController {

    private static final Logger logger = LoggerFactory.getLogger(OgrenciController.class);

    @Autowired
    private OgrenciService ogrenciService;

    @GetMapping("/ogrenciList")
    public List<Ogrenci> getOgrenci() {
        logger.info("inside OgrenciController.getOgrenci() çalıştı.");
        return ogrenciService.getOgrenci();
    }
}
