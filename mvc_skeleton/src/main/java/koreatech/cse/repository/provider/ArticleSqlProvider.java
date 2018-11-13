package koreatech.cse.repository.provider;

import koreatech.cse.domain.Searchable;
import org.apache.ibatis.jdbc.SQL;

public class ArticleSqlProvider {

    public String findAllByProvider() {
        return new SQL() {
            {
                SELECT("*");
                FROM("ARTICLES");
            }
        }.toString();
    }
}
