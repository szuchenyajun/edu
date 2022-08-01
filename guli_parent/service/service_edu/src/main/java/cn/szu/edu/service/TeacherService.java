package cn.szu.edu.service;

import cn.szu.edu.bean.Teacher;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author yajun
* @description 针对表【edu_teacher(讲师)】的数据库操作Service
* @createDate 2022-08-01 22:33:18
*/
public interface TeacherService extends IService<Teacher> {

    IPage<Teacher> listWithPage(Integer pageNum, Integer pageSize);
}
