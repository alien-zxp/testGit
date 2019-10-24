package com.ruoyi.project.module.projectPrice.service;

import java.util.List;

import com.ruoyi.project.module.projectPrice.domain.ProjectPrice;
import com.ruoyi.project.module.projectPrice.mapper.ProjectPriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.support.Convert;

/**
 * 项目资金 服务层实现
 * 
 * @author ruoyi
 * @date 2019-01-24
 */
@Service
public class ProjectPriceServiceImpl implements IProjectPriceService 
{
	@Autowired
	private ProjectPriceMapper projectPriceMapper;

	/**
     * 查询项目资金信息
     * 
     * @param ppId 项目资金ID
     * @return 项目资金信息
     */
    @Override
	public ProjectPrice selectProjectPriceById(String ppId)
	{
	    return projectPriceMapper.selectProjectPriceById(ppId);
	}
	
	/**
     * 查询项目资金列表
     * 
     * @param projectPrice 项目资金信息
     * @return 项目资金集合
     */
	@Override
	public List<ProjectPrice> selectProjectPriceList(ProjectPrice projectPrice)
	{
	    return projectPriceMapper.selectProjectPriceList(projectPrice);
	}
	
    /**
     * 新增项目资金
     * 
     * @param projectPrice 项目资金信息
     * @return 结果
     */
	@Override
	public int insertProjectPrice(ProjectPrice projectPrice)
	{
	    return projectPriceMapper.insertProjectPrice(projectPrice);
	}
	
	/**
     * 修改项目资金
     * 
     * @param projectPrice 项目资金信息
     * @return 结果
     */
	@Override
	public int updateProjectPrice(ProjectPrice projectPrice)
	{
	    return projectPriceMapper.updateProjectPrice(projectPrice);
	}

	/**
     * 删除项目资金对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteProjectPriceByIds(String ids)
	{
		return projectPriceMapper.deleteProjectPriceByIds(Convert.toStrArray(ids));
	}
	
}
