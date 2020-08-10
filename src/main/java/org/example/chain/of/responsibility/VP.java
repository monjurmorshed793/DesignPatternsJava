package org.example.chain.of.responsibility;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE){
            System.out.println("VPs can approve purchases below 1500");
        }else{
            successor.handleRequest(request);
        }
    }
}
