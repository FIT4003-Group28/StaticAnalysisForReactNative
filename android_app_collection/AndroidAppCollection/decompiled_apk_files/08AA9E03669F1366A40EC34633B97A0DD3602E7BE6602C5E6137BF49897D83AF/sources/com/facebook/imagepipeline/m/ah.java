package com.facebook.imagepipeline.m;

import java.util.Map;
/* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
/* loaded from: classes.dex */
public class ah implements aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> f2765a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.f f2766b;

    /* renamed from: c  reason: collision with root package name */
    private final aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> f2767c;

    protected String a() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    public ah(com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> tVar, com.facebook.imagepipeline.d.f fVar, aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar) {
        this.f2765a = tVar;
        this.f2766b = fVar;
        this.f2767c = ajVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, ak akVar) {
        am c2 = akVar.c();
        String b2 = akVar.b();
        com.facebook.imagepipeline.n.b a2 = akVar.a();
        Object d2 = akVar.d();
        com.facebook.imagepipeline.n.e p = a2.p();
        if (p == null || p.a() == null) {
            this.f2767c.a(jVar, akVar);
            return;
        }
        c2.a(b2, a());
        com.facebook.b.a.d b3 = this.f2766b.b(a2, d2);
        com.facebook.common.h.a<com.facebook.imagepipeline.i.b> a3 = this.f2765a.a((com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b>) b3);
        Map<String, String> map = null;
        if (a3 != null) {
            String a4 = a();
            if (c2.b(b2)) {
                map = com.facebook.common.d.f.a("cached_value_found", "true");
            }
            c2.a(b2, a4, map);
            c2.a(b2, "PostprocessedBitmapMemoryCacheProducer", true);
            jVar.b(1.0f);
            jVar.b(a3, true);
            a3.close();
            return;
        }
        a aVar = new a(jVar, b3, p instanceof com.facebook.imagepipeline.n.f, this.f2765a);
        String a5 = a();
        if (c2.b(b2)) {
            map = com.facebook.common.d.f.a("cached_value_found", "false");
        }
        c2.a(b2, a5, map);
        this.f2767c.a(aVar, akVar);
    }

    /* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
    /* loaded from: classes.dex */
    public static class a extends m<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>, com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.b.a.d f2768a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2769b;

        /* renamed from: c  reason: collision with root package name */
        private final com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> f2770c;

        public a(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, com.facebook.b.a.d dVar, boolean z, com.facebook.imagepipeline.d.t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> tVar) {
            super(jVar);
            this.f2768a = dVar;
            this.f2769b = z;
            this.f2770c = tVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar, boolean z) {
            if (aVar == null) {
                if (!z) {
                    return;
                }
                d().b(null, true);
            } else if (!z && !this.f2769b) {
            } else {
                com.facebook.common.h.a<com.facebook.imagepipeline.i.b> a2 = this.f2770c.a(this.f2768a, aVar);
                try {
                    d().b(1.0f);
                    j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> d2 = d();
                    if (a2 != null) {
                        aVar = a2;
                    }
                    d2.b(aVar, z);
                } finally {
                    com.facebook.common.h.a.c(a2);
                }
            }
        }
    }
}
