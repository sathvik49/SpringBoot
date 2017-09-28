package com.satvik.springboot.topic;

import java.util.Arrays;
import java.util.List;

public class TopicService {
	private List<Topic> topic= Arrays.asList(new Topic(001,"Spring","Spring description"),
			new Topic(002,"JavaScript","javascript description")
			);
	public List<Topic> getAllTopics(){
		return topic;
	}

}
