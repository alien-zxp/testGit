package com.ruoyi.project.module.projectPrice.controller;

import java.util.List;

import com.ruoyi.project.module.projectPrice.domain.ProjectPrice;
import com.ruoyi.project.module.projectPrice.service.IProjectPriceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 项目资金 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-01-24
 */
@Controller
@RequestMapping("/system/projectPrice")
public class ProjectPriceController extends BaseController
{
    private String prefix = "module/projectPrice";
	
	@Autowired
	private IProjectPriceService projectPriceService;
	
	@RequiresPermissions("system:projectPrice:view")
	@GetMapping()
	public String projectPrice()
	{
	    return prefix + "/projectPrice";
	}
	
	/**
	 * 查询项目资金列表
	 */
	@RequiresPermissions("system:projectPrice:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(ProjectPrice projectPrice)
	{
		startPage();
        List<ProjectPrice> list = projectPriceService.selectProjectPriceList(projectPrice);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出项目资金列表
	 */
	@RequiresPermissions("system:projectPrice:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProjectPrice projectPrice)
    {
    	List<ProjectPrice> list = projectPriceService.selectProjectPriceList(projectPrice);
        ExcelUtil<ProjectPrice> util = new ExcelUtil<ProjectPrice>(ProjectPrice.class);
        return util.exportExcel(list, "projectPrice");
    }
	
	/**
	 * 新增项目资金
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存项目资金
	 */
	@RequiresPermissions("system:projectPrice:add")
	@Log(title = "项目资金", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(ProjectPrice projectPrice)
	{		
		return toAjax(projectPriceService.insertProjectPrice(projectPrice));
	}

	/**
	 * 修改项目资金
	 */
	@GetMapping("/edit/{ppId}")
	public String edit(@PathVariable("ppId") String ppId, ModelMap mmap)
	{
		ProjectPrice projectPrice = projectPriceService.selectProjectPriceById(ppId);
		mmap.put("projectPrice", projectPrice);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存项目资金
	 */
	@RequiresPermissions("system:projectPrice:edit")
	@Log(title = "项目资金", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(ProjectPrice projectPrice)
	{		
		return toAjax(projectPriceService.updateProjectPrice(projectPrice));
	}
	
	/**
	 * 删除项目资金
	 */
	@RequiresPermissions("system:projectPrice:remove")
	@Log(title = "项目资金", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(projectPriceService.deleteProjectPriceByIds(ids));
	}
	
}
