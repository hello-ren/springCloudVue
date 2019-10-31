package com.day.eurekaprovider.base.service.imp;

import com.day.eurekaprovider.base.model.TreeNode;
import com.day.eurekaprovider.base.service.ITreeNodeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

public class TreeNodeServiceImplTest extends BaseTest {

    private TreeNode treeNode;

        @Autowired
//    @Resource
    private ITreeNodeService treeNodeService;

    @Before
    public void setUp() throws Exception {
        treeNode = new TreeNode();
    }

    @Test
    public void list() throws Exception {
        List<TreeNode> treeNodes = treeNodeService.listParent(treeNode);
        for (TreeNode t : treeNodes) {
            System.out.println(t);
        }
    }

}