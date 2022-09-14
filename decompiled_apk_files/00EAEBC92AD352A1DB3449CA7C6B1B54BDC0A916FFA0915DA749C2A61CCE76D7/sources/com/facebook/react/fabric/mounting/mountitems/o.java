package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f5535a;

    /* renamed from: b  reason: collision with root package name */
    private final ReadableMap f5536b;

    public o(int i, ReadableMap readableMap) {
        this.f5535a = i;
        this.f5536b = readableMap;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.b(this.f5535a, this.f5536b);
    }

    public String toString() {
        return "UpdatePropsMountItem [" + this.f5535a + "]";
    }
}
