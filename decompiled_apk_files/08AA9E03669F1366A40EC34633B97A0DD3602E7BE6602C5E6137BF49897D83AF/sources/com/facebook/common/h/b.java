package com.facebook.common.h;

import java.lang.ref.SoftReference;
/* compiled from: OOMSoftReference.java */
/* loaded from: classes.dex */
public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    SoftReference<T> f2303a = null;

    /* renamed from: b  reason: collision with root package name */
    SoftReference<T> f2304b = null;

    /* renamed from: c  reason: collision with root package name */
    SoftReference<T> f2305c = null;

    public void a(T t) {
        this.f2303a = new SoftReference<>(t);
        this.f2304b = new SoftReference<>(t);
        this.f2305c = new SoftReference<>(t);
    }

    public T a() {
        if (this.f2303a == null) {
            return null;
        }
        return this.f2303a.get();
    }

    public void b() {
        if (this.f2303a != null) {
            this.f2303a.clear();
            this.f2303a = null;
        }
        if (this.f2304b != null) {
            this.f2304b.clear();
            this.f2304b = null;
        }
        if (this.f2305c != null) {
            this.f2305c.clear();
            this.f2305c = null;
        }
    }
}
