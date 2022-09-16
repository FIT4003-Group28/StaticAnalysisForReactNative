package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.spongycastle.i18n.TextBundle;
/* compiled from: ReactTextInputEndEditingEvent.java */
/* loaded from: classes.dex */
class g extends com.facebook.react.uimanager.events.b<g> {

    /* renamed from: a  reason: collision with root package name */
    private String f4143a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topEndEditing";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    public g(int i, String str) {
        super(i);
        this.f4143a = str;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("target", d());
        b2.putString(TextBundle.TEXT_ENTRY, this.f4143a);
        return b2;
    }
}
