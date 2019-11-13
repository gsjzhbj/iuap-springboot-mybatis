package com.example.comtroller;

import com.example.model.Stu;
import com.example.service.StuService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class StuController {


    @Autowired
    private StuService stuService;

    @GetMapping("/findAll")
    public List<Stu> findAll() {

        return stuService.findAll();
    }

    @GetMapping("/selectByExample")
    public List<Stu> selectByExample() {
        return stuService.selectByExample();
    }

    @GetMapping("/selectByExampleWithPage")
    public PageInfo<Stu> selectByExampleWithPage(int pageNum, int pageSize) {
        return stuService.selectByExampleWithPage(pageNum, pageSize);
    }

    /**
     * 测试修改，并且使用restful风格
     *
     * @param id
     * @param address
     * @return
     */
    @PutMapping("/modify/{id}")
    public int modify(@PathVariable("id") int id, @RequestParam("address") String address) {
        return stuService.modify(id, address);
    }

    @GetMapping("/save")
    public int save() {
        return stuService.save();
    }

}
