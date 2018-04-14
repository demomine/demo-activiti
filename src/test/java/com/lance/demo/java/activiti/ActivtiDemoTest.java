package com.lance.demo.java.activiti;

import org.junit.Test;

import static org.junit.Assert.*;

public class ActivtiDemoTest {

    @Test
    public void helloworld() {
        new ActivtiDemo().helloworld();
    }

    @Test
    public void bpmn() {
        new ActivtiDemo().bpmn();
    }
}