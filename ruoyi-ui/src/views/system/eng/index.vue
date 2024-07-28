<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="准字号(去除中文,逗号分割)" prop="approvalCode">
        <el-input
          v-model="queryParams.approvalCode"
          placeholder="请输入准字号(去除中文,逗号分割)"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="准字号" prop="approvalNumber">
        <el-input
          v-model="queryParams.approvalNumber"
          placeholder="请输入准字号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="类别列表" prop="categoryList">
        <el-input
          v-model="queryParams.categoryList"
          placeholder="请输入类别列表"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="药品类型" prop="categoryNamePath">
        <el-input
          v-model="queryParams.categoryNamePath"
          placeholder="请输入药品类型"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="当前价格-美团建议" prop="currentPrice">
        <el-input
          v-model="queryParams.currentPrice"
          placeholder="请输入当前价格-美团建议"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="最小包装单位数量" prop="factor">
        <el-input
          v-model="queryParams.factor"
          placeholder="请输入最小包装单位数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="美团药品名称" prop="goodsName">
        <el-input
          v-model="queryParams.goodsName"
          placeholder="请输入美团药品名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="售卖状态" prop="isSale">
        <el-input
          v-model="queryParams.isSale"
          placeholder="请输入售卖状态"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="isSp">
        <el-input
          v-model="queryParams.isSp"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="生产厂家" prop="manufaturer">
        <el-input
          v-model="queryParams.manufaturer"
          placeholder="请输入生产厂家"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="美团商品药品ID" prop="mtid">
        <el-input
          v-model="queryParams.mtid"
          placeholder="请输入美团商品药品ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="OCT" prop="oct">
        <el-input
          v-model="queryParams.oct"
          placeholder="请输入OCT"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="原始价格-美团建议" prop="originalPrice">
        <el-input
          v-model="queryParams.originalPrice"
          placeholder="请输入原始价格-美团建议"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="制剂规格数量" prop="outlookNumber">
        <el-input
          v-model="queryParams.outlookNumber"
          placeholder="请输入制剂规格数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="图片" prop="pics">
        <el-input
          v-model="queryParams.pics"
          placeholder="请输入图片"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="规格" prop="spec1">
        <el-input
          v-model="queryParams.spec1"
          placeholder="请输入规格"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="标准名" prop="stdName">
        <el-input
          v-model="queryParams.stdName"
          placeholder="请输入标准名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="建议价格" prop="suggestedPrice">
        <el-input
          v-model="queryParams.suggestedPrice"
          placeholder="请输入建议价格"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="供应商id" prop="suppliersId">
        <el-input
          v-model="queryParams.suppliersId"
          placeholder="请输入供应商id"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="基本计量单位" prop="unit">
        <el-input
          v-model="queryParams.unit"
          placeholder="请输入基本计量单位"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="UCP编码" prop="upc">
        <el-input
          v-model="queryParams.upc"
          placeholder="请输入UCP编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="mt_class表id" prop="mtClassId">
        <el-input
          v-model="queryParams.mtClassId"
          placeholder="请输入mt_class表id"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:eng:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:eng:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:eng:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:eng:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="engList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="准字号(去除中文,逗号分割)" align="center" prop="approvalCode" />
      <el-table-column label="批准文号" align="center" prop="approvalNumber1" />
      <el-table-column label="原批准文号" align="center" prop="approvalNumberOriginal" />
      <el-table-column label="准字号" align="center" prop="approvalNumber" />
      <el-table-column label="品牌" align="center" prop="brand" />
      <el-table-column label="类别列表" align="center" prop="categoryList" />
      <el-table-column label="药品类型" align="center" prop="categoryNamePath" />
      <el-table-column label="冷链类型" align="center" prop="coldChainType" />
      <el-table-column label="当前价格-美团建议" align="center" prop="currentPrice" />
      <el-table-column label="剂型" align="center" prop="dosage" />
      <el-table-column label="启用状态 1启用 3停用" align="center" prop="enabledStatus" />
      <el-table-column label="最小包装单位数量" align="center" prop="factor" />
      <el-table-column label="药品通用名称" align="center" prop="genericName" />
      <el-table-column label="美团药品名称" align="center" prop="goodsName" />
      <el-table-column label="药品本位码" align="center" prop="goodsStandardCode" />
      <el-table-column label="是否冷链" align="center" prop="isColdChain" />
      <el-table-column label="售卖状态" align="center" prop="isSale" />
      <el-table-column label="${comment}" align="center" prop="isSp" />
      <el-table-column label="生产单位" align="center" prop="manufaturer1" />
      <el-table-column label="生产厂家" align="center" prop="manufaturer" />
      <el-table-column label="包装" align="center" prop="materialName" />
      <el-table-column label="最小包装单位" align="center" prop="minUnit" />
      <el-table-column label="美团商品药品ID" align="center" prop="mtid" />
      <el-table-column label="OCT" align="center" prop="oct" />
      <el-table-column label="原始价格-美团建议" align="center" prop="originalPrice" />
      <el-table-column label="制剂规格文本描述" align="center" prop="outlookDesc" />
      <el-table-column label="制剂规格数量" align="center" prop="outlookNumber" />
      <el-table-column label="制剂规格单位" align="center" prop="outlookUnit" />
      <el-table-column label="制剂规格" align="center" prop="outlook" />
      <el-table-column label="图片列表" align="center" prop="picList" />
      <el-table-column label="图片" align="center" prop="pics" />
      <el-table-column label="商品图片" align="center" prop="pictureList" />
      <el-table-column label="规格" align="center" prop="spec1" />
      <el-table-column label="规格" align="center" prop="spec" />
      <el-table-column label="标准名" align="center" prop="stdName" />
      <el-table-column label="建议价格" align="center" prop="suggestedPrice" />
      <el-table-column label="供应商id" align="center" prop="suppliersId" />
      <el-table-column label="基本计量单位" align="center" prop="unit1" />
      <el-table-column label="基本计量单位" align="center" prop="unit" />
      <el-table-column label="UCP编码" align="center" prop="upc" />
      <el-table-column label="mt_class表id" align="center" prop="mtClassId" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:eng:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:eng:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改【请填写功能名称】对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="${comment}" prop="id">
          <el-input v-model="form.id" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="准字号(去除中文,逗号分割)" prop="approvalCode">
          <el-input v-model="form.approvalCode" placeholder="请输入准字号(去除中文,逗号分割)" />
        </el-form-item>
        <el-form-item label="批准文号" prop="approvalNumber1">
          <el-input v-model="form.approvalNumber1" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="原批准文号" prop="approvalNumberOriginal">
          <el-input v-model="form.approvalNumberOriginal" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="准字号" prop="approvalNumber">
          <el-input v-model="form.approvalNumber" placeholder="请输入准字号" />
        </el-form-item>
        <el-form-item label="品牌" prop="brand">
          <el-input v-model="form.brand" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="类别列表" prop="categoryList">
          <el-input v-model="form.categoryList" placeholder="请输入类别列表" />
        </el-form-item>
        <el-form-item label="药品类型" prop="categoryNamePath">
          <el-input v-model="form.categoryNamePath" placeholder="请输入药品类型" />
        </el-form-item>
        <el-form-item label="当前价格-美团建议" prop="currentPrice">
          <el-input v-model="form.currentPrice" placeholder="请输入当前价格-美团建议" />
        </el-form-item>
        <el-form-item label="剂型" prop="dosage">
          <el-input v-model="form.dosage" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="最小包装单位数量" prop="factor">
          <el-input v-model="form.factor" placeholder="请输入最小包装单位数量" />
        </el-form-item>
        <el-form-item label="药品通用名称" prop="genericName">
          <el-input v-model="form.genericName" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="美团药品名称" prop="goodsName">
          <el-input v-model="form.goodsName" placeholder="请输入美团药品名称" />
        </el-form-item>
        <el-form-item label="药品本位码" prop="goodsStandardCode">
          <el-input v-model="form.goodsStandardCode" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="是否冷链" prop="isColdChain">
          <el-input v-model="form.isColdChain" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="售卖状态" prop="isSale">
          <el-input v-model="form.isSale" placeholder="请输入售卖状态" />
        </el-form-item>
        <el-form-item label="${comment}" prop="isSp">
          <el-input v-model="form.isSp" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="生产单位" prop="manufaturer1">
          <el-input v-model="form.manufaturer1" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="生产厂家" prop="manufaturer">
          <el-input v-model="form.manufaturer" placeholder="请输入生产厂家" />
        </el-form-item>
        <el-form-item label="包装" prop="materialName">
          <el-input v-model="form.materialName" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="最小包装单位" prop="minUnit">
          <el-input v-model="form.minUnit" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="美团商品药品ID" prop="mtid">
          <el-input v-model="form.mtid" placeholder="请输入美团商品药品ID" />
        </el-form-item>
        <el-form-item label="OCT" prop="oct">
          <el-input v-model="form.oct" placeholder="请输入OCT" />
        </el-form-item>
        <el-form-item label="原始价格-美团建议" prop="originalPrice">
          <el-input v-model="form.originalPrice" placeholder="请输入原始价格-美团建议" />
        </el-form-item>
        <el-form-item label="制剂规格文本描述" prop="outlookDesc">
          <el-input v-model="form.outlookDesc" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="制剂规格数量" prop="outlookNumber">
          <el-input v-model="form.outlookNumber" placeholder="请输入制剂规格数量" />
        </el-form-item>
        <el-form-item label="制剂规格单位" prop="outlookUnit">
          <el-input v-model="form.outlookUnit" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="制剂规格" prop="outlook">
          <el-input v-model="form.outlook" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="图片列表" prop="picList">
          <el-input v-model="form.picList" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="图片" prop="pics">
          <el-input v-model="form.pics" placeholder="请输入图片" />
        </el-form-item>
        <el-form-item label="商品图片" prop="pictureList">
          <el-input v-model="form.pictureList" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="规格" prop="spec1">
          <el-input v-model="form.spec1" placeholder="请输入规格" />
        </el-form-item>
        <el-form-item label="规格" prop="spec">
          <el-input v-model="form.spec" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="标准名" prop="stdName">
          <el-input v-model="form.stdName" placeholder="请输入标准名" />
        </el-form-item>
        <el-form-item label="建议价格" prop="suggestedPrice">
          <el-input v-model="form.suggestedPrice" placeholder="请输入建议价格" />
        </el-form-item>
        <el-form-item label="供应商id" prop="suppliersId">
          <el-input v-model="form.suppliersId" placeholder="请输入供应商id" />
        </el-form-item>
        <el-form-item label="基本计量单位" prop="unit1">
          <el-input v-model="form.unit1" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="基本计量单位" prop="unit">
          <el-input v-model="form.unit" placeholder="请输入基本计量单位" />
        </el-form-item>
        <el-form-item label="UCP编码" prop="upc">
          <el-input v-model="form.upc" placeholder="请输入UCP编码" />
        </el-form-item>
        <el-form-item label="mt_class表id" prop="mtClassId">
          <el-input v-model="form.mtClassId" placeholder="请输入mt_class表id" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listEng, getEng, delEng, addEng, updateEng } from "@/api/system/eng";

