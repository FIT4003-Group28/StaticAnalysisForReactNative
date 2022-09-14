package com.facebook.react.bridge;
/* compiled from: ModuleSpec.java */
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static final Class[] f3295a = new Class[0];

    /* renamed from: b  reason: collision with root package name */
    private static final Class[] f3296b = {ah.class};

    /* renamed from: c  reason: collision with root package name */
    private final Class<? extends NativeModule> f3297c;

    /* renamed from: d  reason: collision with root package name */
    private final javax.a.a<? extends NativeModule> f3298d;

    public static z a(Class<? extends NativeModule> cls, javax.a.a<? extends NativeModule> aVar) {
        return new z(cls, aVar);
    }

    private z(Class<? extends NativeModule> cls, javax.a.a<? extends NativeModule> aVar) {
        this.f3297c = cls;
        this.f3298d = aVar;
    }

    public Class<? extends NativeModule> a() {
        return this.f3297c;
    }

    public javax.a.a<? extends NativeModule> b() {
        return this.f3298d;
    }
}
