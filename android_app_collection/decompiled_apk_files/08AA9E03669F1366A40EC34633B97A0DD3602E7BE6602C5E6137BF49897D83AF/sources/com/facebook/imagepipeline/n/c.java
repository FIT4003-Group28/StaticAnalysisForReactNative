package com.facebook.imagepipeline.n;

import android.net.Uri;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.f.h;
import com.facebook.imagepipeline.n.b;
/* compiled from: ImageRequestBuilder.java */
/* loaded from: classes.dex */
public class c {
    private com.facebook.imagepipeline.j.c l;

    /* renamed from: a  reason: collision with root package name */
    private Uri f2993a = null;

    /* renamed from: b  reason: collision with root package name */
    private b.EnumC0062b f2994b = b.EnumC0062b.FULL_FETCH;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.imagepipeline.e.d f2995c = null;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.imagepipeline.e.e f2996d = null;
    private com.facebook.imagepipeline.e.a e = com.facebook.imagepipeline.e.a.a();
    private b.a f = b.a.DEFAULT;
    private boolean g = h.e().a();
    private boolean h = false;
    private com.facebook.imagepipeline.e.c i = com.facebook.imagepipeline.e.c.HIGH;
    private e j = null;
    private boolean k = true;
    private d m = null;

    public static c a(Uri uri) {
        return new c().b(uri);
    }

    private c() {
    }

    public c b(Uri uri) {
        i.a(uri);
        this.f2993a = uri;
        return this;
    }

    public Uri a() {
        return this.f2993a;
    }

    public d b() {
        return this.m;
    }

    public b.EnumC0062b c() {
        return this.f2994b;
    }

    @Deprecated
    public c a(boolean z) {
        if (z) {
            return a(com.facebook.imagepipeline.e.e.a());
        }
        return a(com.facebook.imagepipeline.e.e.b());
    }

    public c a(com.facebook.imagepipeline.e.d dVar) {
        this.f2995c = dVar;
        return this;
    }

    public com.facebook.imagepipeline.e.d d() {
        return this.f2995c;
    }

    public c a(com.facebook.imagepipeline.e.e eVar) {
        this.f2996d = eVar;
        return this;
    }

    public com.facebook.imagepipeline.e.e e() {
        return this.f2996d;
    }

    public com.facebook.imagepipeline.e.a f() {
        return this.e;
    }

    public c a(b.a aVar) {
        this.f = aVar;
        return this;
    }

    public b.a g() {
        return this.f;
    }

    public c b(boolean z) {
        this.g = z;
        return this;
    }

    public boolean h() {
        return this.g;
    }

    public c c(boolean z) {
        this.h = z;
        return this;
    }

    public boolean i() {
        return this.h;
    }

    public boolean j() {
        return this.k && com.facebook.common.l.f.a(this.f2993a);
    }

    public com.facebook.imagepipeline.e.c k() {
        return this.i;
    }

    public c a(e eVar) {
        this.j = eVar;
        return this;
    }

    public e l() {
        return this.j;
    }

    public com.facebook.imagepipeline.j.c m() {
        return this.l;
    }

    public b n() {
        o();
        return new b(this);
    }

    /* compiled from: ImageRequestBuilder.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    protected void o() {
        if (this.f2993a == null) {
            throw new a("Source must be set!");
        }
        if (com.facebook.common.l.f.g(this.f2993a)) {
            if (!this.f2993a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.f2993a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f2993a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (com.facebook.common.l.f.f(this.f2993a) && !this.f2993a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
    }
}
