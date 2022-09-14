package com.facebook.react.fabric.mounting.mountitems;
/* loaded from: classes.dex */
public class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f5530a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5531b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5532c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5533d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5534e;

    public n(int i, int i2, int i3, int i4, int i5) {
        this.f5530a = i;
        this.f5531b = i2;
        this.f5532c = i3;
        this.f5533d = i4;
        this.f5534e = i5;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.b(this.f5530a, this.f5531b, this.f5532c, this.f5533d, this.f5534e);
    }

    public String toString() {
        return "UpdatePaddingMountItem [" + this.f5530a + "] - left: " + this.f5531b + " - top: " + this.f5532c + " - right: " + this.f5533d + " - bottom: " + this.f5534e;
    }
}
