package com.veelur.sync.elasticsearch.exception;

/**
 * @author: veelur
 * @date: 18-10-22
 * @Description: {相关描述}
 */
public class ElasticErrorException extends RuntimeException {
    public ElasticErrorException() {
    }

    public ElasticErrorException(String message) {
        super(message);
    }
}
