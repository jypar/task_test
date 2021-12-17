package com.example.task.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement
public class Response {

    @XmlElement
    private Long id;
    @XmlElement
    private Long p_id;
    @XmlElement
    private Integer status;
    @XmlElement
    private String message;
    @XmlElement
    private Date dts;

    public Response() {
    }

    public Response(Long id, Long p_id, Integer status, String message, Date dts) {
        this.id = id;
        this.p_id = p_id;
        this.status = status;
        this.message = message;
        this.dts = dts;
    }

}
