package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: g  reason: collision with root package name */
    private static final androidx.core.util.f<b> f9918g = new androidx.core.util.f<>(7);

    /* renamed from: f  reason: collision with root package name */
    private WritableMap f9919f;

    private b() {
    }

    private void a(c.f.a.b bVar, c cVar) {
        super.a(bVar.m().getId());
        this.f9919f = Arguments.createMap();
        if (cVar != null) {
            cVar.a(bVar, this.f9919f);
        }
        this.f9919f.putInt("handlerTag", bVar.l());
        this.f9919f.putInt("state", bVar.k());
    }

    public static b b(c.f.a.b bVar, c cVar) {
        b a2 = f9918g.a();
        if (a2 == null) {
            a2 = new b();
        }
        a2.a(bVar, cVar);
        return a2;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), "onGestureHandlerEvent", this.f9919f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public short c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void i() {
        this.f9919f = null;
        f9918g.a(this);
    }
}
