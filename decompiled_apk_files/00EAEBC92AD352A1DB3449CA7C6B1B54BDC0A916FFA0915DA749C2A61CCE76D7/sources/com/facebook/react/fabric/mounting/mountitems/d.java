package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
/* loaded from: classes.dex */
public class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f5501a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5502b;

    /* renamed from: c  reason: collision with root package name */
    private final ReadableArray f5503c;

    public d(int i, String str, ReadableArray readableArray) {
        this.f5501a = i;
        this.f5502b = str;
        this.f5503c = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5501a, this.f5502b, this.f5503c);
    }

    public String toString() {
        return "DispatchStringCommandMountItem [" + this.f5501a + "] " + this.f5502b;
    }
}
