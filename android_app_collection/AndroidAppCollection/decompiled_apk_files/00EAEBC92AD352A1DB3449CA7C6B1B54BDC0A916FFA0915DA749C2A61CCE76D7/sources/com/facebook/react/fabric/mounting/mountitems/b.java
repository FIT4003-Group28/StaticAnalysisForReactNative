package com.facebook.react.fabric.mounting.mountitems;
/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private int f5497a;

    public b(int i) {
        this.f5497a = i;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5497a);
    }

    public String toString() {
        return "DeleteMountItem [" + this.f5497a + "]";
    }
}
