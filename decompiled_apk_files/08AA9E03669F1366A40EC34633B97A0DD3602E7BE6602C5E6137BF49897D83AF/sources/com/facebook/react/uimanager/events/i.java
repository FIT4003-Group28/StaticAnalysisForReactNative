package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.aq;
import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.o;
/* compiled from: TouchesHelper.java */
/* loaded from: classes.dex */
class i {
    private static aq a(int i, f fVar) {
        aq a2 = com.facebook.react.bridge.b.a();
        MotionEvent j = fVar.j();
        float x = j.getX() - fVar.k();
        float y = j.getY() - fVar.l();
        for (int i2 = 0; i2 < j.getPointerCount(); i2++) {
            ar b2 = com.facebook.react.bridge.b.b();
            b2.putDouble("pageX", o.c(j.getX(i2)));
            b2.putDouble("pageY", o.c(j.getY(i2)));
            b2.putDouble("locationX", o.c(j.getX(i2) - x));
            b2.putDouble("locationY", o.c(j.getY(i2) - y));
            b2.putInt("target", i);
            b2.putDouble("timestamp", fVar.e());
            b2.putDouble("identifier", j.getPointerId(i2));
            a2.a(b2);
        }
        return a2;
    }

    public static void a(RCTEventEmitter rCTEventEmitter, h hVar, int i, f fVar) {
        aq a2 = a(i, fVar);
        MotionEvent j = fVar.j();
        aq a3 = com.facebook.react.bridge.b.a();
        if (hVar == h.MOVE || hVar == h.CANCEL) {
            for (int i2 = 0; i2 < j.getPointerCount(); i2++) {
                a3.pushInt(i2);
            }
        } else if (hVar == h.START || hVar == h.END) {
            a3.pushInt(j.getActionIndex());
        } else {
            throw new RuntimeException("Unknown touch type: " + hVar);
        }
        rCTEventEmitter.receiveTouches(hVar.a(), a2, a3);
    }
}
