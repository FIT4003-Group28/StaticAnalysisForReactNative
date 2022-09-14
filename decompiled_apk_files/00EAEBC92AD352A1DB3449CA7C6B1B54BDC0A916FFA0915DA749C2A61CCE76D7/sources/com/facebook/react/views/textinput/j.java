package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class j extends com.facebook.react.uimanager.events.c<h> {

    /* renamed from: f  reason: collision with root package name */
    private String f6367f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i, String str) {
        super(i);
        this.f6367f = str;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("key", this.f6367f);
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
        return "topKeyPress";
    }
}
