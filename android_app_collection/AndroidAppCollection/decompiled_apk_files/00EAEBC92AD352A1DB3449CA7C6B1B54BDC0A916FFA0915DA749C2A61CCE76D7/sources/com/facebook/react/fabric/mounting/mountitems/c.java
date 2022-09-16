package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
/* loaded from: classes.dex */
public class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f5498a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5499b;

    /* renamed from: c  reason: collision with root package name */
    private final ReadableArray f5500c;

    public c(int i, int i2, ReadableArray readableArray) {
        this.f5498a = i;
        this.f5499b = i2;
        this.f5500c = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5498a, this.f5499b, this.f5500c);
    }

    public String toString() {
        return "DispatchCommandMountItem [" + this.f5498a + "] " + this.f5499b;
    }
}
