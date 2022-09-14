package com.facebook.imagepipeline.m;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PostprocessorProducer.java */
/* loaded from: classes.dex */
public class ai implements aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> f2771a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.c.f f2772b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f2773c;

    public ai(aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar, com.facebook.imagepipeline.c.f fVar, Executor executor) {
        this.f2771a = (aj) com.facebook.common.d.i.a(ajVar);
        this.f2772b = fVar;
        this.f2773c = (Executor) com.facebook.common.d.i.a(executor);
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, ak akVar) {
        j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar;
        am c2 = akVar.c();
        com.facebook.imagepipeline.n.e p = akVar.a().p();
        a aVar = new a(jVar, c2, akVar.b(), p, akVar);
        if (p instanceof com.facebook.imagepipeline.n.f) {
            cVar = new b(aVar, (com.facebook.imagepipeline.n.f) p, akVar);
        } else {
            cVar = new c(aVar);
        }
        this.f2771a.a(cVar, akVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostprocessorProducer.java */
    /* loaded from: classes.dex */
    public class a extends m<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>, com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

        /* renamed from: b  reason: collision with root package name */
        private final am f2775b;

        /* renamed from: c  reason: collision with root package name */
        private final String f2776c;

        /* renamed from: d  reason: collision with root package name */
        private final com.facebook.imagepipeline.n.e f2777d;
        private boolean e;
        private com.facebook.common.h.a<com.facebook.imagepipeline.i.b> f;
        private boolean g;
        private boolean h;
        private boolean i;

        public a(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, am amVar, String str, com.facebook.imagepipeline.n.e eVar, ak akVar) {
            super(jVar);
            this.f = null;
            this.g = false;
            this.h = false;
            this.i = false;
            this.f2775b = amVar;
            this.f2776c = str;
            this.f2777d = eVar;
            akVar.a(new e() { // from class: com.facebook.imagepipeline.m.ai.a.1
                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void a() {
                    a.this.g();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar, boolean z) {
            if (com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar)) {
                b(aVar, z);
            } else if (!z) {
            } else {
                d(null, true);
            }
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        protected void a(Throwable th) {
            c(th);
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        protected void a() {
            g();
        }

        private void b(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar, boolean z) {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar2 = this.f;
                this.f = com.facebook.common.h.a.b(aVar);
                this.g = z;
                this.h = true;
                boolean f = f();
                com.facebook.common.h.a.c(aVar2);
                if (!f) {
                    return;
                }
                c();
            }
        }

        private void c() {
            ai.this.f2773c.execute(new Runnable() { // from class: com.facebook.imagepipeline.m.ai.a.2
                @Override // java.lang.Runnable
                public void run() {
                    com.facebook.common.h.a aVar;
                    boolean z;
                    synchronized (a.this) {
                        aVar = a.this.f;
                        z = a.this.g;
                        a.this.f = null;
                        a.this.h = false;
                    }
                    if (com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar)) {
                        try {
                            a.this.c(aVar, z);
                        } finally {
                            com.facebook.common.h.a.c(aVar);
                        }
                    }
                    a.this.e();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            boolean f;
            synchronized (this) {
                this.i = false;
                f = f();
            }
            if (f) {
                c();
            }
        }

        private synchronized boolean f() {
            if (this.e || !this.h || this.i || !com.facebook.common.h.a.a((com.facebook.common.h.a<?>) this.f)) {
                return false;
            }
            this.i = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar, boolean z) {
            com.facebook.common.d.i.a(com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar));
            if (!a(aVar.a())) {
                d(aVar, z);
                return;
            }
            this.f2775b.a(this.f2776c, "PostprocessorProducer");
            com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar2 = null;
            try {
                try {
                    com.facebook.common.h.a<com.facebook.imagepipeline.i.b> b2 = b(aVar.a());
                    try {
                        this.f2775b.a(this.f2776c, "PostprocessorProducer", a(this.f2775b, this.f2776c, this.f2777d));
                        d(b2, z);
                        com.facebook.common.h.a.c(b2);
                    } catch (Throwable th) {
                        th = th;
                        aVar2 = b2;
                        com.facebook.common.h.a.c(aVar2);
                        throw th;
                    }
                } catch (Exception e) {
                    this.f2775b.a(this.f2776c, "PostprocessorProducer", e, a(this.f2775b, this.f2776c, this.f2777d));
                    c(e);
                    com.facebook.common.h.a.c(null);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private Map<String, String> a(am amVar, String str, com.facebook.imagepipeline.n.e eVar) {
            if (!amVar.b(str)) {
                return null;
            }
            return com.facebook.common.d.f.a("Postprocessor", eVar.b());
        }

        private boolean a(com.facebook.imagepipeline.i.b bVar) {
            return bVar instanceof com.facebook.imagepipeline.i.c;
        }

        private com.facebook.common.h.a<com.facebook.imagepipeline.i.b> b(com.facebook.imagepipeline.i.b bVar) {
            com.facebook.imagepipeline.i.c cVar = (com.facebook.imagepipeline.i.c) bVar;
            com.facebook.common.h.a<Bitmap> a2 = this.f2777d.a(cVar.a(), ai.this.f2772b);
            try {
                return com.facebook.common.h.a.a(new com.facebook.imagepipeline.i.c(a2, bVar.d(), cVar.h()));
            } finally {
                com.facebook.common.h.a.c(a2);
            }
        }

        private void d(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar, boolean z) {
            if ((z || h()) && (!z || !i())) {
                return;
            }
            d().b(aVar, z);
        }

        private void c(Throwable th) {
            if (i()) {
                d().b(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            if (i()) {
                d().b();
            }
        }

        private synchronized boolean h() {
            return this.e;
        }

        private boolean i() {
            synchronized (this) {
                if (this.e) {
                    return false;
                }
                com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar = this.f;
                this.f = null;
                this.e = true;
                com.facebook.common.h.a.c(aVar);
                return true;
            }
        }
    }

    /* compiled from: PostprocessorProducer.java */
    /* loaded from: classes.dex */
    class c extends m<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>, com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {
        private c(a aVar) {
            super(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar, boolean z) {
            if (!z) {
                return;
            }
            d().b(aVar, z);
        }
    }

    /* compiled from: PostprocessorProducer.java */
    /* loaded from: classes.dex */
    class b extends m<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>, com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> implements com.facebook.imagepipeline.n.g {

        /* renamed from: b  reason: collision with root package name */
        private boolean f2782b;

        /* renamed from: c  reason: collision with root package name */
        private com.facebook.common.h.a<com.facebook.imagepipeline.i.b> f2783c;

        private b(a aVar, com.facebook.imagepipeline.n.f fVar, ak akVar) {
            super(aVar);
            this.f2782b = false;
            this.f2783c = null;
            fVar.a(this);
            akVar.a(new e() { // from class: com.facebook.imagepipeline.m.ai.b.1
                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void a() {
                    if (b.this.e()) {
                        b.this.d().b();
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.m.b
        public void a(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar, boolean z) {
            if (!z) {
                return;
            }
            a(aVar);
            c();
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        protected void a(Throwable th) {
            if (e()) {
                d().b(th);
            }
        }

        @Override // com.facebook.imagepipeline.m.m, com.facebook.imagepipeline.m.b
        protected void a() {
            if (e()) {
                d().b();
            }
        }

        private void c() {
            synchronized (this) {
                if (this.f2782b) {
                    return;
                }
                com.facebook.common.h.a<com.facebook.imagepipeline.i.b> b2 = com.facebook.common.h.a.b(this.f2783c);
                try {
                    d().b(b2, false);
                } finally {
                    com.facebook.common.h.a.c(b2);
                }
            }
        }

        private void a(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar) {
            synchronized (this) {
                if (this.f2782b) {
                    return;
                }
                com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar2 = this.f2783c;
                this.f2783c = com.facebook.common.h.a.b(aVar);
                com.facebook.common.h.a.c(aVar2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            synchronized (this) {
                if (this.f2782b) {
                    return false;
                }
                com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar = this.f2783c;
                this.f2783c = null;
                this.f2782b = true;
                com.facebook.common.h.a.c(aVar);
                return true;
            }
        }
    }
}
