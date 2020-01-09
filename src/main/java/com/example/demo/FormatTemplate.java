package com.example.demo;

import com.example.demo.format.FormatProcessor;

public class FormatTemplate {
    private FormatProcessor formatProcessor;

    public FormatTemplate(FormatProcessor formatProcessor) {
        this.formatProcessor = formatProcessor;
    }

    public <T> String doFormat(T obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("result:").append(formatProcessor.format(obj));
        return stringBuilder.toString();
    }
}