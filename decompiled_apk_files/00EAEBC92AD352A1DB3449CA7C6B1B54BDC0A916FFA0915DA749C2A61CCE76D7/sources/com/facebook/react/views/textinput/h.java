package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class h extends com.facebook.react.uimanager.events.c<h> {

    /* renamed from: f  reason: collision with root package name */
    private String f6364f;

    /* renamed from: g  reason: collision with root package name */
    private String f6365g;

    /* renamed from: h  reason: collision with root package name */
    private int f6366h;
    private int i;

    public h(int i, String str, String str2, int i2, int i3) {
        super(i);
        this.f6364f = str;
        this.f6365g = str2;
        this.f6366h = i2;
        this.i = i3;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("start", this.f6366h);
        createMap2.putDouble("end", this.i);
        createMap.putString("text", this.f6364f);
        createMap.putString("previousText", this.f6365g);
        createMap.putMap("range", createMap2);
        createMap.putInt("target", g());
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
        return "topTextInput";
    }
}
