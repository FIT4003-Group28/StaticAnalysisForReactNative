package com.facebook.react.bridge;

import android.support.v4.i.j;
/* compiled from: DynamicFromArray.java */
/* loaded from: classes.dex */
public class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private static final j.a<h> f3239a = new j.a<>(10);

    /* renamed from: b  reason: collision with root package name */
    private am f3240b;

    /* renamed from: c  reason: collision with root package name */
    private int f3241c = -1;

    private h() {
    }

    public static h a(am amVar, int i) {
        h a2 = f3239a.a();
        if (a2 == null) {
            a2 = new h();
        }
        a2.f3240b = amVar;
        a2.f3241c = i;
        return a2;
    }

    @Override // com.facebook.react.bridge.g
    public void e() {
        this.f3240b = null;
        this.f3241c = -1;
        f3239a.a(this);
    }

    @Override // com.facebook.react.bridge.g
    public boolean a() {
        if (this.f3240b == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.f3240b.isNull(this.f3241c);
    }

    @Override // com.facebook.react.bridge.g
    public double b() {
        if (this.f3240b == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.f3240b.getDouble(this.f3241c);
    }

    @Override // com.facebook.react.bridge.g
    public String c() {
        if (this.f3240b == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.f3240b.getString(this.f3241c);
    }

    @Override // com.facebook.react.bridge.g
    public ReadableType d() {
        if (this.f3240b == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.f3240b.getType(this.f3241c);
    }
}
