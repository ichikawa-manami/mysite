package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserAddRequest;
import com.example.demo.dto.UserUpdateRequest;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface PortFolioMapper {

   
    /**
     * ユーザー情報登録
     * @param userRequest 登録用リクエストデータ
     */
    void save(UserAddRequest userRequest);

    /**
     * ユーザー情報更新
     * @param userUpdateRequest 更新用リクエストデータ
     */
    void update(UserUpdateRequest userUpdateRequest);


}