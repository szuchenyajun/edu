package cn.szu.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.szu.edu.bean.Subject;
import cn.szu.edu.service.SubjectService;
import cn.szu.edu.mapper.SubjectMapper;
import org.springframework.stereotype.Service;

/**
* @author yajun
* @description 针对表【edu_subject(课程科目)】的数据库操作Service实现
* @createDate 2022-08-01 22:33:13
*/
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject>
    implements SubjectService{

}




