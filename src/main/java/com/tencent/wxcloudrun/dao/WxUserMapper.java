package com.tencent.wxcloudrun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tencent.wxcloudrun.model.WxUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WxUserMapper extends BaseMapper<WxUser> {

}
