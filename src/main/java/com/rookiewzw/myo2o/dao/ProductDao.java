package com.rookiewzw.myo2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rookiewzw.myo2o.entity.Product;

public interface ProductDao {
	
	
	List<Product>  queryProductList(@Param("productCondition")Product productCondition,@Param("rowIndex")int rowIndex,@Param("pageSize")int pageSize);
	
	
	int queryProductCount(@Param("productCondition") Product productCondition);
	
	Product queryProductByProductId(long productId);
	
	int insertProduct(Product product);
	
	int updateProduct(Product product);
	
	int updateProductCategoryToNull(long productCategoryId);
	
	int deleteProduct(@Param("productId")long productId,@Param("shopId")long shopId);
}
