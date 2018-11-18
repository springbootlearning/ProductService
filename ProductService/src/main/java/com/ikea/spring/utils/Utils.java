package com.ikea.spring.utils;

import org.springframework.stereotype.Component;

import com.ikea.spring.model.ApiResponse;
import com.ikea.spring.model.Product;

@Component
public class Utils {

	public static ApiResponse getApiResponse(String code, String message) {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setCode(code);
		apiResponse.setMessage(message);
		return apiResponse;
	}

	public static void getUpdatedProduct(Product requestProduct, Product product) {
		if(requestProduct.getName()!=null)
			product.setName(requestProduct.getName());
		if(requestProduct.getPrice()>0)
			product.setPrice(requestProduct.getPrice());
		if(requestProduct.getQty()>0)
			product.setQty(requestProduct.getQty());
		if(requestProduct.getSku()!=null)
			product.setSku(requestProduct.getSku());
	}
}
