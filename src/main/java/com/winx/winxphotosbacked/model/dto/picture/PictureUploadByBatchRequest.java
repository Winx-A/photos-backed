package com.winx.winxphotosbacked.model.dto.picture;

import lombok.Data;

@Data
public class PictureUploadByBatchRequest {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 抓取数量(默认)
     */
    private Integer count = 10;

    /**
     * 名称前缀
     */
    private String namePrefix;

    private static final long serialVersionUID = 1L;

}
