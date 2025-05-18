package com.jaychou.kongpicturebackend.model.entity;

import lombok.Data;

import java.util.List;

/**
 * ClassName: PictureTagCategory
 * Package: com.jaychou.kongpicturebackend.model.entity
 * Description:
 *
 * @Author: 红模仿
 * @Create: 2025/5/18 - 22:09
 * @Version: v1.0
 */
@Data
public class PictureTagCategory {
    private List<String> tagList;
    private List<String> categoryList;

}
