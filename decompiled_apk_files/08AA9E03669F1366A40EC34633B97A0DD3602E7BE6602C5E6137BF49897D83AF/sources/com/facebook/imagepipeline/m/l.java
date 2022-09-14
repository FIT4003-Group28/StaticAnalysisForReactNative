package com.facebook.imagepipeline.m;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.m.u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: DecodeProducer.java */
/* loaded from: classes.dex */
public class l implements aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.g.a f2851a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2852b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.h.b f2853c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.imagepipeline.h.d f2854d;
    private final aj<com.facebook.imagepipeline.i.d> e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    public l(com.facebook.common.g.a aVar, Executor executor, com.facebook.imagepipeline.h.b bVar, com.facebook.imagepipeline.h.d dVar, boolean z, boolean z2, boolean z3, aj<com.facebook.imagepipeline.i.d> ajVar) {
        this.f2851a = (com.facebook.common.g.a) com.facebook.common.d.i.a(aVar);
        this.f2852b = (Executor) com.facebook.common.d.i.a(executor);
        this.f2853c = (com.facebook.imagepipeline.h.b) com.facebook.common.d.i.a(bVar);
        this.f2854d = (com.facebook.imagepipeline.h.d) com.facebook.common.d.i.a(dVar);
        this.f = z;
        this.g = z2;
        this.e = (aj) com.facebook.common.d.i.a(ajVar);
        this.h = z3;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, ak akVar) {
        j<com.facebook.imagepipeline.i.d> bVar;
        if (!com.facebook.common.l.f.a(akVar.a().b())) {
            bVar = new a(jVar, akVar, this.h);
        } else {
            bVar = new b(jVar, akVar, new com.facebook.imagepipeline.h.e(this.f2851a), this.f2854d, this.h);
        }
        this.e.a(bVar, akVar);
    }

    /* compiled from: DecodeProducer.java */
    /* loaded from: classes.dex */
    private abstract class c extends m<com.facebook.imagepipeline.i.d, com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

        /* renamed from: a  reason: collision with root package name */
        private final ak f2859a;

        /* renamed from: c  reason: collision with root package name */
        private final am f2861c;

        /* renamed from: d  reason: collision with root package name */
        private final com.facebook.imagepipeline.e.a f2862d;
        private boolean e;
        private final u f;

        protected abstract int a(com.facebook.imagepipeline.i.d dVar);

        protected abstract com.facebook.imagepipeline.i.g c();

        public c(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, final ak akVar, final boolean z) {
            super(jVar);
            this.f2859a = akVar;
            this.f2861c = akVar.c();
            this.f2862d = akVar.a().i();
            this.e = false;
            this.f = new u(l.this.f2852b, new u.a() { // from class: com.facebook.imagepipeline.m.l.c.1
                @Override // com.facebook.imagepipeline.m.u.a
                public void a(com.facebook.imagepipeline.i.d dVar, boolean z2) {
                    if (dVar != null) {
                        if (l.this.f) {
                            com.facebook.imagepipeline.n.b a2 = akVar.a();
                            if (l.this.g || !com.facebook.common.l.f.a(a2.b())) {
                                dVar.d(p.a(a2, dVar));
                            }
                        }
                        c.this.c(dVar, z2);
                    }
                }
            }, this.f2862d.f2620a);
            this.f2859a.a(new e() { // from class: com.facebook.imagepipeline.m.l.c.2
                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void c() {
                    if (c.this.f2859a.h()) {
                        c.this.f.b();
                    }
                }

                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void a() {
                    if (z) {
                        c.this.f();
                    }
                }
            });
        }

        @Override // com.facebook.imagepipeline.m.b
        /* renamed from: b */
        public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            if (z && !com.facebook.imagepipeline.i.d.e(dVar)) {
                c(new com.facebook.common.l.a("Encoded image is not valid."));
            } else if (!a(dVar, z)) {
            } else {
                if (!z && !this.f2859a.h()) {
                    return;
                }
                this.f.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        public void a(float f) {
            super.a(f * 0.99f);
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        public void a(Throwable th) {
            c(th);
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        public void a() {
            f();
        }

        protected boolean a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            return this.f.a(dVar, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(com.facebook.imagepipeline.i.d dVar, boolean z) {
            String str;
            String str2;
            com.facebook.imagepipeline.e.d g;
            String str3;
            long c2;
            com.facebook.imagepipeline.i.g c3;
            if (e() || !com.facebook.imagepipeline.i.d.e(dVar)) {
                return;
            }
            com.facebook.h.c e = dVar.e();
            String a2 = e != null ? e.a() : "unknown";
            if (dVar != null) {
                str = dVar.g() + "x" + dVar.h();
                str2 = String.valueOf(dVar.i());
            } else {
                str = "unknown";
                str2 = "unknown";
            }
            String str4 = str;
            String str5 = str2;
            if (this.f2859a.a().g() != null) {
                str3 = g.f2632a + "x" + g.f2633b;
            } else {
                str3 = "unknown";
            }
            String str6 = str3;
            try {
                c2 = this.f.c();
                int k = z ? dVar.k() : a(dVar);
                c3 = z ? com.facebook.imagepipeline.i.f.f2710a : c();
                this.f2861c.a(this.f2859a.b(), "DecodeProducer");
                com.facebook.imagepipeline.i.b a3 = l.this.f2853c.a(dVar, k, c3, this.f2862d);
                this.f2861c.a(this.f2859a.b(), "DecodeProducer", a(a3, c2, c3, z, a2, str4, str6, str5));
                a(a3, z);
            } catch (Exception e2) {
                this.f2861c.a(this.f2859a.b(), "DecodeProducer", e2, a(null, c2, c3, z, a2, str4, str6, str5));
                c(e2);
            } finally {
                com.facebook.imagepipeline.i.d.d(dVar);
            }
        }

        private Map<String, String> a(com.facebook.imagepipeline.i.b bVar, long j, com.facebook.imagepipeline.i.g gVar, boolean z, String str, String str2, String str3, String str4) {
            if (!this.f2861c.b(this.f2859a.b())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(gVar.b());
            String valueOf3 = String.valueOf(z);
            if (bVar instanceof com.facebook.imagepipeline.i.c) {
                Bitmap a2 = ((com.facebook.imagepipeline.i.c) bVar).a();
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", a2.getWidth() + "x" + a2.getHeight());
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                return com.facebook.common.d.f.a(hashMap);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            return com.facebook.common.d.f.a(hashMap2);
        }

        private synchronized boolean e() {
            return this.e;
        }

        private void a(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.e) {
                        d().b(1.0f);
                        this.e = true;
                        this.f.a();
                    }
                }
            }
        }

        private void a(com.facebook.imagepipeline.i.b bVar, boolean z) {
            com.facebook.common.h.a<com.facebook.imagepipeline.i.b> a2 = com.facebook.common.h.a.a(bVar);
            try {
                a(z);
                d().b(a2, z);
            } finally {
                com.facebook.common.h.a.c(a2);
            }
        }

        private void c(Throwable th) {
            a(true);
            d().b(th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            a(true);
            d().b();
        }
    }

    /* compiled from: DecodeProducer.java */
    /* loaded from: classes.dex */
    private class a extends c {
        public a(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, ak akVar, boolean z) {
            super(jVar, akVar, z);
        }

        @Override // com.facebook.imagepipeline.m.l.c
        protected synchronized boolean a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            if (!z) {
                return false;
            }
            return super.a(dVar, z);
        }

        @Override // com.facebook.imagepipeline.m.l.c
        protected int a(com.facebook.imagepipeline.i.d dVar) {
            return dVar.k();
        }

        @Override // com.facebook.imagepipeline.m.l.c
        protected com.facebook.imagepipeline.i.g c() {
            return com.facebook.imagepipeline.i.f.a(0, false, false);
        }
    }

    /* compiled from: DecodeProducer.java */
    /* loaded from: classes.dex */
    private class b extends c {

        /* renamed from: c  reason: collision with root package name */
        private final com.facebook.imagepipeline.h.e f2857c;

        /* renamed from: d  reason: collision with root package name */
        private final com.facebook.imagepipeline.h.d f2858d;
        private int e;

        public b(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, ak akVar, com.facebook.imagepipeline.h.e eVar, com.facebook.imagepipeline.h.d dVar, boolean z) {
            super(jVar, akVar, z);
            this.f2857c = (com.facebook.imagepipeline.h.e) com.facebook.common.d.i.a(eVar);
            this.f2858d = (com.facebook.imagepipeline.h.d) com.facebook.common.d.i.a(dVar);
            this.e = 0;
        }

        @Override // com.facebook.imagepipeline.m.l.c
        protected synchronized boolean a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            boolean a2 = super.a(dVar, z);
            if (!z && com.facebook.imagepipeline.i.d.e(dVar) && dVar.e() == com.facebook.h.b.f2509a) {
                if (!this.f2857c.a(dVar)) {
                    return false;
                }
                int b2 = this.f2857c.b();
                if (b2 <= this.e) {
                    return false;
                }
                if (b2 < this.f2858d.a(this.e) && !this.f2857c.c()) {
                    return false;
                }
                this.e = b2;
            }
            return a2;
        }

        @Override // com.facebook.imagepipeline.m.l.c
        protected int a(com.facebook.imagepipeline.i.d dVar) {
            return this.f2857c.a();
        }

        @Override // com.facebook.imagepipeline.m.l.c
        protected com.facebook.imagepipeline.i.g c() {
            return this.f2858d.b(this.f2857c.b());
        }
    }
}
