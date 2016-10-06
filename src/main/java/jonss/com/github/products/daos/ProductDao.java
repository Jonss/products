package jonss.com.github.products.daos;

import jonss.com.github.products.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ProductDao {

    @PersistenceContext
    private EntityManager em;

    public void save(Product product) {
        em.persist(product);
    }
}
