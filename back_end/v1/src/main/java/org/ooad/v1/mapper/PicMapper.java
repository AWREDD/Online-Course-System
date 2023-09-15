package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Pic;

@Mapper
public interface PicMapper {

    void insertPic(Pic pic);

    Pic selectPicById(Integer pic_id);

    Pic selectPicByUrl(String url);
}
