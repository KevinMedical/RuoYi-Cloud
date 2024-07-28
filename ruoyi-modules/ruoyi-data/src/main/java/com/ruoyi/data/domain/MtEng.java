package com.ruoyi.data.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 美团药品对象 mt_eng
 * 
 * @author kevin
 * @date 2024-06-30
 */
public class MtEng extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 准字号 */
    @Excel(name = "准字号")
    private String approvalCode;

    /** 批准文号 */
    @Excel(name = "批准文号")
    private String approvalNumber1;

    /** 原批准文号 */
    @Excel(name = "原批准文号")
    private String approvalNumberOriginal;

    /** 准字号 */
    @Excel(name = "准字号")
    private String approvalNumber;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    /** 类别列表 */
    @Excel(name = "类别列表")
    private String categoryList;

    /** 药品类型 */
    @Excel(name = "药品类型")
    private String categoryNamePath;

    /** 冷链类型 */
    @Excel(name = "冷链类型")
    private String coldChainType;

    /** 当前价格 */
    @Excel(name = "当前价格")
    private String currentPrice;

    /** 剂型 */
    @Excel(name = "剂型")
    private String dosage;

    /** 启用状态 */
    @Excel(name = "启用状态")
    private String enabledStatus;

    /** 最小包装单位数量 */
    @Excel(name = "最小包装单位数量")
    private String factor;

    /** 药品通用名称 */
    @Excel(name = "药品通用名称")
    private String genericName;

    /** 美团药品名称 */
    @Excel(name = "美团药品名称")
    private String goodsName;

    /** 药品本位码 */
    @Excel(name = "药品本位码")
    private String goodsStandardCode;

    /** 是否冷链 */
    @Excel(name = "是否冷链")
    private String isColdChain;

    /** 售卖状态 */
    @Excel(name = "售卖状态")
    private String isSale;

    /** 是否SP */
    @Excel(name = "是否SP")
    private String isSp;

    /** 生产单位 */
    @Excel(name = "生产单位")
    private String manufaturer1;

    /** 生产厂家 */
    @Excel(name = "生产厂家")
    private String manufaturer;

    /** 包装 */
    @Excel(name = "包装")
    private String materialName;

    /** 最小包装单位 */
    @Excel(name = "最小包装单位")
    private String minUnit;

    /** 美团商品药品ID */
    @Excel(name = "美团商品药品ID")
    private String mtid;

    /** OCT */
    @Excel(name = "OCT")
    private String oct;

    /** 原始价格 */
    @Excel(name = "原始价格")
    private String originalPrice;

    /** 制剂规格文本描述 */
    @Excel(name = "制剂规格文本描述")
    private String outlookDesc;

    /** 制剂规格数量 */
    @Excel(name = "制剂规格数量")
    private Long outlookNumber;

    /** 制剂规格单位 */
    @Excel(name = "制剂规格单位")
    private String outlookUnit;

    /** 制剂规格 */
    @Excel(name = "制剂规格")
    private String outlook;

    /** 图片列表 */
    @Excel(name = "图片列表")
    private String picList;

    /** 图片 */
    @Excel(name = "图片")
    private Long pics;

    /** 商品图片 */
    @Excel(name = "商品图片")
    private String pictureList;

    /** 规格 */
    @Excel(name = "规格")
    private String spec1;

    /** 规格 */
    @Excel(name = "规格")
    private String spec;

    /** 标准名 */
    @Excel(name = "标准名")
    private String stdName;

    /** 建议价格 */
    @Excel(name = "建议价格")
    private Long suggestedPrice;

    /** 供应商ID */
    @Excel(name = "供应商ID")
    private Long suppliersId;

    /** 基本计量单位 */
    @Excel(name = "基本计量单位")
    private String unit1;

    /** 基本计量单位 */
    @Excel(name = "基本计量单位")
    private String unit;

    /** UPC编码 */
    @Excel(name = "UPC编码")
    private String upc;

    /** 类型ID */
    @Excel(name = "类型ID")
    private Long mtClassId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setApprovalCode(String approvalCode)
    {
        this.approvalCode = approvalCode;
    }

    public String getApprovalCode()
    {
        return approvalCode;
    }
    public void setApprovalNumber1(String approvalNumber1)
    {
        this.approvalNumber1 = approvalNumber1;
    }

    public String getApprovalNumber1()
    {
        return approvalNumber1;
    }
    public void setApprovalNumberOriginal(String approvalNumberOriginal)
    {
        this.approvalNumberOriginal = approvalNumberOriginal;
    }

    public String getApprovalNumberOriginal()
    {
        return approvalNumberOriginal;
    }
    public void setApprovalNumber(String approvalNumber)
    {
        this.approvalNumber = approvalNumber;
    }

    public String getApprovalNumber() 
    {
        return approvalNumber;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setCategoryList(String categoryList) 
    {
        this.categoryList = categoryList;
    }

    public String getCategoryList() 
    {
        return categoryList;
    }
    public void setCategoryNamePath(String categoryNamePath) 
    {
        this.categoryNamePath = categoryNamePath;
    }

    public String getCategoryNamePath() 
    {
        return categoryNamePath;
    }
    public void setColdChainType(String coldChainType) 
    {
        this.coldChainType = coldChainType;
    }

    public String getColdChainType() 
    {
        return coldChainType;
    }
    public void setCurrentPrice(String currentPrice) 
    {
        this.currentPrice = currentPrice;
    }

    public String getCurrentPrice() 
    {
        return currentPrice;
    }
    public void setDosage(String dosage) 
    {
        this.dosage = dosage;
    }

    public String getDosage() 
    {
        return dosage;
    }
    public void setEnabledStatus(String enabledStatus) 
    {
        this.enabledStatus = enabledStatus;
    }

    public String getEnabledStatus() 
    {
        return enabledStatus;
    }
    public void setFactor(String factor) 
    {
        this.factor = factor;
    }

    public String getFactor() 
    {
        return factor;
    }
    public void setGenericName(String genericName) 
    {
        this.genericName = genericName;
    }

    public String getGenericName() 
    {
        return genericName;
    }
    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }
    public void setGoodsStandardCode(String goodsStandardCode) 
    {
        this.goodsStandardCode = goodsStandardCode;
    }

    public String getGoodsStandardCode() 
    {
        return goodsStandardCode;
    }
    public void setIsColdChain(String isColdChain) 
    {
        this.isColdChain = isColdChain;
    }

    public String getIsColdChain() 
    {
        return isColdChain;
    }
    public void setIsSale(String isSale) 
    {
        this.isSale = isSale;
    }

    public String getIsSale() 
    {
        return isSale;
    }
    public void setIsSp(String isSp) 
    {
        this.isSp = isSp;
    }

    public String getIsSp() 
    {
        return isSp;
    }
    public void setManufaturer1(String manufaturer1)
    {
        this.manufaturer1 = manufaturer1;
    }

    public String getManufaturer1()
    {
        return manufaturer1;
    }
    public void setManufaturer(String manufaturer) 
    {
        this.manufaturer = manufaturer;
    }

    public String getManufaturer() 
    {
        return manufaturer;
    }
    public void setMaterialName(String materialName) 
    {
        this.materialName = materialName;
    }

    public String getMaterialName() 
    {
        return materialName;
    }
    public void setMinUnit(String minUnit) 
    {
        this.minUnit = minUnit;
    }

    public String getMinUnit() 
    {
        return minUnit;
    }
    public void setMtid(String mtid) 
    {
        this.mtid = mtid;
    }

    public String getMtid() 
    {
        return mtid;
    }
    public void setOct(String oct) 
    {
        this.oct = oct;
    }

    public String getOct() 
    {
        return oct;
    }
    public void setOriginalPrice(String originalPrice) 
    {
        this.originalPrice = originalPrice;
    }

    public String getOriginalPrice() 
    {
        return originalPrice;
    }
    public void setOutlookDesc(String outlookDesc) 
    {
        this.outlookDesc = outlookDesc;
    }

    public String getOutlookDesc() 
    {
        return outlookDesc;
    }
    public void setOutlookNumber(Long outlookNumber) 
    {
        this.outlookNumber = outlookNumber;
    }

    public Long getOutlookNumber() 
    {
        return outlookNumber;
    }
    public void setOutlookUnit(String outlookUnit) 
    {
        this.outlookUnit = outlookUnit;
    }

    public String getOutlookUnit() 
    {
        return outlookUnit;
    }
    public void setOutlook(String outlook) 
    {
        this.outlook = outlook;
    }

    public String getOutlook() 
    {
        return outlook;
    }
    public void setPicList(String picList) 
    {
        this.picList = picList;
    }

    public String getPicList() 
    {
        return picList;
    }
    public void setPics(Long pics) 
    {
        this.pics = pics;
    }

    public Long getPics() 
    {
        return pics;
    }
    public void setPictureList(String pictureList) 
    {
        this.pictureList = pictureList;
    }

    public String getPictureList() 
    {
        return pictureList;
    }
    public void setSpec1(String spec1)
    {
        this.spec1 = spec1;
    }

    public String getSpec1()
    {
        return spec1;
    }
    public void setSpec(String spec) 
    {
        this.spec = spec;
    }

    public String getSpec() 
    {
        return spec;
    }
    public void setStdName(String stdName) 
    {
        this.stdName = stdName;
    }

    public String getStdName() 
    {
        return stdName;
    }
    public void setSuggestedPrice(Long suggestedPrice) 
    {
        this.suggestedPrice = suggestedPrice;
    }

    public Long getSuggestedPrice() 
    {
        return suggestedPrice;
    }
    public void setSuppliersId(Long suppliersId) 
    {
        this.suppliersId = suppliersId;
    }

    public Long getSuppliersId() 
    {
        return suppliersId;
    }
    public void setUnit1(String unit1)
    {
        this.unit1 = unit1;
    }

    public String getUnit1()
    {
        return unit1;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setUpc(String upc) 
    {
        this.upc = upc;
    }

    public String getUpc() 
    {
        return upc;
    }
    public void setMtClassId(Long mtClassId) 
    {
        this.mtClassId = mtClassId;
    }

    public Long getMtClassId() 
    {
        return mtClassId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("approvalCode", getApprovalCode())
            .append("approvalNumber1", getApprovalNumber1())
            .append("approvalNumberOriginal", getApprovalNumberOriginal())
            .append("approvalNumber", getApprovalNumber())
            .append("brand", getBrand())
            .append("categoryList", getCategoryList())
            .append("categoryNamePath", getCategoryNamePath())
            .append("coldChainType", getColdChainType())
            .append("currentPrice", getCurrentPrice())
            .append("dosage", getDosage())
            .append("enabledStatus", getEnabledStatus())
            .append("factor", getFactor())
            .append("genericName", getGenericName())
            .append("goodsName", getGoodsName())
            .append("goodsStandardCode", getGoodsStandardCode())
            .append("isColdChain", getIsColdChain())
            .append("isSale", getIsSale())
            .append("isSp", getIsSp())
            .append("manufaturer1", getManufaturer1())
            .append("manufaturer", getManufaturer())
            .append("materialName", getMaterialName())
            .append("minUnit", getMinUnit())
            .append("mtid", getMtid())
            .append("oct", getOct())
            .append("originalPrice", getOriginalPrice())
            .append("outlookDesc", getOutlookDesc())
            .append("outlookNumber", getOutlookNumber())
            .append("outlookUnit", getOutlookUnit())
            .append("outlook", getOutlook())
            .append("picList", getPicList())
            .append("pics", getPics())
            .append("pictureList", getPictureList())
            .append("spec1", getSpec1())
            .append("spec", getSpec())
            .append("stdName", getStdName())
            .append("suggestedPrice", getSuggestedPrice())
            .append("suppliersId", getSuppliersId())
            .append("unit1", getUnit1())
            .append("unit", getUnit())
            .append("upc", getUpc())
            .append("mtClassId", getMtClassId())
            .toString();
    }
}
