package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f5507a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5508b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5509c;

    /* renamed from: d  reason: collision with root package name */
    private final ReadableMap f5510d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f5511e;

    /* renamed from: f  reason: collision with root package name */
    private final k0 f5512f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5513g;

    public g(k0 k0Var, int i, int i2, String str, ReadableMap readableMap, j0 j0Var, boolean z) {
        this.f5512f = k0Var;
        this.f5507a = str;
        this.f5508b = i;
        this.f5510d = readableMap;
        this.f5511e = j0Var;
        this.f5509c = i2;
        this.f5513g = z;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        if (com.facebook.react.fabric.c.w) {
            c.d.d.e.a.a("FabricUIManager", "Executing pre-allocation of: " + toString());
        }
        bVar.b(this.f5512f, this.f5507a, this.f5509c, this.f5510d, this.f5511e, this.f5513g);
    }

    public String toString() {
        return "PreAllocateViewMountItem [" + this.f5509c + "] - component: " + this.f5507a + " rootTag: " + this.f5508b + " isLayoutable: " + this.f5513g;
    }
}
