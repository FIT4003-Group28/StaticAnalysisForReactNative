package com.facebook.imagepipeline.m;

import com.facebook.imagepipeline.n.b;
import com.facebook.imagepipeline.n.d;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: MediaVariationsFallbackProducer.java */
/* loaded from: classes.dex */
public class ad implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.e f2733a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.e f2734b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.f f2735c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.r f2736d;
    private com.facebook.imagepipeline.d.q e;
    private final com.facebook.imagepipeline.d.l f;
    private final aj<com.facebook.imagepipeline.i.d> g;

    public ad(com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, com.facebook.imagepipeline.d.f fVar, com.facebook.imagepipeline.d.r rVar, com.facebook.imagepipeline.d.q qVar, com.facebook.imagepipeline.d.l lVar, aj<com.facebook.imagepipeline.i.d> ajVar) {
        this.f2733a = eVar;
        this.f2734b = eVar2;
        this.f2735c = fVar;
        this.f2736d = rVar;
        this.e = qVar;
        this.f = lVar;
        this.g = ajVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(final j<com.facebook.imagepipeline.i.d> jVar, final ak akVar) {
        String a2;
        String str;
        String str2;
        final AtomicBoolean atomicBoolean;
        boolean z;
        final com.facebook.imagepipeline.n.b a3 = akVar.a();
        final com.facebook.imagepipeline.e.d g = a3.g();
        com.facebook.imagepipeline.n.d d2 = a3.d();
        if (!a3.n() || g == null || g.f2633b <= 0 || g.f2632a <= 0) {
            b(jVar, akVar);
            return;
        }
        if (d2 == null) {
            if (this.e == null) {
                str = null;
                str2 = null;
                if (d2 != null && str2 == null) {
                    b(jVar, akVar);
                    return;
                }
                akVar.c().a(akVar.b(), "MediaVariationsFallbackProducer");
                z = false;
                atomicBoolean = new AtomicBoolean(false);
                if (d2 == null && d2.b() > 0) {
                    a(jVar, akVar, a3, d2, g, atomicBoolean);
                } else {
                    d.a a4 = com.facebook.imagepipeline.n.d.a(str2);
                    if (d2 != null && d2.c()) {
                        z = true;
                    }
                    final String str3 = str2;
                    this.f2736d.a(str2, a4.a(z).a(str)).a(new a.f<com.facebook.imagepipeline.n.d, Object>() { // from class: com.facebook.imagepipeline.m.ad.1
                        @Override // a.f
                        public Object a(a.h<com.facebook.imagepipeline.n.d> hVar) {
                            if (hVar.c() || hVar.d()) {
                                return hVar;
                            }
                            try {
                                if (hVar.e() == null) {
                                    ad.this.a(jVar, akVar, str3);
                                    return null;
                                }
                                return ad.this.a(jVar, akVar, a3, hVar.e(), g, atomicBoolean);
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                    });
                }
                a(atomicBoolean, akVar);
            }
            a2 = this.e.a(a3.b());
            str = "id_extractor";
        } else {
            a2 = d2.a();
            str = "index_db";
        }
        str2 = a2;
        if (d2 != null) {
        }
        akVar.c().a(akVar.b(), "MediaVariationsFallbackProducer");
        z = false;
        atomicBoolean = new AtomicBoolean(false);
        if (d2 == null) {
        }
        d.a a42 = com.facebook.imagepipeline.n.d.a(str2);
        if (d2 != null) {
            z = true;
        }
        final String str32 = str2;
        this.f2736d.a(str2, a42.a(z).a(str)).a(new a.f<com.facebook.imagepipeline.n.d, Object>() { // from class: com.facebook.imagepipeline.m.ad.1
            @Override // a.f
            public Object a(a.h<com.facebook.imagepipeline.n.d> hVar) {
                if (hVar.c() || hVar.d()) {
                    return hVar;
                }
                try {
                    if (hVar.e() == null) {
                        ad.this.a(jVar, akVar, str32);
                        return null;
                    }
                    return ad.this.a(jVar, akVar, a3, hVar.e(), g, atomicBoolean);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
        a(atomicBoolean, akVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a.h a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar, com.facebook.imagepipeline.n.b bVar, com.facebook.imagepipeline.n.d dVar, com.facebook.imagepipeline.e.d dVar2, AtomicBoolean atomicBoolean) {
        if (dVar.b() == 0) {
            return a.h.a((com.facebook.imagepipeline.i.d) null).a((a.f) b(jVar, akVar, bVar, dVar, Collections.emptyList(), 0, atomicBoolean));
        }
        return a(jVar, akVar, bVar, dVar, dVar.a(new b(dVar2)), 0, atomicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a.h a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar, com.facebook.imagepipeline.n.b bVar, com.facebook.imagepipeline.n.d dVar, List<d.b> list, int i, AtomicBoolean atomicBoolean) {
        b.a d2;
        d.b bVar2 = list.get(i);
        com.facebook.b.a.d a2 = this.f2735c.a(bVar, bVar2.a(), akVar.d());
        if (bVar2.d() == null) {
            d2 = bVar.a();
        } else {
            d2 = bVar2.d();
        }
        return (d2 == b.a.SMALL ? this.f2734b : this.f2733a).a(a2, atomicBoolean).a((a.f<com.facebook.imagepipeline.i.d, TContinuationResult>) b(jVar, akVar, bVar, dVar, list, i, atomicBoolean));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(d.b bVar, com.facebook.imagepipeline.e.d dVar) {
        return bVar.b() >= dVar.f2632a && bVar.c() >= dVar.f2633b;
    }

    private a.f<com.facebook.imagepipeline.i.d, Void> b(final j<com.facebook.imagepipeline.i.d> jVar, final ak akVar, final com.facebook.imagepipeline.n.b bVar, final com.facebook.imagepipeline.n.d dVar, final List<d.b> list, final int i, final AtomicBoolean atomicBoolean) {
        final String b2 = akVar.b();
        final am c2 = akVar.c();
        return new a.f<com.facebook.imagepipeline.i.d, Void>() { // from class: com.facebook.imagepipeline.m.ad.2
            @Override // a.f
            /* renamed from: b */
            public Void a(a.h<com.facebook.imagepipeline.i.d> hVar) {
                boolean z = false;
                if (ad.b(hVar)) {
                    c2.b(b2, "MediaVariationsFallbackProducer", null);
                    jVar.b();
                } else {
                    if (hVar.d()) {
                        c2.a(b2, "MediaVariationsFallbackProducer", hVar.f(), null);
                        ad.this.a(jVar, akVar, dVar.a());
                    } else {
                        com.facebook.imagepipeline.i.d e = hVar.e();
                        if (e != null) {
                            if (!dVar.c() && ad.b((d.b) list.get(i), bVar.g())) {
                                z = true;
                            }
                            c2.a(b2, "MediaVariationsFallbackProducer", ad.a(c2, b2, true, list.size(), dVar.d(), z));
                            if (z) {
                                c2.a(b2, "MediaVariationsFallbackProducer", true);
                                jVar.b(1.0f);
                            }
                            jVar.b(e, z);
                            e.close();
                            z = !z;
                        } else if (i < list.size() - 1) {
                            ad.this.a(jVar, akVar, bVar, dVar, list, i + 1, atomicBoolean);
                        } else {
                            c2.a(b2, "MediaVariationsFallbackProducer", ad.a(c2, b2, false, list.size(), dVar.d(), false));
                        }
                    }
                    z = true;
                }
                if (z) {
                    ad.this.a(jVar, akVar, dVar.a());
                }
                return null;
            }
        };
    }

    private void b(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        this.g.a(jVar, akVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar, String str) {
        this.g.a(new a(jVar, akVar, str), akVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(a.h<?> hVar) {
        return hVar.c() || (hVar.d() && (hVar.f() instanceof CancellationException));
    }

    static Map<String, String> a(am amVar, String str, boolean z, int i, String str2, boolean z2) {
        if (!amVar.b(str)) {
            return null;
        }
        if (z) {
            return com.facebook.common.d.f.a("cached_value_found", String.valueOf(true), "cached_value_used_as_last", String.valueOf(z2), "variants_count", String.valueOf(i), "variants_source", str2);
        }
        return com.facebook.common.d.f.a("cached_value_found", String.valueOf(false), "variants_count", String.valueOf(i), "variants_source", str2);
    }

    private void a(final AtomicBoolean atomicBoolean, ak akVar) {
        akVar.a(new e() { // from class: com.facebook.imagepipeline.m.ad.3
            @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
            public void a() {
                atomicBoolean.set(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediaVariationsFallbackProducer.java */
    /* loaded from: classes.dex */
    public class a extends m<com.facebook.imagepipeline.i.d, com.facebook.imagepipeline.i.d> {

        /* renamed from: b  reason: collision with root package name */
        private final ak f2748b;

        /* renamed from: c  reason: collision with root package name */
        private final String f2749c;

        public a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar, String str) {
            super(jVar);
            this.f2748b = akVar;
            this.f2749c = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            if (z && dVar != null) {
                a(dVar);
            }
            d().b(dVar, z);
        }

        private void a(com.facebook.imagepipeline.i.d dVar) {
            com.facebook.imagepipeline.n.b a2 = this.f2748b.a();
            if (!a2.n() || this.f2749c == null) {
                return;
            }
            ad.this.f2736d.a(this.f2749c, ad.this.f.a(a2, dVar), ad.this.f2735c.c(a2, this.f2748b.d()), dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediaVariationsFallbackProducer.java */
    /* loaded from: classes.dex */
    public static class b implements Comparator<d.b> {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.imagepipeline.e.d f2750a;

        b(com.facebook.imagepipeline.e.d dVar) {
            this.f2750a = dVar;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d.b bVar, d.b bVar2) {
            boolean b2 = ad.b(bVar, this.f2750a);
            boolean b3 = ad.b(bVar2, this.f2750a);
            if (!b2 || !b3) {
                if (b2) {
                    return -1;
                }
                if (!b3) {
                    return bVar2.b() - bVar.b();
                }
                return 1;
            }
            return bVar.b() - bVar2.b();
        }
    }
}
