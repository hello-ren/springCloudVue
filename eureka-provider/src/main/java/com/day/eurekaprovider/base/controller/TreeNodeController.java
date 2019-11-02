package com.day.eurekaprovider.base.controller;

import com.day.eurekaprovider.base.model.TreeNode;
import com.day.eurekaprovider.base.service.ITreeNodeService;
import com.day.eurekaprovider.base.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/treeNode")
public class TreeNodeController {

    @Autowired
    public ITreeNodeService treeNodeService;

    @CrossOrigin // 注解方式
    @RequestMapping("list")
    public JsonData list(TreeNode treeNode){
        List<TreeNode> treeNodes = treeNodeService.listParent(treeNode);
        JsonData jsonData=new JsonData();
        jsonData.setResult(treeNodes);
        jsonData.setCode(0);
        return jsonData;
    }
}
