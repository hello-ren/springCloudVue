package com.day.eurekaprovider.base.service.imp;


import com.day.eurekaprovider.base.mapper.TreeNodeMapper;
import com.day.eurekaprovider.base.model.TreeNode;
import com.day.eurekaprovider.base.service.ITreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeNodeServiceImpl implements ITreeNodeService {

    @Autowired
    private TreeNodeMapper treeNodeMapper;

    public List<TreeNode> listParent(TreeNode treeNode) {

        List<TreeNode> treeNodes = treeNodeMapper.listParent(treeNode);
        for (TreeNode t:treeNodes){
            List<TreeNode> treeNodesChil = treeNodeMapper.listParent(t);
            t.setChildN(treeNodesChil);
        }
        return treeNodes;
    }

    public TreeNode one(TreeNode treeNode) {
        return treeNodeMapper.selectByPrimaryKey(treeNode.getTreeNodeId());
    }
}
