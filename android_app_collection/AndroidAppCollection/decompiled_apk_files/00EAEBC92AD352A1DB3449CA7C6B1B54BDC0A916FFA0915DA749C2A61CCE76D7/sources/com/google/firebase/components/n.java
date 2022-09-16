package com.google.firebase.components;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f8554a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8555b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8556c;

    private n(Class<?> cls, int i, int i2) {
        u.a(cls, "Null dependency anInterface.");
        this.f8554a = cls;
        this.f8555b = i;
        this.f8556c = i2;
    }

    public static n a(Class<?> cls) {
        return new n(cls, 0, 0);
    }

    public static n b(Class<?> cls) {
        return new n(cls, 1, 0);
    }

    public static n c(Class<?> cls) {
        return new n(cls, 1, 1);
    }

    public static n d(Class<?> cls) {
        return new n(cls, 2, 0);
    }

    public Class<?> a() {
        return this.f8554a;
    }

    public boolean b() {
        return this.f8556c == 0;
    }

    public boolean c() {
        return this.f8555b == 1;
    }

    public boolean d() {
        return this.f8555b == 2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f8554a == nVar.f8554a && this.f8555b == nVar.f8555b && this.f8556c == nVar.f8556c;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f8554a.hashCode() ^ 1000003) * 1000003) ^ this.f8555b) * 1000003) ^ this.f8556c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8554a);
        sb.append(", type=");
        int i = this.f8555b;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.f8556c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
