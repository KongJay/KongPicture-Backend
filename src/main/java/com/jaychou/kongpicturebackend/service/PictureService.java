package com.jaychou.kongpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jaychou.kongpicturebackend.model.dto.picture.PictureQueryRequest;
import com.jaychou.kongpicturebackend.model.dto.picture.PictureUploadRequest;
import com.jaychou.kongpicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jaychou.kongpicturebackend.model.entity.User;
import com.jaychou.kongpicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author JayChou
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-05-18 20:40:23
*/
public interface PictureService extends IService<Picture> {
    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    void validPicture(Picture picture);
}
