package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.uimanager.j0;
/* loaded from: classes.dex */
public class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f5537a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f5538b;

    public p(int i, j0 j0Var) {
        this.f5537a = i;
        this.f5538b = j0Var;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5537a, this.f5538b);
    }

    public String toString() {
        return "UpdateStateMountItem [" + this.f5537a + "]";
    }
}
