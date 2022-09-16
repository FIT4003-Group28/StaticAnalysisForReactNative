package com.facebook.imagepipeline.m;

import com.facebook.imagepipeline.n.b;
import java.util.Map;
/* compiled from: BitmapMemoryCacheProducer.java */
/* loaded from: classes.dex */
public class h implements aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> f2842a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.f f2843b;

    /* renamed from: c  reason: collision with root package name */
    private final aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> f2844c;

    protected String a() {
        return "BitmapMemoryCacheProducer";
    }

    public h(com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> tVar, com.facebook.imagepipeline.d.f fVar, aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar) {
        this.f2842a = tVar;
        this.f2843b = fVar;
        this.f2844c = ajVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, ak akVar) {
        am c2 = akVar.c();
        String b2 = akVar.b();
        c2.a(b2, a());
        com.facebook.b.a.d a2 = this.f2843b.a(akVar.a(), akVar.d());
        com.facebook.common.h.a<com.facebook.imagepipeline.i.b> a3 = this.f2842a.a((com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b>) a2);
        Map<String, String> map = null;
        if (a3 != null) {
            boolean c3 = a3.a().d().c();
            if (c3) {
                c2.a(b2, a(), c2.b(b2) ? com.facebook.common.d.f.a("cached_value_found", "true") : null);
                c2.a(b2, a(), true);
                jVar.b(1.0f);
            }
            jVar.b(a3, c3);
            a3.close();
            if (c3) {
                return;
            }
        }
        if (akVar.e().a() >= b.EnumC0062b.BITMAP_MEMORY_CACHE.a()) {
            c2.a(b2, a(), c2.b(b2) ? com.facebook.common.d.f.a("cached_value_found", "false") : null);
            c2.a(b2, a(), false);
            jVar.b(null, true);
            return;
        }
        j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a4 = a(jVar, a2);
        String a5 = a();
        if (c2.b(b2)) {
            map = com.facebook.common.d.f.a("cached_value_found", "false");
        }
        c2.a(b2, a5, map);
        this.f2844c.a(a4, akVar);
    }

    protected j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, final com.facebook.b.a.d dVar) {
        return new m<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>, com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>(jVar) { // from class: com.facebook.imagepipeline.m.h.1
            @Override // com.facebook.imagepipeline.m.b
            public void a(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar, boolean z) {
                com.facebook.common.h.a<com.facebook.imagepipeline.i.b> a2;
                if (aVar == null) {
                    if (!z) {
                        return;
                    }
                    d().b(null, true);
                } else if (!aVar.a().e()) {
                    if (!z && (a2 = h.this.f2842a.a((com.facebook.imagepipeline.d.t) dVar)) != null) {
                        try {
                            com.facebook.imagepipeline.i.g d2 = aVar.a().d();
                            com.facebook.imagepipeline.i.g d3 = a2.a().d();
                            if (d3.c() || d3.a() >= d2.a()) {
                                d().b(a2, false);
                                return;
                            }
                        } finally {
                            com.facebook.common.h.a.c(a2);
                        }
                    }
                    com.facebook.common.h.a<com.facebook.imagepipeline.i.b> a3 = h.this.f2842a.a(dVar, aVar);
                    if (z) {
                        try {
                            d().b(1.0f);
                        } catch (Throwable th) {
                            com.facebook.common.h.a.c(a3);
                            throw th;
                        }
                    }
                    j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> d4 = d();
                    if (a3 != null) {
                        aVar = a3;
                    }
                    d4.b(aVar, z);
                    com.facebook.common.h.a.c(a3);
                } else {
                    d().b(aVar, z);
                }
            }
        };
    }
}
