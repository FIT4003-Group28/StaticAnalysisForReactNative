package com.facebook.imagepipeline.m;

import android.net.Uri;
/* compiled from: FetchState.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final j<com.facebook.imagepipeline.i.d> f2888a;

    /* renamed from: b  reason: collision with root package name */
    private final ak f2889b;

    /* renamed from: c  reason: collision with root package name */
    private long f2890c = 0;

    public s(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        this.f2888a = jVar;
        this.f2889b = akVar;
    }

    public j<com.facebook.imagepipeline.i.d> a() {
        return this.f2888a;
    }

    public ak b() {
        return this.f2889b;
    }

    public String c() {
        return this.f2889b.b();
    }

    public am d() {
        return this.f2889b.c();
    }

    public Uri e() {
        return this.f2889b.a().b();
    }

    public long f() {
        return this.f2890c;
    }

    public void a(long j) {
        this.f2890c = j;
    }
}
