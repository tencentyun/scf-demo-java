package example;

import com.qcloud.scf.runtime.Context;
import com.qcloud.services.scf.runtime.events.CKafkaEvent;

public class Ckafka {
    public void mainHandler(CKafkaEvent cKafkaEvent, Context context) {
        System.out.println("start main handler");
        System.out.println("cKafkaEvent: " + cKafkaEvent);
        System.out.println("context: " + context);
    }
}
