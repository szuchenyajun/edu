package cn.szu.edu.controller;

import cn.szu.edu.bean.Teacher;
import cn.szu.edu.service.TeacherService;
import cn.szu.edu.utils.R;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author yajun
 * @Date 2022/8/2
 * @Version 1.0
 */
@RequestMapping("/teacher")
@RestController
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @GetMapping("/list/{pageNum}/{pageSize}")
    public R listTeacher(@PathVariable Integer pageNum,
                         @PathVariable Integer pageSize){
        //List<Teacher> list = teacherService.list();
        //int i = 1/0;
        IPage<Teacher> list = teacherService.listWithPage(pageNum, pageSize);
        return R.ok().data("data",list);
    }
    @DeleteMapping("/{id}")
    public R deleteTeacher(@PathVariable String id){
        boolean res = teacherService.removeById(id);
        if(res){
            return R.ok();
        }
        return R.error();
    }

    @PostMapping("/save")
    public R save(@RequestBody Teacher teacher){
        teacherService.save(teacher);
        return R.ok();
    }

    @GetMapping("/{id}")
    public R listOne(@PathVariable String id){
        Teacher teacher = teacherService.getById(id);
        return R.ok().data("data",teacher);
    }

    @PutMapping("/{id}")
    public R update(@PathVariable String id,
                    @RequestBody Teacher teacher){
        teacher.setId(id);
        teacherService.updateById(teacher);
        return R.ok();
    }
}
