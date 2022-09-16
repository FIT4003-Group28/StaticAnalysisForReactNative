package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.spongycastle.i18n.TextBundle;
/* compiled from: ReactTextInputEvent.java */
/* loaded from: classes.dex */
public class h extends com.facebook.react.uimanager.events.b<h> {

    /* renamed from: a  reason: collision with root package name */
    private String f4144a;

    /* renamed from: b  reason: collision with root package name */
    private String f4145b;

    /* renamed from: c  reason: collision with root package name */
    private int f4146c;

    /* renamed from: d  reason: collision with root package name */
    private int f4147d;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topTextInput";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    public h(int i, String str, String str2, int i2, int i3) {
        super(i);
        this.f4144a = str;
        this.f4145b = str2;
        this.f4146c = i2;
        this.f4147d = i3;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        ar b3 = com.facebook.react.bridge.b.b();
        b3.putDouble("start", this.f4146c);
        b3.putDouble("end", this.f4147d);
        b2.putString(TextBundle.TEXT_ENTRY, this.f4144a);
        b2.putString("previousText", this.f4145b);
        b2.a("range", b3);
        b2.putInt("target", d());
        return b2;
    }
}
