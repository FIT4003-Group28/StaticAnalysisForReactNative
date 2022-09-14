package com.facebook.react.views.webview.a;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: TopLoadingStartEvent.java */
/* loaded from: classes.dex */
public class c extends com.facebook.react.uimanager.events.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private ar f4217a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topLoadingStart";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public c(int i, ar arVar) {
        super(i);
        this.f4217a = arVar;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), this.f4217a);
    }
}
