package com.facebook.react.common;
/* loaded from: classes.dex */
public class a<T> implements androidx.core.util.e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f5447a;

    /* renamed from: b  reason: collision with root package name */
    private int f5448b = 0;

    public a(int i) {
        this.f5447a = new Object[i];
    }

    @Override // androidx.core.util.e
    public synchronized T a() {
        if (this.f5448b == 0) {
            return null;
        }
        this.f5448b--;
        int i = this.f5448b;
        T t = (T) this.f5447a[i];
        this.f5447a[i] = null;
        return t;
    }

    @Override // androidx.core.util.e
    public synchronized boolean a(T t) {
        if (this.f5448b == this.f5447a.length) {
            return false;
        }
        this.f5447a[this.f5448b] = t;
        this.f5448b++;
        return true;
    }

    public synchronized void b() {
        for (int i = 0; i < this.f5448b; i++) {
            this.f5447a[i] = null;
        }
        this.f5448b = 0;
    }
}
