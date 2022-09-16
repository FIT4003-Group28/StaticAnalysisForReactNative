package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: f  reason: collision with root package name */
    private final String f6406f;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i, String str) {
        super(i);
        this.f6406f = str;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("pageScrollState", this.f6406f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), j());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topPageScrollStateChanged";
    }
}
