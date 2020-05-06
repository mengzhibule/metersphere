package io.metersphere.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestCase implements Serializable {
    private String id;

    private Integer nodeId;

    private String nodePath;

    private String projectId;

    private String name;

    private String type;

    private String maintainer;

    private String priority;

    private String method;

    private String prerequisite;

    private Long createTime;

    private Long updateTime;

    private static final long serialVersionUID = 1L;
}