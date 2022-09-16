package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ReactTextInputKeyPressEvent.java */
/* loaded from: classes.dex */
public class j extends com.facebook.react.uimanager.events.b<h> {

    /* renamed from: a  reason: collision with root package name */
    private String f4148a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topKeyPress";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i, String str) {
        super(i);
        this.f4148a = str;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString("key", this.f4148a);
        return b2;
    }
}
