package com.learning.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework description"),
                    new Topic("java", "Core Java", "Core Java description"),
                    new Topic("javascript", "JavaScript", "JavaScript description")));

    public List<Topic> getAllTopics() {
        return this.topics;
    }
}