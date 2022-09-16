package com.facebook.react.fabric.mounting.mountitems;
/* loaded from: classes.dex */
public class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private int f5515a;

    /* renamed from: b  reason: collision with root package name */
    private int f5516b;

    /* renamed from: c  reason: collision with root package name */
    private int f5517c;

    public i(int i, int i2, int i3) {
        this.f5515a = i;
        this.f5516b = i2;
        this.f5517c = i3;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5516b, this.f5517c);
    }

    public String toString() {
        return "RemoveMountItem [" + this.f5515a + "] - parentTag: " + this.f5516b + " - index: " + this.f5517c;
    }
}
