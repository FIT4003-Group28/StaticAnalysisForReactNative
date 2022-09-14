package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.spongycastle.i18n.TextBundle;
/* compiled from: ReactTextChangedEvent.java */
/* loaded from: classes.dex */
public class e extends com.facebook.react.uimanager.events.b<e> {

    /* renamed from: a  reason: collision with root package name */
    private String f4141a;

    /* renamed from: b  reason: collision with root package name */
    private int f4142b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topChange";
    }

    public e(int i, String str, int i2) {
        super(i);
        this.f4141a = str;
        this.f4142b = i2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString(TextBundle.TEXT_ENTRY, this.f4141a);
        b2.putInt("eventCount", this.f4142b);
        b2.putInt("target", d());
        return b2;
    }
}
