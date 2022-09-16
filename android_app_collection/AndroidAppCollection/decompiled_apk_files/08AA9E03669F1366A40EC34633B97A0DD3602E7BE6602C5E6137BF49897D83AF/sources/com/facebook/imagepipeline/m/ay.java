package com.facebook.imagepipeline.m;

import java.io.InputStream;
import java.util.concurrent.Executor;
/* compiled from: WebpTranscodeProducer.java */
/* loaded from: classes.dex */
public class ay implements aj<com.facebook.imagepipeline.i.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2828a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.g.h f2829b;

    /* renamed from: c  reason: collision with root package name */
    private final aj<com.facebook.imagepipeline.i.d> f2830c;

    public ay(Executor executor, com.facebook.common.g.h hVar, aj<com.facebook.imagepipeline.i.d> ajVar) {
        this.f2828a = (Executor) com.facebook.common.d.i.a(executor);
        this.f2829b = (com.facebook.common.g.h) com.facebook.common.d.i.a(hVar);
        this.f2830c = (aj) com.facebook.common.d.i.a(ajVar);
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        this.f2830c.a(new a(jVar, akVar), akVar);
    }

    /* compiled from: WebpTranscodeProducer.java */
    /* loaded from: classes.dex */
    private class a extends m<com.facebook.imagepipeline.i.d, com.facebook.imagepipeline.i.d> {

        /* renamed from: b  reason: collision with root package name */
        private final ak f2834b;

        /* renamed from: c  reason: collision with root package name */
        private com.facebook.common.l.e f2835c;

        public a(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
            super(jVar);
            this.f2834b = akVar;
            this.f2835c = com.facebook.common.l.e.UNSET;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.imagepipeline.i.d dVar, boolean z) {
            if (this.f2835c == com.facebook.common.l.e.UNSET && dVar != null) {
                this.f2835c = ay.b(dVar);
            }
            if (this.f2835c == com.facebook.common.l.e.NO) {
                d().b(dVar, z);
            } else if (!z) {
            } else {
                if (this.f2835c == com.facebook.common.l.e.YES && dVar != null) {
                    ay.this.a(dVar, d(), this.f2834b);
                } else {
                    d().b(dVar, z);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.facebook.imagepipeline.i.d dVar, j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        com.facebook.common.d.i.a(dVar);
        final com.facebook.imagepipeline.i.d a2 = com.facebook.imagepipeline.i.d.a(dVar);
        this.f2828a.execute(new aq<com.facebook.imagepipeline.i.d>(jVar, akVar.c(), "WebpTranscodeProducer", akVar.b()) { // from class: com.facebook.imagepipeline.m.ay.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.common.b.e
            /* renamed from: d */
            public com.facebook.imagepipeline.i.d c() {
                com.facebook.common.g.j a3 = ay.this.f2829b.a();
                try {
                    ay.b(a2, a3);
                    com.facebook.common.h.a a4 = com.facebook.common.h.a.a(a3.a());
                    com.facebook.imagepipeline.i.d dVar2 = new com.facebook.imagepipeline.i.d(a4);
                    dVar2.b(a2);
                    com.facebook.common.h.a.c(a4);
                    return dVar2;
                } finally {
                    a3.close();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            /* renamed from: a */
            public void b(com.facebook.imagepipeline.i.d dVar2) {
                com.facebook.imagepipeline.i.d.d(dVar2);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            /* renamed from: b */
            public void a(com.facebook.imagepipeline.i.d dVar2) {
                com.facebook.imagepipeline.i.d.d(a2);
                super.a((AnonymousClass1) dVar2);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            public void a(Exception exc) {
                com.facebook.imagepipeline.i.d.d(a2);
                super.a(exc);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            public void b() {
                com.facebook.imagepipeline.i.d.d(a2);
                super.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.common.l.e b(com.facebook.imagepipeline.i.d dVar) {
        com.facebook.common.d.i.a(dVar);
        com.facebook.h.c c2 = com.facebook.h.d.c(dVar.d());
        if (com.facebook.h.b.b(c2)) {
            com.facebook.imagepipeline.nativecode.b a2 = com.facebook.imagepipeline.nativecode.c.a();
            if (a2 == null) {
                return com.facebook.common.l.e.NO;
            }
            return com.facebook.common.l.e.a(!a2.a(c2));
        } else if (c2 == com.facebook.h.c.f2513a) {
            return com.facebook.common.l.e.UNSET;
        } else {
            return com.facebook.common.l.e.NO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.facebook.imagepipeline.i.d dVar, com.facebook.common.g.j jVar) {
        InputStream d2 = dVar.d();
        com.facebook.h.c c2 = com.facebook.h.d.c(d2);
        if (c2 == com.facebook.h.b.e || c2 == com.facebook.h.b.g) {
            com.facebook.imagepipeline.nativecode.c.a().a(d2, jVar, 80);
            dVar.a(com.facebook.h.b.f2509a);
        } else if (c2 == com.facebook.h.b.f || c2 == com.facebook.h.b.h) {
            com.facebook.imagepipeline.nativecode.c.a().a(d2, jVar);
            dVar.a(com.facebook.h.b.f2510b);
        } else {
            throw new IllegalArgumentException("Wrong image format");
        }
    }
}
