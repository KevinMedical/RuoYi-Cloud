import request from '@/utils/request'

// 查询美团药品列表
export function listMt(query) {
  return request({
    url: '/data/mt/list',
    method: 'get',
    params: query
  })
}

// 查询美团药品详细
export function getMt(id) {
  return request({
    url: '/data/mt/' + id,
    method: 'get'
  })
}

// 新增美团药品
export function addMt(data) {
  return request({
    url: '/data/mt',
    method: 'post',
    data: data
  })
}

// 修改美团药品
export function updateMt(data) {
  return request({
    url: '/data/mt',
    method: 'put',
    data: data
  })
}

// 删除美团药品
export function delMt(id) {
  return request({
    url: '/data/mt/' + id,
    method: 'delete'
  })
}
