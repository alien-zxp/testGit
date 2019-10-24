package com.ruoyi.project.module.projectPrice.mapper;

import com.ruoyi.project.module.projectPrice.domain.ProjectPrice;
import java.util.List;

/**
 * 项目资金 数据层
 * 
 * @author ruoyi
 * @date 2019-01-24
 */
public interface ProjectPriceMapper 
{
	/**
     * 查询项目资金信息
     * 
     * @param ppId 项目资金ID
     * @return 项目资金信息
     */
	public ProjectPrice selectProjectPriceById(String ppId);
	
	/**
     * 查询项目资金列表
     * 
     * @param projectPrice 项目资金信息
     * @return 项目资金集合
     */
	public List<ProjectPrice> selectProjectPriceList(ProjectPrice projectPrice);
	
	/**
     * 新增项目资金
     * 
     * @param projectPrice 项目资金信息
     * @return 结果
     */
	public int insertProjectPrice(ProjectPrice projectPrice);
	
	/**
     * 修改项目资金
     * 
     * @param projectPrice 项目资金信息
     * @return 结果
     */
	public int updateProjectPrice(ProjectPrice projectPrice);
	
	/**
     * 删除项目资金
     * 
     * @param ppId 项目资金ID
     * @return 结果
     */
	public int deleteProjectPriceById(String ppId);
	
	/**
     * 批量删除项目资金
     * 
     * @param ppIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteProjectPriceByIds(String[] ppIds);
	
}