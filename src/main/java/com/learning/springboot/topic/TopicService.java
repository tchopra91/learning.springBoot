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

    public Topic getTopic(String id) {
        return this.topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    public void addTopic(Topic topic) {
        this.topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        this.topics.removeIf(t -> t.getId().equals(id));
    }
}