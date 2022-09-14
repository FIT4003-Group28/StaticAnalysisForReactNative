package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f5528a;

    /* renamed from: b  reason: collision with root package name */
    private final ReadableMap f5529b;

    public m(int i, ReadableMap readableMap) {
        this.f5528a = i;
        this.f5529b = readableMap;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5528a, this.f5529b);
    }

    public String toString() {
        return "UpdateLocalDataMountItem [" + this.f5528a + "]";
    }
}
