package cn.szu.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.szu.edu.bean.CourseDescription;
import cn.szu.edu.service.CourseDescriptionService;
import cn.szu.edu.mapper.CourseDescriptionMapper;
import org.springframework.stereotype.Service;

/**
* @author yajun
* @description 针对表【edu_course_description(课程简介)】的数据库操作Service实现
* @createDate 2022-08-01 22:33:09
*/
@Service
public class CourseDescriptionServiceImpl extends ServiceImpl<CourseDescriptionMapper, CourseDescription>
    implements CourseDescriptionService{

}




