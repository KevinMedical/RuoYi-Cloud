import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listEng(query) {
  return request({
    url: '/system/eng/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getEng(id) {
  return request({
    url: '/system/eng/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addEng(data) {
  return request({
    url: '/system/eng',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateEng(data) {
  return request({
    url: '/system/eng',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delEng(id) {
  return request({
    url: '/system/eng/' + id,
    method: 'delete'
  })
}
