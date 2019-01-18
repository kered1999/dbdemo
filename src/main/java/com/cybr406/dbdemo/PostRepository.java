package com.cybr406.dbdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by stuehmdr on 1/17/2019.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
