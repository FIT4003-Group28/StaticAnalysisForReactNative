package com.facebook.react.fabric.mounting.mountitems;
/* loaded from: classes.dex */
public class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f5518a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5519b;

    public j(int i, int i2) {
        this.f5518a = i;
        this.f5519b = i2;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.b(this.f5518a, this.f5519b);
    }

    public String toString() {
        return "SendAccessibilityEvent [" + this.f5518a + "] " + this.f5519b;
    }
}
