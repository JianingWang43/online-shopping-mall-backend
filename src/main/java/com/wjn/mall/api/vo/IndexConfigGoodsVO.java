package com.wjn.mall.api.vo;

import lombok.Data;

@Data
public class IndexConfigGoodsVO {

    private Long goodsId;
    private String goodsName;
    private String goodsIntro;
    private String goodsCoverImg;
    private Integer sellingPrice;
    private String tag;
}
