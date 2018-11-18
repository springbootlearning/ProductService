package com.ikea.spring.service;

import java.util.List;

import com.ikea.spring.model.Product;

public interface ApplicationService {

	public void createProduct(Product product);

	public List<Product> getProducts();

	public void deleteProduct(String id);

	public void updateProduct(Product product, String id);

	public boolean isSkuExists(String sku);

	public boolean isProductExists(String id);

	public Product getProductById(String id);

}
