package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
class n extends com.facebook.react.uimanager.events.c<n> {

    /* renamed from: f  reason: collision with root package name */
    private String f6377f;

    public n(int i, String str) {
        super(i);
        this.f6377f = str;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", g());
        createMap.putString("text", this.f6377f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), j());
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topSubmitEditing";
    }
}
