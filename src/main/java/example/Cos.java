package example;

import com.qcloud.scf.runtime.Context;
import com.qcloud.services.scf.runtime.events.CosEvent;

public class Cos {
    public void mainHandler(CosEvent cosEvent, Context context) {
        System.out.println("start main handler");
        System.out.println("cosEvent: " + cosEvent);
        System.out.println("context: " + context);
    }
}
