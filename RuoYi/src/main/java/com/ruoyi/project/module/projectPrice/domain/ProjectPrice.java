package com.ruoyi.project.module.projectPrice.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 项目资金表 fm_project_price
 * 
 * @author ruoyi
 * @date 2019-01-24
 */
public class ProjectPrice extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键编号 */
	private String ppId;
	/** *资金名称 */
	private String ppProjectName;
	/** *资金文号(省) */
	private String ppNo;
	/** *资金文号(县) */
	private String ppNoX;
	/** *资金性质 */
	private String ppNature;
	/** *资金类别 */
	private String ppPriceType;
	/** *资金级别 */
	private String ppPriceClass;
	/** *资金金额(万元) */
	private BigDecimal ppPrice;
	/** 已挂接(万元)-实际到了实施单位的金额 */
	private BigDecimal ppUsePrice;
	/** 剩余(万元) */
	private BigDecimal ppSurplusPrice;
	/** 行政区划(省) */
	private String ppProvinceId;
	/** 行政区划(市) */
	private String ppCityId;
	/** 行政区划(区) */
	private String ppZoneId;
	/** 资金用途 */
	private String ppPurpose;
	/** 资金状态(1、待拨付2、拨付中3、拨付完) */
	private String ppPriceState;
	/** 到位时间 */
	private Date ppInPlaceTime;
	/** 限定使用时间 */
	private Date ppUseTime;
	/** 是否可用(1、否0、是) */
	private Integer ppIsUse;
	/** 是否删除(1 可用   -100已删除) */
	private Integer ppIsDel;
	/** 录入人 */
	private String ppPerson;
	/** 创建时间 */
	private Date ppCreateTime;

	public void setPpId(String ppId) 
	{
		this.ppId = ppId;
	}

	public String getPpId() 
	{
		return ppId;
	}
	public void setPpProjectName(String ppProjectName) 
	{
		this.ppProjectName = ppProjectName;
	}

	public String getPpProjectName() 
	{
		return ppProjectName;
	}
	public void setPpNo(String ppNo) 
	{
		this.ppNo = ppNo;
	}

	public String getPpNo() 
	{
		return ppNo;
	}
	public void setPpNoX(String ppNoX) 
	{
		this.ppNoX = ppNoX;
	}

	public String getPpNoX() 
	{
		return ppNoX;
	}
	public void setPpNature(String ppNature) 
	{
		this.ppNature = ppNature;
	}

	public String getPpNature() 
	{
		return ppNature;
	}
	public void setPpPriceType(String ppPriceType) 
	{
		this.ppPriceType = ppPriceType;
	}

	public String getPpPriceType() 
	{
		return ppPriceType;
	}
	public void setPpPriceClass(String ppPriceClass) 
	{
		this.ppPriceClass = ppPriceClass;
	}

	public String getPpPriceClass() 
	{
		return ppPriceClass;
	}
	public void setPpPrice(BigDecimal ppPrice) 
	{
		this.ppPrice = ppPrice;
	}

	public BigDecimal getPpPrice() 
	{
		return ppPrice;
	}
	public void setPpUsePrice(BigDecimal ppUsePrice) 
	{
		this.ppUsePrice = ppUsePrice;
	}

	public BigDecimal getPpUsePrice() 
	{
		return ppUsePrice;
	}
	public void setPpSurplusPrice(BigDecimal ppSurplusPrice) 
	{
		this.ppSurplusPrice = ppSurplusPrice;
	}

	public BigDecimal getPpSurplusPrice() 
	{
		return ppSurplusPrice;
	}
	public void setPpProvinceId(String ppProvinceId) 
	{
		this.ppProvinceId = ppProvinceId;
	}

	public String getPpProvinceId() 
	{
		return ppProvinceId;
	}
	public void setPpCityId(String ppCityId) 
	{
		this.ppCityId = ppCityId;
	}

	public String getPpCityId() 
	{
		return ppCityId;
	}
	public void setPpZoneId(String ppZoneId) 
	{
		this.ppZoneId = ppZoneId;
	}

	public String getPpZoneId() 
	{
		return ppZoneId;
	}
	public void setPpPurpose(String ppPurpose) 
	{
		this.ppPurpose = ppPurpose;
	}

	public String getPpPurpose() 
	{
		return ppPurpose;
	}
	public void setPpPriceState(String ppPriceState) 
	{
		this.ppPriceState = ppPriceState;
	}

	public String getPpPriceState() 
	{
		return ppPriceState;
	}
	public void setPpInPlaceTime(Date ppInPlaceTime) 
	{
		this.ppInPlaceTime = ppInPlaceTime;
	}

	public Date getPpInPlaceTime() 
	{
		return ppInPlaceTime;
	}
	public void setPpUseTime(Date ppUseTime) 
	{
		this.ppUseTime = ppUseTime;
	}

	public Date getPpUseTime() 
	{
		return ppUseTime;
	}
	public void setPpIsUse(Integer ppIsUse) 
	{
		this.ppIsUse = ppIsUse;
	}

	public Integer getPpIsUse() 
	{
		return ppIsUse;
	}
	public void setPpIsDel(Integer ppIsDel) 
	{
		this.ppIsDel = ppIsDel;
	}

	public Integer getPpIsDel() 
	{
		return ppIsDel;
	}
	public void setPpPerson(String ppPerson) 
	{
		this.ppPerson = ppPerson;
	}

	public String getPpPerson() 
	{
		return ppPerson;
	}
	public void setPpCreateTime(Date ppCreateTime) 
	{
		this.ppCreateTime = ppCreateTime;
	}

	public Date getPpCreateTime() 
	{
		return ppCreateTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ppId", getPpId())
            .append("ppProjectName", getPpProjectName())
            .append("ppNo", getPpNo())
            .append("ppNoX", getPpNoX())
            .append("ppNature", getPpNature())
            .append("ppPriceType", getPpPriceType())
            .append("ppPriceClass", getPpPriceClass())
            .append("ppPrice", getPpPrice())
            .append("ppUsePrice", getPpUsePrice())
            .append("ppSurplusPrice", getPpSurplusPrice())
            .append("ppProvinceId", getPpProvinceId())
            .append("ppCityId", getPpCityId())
            .append("ppZoneId", getPpZoneId())
            .append("ppPurpose", getPpPurpose())
            .append("ppPriceState", getPpPriceState())
            .append("ppInPlaceTime", getPpInPlaceTime())
            .append("ppUseTime", getPpUseTime())
            .append("ppIsUse", getPpIsUse())
            .append("ppIsDel", getPpIsDel())
            .append("ppPerson", getPpPerson())
            .append("ppCreateTime", getPpCreateTime())
            .toString();
    }
}
