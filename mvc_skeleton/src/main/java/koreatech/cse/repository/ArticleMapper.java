package koreatech.cse.repository;


import koreatech.cse.domain.Article;
import koreatech.cse.domain.Searchable;
import koreatech.cse.domain.User;
import koreatech.cse.repository.provider.ArticleSqlProvider;
import koreatech.cse.repository.provider.UserSqlProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper {
    @Insert("INSERT INTO ARTICLES (AUTHOR, CONTENT, USER_ID) VALUES (#{author}, #{content}, #{userId})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
    void insert(Article article);

    @Update("UPDATE ARTICLES SET AUTHOR = #{author}, CONTENT = #{content} WHERE ID = #{id}")
    void update(Article article);

    @Select("SELECT * FROM ARTICLES WHERE ID = #{id}")
    Article findOne(@Param("id") int id);

    @Delete("DELETE FROM ARTICLES WHERE ID = #{id}")
    void delete(@Param("id") int id);

    @SelectProvider(type = ArticleSqlProvider.class, method = "findAllByProvider")
    List<Article> findByProvider();
}
