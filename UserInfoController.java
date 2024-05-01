package com.example.mybatis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mybatis.dto.UserAddRequest;
import com.example.mybatis.dto.UserSearchRequest;
import com.example.mybatis.dto.UserUpdateRequest;
import com.example.mybatis.entity.UserInfo;
import com.example.mybatis.service.UserInfoService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserInfoController {
  /**
     * ユーザー情報 Service
     */
    @Autowired
    private UserInfoService userInfoService;

    /**
     * ユーザー情報一覧画面を表示
     * @param model Model
     * @return ユーザー情報一覧画面
     */
    @GetMapping(value = "/user/list")
    public String displayList(Model model) {
        List<UserInfo> userList = userInfoService.findAll();
        model.addAttribute("userlist", userList);
        model.addAttribute("userSearchRequest", new UserSearchRequest());
        return "user/search";
    }

}
