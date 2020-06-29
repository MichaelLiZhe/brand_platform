package com.gqgx.common.mapper;

import com.gqgx.common.entity.SysUser;
import tk.mybatis.mapper.common.Mapper;

public interface SysUserMapper extends Mapper<SysUser> {

    SysUser findUserByAccountName(String accountName);

    int deleteByIds(Long[] ids);
}