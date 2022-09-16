package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.q;
/* loaded from: classes.dex */
public class j {
    private static WritableArray a(int i, g gVar) {
        WritableArray createArray = Arguments.createArray();
        MotionEvent j = gVar.j();
        float x = j.getX() - gVar.k();
        float y = j.getY() - gVar.l();
        for (int i2 = 0; i2 < j.getPointerCount(); i2++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", q.a(j.getX(i2)));
            createMap.putDouble("pageY", q.a(j.getY(i2)));
            createMap.putDouble("locationX", q.a(j.getX(i2) - x));
            createMap.putDouble("locationY", q.a(j.getY(i2) - y));
            createMap.putInt("target", i);
            createMap.putDouble("timestamp", gVar.e());
            createMap.putDouble("identifier", j.getPointerId(i2));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    public static void a(RCTEventEmitter rCTEventEmitter, i iVar, int i, g gVar) {
        WritableArray a2 = a(i, gVar);
        MotionEvent j = gVar.j();
        WritableArray createArray = Arguments.createArray();
        if (iVar == i.MOVE || iVar == i.CANCEL) {
            for (int i2 = 0; i2 < j.getPointerCount(); i2++) {
                createArray.pushInt(i2);
            }
        } else if (iVar != i.START && iVar != i.END) {
            throw new RuntimeException("Unknown touch type: " + iVar);
        } else {
            createArray.pushInt(j.getActionIndex());
        }
        rCTEventEmitter.receiveTouches(i.a(iVar), a2, createArray);
    }
}
