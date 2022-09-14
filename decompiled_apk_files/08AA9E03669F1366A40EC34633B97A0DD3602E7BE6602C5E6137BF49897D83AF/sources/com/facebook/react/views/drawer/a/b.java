package com.facebook.react.views.drawer.a;

import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: DrawerOpenedEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.b<b> {
    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topDrawerOpened";
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public b(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), com.facebook.react.bridge.b.b());
    }
}
