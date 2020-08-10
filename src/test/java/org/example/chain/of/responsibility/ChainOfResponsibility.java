package org.example.chain.of.responsibility;

import org.junit.Test;

public class ChainOfResponsibility {
    @Test
    public void testChainOfResponsibility(){
        Director brayan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();
        brayan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        brayan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        crystal.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        brayan.handleRequest(request);
    }
}
