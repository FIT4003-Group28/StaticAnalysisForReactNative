package com.facebook.imagepipeline.m;

import com.facebook.imagepipeline.n.b;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: DiskCacheReadProducer.java */
/* loaded from: classes.dex */
public class n implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final aj<com.facebook.imagepipeline.i.d> f2870a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.l f2871b;

    public n(aj<com.facebook.imagepipeline.i.d> ajVar, com.facebook.imagepipeline.d.l lVar) {
        this.f2870a = ajVar;
        this.f2871b = lVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        com.facebook.imagepipeline.n.b a2 = akVar.a();
        if (!a2.n()) {
            c(jVar, akVar);
            return;
        }
        akVar.c().a(akVar.b(), "DiskCacheProducer");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f2871b.a(a2, akVar.d(), atomicBoolean).a((a.f<com.facebook.imagepipeline.i.d, TContinuationResult>) b(jVar, akVar));
        a(atomicBoolean, akVar);
    }

    private a.f<com.facebook.imagepipeline.i.d, Void> b(final j<com.facebook.imagepipeline.i.d> jVar, final ak akVar) {
        final String b2 = akVar.b();
        final am c2 = akVar.c();
        return new a.f<com.facebook.imagepipeline.i.d, Void>() { // from class: com.facebook.imagepipeline.m.n.1
            @Override // a.f
            /* renamed from: b */
            public Void a(a.h<com.facebook.imagepipeline.i.d> hVar) {
                if (n.b(hVar)) {
                    c2.b(b2, "DiskCacheProducer", null);
                    jVar.b();
                } else if (hVar.d()) {
                    c2.a(b2, "DiskCacheProducer", hVar.f(), null);
                    n.this.f2870a.a(jVar, akVar);
                } else {
                    com.facebook.imagepipeline.i.d e = hVar.e();
                    if (e != null) {
                        c2.a(b2, "DiskCacheProducer", n.a(c2, b2, true, e.k()));
                        c2.a(b2, "DiskCacheProducer", true);
                        jVar.b(1.0f);
                        jVar.b(e, true);
                        e.close();
                    } else {
                        c2.a(b2, "DiskCacheProducer", n.a(c2, b2, false, 0));
                        n.this.f2870a.a(jVar, akVar);
                    }
                }
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(a.h<?> hVar) {
        return hVar.c() || (hVar.d() && (hVar.f() instanceof CancellationException));
    }

    private void c(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        if (akVar.e().a() >= b.EnumC0062b.DISK_CACHE.a()) {
            jVar.b(null, true);
        } else {
            this.f2870a.a(jVar, akVar);
        }
    }

    static Map<String, String> a(am amVar, String str, boolean z, int i) {
        if (!amVar.b(str)) {
            return null;
        }
        if (z) {
            return com.facebook.common.d.f.a("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return com.facebook.common.d.f.a("cached_value_found", String.valueOf(z));
    }

    private void a(final AtomicBoolean atomicBoolean, ak akVar) {
        akVar.a(new e() { // from class: com.facebook.imagepipeline.m.n.2
            @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
            public void a() {
                atomicBoolean.set(true);
            }
        });
    }
}
