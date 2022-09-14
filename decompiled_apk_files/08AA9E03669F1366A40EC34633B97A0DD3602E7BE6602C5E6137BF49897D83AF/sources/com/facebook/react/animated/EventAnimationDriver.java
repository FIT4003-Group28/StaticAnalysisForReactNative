package com.facebook.react.animated;

import com.facebook.react.bridge.aq;
import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;
/* loaded from: classes.dex */
class EventAnimationDriver implements RCTEventEmitter {
    private List<String> mEventPath;
    q mValueNode;

    public EventAnimationDriver(List<String> list, q qVar) {
        this.mEventPath = list;
        this.mValueNode = qVar;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, ar arVar) {
        if (arVar == null) {
            throw new IllegalArgumentException("Native animated events must have event data.");
        }
        int i2 = 0;
        ar arVar2 = arVar;
        while (i2 < this.mEventPath.size() - 1) {
            i2++;
            arVar2 = arVar2.d(this.mEventPath.get(i2));
        }
        this.mValueNode.e = arVar2.getDouble(this.mEventPath.get(this.mEventPath.size() - 1));
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, aq aqVar, aq aqVar2) {
        throw new RuntimeException("receiveTouches is not support by native animated events");
    }
}
