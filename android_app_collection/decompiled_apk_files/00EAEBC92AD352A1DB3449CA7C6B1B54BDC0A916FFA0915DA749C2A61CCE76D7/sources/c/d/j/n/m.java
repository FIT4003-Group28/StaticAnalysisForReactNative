package c.d.j.n;

import android.graphics.Bitmap;
import c.d.j.n.u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class m implements j0<c.d.d.h.a<c.d.j.k.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.d.g.a f3483a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3484b;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.j.i.c f3485c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.j.i.e f3486d;

    /* renamed from: e  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3487e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3488f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3489g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f3490h;
    private final int i;
    private final c.d.j.f.a j;

    /* loaded from: classes.dex */
    private class a extends c {
        public a(m mVar, k<c.d.d.h.a<c.d.j.k.b>> kVar, k0 k0Var, boolean z, int i) {
            super(kVar, k0Var, z, i);
        }

        @Override // c.d.j.n.m.c
        protected int a(c.d.j.k.d dVar) {
            return dVar.z();
        }

        @Override // c.d.j.n.m.c
        protected synchronized boolean b(c.d.j.k.d dVar, int i) {
            if (c.d.j.n.b.b(i)) {
                return false;
            }
            return super.b(dVar, i);
        }

        @Override // c.d.j.n.m.c
        protected c.d.j.k.g d() {
            return c.d.j.k.f.a(0, false, false);
        }
    }

    /* loaded from: classes.dex */
    private class b extends c {
        private final c.d.j.i.f i;
        private final c.d.j.i.e j;
        private int k;

        public b(m mVar, k<c.d.d.h.a<c.d.j.k.b>> kVar, k0 k0Var, c.d.j.i.f fVar, c.d.j.i.e eVar, boolean z, int i) {
            super(kVar, k0Var, z, i);
            c.d.d.d.i.a(fVar);
            this.i = fVar;
            c.d.d.d.i.a(eVar);
            this.j = eVar;
            this.k = 0;
        }

        @Override // c.d.j.n.m.c
        protected int a(c.d.j.k.d dVar) {
            return this.i.a();
        }

        @Override // c.d.j.n.m.c
        protected synchronized boolean b(c.d.j.k.d dVar, int i) {
            boolean b2 = super.b(dVar, i);
            if ((c.d.j.n.b.b(i) || c.d.j.n.b.b(i, 8)) && !c.d.j.n.b.b(i, 4) && c.d.j.k.d.e(dVar) && dVar.g() == c.d.i.b.f3144a) {
                if (!this.i.a(dVar)) {
                    return false;
                }
                int b3 = this.i.b();
                if (b3 <= this.k) {
                    return false;
                }
                if (b3 < this.j.a(this.k) && !this.i.c()) {
                    return false;
                }
                this.k = b3;
            }
            return b2;
        }

        @Override // c.d.j.n.m.c
        protected c.d.j.k.g d() {
            return this.j.b(this.i.b());
        }
    }

    /* loaded from: classes.dex */
    private abstract class c extends n<c.d.j.k.d, c.d.d.h.a<c.d.j.k.b>> {

        /* renamed from: c  reason: collision with root package name */
        private final k0 f3491c;

        /* renamed from: d  reason: collision with root package name */
        private final m0 f3492d;

        /* renamed from: e  reason: collision with root package name */
        private final c.d.j.e.b f3493e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3494f;

        /* renamed from: g  reason: collision with root package name */
        private final u f3495g;

        /* loaded from: classes.dex */
        class a implements u.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k0 f3497a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f3498b;

            a(m mVar, k0 k0Var, int i) {
                this.f3497a = k0Var;
                this.f3498b = i;
            }

            @Override // c.d.j.n.u.d
            public void a(c.d.j.k.d dVar, int i) {
                if (dVar != null) {
                    if (m.this.f3488f || !c.d.j.n.b.b(i, 16)) {
                        c.d.j.o.c f2 = this.f3497a.f();
                        if (m.this.f3489g || !c.d.d.k.f.i(f2.p())) {
                            dVar.g(c.d.j.q.a.a(f2.n(), f2.l(), dVar, this.f3498b));
                        }
                    }
                    c.this.c(dVar, i);
                }
            }
        }

        /* loaded from: classes.dex */
        class b extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f3500a;

            b(m mVar, boolean z) {
                this.f3500a = z;
            }

            @Override // c.d.j.n.l0
            public void a() {
                if (this.f3500a) {
                    c.this.e();
                }
            }

            @Override // c.d.j.n.e, c.d.j.n.l0
            public void b() {
                if (c.this.f3491c.g()) {
                    c.this.f3495g.c();
                }
            }
        }

        public c(k<c.d.d.h.a<c.d.j.k.b>> kVar, k0 k0Var, boolean z, int i) {
            super(kVar);
            this.f3491c = k0Var;
            this.f3492d = k0Var.e();
            this.f3493e = k0Var.f().c();
            this.f3494f = false;
            this.f3495g = new u(m.this.f3484b, new a(m.this, k0Var, i), this.f3493e.f3246a);
            this.f3491c.a(new b(m.this, z));
        }

        private Map<String, String> a(c.d.j.k.b bVar, long j, c.d.j.k.g gVar, boolean z, String str, String str2, String str3, String str4) {
            String str5;
            HashMap hashMap;
            if (!this.f3492d.a(this.f3491c.a())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(gVar.b());
            String valueOf3 = String.valueOf(z);
            if (bVar instanceof c.d.j.k.c) {
                Bitmap f2 = ((c.d.j.k.c) bVar).f();
                hashMap = new HashMap(8);
                hashMap.put("bitmapSize", f2.getWidth() + "x" + f2.getHeight());
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                str5 = str4;
            } else {
                str5 = str4;
                hashMap = new HashMap(7);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
            }
            hashMap.put("sampleSize", str5);
            return c.d.d.d.f.a(hashMap);
        }

        private void a(c.d.j.k.b bVar, int i) {
            c.d.d.h.a<c.d.j.k.b> a2 = m.this.j.a((c.d.j.f.a) bVar);
            try {
                b(c.d.j.n.b.a(i));
                c().a(a2, i);
            } finally {
                c.d.d.h.a.b(a2);
            }
        }

        private void b(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f3494f) {
                        c().a(1.0f);
                        this.f3494f = true;
                        this.f3495g.a();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:(10:(14:28|(12:32|33|34|35|36|37|38|(1:40)|41|42|43|44)|58|33|34|35|36|37|38|(0)|41|42|43|44)|(12:32|33|34|35|36|37|38|(0)|41|42|43|44)|36|37|38|(0)|41|42|43|44)|34|35) */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
            r2 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(c.d.j.k.d r19, int r20) {
            /*
                Method dump skipped, instructions count: 334
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.j.n.m.c.c(c.d.j.k.d, int):void");
        }

        private void c(Throwable th) {
            b(true);
            c().a(th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            b(true);
            c().a();
        }

        private synchronized boolean f() {
            return this.f3494f;
        }

        protected abstract int a(c.d.j.k.d dVar);

        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.j.k.d dVar, int i) {
            try {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a("DecodeProducer#onNewResultImpl");
                }
                boolean a2 = c.d.j.n.b.a(i);
                if (a2 && !c.d.j.k.d.e(dVar)) {
                    c(new c.d.d.k.a("Encoded image is not valid."));
                } else if (!b(dVar, i)) {
                    if (!c.d.j.p.b.c()) {
                        return;
                    }
                    c.d.j.p.b.a();
                } else {
                    boolean b2 = c.d.j.n.b.b(i, 4);
                    if (a2 || b2 || this.f3491c.g()) {
                        this.f3495g.c();
                    }
                    if (!c.d.j.p.b.c()) {
                        return;
                    }
                    c.d.j.p.b.a();
                }
            } finally {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
            }
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        public void b() {
            e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.n, c.d.j.n.b
        public void b(float f2) {
            super.b(f2 * 0.99f);
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        public void b(Throwable th) {
            c(th);
        }

        protected boolean b(c.d.j.k.d dVar, int i) {
            return this.f3495g.a(dVar, i);
        }

        protected abstract c.d.j.k.g d();
    }

    public m(c.d.d.g.a aVar, Executor executor, c.d.j.i.c cVar, c.d.j.i.e eVar, boolean z, boolean z2, boolean z3, j0<c.d.j.k.d> j0Var, int i, c.d.j.f.a aVar2) {
        c.d.d.d.i.a(aVar);
        this.f3483a = aVar;
        c.d.d.d.i.a(executor);
        this.f3484b = executor;
        c.d.d.d.i.a(cVar);
        this.f3485c = cVar;
        c.d.d.d.i.a(eVar);
        this.f3486d = eVar;
        this.f3488f = z;
        this.f3489g = z2;
        c.d.d.d.i.a(j0Var);
        this.f3487e = j0Var;
        this.f3490h = z3;
        this.i = i;
        this.j = aVar2;
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.d.h.a<c.d.j.k.b>> kVar, k0 k0Var) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("DecodeProducer#produceResults");
            }
            this.f3487e.a(!c.d.d.k.f.i(k0Var.f().p()) ? new a(this, kVar, k0Var, this.f3490h, this.i) : new b(this, kVar, k0Var, new c.d.j.i.f(this.f3483a), this.f3486d, this.f3490h, this.i), k0Var);
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }
}
