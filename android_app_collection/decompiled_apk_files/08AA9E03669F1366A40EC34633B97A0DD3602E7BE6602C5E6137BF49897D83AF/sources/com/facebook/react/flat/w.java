package com.facebook.react.flat;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PipelineRequestHelper.java */
/* loaded from: classes.dex */
public final class w implements com.facebook.c.e<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.n.b f3429a;

    /* renamed from: b  reason: collision with root package name */
    private d f3430b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> f3431c;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.common.h.a<com.facebook.imagepipeline.i.b> f3432d;
    private int e;

    @Override // com.facebook.c.e
    public void d(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(com.facebook.imagepipeline.n.b bVar) {
        this.f3429a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        this.f3430b = dVar;
        this.e++;
        if (this.e != 1) {
            Bitmap b2 = b();
            if (b2 == null) {
                return;
            }
            dVar.a(b2);
            return;
        }
        dVar.a(4);
        boolean z = false;
        com.facebook.j.a.a.a(this.f3431c == null);
        if (this.f3432d == null) {
            z = true;
        }
        com.facebook.j.a.a.a(z);
        this.f3431c = com.facebook.imagepipeline.f.j.a().i().b(this.f3429a, x.f());
        this.f3431c.a(this, com.facebook.common.b.f.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.e--;
        if (this.e != 0) {
            return;
        }
        if (this.f3431c != null) {
            this.f3431c.h();
            this.f3431c = null;
        }
        if (this.f3432d != null) {
            this.f3432d.close();
            this.f3432d = null;
        }
        this.f3430b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap b() {
        if (this.f3432d == null) {
            return null;
        }
        com.facebook.imagepipeline.i.b a2 = this.f3432d.a();
        if (!(a2 instanceof com.facebook.imagepipeline.i.a)) {
            this.f3432d.close();
            this.f3432d = null;
            return null;
        }
        return ((com.facebook.imagepipeline.i.a) a2).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.e == 0;
    }

    @Override // com.facebook.c.e
    public void a(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
        if (!cVar.b()) {
            return;
        }
        try {
            if (this.f3431c != cVar) {
                return;
            }
            this.f3431c = null;
            com.facebook.common.h.a<com.facebook.imagepipeline.i.b> d2 = cVar.d();
            if (d2 == null) {
                return;
            }
            if (!(d2.a() instanceof com.facebook.imagepipeline.i.a)) {
                d2.close();
                return;
            }
            this.f3432d = d2;
            Bitmap b2 = b();
            if (b2 == null) {
                return;
            }
            d dVar = (d) com.facebook.j.a.a.a(this.f3430b);
            dVar.b(b2);
            dVar.a(2);
            dVar.a(3);
        } finally {
            cVar.h();
        }
    }

    @Override // com.facebook.c.e
    public void b(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
        if (this.f3431c == cVar) {
            ((d) com.facebook.j.a.a.a(this.f3430b)).a(1);
            ((d) com.facebook.j.a.a.a(this.f3430b)).a(3);
            this.f3431c = null;
        }
        cVar.h();
    }

    @Override // com.facebook.c.e
    public void c(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
        if (this.f3431c == cVar) {
            this.f3431c = null;
        }
        cVar.h();
    }
}
