package com.facebook.imagepipeline.m;

import java.io.InputStream;
import java.util.concurrent.Executor;
/* compiled from: LocalFetchProducer.java */
/* loaded from: classes.dex */
public abstract class z implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2924a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.g.h f2925b;

    protected abstract com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.n.b bVar);

    protected abstract String a();

    /* JADX INFO: Access modifiers changed from: protected */
    public z(Executor executor, com.facebook.common.g.h hVar) {
        this.f2924a = executor;
        this.f2925b = hVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        final am c2 = akVar.c();
        final String b2 = akVar.b();
        final com.facebook.imagepipeline.n.b a2 = akVar.a();
        final aq<com.facebook.imagepipeline.i.d> aqVar = new aq<com.facebook.imagepipeline.i.d>(jVar, c2, a(), b2) { // from class: com.facebook.imagepipeline.m.z.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.common.b.e
            /* renamed from: d */
            public com.facebook.imagepipeline.i.d c() {
                com.facebook.imagepipeline.i.d a3 = z.this.a(a2);
                if (a3 == null) {
                    c2.a(b2, z.this.a(), false);
                    return null;
                }
                a3.l();
                c2.a(b2, z.this.a(), true);
                return a3;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            /* renamed from: a */
            public void b(com.facebook.imagepipeline.i.d dVar) {
                com.facebook.imagepipeline.i.d.d(dVar);
            }
        };
        akVar.a(new e() { // from class: com.facebook.imagepipeline.m.z.2
            @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
            public void a() {
                aqVar.a();
            }
        });
        this.f2924a.execute(aqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.facebook.imagepipeline.i.d a(InputStream inputStream, int i) {
        com.facebook.common.h.a a2;
        com.facebook.common.h.a aVar = null;
        try {
            if (i <= 0) {
                a2 = com.facebook.common.h.a.a(this.f2925b.a(inputStream));
            } else {
                a2 = com.facebook.common.h.a.a(this.f2925b.a(inputStream, i));
            }
            aVar = a2;
            com.facebook.imagepipeline.i.d dVar = new com.facebook.imagepipeline.i.d(aVar);
            com.facebook.common.d.b.a(inputStream);
            com.facebook.common.h.a.c(aVar);
            return dVar;
        } catch (Throwable th) {
            com.facebook.common.d.b.a(inputStream);
            com.facebook.common.h.a.c(aVar);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.facebook.imagepipeline.i.d b(InputStream inputStream, int i) {
        return a(inputStream, i);
    }
}
