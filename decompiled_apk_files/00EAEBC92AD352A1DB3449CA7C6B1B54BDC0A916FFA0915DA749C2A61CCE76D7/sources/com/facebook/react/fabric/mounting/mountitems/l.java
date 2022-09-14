package com.facebook.react.fabric.mounting.mountitems;

import android.annotation.TargetApi;
/* loaded from: classes.dex */
public class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f5522a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5523b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5524c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5525d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5526e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5527f;

    public l(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f5522a = i;
        this.f5523b = i2;
        this.f5524c = i3;
        this.f5525d = i4;
        this.f5526e = i5;
        this.f5527f = a(i6);
    }

    @TargetApi(19)
    private static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Unsupported layout direction: " + i);
        }
        return 2;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5522a, this.f5523b, this.f5524c, this.f5525d, this.f5526e);
    }

    public String toString() {
        return "UpdateLayoutMountItem [" + this.f5522a + "] - x: " + this.f5523b + " - y: " + this.f5524c + " - height: " + this.f5526e + " - width: " + this.f5525d + " - layoutDirection: " + this.f5527f;
    }
}
