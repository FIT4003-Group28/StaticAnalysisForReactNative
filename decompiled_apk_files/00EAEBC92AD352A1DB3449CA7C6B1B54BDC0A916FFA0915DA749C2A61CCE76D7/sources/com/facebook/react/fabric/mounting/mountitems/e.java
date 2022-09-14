package com.facebook.react.fabric.mounting.mountitems;
/* loaded from: classes.dex */
public class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private int f5504a;

    /* renamed from: b  reason: collision with root package name */
    private int f5505b;

    /* renamed from: c  reason: collision with root package name */
    private int f5506c;

    public e(int i, int i2, int i3) {
        this.f5504a = i;
        this.f5505b = i2;
        this.f5506c = i3;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5505b, this.f5504a, this.f5506c);
    }

    public String toString() {
        return "InsertMountItem [" + this.f5504a + "] - parentTag: " + this.f5505b + " - index: " + this.f5506c;
    }
}
