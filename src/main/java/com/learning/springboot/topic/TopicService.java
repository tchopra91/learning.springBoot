package com.learning.springboot.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        this.topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return this.topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        this.topicRepository.save(topic);
    }

    public void updateTopic(Topic topic) {
        this.topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        this.topicRepository.deleteById(id);
    }
}