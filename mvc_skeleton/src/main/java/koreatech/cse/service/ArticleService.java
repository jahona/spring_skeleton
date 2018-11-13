package koreatech.cse.service;

import koreatech.cse.domain.Article;
import koreatech.cse.domain.User;
import koreatech.cse.repository.ArticleMapper;
import koreatech.cse.repository.UserMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;

@Service
public class ArticleService {
    @Inject
    private ArticleMapper articleMapper;

    public Boolean post(Article article) {
        if(article.getContent() ==  null)
            return false;

        article.setAuthor(User.current().getUsername());
        article.setUserId(User.current().getId());
        articleMapper.insert(article);

        return true;
    }
}
