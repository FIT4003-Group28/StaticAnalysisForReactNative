package com.facebook.react.views.drawer.b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class a extends com.facebook.react.uimanager.events.c<a> {
    public a(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), Arguments.createMap());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topDrawerClose";
    }
}
