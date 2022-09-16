package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.spongycastle.i18n.TextBundle;
/* compiled from: ReactTextInputSubmitEditingEvent.java */
/* loaded from: classes.dex */
class n extends com.facebook.react.uimanager.events.b<n> {

    /* renamed from: a  reason: collision with root package name */
    private String f4155a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topSubmitEditing";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    public n(int i, String str) {
        super(i);
        this.f4155a = str;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("target", d());
        b2.putString(TextBundle.TEXT_ENTRY, this.f4155a);
        return b2;
    }
}
