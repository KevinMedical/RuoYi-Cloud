package com.ruoyi.data.service;

import java.util.List;
import com.ruoyi.data.domain.MtEng;

/**
 * 美团药品Service接口
 * 
 * @author kevin
 * @date 2024-06-30
 */
public interface IMtEngService 
{
    /**
     * 查询美团药品
     * 
     * @param id 美团药品主键
     * @return 美团药品
     */
    public MtEng selectMtEngById(Long id);

    /**
     * 查询美团药品列表
     * 
     * @param mtEng 美团药品
     * @return 美团药品集合
     */
    public List<MtEng> selectMtEngList(MtEng mtEng);

    /**
     * 新增美团药品
     * 
     * @param mtEng 美团药品
     * @return 结果
     */
    public int insertMtEng(MtEng mtEng);

    /**
     * 修改美团药品
     * 
     * @param mtEng 美团药品
     * @return 结果
     */
    public int updateMtEng(MtEng mtEng);

    /**
     * 批量删除美团药品
     * 
     * @param ids 需要删除的美团药品主键集合
     * @return 结果
     */
    public int deleteMtEngByIds(Long[] ids);

    /**
     * 删除美团药品信息
     * 
     * @param id 美团药品主键
     * @return 结果
     */
    public int deleteMtEngById(Long id);
}
