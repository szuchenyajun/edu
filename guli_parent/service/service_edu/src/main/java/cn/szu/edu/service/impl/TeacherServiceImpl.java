package cn.szu.edu.service.impl;

import cn.szu.edu.utils.R;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.szu.edu.bean.Teacher;
import cn.szu.edu.service.TeacherService;
import cn.szu.edu.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

/**
* @author yajun
* @description 针对表【edu_teacher(讲师)】的数据库操作Service实现
* @createDate 2022-08-01 22:33:18
*/
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService{

    @Override
    public IPage<Teacher> listWithPage(Integer pageNum, Integer pageSize) {
        IPage<Teacher> page = new Page<Teacher>(pageNum, pageSize);
        IPage<Teacher> teacherPage = baseMapper.selectPage(page, null);

        return teacherPage;
    }
}




