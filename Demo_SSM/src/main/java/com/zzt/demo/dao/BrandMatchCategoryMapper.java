package com.zzt.demo.dao;

import com.zzt.demo.entity.BrandMatchCategory;
import com.zzt.demo.entity.BrandMatchCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandMatchCategoryMapper {
    int countByExample(BrandMatchCategoryExample example);

    int deleteByExample(BrandMatchCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrandMatchCategory record);

    int insertSelective(BrandMatchCategory record);

    List<BrandMatchCategory> selectByExample(BrandMatchCategoryExample example);

    BrandMatchCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandMatchCategory record, @Param("example") BrandMatchCategoryExample example);

    int updateByExample(@Param("record") BrandMatchCategory record, @Param("example") BrandMatchCategoryExample example);

    int updateByPrimaryKeySelective(BrandMatchCategory record);

    int updateByPrimaryKey(BrandMatchCategory record);
}