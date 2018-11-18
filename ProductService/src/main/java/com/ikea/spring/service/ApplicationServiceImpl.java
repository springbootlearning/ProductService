package com.ikea.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikea.spring.dao.ProductServiceDAO;
import com.ikea.spring.model.Product;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	ProductServiceDAO productServiceDAO;

	@Override
	public void createProduct(Product product) {
		productServiceDAO.createProduct(product);
	}

	@Override
	public List<Product> getProducts() {
		return productServiceDAO.getProducts();
	}

	@Override
	public void deleteProduct(String id) {
		productServiceDAO.deleteProduct(id);
	}

	@Override
	public void updateProduct(Product product, String id) {
		productServiceDAO.updateProduct(product, id);

	}

	@Override
	public boolean isSkuExists(String sku) {
		return productServiceDAO.isSkuExists(sku);
	}

	@Override
	public boolean isProductExists(String id) {
		return productServiceDAO.isProductExists(id);
	}

	@Override
	public Product getProductById(String id) {
		return productServiceDAO.getProductById(id);
	}

}
