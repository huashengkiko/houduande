package dsad.cscsd.dsfdf.dcd.service;

import com.deepexi.util.pageHelper.PageBean;
import dsad.cscsd.dsfdf.dcd.domain.eo.Product;

public interface ProductService {

    PageBean getProductList(Integer page, Integer size, Integer price);

    Product getProductById(String id);

    Integer createProduct(Product product);

    Boolean deleteProductById(String id);

    void testError();
}
