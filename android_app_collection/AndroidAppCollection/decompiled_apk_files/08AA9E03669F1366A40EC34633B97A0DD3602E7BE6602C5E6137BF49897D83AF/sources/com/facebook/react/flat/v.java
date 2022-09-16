package com.facebook.react.flat;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: NodeRegion.java */
/* loaded from: classes.dex */
class v {

    /* renamed from: a  reason: collision with root package name */
    static final v[] f3425a = new v[0];

    /* renamed from: b  reason: collision with root package name */
    static final v f3426b = new v(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1, false);

    /* renamed from: c  reason: collision with root package name */
    final int f3427c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f3428d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;

    v(float f, float f2, float f3, float f4, int i, boolean z) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.f3427c = i;
        this.f3428d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float d() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(float f, float f2) {
        return this.e <= f && f < this.g && this.f <= f2 && f2 < this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(float f, float f2) {
        return this.f3427c;
    }
}
