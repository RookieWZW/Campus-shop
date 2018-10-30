package com.rookiewzw.myo2o.service;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.rookiewzw.myo2o.dto.ProductExecution;
import com.rookiewzw.myo2o.entity.Product;

public interface ProductService {
	
	
	ProductExecution getProductList(Product productCondition,int pageIndex,int pageSize);
	
	Product getProductById(long productId);
	
	ProductExecution addProduct(Product product,CommonsMultipartFile thumbnail,List<CommonsMultipartFile> productImg) throws RuntimeException;
	
	ProductExecution modifyProduct(Product product, CommonsMultipartFile thumbnail,
			List<CommonsMultipartFile> productImgs) throws RuntimeException;
	
	
}
