package com.jaychou.kongpicturebackend.manager.upload;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.jaychou.kongpicturebackend.common.ErrorCode;
import com.jaychou.kongpicturebackend.exception.ThrowUtils;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class UrlPictureUpload extends PictureUploadTemplate {  
    @Override  
    protected void validPicture(Object inputSource) {  
        String fileUrl = (String) inputSource;  
        ThrowUtils.throwIf(StrUtil.isBlank(fileUrl), ErrorCode.PARAMS_ERROR, "文件地址不能为空");
        // ... 跟之前的校验逻辑保持一致  
    }

    @Override
    protected String getOriginFilename(Object inputSource) {
        String fileUrl = (String) inputSource;
        return FileUtil.mainName(fileUrl) + "." + FileUtil.extName(fileUrl);
    }
  
    @Override  
    protected void processFile(Object inputSource, File file) throws Exception {
        String fileUrl = (String) inputSource;  
        // 下载文件到临时目录  
        HttpUtil.downloadFile(fileUrl, file);
    }  
}
