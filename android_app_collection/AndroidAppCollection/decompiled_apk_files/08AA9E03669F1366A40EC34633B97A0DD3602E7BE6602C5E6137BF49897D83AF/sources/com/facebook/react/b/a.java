package com.facebook.react.b;
/* compiled from: ClearableSynchronizedPool.java */
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f3167a;

    /* renamed from: b  reason: collision with root package name */
    private int f3168b = 0;

    public a(int i) {
        this.f3167a = new Object[i];
    }

    public synchronized T a() {
        if (this.f3168b == 0) {
            return null;
        }
        this.f3168b--;
        int i = this.f3168b;
        T t = (T) this.f3167a[i];
        this.f3167a[i] = null;
        return t;
    }

    public synchronized boolean a(T t) {
        if (this.f3168b == this.f3167a.length) {
            return false;
        }
        this.f3167a[this.f3168b] = t;
        this.f3168b++;
        return true;
    }

    public synchronized void b() {
        for (int i = 0; i < this.f3168b; i++) {
            this.f3167a[i] = null;
        }
        this.f3168b = 0;
    }
}
