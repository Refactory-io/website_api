package io.refactory.website_api.article;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/articles")
class ArticleController {
    
    @GetMapping
    Mono<ResponseEntity> getArticles() {
        return Mono.just(ResponseEntity.notFound().build());
    }
    
    @GetMapping("/{id}")
    Mono<ResponseEntity> getArticle(@PathVariable int id) {
        return Mono.just(ResponseEntity.notFound().build());
    }
}
