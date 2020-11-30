package ru.shop.repo;

import org.springframework.data.repository.CrudRepository;
import ru.shop.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