export default {
  name: "Eng",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 【请填写功能名称】表格数据
      engList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        approvalCode: null,
        approvalNumber1: null,
        approvalNumberOriginal: null,
        approvalNumber: null,
        brand: null,
        categoryList: null,
        categoryNamePath: null,
        coldChainType: null,
        currentPrice: null,
        dosage: null,
        enabledStatus: null,
        factor: null,
        genericName: null,
        goodsName: null,
        goodsStandardCode: null,
        isColdChain: null,
        isSale: null,
        isSp: null,
        manufaturer1: null,
        manufaturer: null,
        materialName: null,
        minUnit: null,
        mtid: null,
        oct: null,
        originalPrice: null,
        outlookDesc: null,
        outlookNumber: null,
        outlookUnit: null,
        outlook: null,
        picList: null,
        pics: null,
        pictureList: null,
        spec1: null,
        spec: null,
        stdName: null,
        suggestedPrice: null,
        suppliersId: null,
        unit1: null,
        unit: null,
        upc: null,
        mtClassId: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        id: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
        mtid: [
          { required: true, message: "美团商品药品ID不能为空", trigger: "blur" }
        ],
        suppliersId: [
          { required: true, message: "供应商id不能为空", trigger: "blur" }
        ],
        upc: [
          { required: true, message: "UCP编码不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询【请填写功能名称】列表 */
    getList() {
      this.loading = true;
      listEng(this.queryParams).then(response => {
        this.engList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        approvalCode: null,
        approvalNumber1: null,
        approvalNumberOriginal: null,
        approvalNumber: null,
        brand: null,
        categoryList: null,
        categoryNamePath: null,
        coldChainType: null,
        currentPrice: null,
        dosage: null,
        enabledStatus: null,
        factor: null,
        genericName: null,
        goodsName: null,
        goodsStandardCode: null,
        isColdChain: null,
        isSale: null,
        isSp: null,
        manufaturer1: null,
        manufaturer: null,
        materialName: null,
        minUnit: null,
        mtid: null,
        oct: null,
        originalPrice: null,
        outlookDesc: null,
        outlookNumber: null,
        outlookUnit: null,
        outlook: null,
        picList: null,
        pics: null,
        pictureList: null,
        spec1: null,
        spec: null,
        stdName: null,
        suggestedPrice: null,
        suppliersId: null,
        unit1: null,
        unit: null,
        upc: null,
        mtClassId: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加【请填写功能名称】";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getEng(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateEng(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addEng(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除【请填写功能名称】编号为"' + ids + '"的数据项？').then(function() {
        return delEng(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/eng/export', {
        ...this.queryParams
      }, `eng_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
