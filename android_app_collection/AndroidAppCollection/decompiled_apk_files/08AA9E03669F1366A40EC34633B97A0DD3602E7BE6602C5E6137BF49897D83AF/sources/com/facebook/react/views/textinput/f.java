package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ReactTextInputBlurEvent.java */
/* loaded from: classes.dex */
class f extends com.facebook.react.uimanager.events.b<f> {
    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topBlur";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    public f(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("target", d());
        return b2;
    }
}
