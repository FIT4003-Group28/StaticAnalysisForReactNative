package com.facebook.imagepipeline.e;

import android.graphics.Bitmap;
/* compiled from: ImageDecodeOptions.java */
/* loaded from: classes.dex */
public class a {
    private static final a h = b().h();

    /* renamed from: a  reason: collision with root package name */
    public final int f2620a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2621b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2622c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2623d;
    public final boolean e;
    public final Bitmap.Config f;
    public final com.facebook.imagepipeline.h.b g;

    public a(b bVar) {
        this.f2620a = bVar.a();
        this.f2621b = bVar.b();
        this.f2622c = bVar.c();
        this.f2623d = bVar.d();
        this.e = bVar.f();
        this.f = bVar.g();
        this.g = bVar.e();
    }

    public static a a() {
        return h;
    }

    public static b b() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2621b == aVar.f2621b && this.f2622c == aVar.f2622c && this.f2623d == aVar.f2623d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
    }

    public int hashCode() {
        return (((((((((((this.f2620a * 31) + (this.f2621b ? 1 : 0)) * 31) + (this.f2622c ? 1 : 0)) * 31) + (this.f2623d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f.ordinal()) * 31) + (this.g != null ? this.g.hashCode() : 0);
    }

    public String toString() {
        return String.format(null, "%d-%b-%b-%b-%b-%s-%s", Integer.valueOf(this.f2620a), Boolean.valueOf(this.f2621b), Boolean.valueOf(this.f2622c), Boolean.valueOf(this.f2623d), Boolean.valueOf(this.e), this.f.name(), this.g);
    }
}
