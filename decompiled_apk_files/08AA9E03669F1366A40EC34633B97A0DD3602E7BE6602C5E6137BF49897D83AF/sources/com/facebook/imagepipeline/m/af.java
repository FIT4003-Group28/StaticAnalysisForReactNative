package com.facebook.imagepipeline.m;

import android.os.SystemClock;
import com.facebook.imagepipeline.m.ag;
import java.io.InputStream;
import java.util.Map;
/* compiled from: NetworkFetchProducer.java */
/* loaded from: classes.dex */
public class af implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.g.h f2760a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.g.a f2761b;

    /* renamed from: c  reason: collision with root package name */
    private final ag f2762c;

    public af(com.facebook.common.g.h hVar, com.facebook.common.g.a aVar, ag agVar) {
        this.f2760a = hVar;
        this.f2761b = aVar;
        this.f2762c = agVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        akVar.c().a(akVar.b(), "NetworkFetchProducer");
        final s b2 = this.f2762c.b(jVar, akVar);
        this.f2762c.a((ag) b2, new ag.a() { // from class: com.facebook.imagepipeline.m.af.1
            @Override // com.facebook.imagepipeline.m.ag.a
            public void a(InputStream inputStream, int i) {
                af.this.a(b2, inputStream, i);
            }

            @Override // com.facebook.imagepipeline.m.ag.a
            public void a(Throwable th) {
                af.this.a(b2, th);
            }

            @Override // com.facebook.imagepipeline.m.ag.a
            public void a() {
                af.this.a(b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar, InputStream inputStream, int i) {
        com.facebook.common.g.j a2;
        if (i > 0) {
            a2 = this.f2760a.a(i);
        } else {
            a2 = this.f2760a.a();
        }
        byte[] a3 = this.f2761b.a(16384);
        while (true) {
            try {
                int read = inputStream.read(a3);
                if (read < 0) {
                    this.f2762c.b((ag) sVar, a2.b());
                    b(a2, sVar);
                    return;
                } else if (read > 0) {
                    a2.write(a3, 0, read);
                    a(a2, sVar);
                    sVar.a().b(a(a2.b(), i));
                }
            } finally {
                this.f2761b.a((com.facebook.common.g.a) a3);
                a2.close();
            }
        }
    }

    private static float a(int i, int i2) {
        return i2 > 0 ? i / i2 : 1.0f - ((float) Math.exp((-i) / 50000.0d));
    }

    private void a(com.facebook.common.g.j jVar, s sVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!b(sVar) || uptimeMillis - sVar.f() < 100) {
            return;
        }
        sVar.a(uptimeMillis);
        sVar.d().a(sVar.c(), "NetworkFetchProducer", "intermediate_result");
        a(jVar, false, sVar.a());
    }

    private void b(com.facebook.common.g.j jVar, s sVar) {
        Map<String, String> a2 = a(sVar, jVar.b());
        am d2 = sVar.d();
        d2.a(sVar.c(), "NetworkFetchProducer", a2);
        d2.a(sVar.c(), "NetworkFetchProducer", true);
        a(jVar, true, sVar.a());
    }

    private void a(com.facebook.common.g.j jVar, boolean z, j<com.facebook.imagepipeline.i.d> jVar2) {
        com.facebook.common.h.a a2 = com.facebook.common.h.a.a(jVar.a());
        com.facebook.imagepipeline.i.d dVar = null;
        try {
            com.facebook.imagepipeline.i.d dVar2 = new com.facebook.imagepipeline.i.d(a2);
            try {
                dVar2.l();
                jVar2.b(dVar2, z);
                com.facebook.imagepipeline.i.d.d(dVar2);
                com.facebook.common.h.a.c(a2);
            } catch (Throwable th) {
                th = th;
                dVar = dVar2;
                com.facebook.imagepipeline.i.d.d(dVar);
                com.facebook.common.h.a.c(a2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar, Throwable th) {
        sVar.d().a(sVar.c(), "NetworkFetchProducer", th, null);
        sVar.d().a(sVar.c(), "NetworkFetchProducer", false);
        sVar.a().b(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar) {
        sVar.d().b(sVar.c(), "NetworkFetchProducer", null);
        sVar.a().b();
    }

    private boolean b(s sVar) {
        if (!sVar.b().h()) {
            return false;
        }
        return this.f2762c.a(sVar);
    }

    private Map<String, String> a(s sVar, int i) {
        if (!sVar.d().b(sVar.c())) {
            return null;
        }
        return this.f2762c.a((ag) sVar, i);
    }
}
