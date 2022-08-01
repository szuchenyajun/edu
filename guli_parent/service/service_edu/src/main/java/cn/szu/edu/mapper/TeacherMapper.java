package cn.szu.edu.mapper;

import cn.szu.edu.bean.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yajun
* @description 针对表【edu_teacher(讲师)】的数据库操作Mapper
* @createDate 2022-08-01 22:33:18
* @Entity cn.szu.edu.dao.Teacher
*/
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

}




