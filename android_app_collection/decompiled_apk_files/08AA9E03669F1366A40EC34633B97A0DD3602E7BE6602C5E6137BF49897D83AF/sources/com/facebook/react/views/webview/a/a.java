package com.facebook.react.views.webview.a;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: TopLoadingErrorEvent.java */
/* loaded from: classes.dex */
public class a extends com.facebook.react.uimanager.events.b<a> {

    /* renamed from: a  reason: collision with root package name */
    private ar f4215a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topLoadingError";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public a(int i, ar arVar) {
        super(i);
        this.f4215a = arVar;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), this.f4215a);
    }
}
