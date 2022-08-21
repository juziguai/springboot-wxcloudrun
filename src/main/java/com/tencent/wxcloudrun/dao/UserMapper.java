package com.tencent.wxcloudrun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tencent.wxcloudrun.model.UserPO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserPO> {
}
