package com.winx.winxphotosbacked.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.winx.winxphotosbacked.model.dto.picture.PictureQueryRequest;
import com.winx.winxphotosbacked.model.dto.picture.PictureReviewRequest;
import com.winx.winxphotosbacked.model.dto.picture.PictureUploadByBatchRequest;
import com.winx.winxphotosbacked.model.dto.picture.PictureUploadRequest;
import com.winx.winxphotosbacked.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.winx.winxphotosbacked.model.entity.User;
import com.winx.winxphotosbacked.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Serendipity
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2025-02-05 15:24:08
 */
public interface PictureService extends IService<Picture> {

    /**
     * 校验数据
     *
     * @param picture
     */
    void validPicture(Picture picture);

    /**
     * 上传图片
     *
     * @param inputSource          文件输入源
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    /**
     * 获取图片包装类（单条）
     *
     * @param picture
     * @param request
     * @return
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 获取图片包装类（分页）
     *
     * @param picturePage
     * @param request
     * @return
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 获取查询对象
     *
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    /**
     * 填充图片审核参数
     *
     * @param picture
     * @param loginUser
     */
    public void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量上传图片
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 返回创建成功的图片数
     */
    Integer uploadPictureByBatch(PictureUploadByBatchRequest pictureUploadByBatchRequest, User loginUser);

    public void clearPictureFile(Picture oldPicture);

}
