package com.facebook.imagepipeline.f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: DefaultExecutorSupplier.java */
/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2640a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2641b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f2642c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f2643d;

    public a(int i) {
        k kVar = new k(10);
        this.f2640a = Executors.newFixedThreadPool(2);
        this.f2641b = Executors.newFixedThreadPool(i, kVar);
        this.f2642c = Executors.newFixedThreadPool(i, kVar);
        this.f2643d = Executors.newFixedThreadPool(1, kVar);
    }

    @Override // com.facebook.imagepipeline.f.e
    public Executor a() {
        return this.f2640a;
    }

    @Override // com.facebook.imagepipeline.f.e
    public Executor b() {
        return this.f2640a;
    }

    @Override // com.facebook.imagepipeline.f.e
    public Executor c() {
        return this.f2641b;
    }

    @Override // com.facebook.imagepipeline.f.e
    public Executor d() {
        return this.f2642c;
    }

    @Override // com.facebook.imagepipeline.f.e
    public Executor e() {
        return this.f2643d;
    }
}
