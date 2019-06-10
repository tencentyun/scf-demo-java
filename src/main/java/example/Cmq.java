package example;

import com.qcloud.scf.runtime.Context;
import com.qcloud.services.scf.runtime.events.CMQTopicEvent;

public class Cmq {
    public void mainHandler(CMQTopicEvent cmqTopicEvent, Context context) {
        System.out.println("start main handler");
        System.out.println("cmqTopicEvent: " + cmqTopicEvent);
        System.out.println("context: " + context);
    }
}
