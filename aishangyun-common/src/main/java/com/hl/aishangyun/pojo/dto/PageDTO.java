package com.hl.aishangyun.pojo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName PageDTO
 * @Description TODO
 * @Date 2020/7/3 13:15
 * @Created by 胡磊
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageDTO implements Serializable {


    private Integer code = 0;

    private String msg = "";

    private Integer count = 0;

    private Object data;
    private Object moreData;

    public static PageDTO setPageData(Integer count, Object data) {
        return new PageDTO(0, "成功", count, data,null);
    }
    public static PageDTO setPageData(Integer count, Object data, Object moreData) {
        return new PageDTO(0, "成功", count, data,moreData);
    }

}
