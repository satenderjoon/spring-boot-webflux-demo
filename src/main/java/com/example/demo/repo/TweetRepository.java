package com.example.demo.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.models.Tweet;

@Repository
public interface TweetRepository extends ReactiveMongoRepository<Tweet, String> {

	reactor.core.publisher.Flux<Tweet> findAll();

	reactor.core.publisher.Mono<Tweet> findById(ID id);

	<S extends Tweet> reactor.core.publisher.Mono<S> save(S entity);

	reactor.core.publisher.Mono<Void> delete(Tweet entity);
}