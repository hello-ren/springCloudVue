package com.day.eurekaprovider.base.service;

import com.day.eurekaprovider.base.model.TreeNode;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface ITreeNodeService {
    @Transactional(readOnly = true)
   public  List<TreeNode> listParent(TreeNode treeNode);

    public TreeNode one(TreeNode treeNode);

}
