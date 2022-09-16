package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class i extends com.facebook.react.uimanager.events.c<i> {

    /* renamed from: g  reason: collision with root package name */
    private static final androidx.core.util.f<i> f9934g = new androidx.core.util.f<>(7);

    /* renamed from: f  reason: collision with root package name */
    private WritableMap f9935f;

    private i() {
    }

    private void a(c.f.a.b bVar, int i, int i2, c cVar) {
        super.a(bVar.m().getId());
        this.f9935f = Arguments.createMap();
        if (cVar != null) {
            cVar.a(bVar, this.f9935f);
        }
        this.f9935f.putInt("handlerTag", bVar.l());
        this.f9935f.putInt("state", i);
        this.f9935f.putInt("oldState", i2);
    }

    public static i b(c.f.a.b bVar, int i, int i2, c cVar) {
        i a2 = f9934g.a();
        if (a2 == null) {
            a2 = new i();
        }
        a2.a(bVar, i, i2, cVar);
        return a2;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), "onGestureHandlerStateChange", this.f9935f);
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
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void i() {
        this.f9935f = null;
        f9934g.a(this);
    }
}
