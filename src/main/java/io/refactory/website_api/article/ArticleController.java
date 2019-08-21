package io.refactory.website_api.article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/articles")
class ArticleController {
    
    @GetMapping
    Mono getArticles() {
        return Mono.empty();
    }
}
