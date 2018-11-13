package koreatech.cse.controller;

import koreatech.cse.domain.Article;
import koreatech.cse.repository.ArticleMapper;
import koreatech.cse.service.ArticleService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@Controller

@RequestMapping("/article")
public class ArticleController {
    @Inject
    private ArticleMapper articleMapper;
    @Inject
    private ArticleService articleService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/write")
    public String post(Model model) {
        Article article = new Article();
        model.addAttribute("article", article);
        return "article/write";
    }

    @Transactional
    @RequestMapping(value="/write", method= RequestMethod.POST)
    public String post(@ModelAttribute Article article) {
        articleService.post(article);

        return "redirect:/article/list";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/edit")
    public String edit(Model model, @RequestParam int id) {
        Article article = articleMapper.findOne(id);
        model.addAttribute("article", article);
        return "article/edit";
    }

    @RequestMapping(value="/edit", method= RequestMethod.POST)
    public String edit(@ModelAttribute Article article) {
        articleMapper.update(article);
        return "redirect:/article/list";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value="/delete", method= RequestMethod.GET)
    public String delete(@RequestParam int id) {
        articleMapper.delete(id);
        return "redirect:/article/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("articles", articleMapper.findByProvider());
        return "article/list";
    }

}
