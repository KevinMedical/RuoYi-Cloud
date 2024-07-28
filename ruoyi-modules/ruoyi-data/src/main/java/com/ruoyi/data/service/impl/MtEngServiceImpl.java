package com.ruoyi.data.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.data.mapper.MtEngMapper;
import com.ruoyi.data.domain.MtEng;
import com.ruoyi.data.service.IMtEngService;

/**
 * 美团药品Service业务层处理
 * 
 * @author kevin
 * @date 2024-06-30
 */
@Service
public class MtEngServiceImpl implements IMtEngService 
{
    @Autowired
    private MtEngMapper mtEngMapper;

    /**
     * 查询美团药品
     * 
     * @param id 美团药品主键
     * @return 美团药品
     */
    @Override
    public MtEng selectMtEngById(Long id)
    {
        return mtEngMapper.selectMtEngById(id);
    }

    /**
     * 查询美团药品列表
     * 
     * @param mtEng 美团药品
     * @return 美团药品
     */
    @Override
    public List<MtEng> selectMtEngList(MtEng mtEng)
    {
        return mtEngMapper.selectMtEngList(mtEng);
    }

    /**
     * 新增美团药品
     * 
     * @param mtEng 美团药品
     * @return 结果
     */
    @Override
    public int insertMtEng(MtEng mtEng)
    {
        return mtEngMapper.insertMtEng(mtEng);
    }

    /**
     * 修改美团药品
     * 
     * @param mtEng 美团药品
     * @return 结果
     */
    @Override
    public int updateMtEng(MtEng mtEng)
    {
        return mtEngMapper.updateMtEng(mtEng);
    }

    /**
     * 批量删除美团药品
     * 
     * @param ids 需要删除的美团药品主键
     * @return 结果
     */
    @Override
    public int deleteMtEngByIds(Long[] ids)
    {
        return mtEngMapper.deleteMtEngByIds(ids);
    }

    /**
     * 删除美团药品信息
     * 
     * @param id 美团药品主键
     * @return 结果
     */
    @Override
    public int deleteMtEngById(Long id)
    {
        return mtEngMapper.deleteMtEngById(id);
    }
}
