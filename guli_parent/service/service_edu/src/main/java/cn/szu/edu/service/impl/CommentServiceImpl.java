package cn.szu.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.szu.edu.bean.Comment;
import cn.szu.edu.service.CommentService;
import cn.szu.edu.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author yajun
* @description 针对表【edu_comment(评论)】的数据库操作Service实现
* @createDate 2022-08-01 22:32:53
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




