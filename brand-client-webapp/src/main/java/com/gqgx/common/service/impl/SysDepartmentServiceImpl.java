package com.gqgx.common.service.impl;

import com.gqgx.common.criteria.Criteria;
import com.gqgx.common.entity.SysDepartment;
import com.gqgx.common.mapper.SysDepartmentMapper;
import com.gqgx.common.paging.PagingResult;
import com.gqgx.common.service.SysDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class SysDepartmentServiceImpl implements SysDepartmentService {

    @Autowired
    protected SysDepartmentMapper sysDepartmentDAO;

    @Override
    public SysDepartment getSysDepartment(Long id) {
        return null;
    }

    @Override
    public int saveSysDepartment(SysDepartment sysDepartment) {
        return 0;
    }

    @Override
    public int deleteSysDepartment(SysDepartment sysDepartment) {
        return 0;
    }

    @Override
    public int deleteSysDepartmentByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysDepartment> findSysDepartment(Criteria criteria) {
        return null;
    }

    @Override
    public boolean isExsitDepartment(SysDepartment sysDepartment) {
        return false;
    }

    @Override
    public int addOrUpdateDepartment(SysDepartment sysDepartment) {
        return 0;
    }

    @Override
    public List<SysDepartment> listAll(Long companyId) {
        return null;
    }

    @Override
    public List<SysDepartment> findDepartmentStaff(Long companyId, Long parentId) {
        return null;
    }

    @Override
    public Map<String, Object> findByMaxLevelAndSeq(SysDepartment sysDepartment) {
        return null;
    }

    @Override
    public SysDepartment getSysDepartMentByParam(String paramName, String paramValue, Long companyId) {
        return null;
    }

    @Override
    public SysDepartment findDepartmentById(Long id) {
        return null;
    }

    @Override
    public List<SysDepartment> findDepartmentById(Long id, boolean needChild) {
        return null;
    }

    @Override
    public List<Long> findSonDepartment(Long departmentId) {
        return null;
    }

    @Override
    public SysDepartment getBranchDepartmentId(Long userId) {
        return null;
    }

    @Override
    public List<SysDepartment> departmentList() {
        return null;
    }
}