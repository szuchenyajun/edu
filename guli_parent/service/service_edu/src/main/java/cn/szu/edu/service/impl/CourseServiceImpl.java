package cn.szu.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.szu.edu.bean.Course;
import cn.szu.edu.service.CourseService;
import cn.szu.edu.mapper.CourseMapper;
import org.springframework.stereotype.Service;

/**
* @author yajun
* @description 针对表【edu_course(课程)】的数据库操作Service实现
* @createDate 2022-08-01 22:33:00
*/
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course>
    implements CourseService{

}




