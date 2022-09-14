package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.events.EventEmitterWrapper;
/* loaded from: classes.dex */
public class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final EventEmitterWrapper f5520a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5521b;

    public k(int i, EventEmitterWrapper eventEmitterWrapper) {
        this.f5521b = i;
        this.f5520a = eventEmitterWrapper;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5521b, this.f5520a);
    }

    public String toString() {
        return "UpdateEventEmitterMountItem [" + this.f5521b + "]";
    }
}
