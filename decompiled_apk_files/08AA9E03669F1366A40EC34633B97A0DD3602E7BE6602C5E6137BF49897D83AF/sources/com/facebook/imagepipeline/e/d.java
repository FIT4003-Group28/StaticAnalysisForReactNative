package com.facebook.imagepipeline.e;

import com.facebook.common.d.i;
/* compiled from: ResizeOptions.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f2632a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2633b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2634c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2635d;

    public d(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    public d(int i, int i2, float f) {
        this(i, i2, f, 0.6666667f);
    }

    public d(int i, int i2, float f, float f2) {
        boolean z = false;
        i.a(i > 0);
        i.a(i2 > 0 ? true : z);
        this.f2632a = i;
        this.f2633b = i2;
        this.f2634c = f;
        this.f2635d = f2;
    }

    public int hashCode() {
        return com.facebook.common.l.b.a(this.f2632a, this.f2633b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2632a == dVar.f2632a && this.f2633b == dVar.f2633b;
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.f2632a), Integer.valueOf(this.f2633b));
    }
}
