package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
public final class s3<V> {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f7672g = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f7673a;

    /* renamed from: b  reason: collision with root package name */
    private final q3<V> f7674b;

    /* renamed from: c  reason: collision with root package name */
    private final V f7675c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f7676d;

    /* renamed from: e  reason: collision with root package name */
    private volatile V f7677e;

    /* renamed from: f  reason: collision with root package name */
    private volatile V f7678f;

    private s3(String str, V v, V v2, q3<V> q3Var) {
        this.f7676d = new Object();
        this.f7677e = null;
        this.f7678f = null;
        this.f7673a = str;
        this.f7675c = v;
        this.f7674b = q3Var;
    }

    public final V a(V v) {
        synchronized (this.f7676d) {
        }
        if (v != null) {
            return v;
        }
        if (p3.f7576a == null) {
            return this.f7675c;
        }
        synchronized (f7672g) {
            if (pa.a()) {
                return this.f7678f == null ? this.f7675c : this.f7678f;
            }
            try {
                for (s3 s3Var : r.u0()) {
                    if (pa.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v2 = null;
                    try {
                        if (s3Var.f7674b != null) {
                            v2 = s3Var.f7674b.f();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f7672g) {
                        s3Var.f7678f = v2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            q3<V> q3Var = this.f7674b;
            if (q3Var == null) {
                return this.f7675c;
            }
            try {
                return q3Var.f();
            } catch (IllegalStateException unused3) {
                return this.f7675c;
            } catch (SecurityException unused4) {
                return this.f7675c;
            }
        }
    }

    public final String a() {
        return this.f7673a;
    }
}
