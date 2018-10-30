package com.rookiewzw.myo2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rookiewzw.myo2o.entity.HeadLine;

public interface HeadLineDao {
	
	
	List<HeadLine> queryHeadLine(@Param("headLineCondition")HeadLine headLineCodition);
	
	
	HeadLine queryHeadLineById(long lineId);
	
	List<HeadLine> queryHeadLineByIds(List<Long> lineList);
	
	int insertHeadLine(HeadLine headLine);
	
	int updateHeadLine(HeadLine headLine);
	
	int deleteHeadLine(long headLine);
	
	int batchDeleteHeadLine(List<Long> lineIdList);
}
