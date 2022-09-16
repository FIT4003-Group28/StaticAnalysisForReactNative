package com.facebook.imagepipeline.e;
/* compiled from: RotationOptions.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private static final e f2636c = new e(-1, false);

    /* renamed from: d  reason: collision with root package name */
    private static final e f2637d = new e(-2, false);
    private static final e e = new e(-1, true);

    /* renamed from: a  reason: collision with root package name */
    private final int f2638a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2639b;

    public static e a() {
        return f2636c;
    }

    public static e b() {
        return f2637d;
    }

    public static e c() {
        return e;
    }

    private e(int i, boolean z) {
        this.f2638a = i;
        this.f2639b = z;
    }

    public boolean d() {
        return this.f2638a == -1;
    }

    public boolean e() {
        return this.f2638a != -2;
    }

    public int f() {
        if (d()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.f2638a;
    }

    public boolean g() {
        return this.f2639b;
    }

    public int hashCode() {
        return com.facebook.common.l.b.a(Integer.valueOf(this.f2638a), Boolean.valueOf(this.f2639b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2638a == eVar.f2638a && this.f2639b == eVar.f2639b;
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.f2638a), Boolean.valueOf(this.f2639b));
    }
}
