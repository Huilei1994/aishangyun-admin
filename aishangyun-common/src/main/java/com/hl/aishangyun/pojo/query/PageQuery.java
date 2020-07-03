package com.hl.aishangyun.pojo.query;


import lombok.Data;

/**
 * @ClassName PageQuery
 * @Description TODO
 * @Date 2020/7/3 13:17
 * @Created by 胡磊
 */
@Data
public class PageQuery {


    private Integer page = 1;
    private Integer limit = 10;
    private Integer start = 0;// 偏移量应该计算出来

    public Integer getStart() {
        if (page != null && limit != null) {
            return (page - 1) * limit;
        }
        return start;
    }

}
