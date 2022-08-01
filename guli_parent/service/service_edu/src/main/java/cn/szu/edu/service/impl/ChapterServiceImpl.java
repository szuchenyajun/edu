package cn.szu.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.szu.edu.bean.Chapter;
import cn.szu.edu.service.ChapterService;
import cn.szu.edu.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

/**
* @author yajun
* @description 针对表【edu_chapter(课程)】的数据库操作Service实现
* @createDate 2022-08-01 22:32:33
*/
@Service
public class ChapterServiceImpl extends ServiceImpl<ChapterMapper, Chapter>
    implements ChapterService{

}




