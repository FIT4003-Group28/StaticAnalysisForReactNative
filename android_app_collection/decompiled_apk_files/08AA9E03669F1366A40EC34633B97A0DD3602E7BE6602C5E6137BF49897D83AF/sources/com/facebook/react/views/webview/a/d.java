package com.facebook.react.views.webview.a;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
/* compiled from: TopMessageEvent.java */
/* loaded from: classes.dex */
public class d extends com.facebook.react.uimanager.events.b<d> {

    /* renamed from: a  reason: collision with root package name */
    private final String f4218a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topMessage";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public d(int i, String str) {
        super(i);
        this.f4218a = str;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString(DataBufferSafeParcelable.DATA_FIELD, this.f4218a);
        rCTEventEmitter.receiveEvent(d(), "topMessage", b2);
    }
}
