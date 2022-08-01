package cn.szu.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.szu.edu.bean.Video;
import cn.szu.edu.service.VideoService;
import cn.szu.edu.mapper.VideoMapper;
import org.springframework.stereotype.Service;

/**
* @author yajun
* @description 针对表【edu_video(课程视频)】的数据库操作Service实现
* @createDate 2022-08-01 22:33:22
*/
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video>
    implements VideoService{

}




