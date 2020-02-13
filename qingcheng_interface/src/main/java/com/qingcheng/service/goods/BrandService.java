package com.qingcheng.service.goods;

import com.qingcheng.pojo.goods.Brand;

import java.util.List;

/**
 * 品牌列表
 * url  /brand/findAll.do
 * http请求方式  GET
 * 返回格式 [{
 * "id": 品牌id,
 * "name": 品牌名称,
 * "image": 品牌图片地址,
 * "letter": 品牌的首字母,
 * "seq": 排序,
 * },
 * .......
 * ]
 */
public interface BrandService {
    List<Brand> findAll();
}
