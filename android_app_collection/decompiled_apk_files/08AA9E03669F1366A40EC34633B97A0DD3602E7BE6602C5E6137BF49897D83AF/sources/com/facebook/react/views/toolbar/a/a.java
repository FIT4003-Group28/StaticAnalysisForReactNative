package com.facebook.react.views.toolbar.a;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.b;
/* compiled from: ToolbarClickEvent.java */
/* loaded from: classes.dex */
public class a extends b<a> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4163a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topSelect";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    public a(int i, int i2) {
        super(i);
        this.f4163a = i2;
    }

    public int j() {
        return this.f4163a;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("position", j());
        rCTEventEmitter.receiveEvent(d(), a(), writableNativeMap);
    }
}
