package cn.nonocast.cache;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class World implements Serializable {
	private static final Logger logger = LoggerFactory.getLogger(World.class);

	@JsonProperty
	private Long id;

	@JsonProperty
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public World() { }

	public World(Long id, String name) {
		this.id = id;
		this.name = name;

		logger.info("new World() ...");
	}
}