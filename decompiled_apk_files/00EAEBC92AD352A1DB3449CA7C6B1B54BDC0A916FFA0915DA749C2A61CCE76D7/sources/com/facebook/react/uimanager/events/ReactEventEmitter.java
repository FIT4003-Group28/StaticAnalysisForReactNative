package com.facebook.react.uimanager.events;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
/* loaded from: classes.dex */
public class ReactEventEmitter implements RCTEventEmitter {
    private static final String TAG = "ReactEventEmitter";
    private final SparseArray<RCTEventEmitter> mEventEmitters = new SparseArray<>();
    private final ReactApplicationContext mReactContext;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    private RCTEventEmitter getEventEmitter(int i) {
        int a2 = com.facebook.react.uimanager.f1.a.a(i);
        RCTEventEmitter rCTEventEmitter = this.mEventEmitters.get(a2);
        if (rCTEventEmitter == null) {
            c.d.d.e.a.b(TAG, "Unable to find event emitter for reactTag: %d - uiManagerType: %d", Integer.valueOf(i), Integer.valueOf(a2));
            return (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
        }
        return rCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        getEventEmitter(i).receiveEvent(i, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        c.d.k.a.a.a(writableArray.size() > 0);
        getEventEmitter(writableArray.mo209getMap(0).getInt("target")).receiveTouches(str, writableArray, writableArray2);
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        this.mEventEmitters.put(i, rCTEventEmitter);
    }

    public void unregister(int i) {
        this.mEventEmitters.remove(i);
    }
}
