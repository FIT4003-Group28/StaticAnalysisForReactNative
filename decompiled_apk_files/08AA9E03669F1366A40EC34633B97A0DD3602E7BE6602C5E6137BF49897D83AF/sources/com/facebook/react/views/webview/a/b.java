package com.facebook.react.views.webview.a;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: TopLoadingFinishEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.b<b> {

    /* renamed from: a  reason: collision with root package name */
    private ar f4216a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topLoadingFinish";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public b(int i, ar arVar) {
        super(i);
        this.f4216a = arVar;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), this.f4216a);
    }
}
