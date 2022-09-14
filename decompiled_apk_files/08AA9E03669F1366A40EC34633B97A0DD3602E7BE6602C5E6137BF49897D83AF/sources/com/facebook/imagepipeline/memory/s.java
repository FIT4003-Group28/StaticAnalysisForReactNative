package com.facebook.imagepipeline.memory;
/* compiled from: PoolFactory.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final r f2973a;

    /* renamed from: b  reason: collision with root package name */
    private d f2974b;

    /* renamed from: c  reason: collision with root package name */
    private j f2975c;

    /* renamed from: d  reason: collision with root package name */
    private l f2976d;
    private com.facebook.common.g.h e;
    private com.facebook.common.g.k f;
    private com.facebook.common.g.a g;

    public s(r rVar) {
        this.f2973a = (r) com.facebook.common.d.i.a(rVar);
    }

    public d a() {
        if (this.f2974b == null) {
            this.f2974b = new d(this.f2973a.c(), this.f2973a.a(), this.f2973a.b());
        }
        return this.f2974b;
    }

    public j b() {
        if (this.f2975c == null) {
            this.f2975c = new j(this.f2973a.c(), this.f2973a.f());
        }
        return this.f2975c;
    }

    public int c() {
        return this.f2973a.f().f;
    }

    public l d() {
        if (this.f2976d == null) {
            this.f2976d = new l(this.f2973a.c(), this.f2973a.d(), this.f2973a.e());
        }
        return this.f2976d;
    }

    public com.facebook.common.g.h e() {
        if (this.e == null) {
            this.e = new n(d(), f());
        }
        return this.e;
    }

    public com.facebook.common.g.k f() {
        if (this.f == null) {
            this.f = new com.facebook.common.g.k(g());
        }
        return this.f;
    }

    public com.facebook.common.g.a g() {
        if (this.g == null) {
            this.g = new k(this.f2973a.c(), this.f2973a.g(), this.f2973a.h());
        }
        return this.g;
    }
}
