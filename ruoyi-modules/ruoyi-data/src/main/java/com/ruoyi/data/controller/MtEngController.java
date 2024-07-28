package com.ruoyi.data.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.data.domain.MtEng;
import com.ruoyi.data.service.IMtEngService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 美团药品Controller
 * 
 * @author kevin
 * @date 2024-06-30
 */
@RestController
@RequestMapping("/mt")
public class MtEngController extends BaseController
{
    @Autowired
    private IMtEngService mtEngService;

    /**
     * 查询美团药品列表
     */
    @RequiresPermissions("data:mt:list")
    @GetMapping("/list")
    public TableDataInfo list(MtEng mtEng)
    {
        startPage();
        List<MtEng> list = mtEngService.selectMtEngList(mtEng);
        return getDataTable(list);
    }

    /**
     * 导出美团药品列表
     */
    @RequiresPermissions("data:mt:export")
    @Log(title = "美团药品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MtEng mtEng)
    {
        List<MtEng> list = mtEngService.selectMtEngList(mtEng);
        ExcelUtil<MtEng> util = new ExcelUtil<MtEng>(MtEng.class);
        util.exportExcel(response, list, "美团药品数据");
    }

    /**
     * 获取美团药品详细信息
     */
    @RequiresPermissions("data:mt:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mtEngService.selectMtEngById(id));
    }

    /**
     * 新增美团药品
     */
    @RequiresPermissions("data:mt:add")
    @Log(title = "美团药品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MtEng mtEng)
    {
        return toAjax(mtEngService.insertMtEng(mtEng));
    }

    /**
     * 修改美团药品
     */
    @RequiresPermissions("data:mt:edit")
    @Log(title = "美团药品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MtEng mtEng)
    {
        return toAjax(mtEngService.updateMtEng(mtEng));
    }

    /**
     * 删除美团药品
     */
    @RequiresPermissions("data:mt:remove")
    @Log(title = "美团药品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mtEngService.deleteMtEngByIds(ids));
    }
}
