package com.facebook.imagepipeline.m;

import com.facebook.imagepipeline.n.b;
import java.util.Map;
/* compiled from: EncodedMemoryCacheProducer.java */
/* loaded from: classes.dex */
public class r implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.common.g.g> f2883a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.f f2884b;

    /* renamed from: c  reason: collision with root package name */
    private final aj<com.facebook.imagepipeline.i.d> f2885c;

    public r(com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.common.g.g> tVar, com.facebook.imagepipeline.d.f fVar, aj<com.facebook.imagepipeline.i.d> ajVar) {
        this.f2883a = tVar;
        this.f2884b = fVar;
        this.f2885c = ajVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        String b2 = akVar.b();
        am c2 = akVar.c();
        c2.a(b2, "EncodedMemoryCacheProducer");
        com.facebook.b.a.d c3 = this.f2884b.c(akVar.a(), akVar.d());
        com.facebook.common.h.a<com.facebook.common.g.g> a2 = this.f2883a.a((com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.common.g.g>) c3);
        Map<String, String> map = null;
        try {
            if (a2 != null) {
                com.facebook.imagepipeline.i.d dVar = new com.facebook.imagepipeline.i.d(a2);
                dVar.a(c3);
                if (c2.b(b2)) {
                    map = com.facebook.common.d.f.a("cached_value_found", "true");
                }
                c2.a(b2, "EncodedMemoryCacheProducer", map);
                c2.a(b2, "EncodedMemoryCacheProducer", true);
                jVar.b(1.0f);
                jVar.b(dVar, true);
                com.facebook.imagepipeline.i.d.d(dVar);
                com.facebook.common.h.a.c(a2);
            } else if (akVar.e().a() >= b.EnumC0062b.ENCODED_MEMORY_CACHE.a()) {
                c2.a(b2, "EncodedMemoryCacheProducer", c2.b(b2) ? com.facebook.common.d.f.a("cached_value_found", "false") : null);
                c2.a(b2, "EncodedMemoryCacheProducer", false);
                jVar.b(null, true);
                com.facebook.common.h.a.c(a2);
            } else {
                a aVar = new a(jVar, this.f2883a, c3);
                if (c2.b(b2)) {
                    map = com.facebook.common.d.f.a("cached_value_found", "false");
                }
                c2.a(b2, "EncodedMemoryCacheProducer", map);
                this.f2885c.a(aVar, akVar);
                com.facebook.common.h.a.c(a2);
            }
        } catch (Throwable th) {
            com.facebook.common.h.a.c(a2);
            throw th;
        }
    }

    /* compiled from: EncodedMemoryCacheProducer.java */
    /* loaded from: classes.dex */
    private static class a extends m<com.facebook.imagepipeline.i.d, com.facebook.imagepipeline.i.d> {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.common.g.g> f2886a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.b.a.d f2887b;

        public a(j<com.facebook.imagepipeline.i.d> jVar, com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.common.g.g> tVar, com.facebook.b.a.d dVar) {
            super(jVar);
            this.f2886a = tVar;
            this.f2887b = dVar;
        }

        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            if (!z || dVar == null) {
                d().b(dVar, z);
                return;
            }
            com.facebook.common.h.a<com.facebook.common.g.g> c2 = dVar.c();
            if (c2 != null) {
                try {
                    com.facebook.common.h.a<com.facebook.common.g.g> a2 = this.f2886a.a(dVar.j() != null ? dVar.j() : this.f2887b, c2);
                    if (a2 != null) {
                        try {
                            com.facebook.imagepipeline.i.d dVar2 = new com.facebook.imagepipeline.i.d(a2);
                            dVar2.b(dVar);
                            try {
                                d().b(1.0f);
                                d().b(dVar2, true);
                                return;
                            } finally {
                                com.facebook.imagepipeline.i.d.d(dVar2);
                            }
                        } finally {
                            com.facebook.common.h.a.c(a2);
                        }
                    }
                } finally {
                    com.facebook.common.h.a.c(c2);
                }
            }
            d().b(dVar, true);
        }
    }
}
