package c.d.j.n;

import c.d.j.n.u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class o0 implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3514a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.d.g.h f3515b;

    /* renamed from: c  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3516c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3517d;

    /* renamed from: e  reason: collision with root package name */
    private final c.d.j.q.d f3518e;

    /* loaded from: classes.dex */
    private class a extends n<c.d.j.k.d, c.d.j.k.d> {

        /* renamed from: c  reason: collision with root package name */
        private final boolean f3519c;

        /* renamed from: d  reason: collision with root package name */
        private final c.d.j.q.d f3520d;

        /* renamed from: e  reason: collision with root package name */
        private final k0 f3521e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3522f;

        /* renamed from: g  reason: collision with root package name */
        private final u f3523g;

        /* renamed from: c.d.j.n.o0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0090a implements u.d {
            C0090a(o0 o0Var) {
            }

            @Override // c.d.j.n.u.d
            public void a(c.d.j.k.d dVar, int i) {
                a aVar = a.this;
                c.d.j.q.c createImageTranscoder = aVar.f3520d.createImageTranscoder(dVar.g(), a.this.f3519c);
                c.d.d.d.i.a(createImageTranscoder);
                aVar.a(dVar, i, createImageTranscoder);
            }
        }

        /* loaded from: classes.dex */
        class b extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f3526a;

            b(o0 o0Var, k kVar) {
                this.f3526a = kVar;
            }

            @Override // c.d.j.n.l0
            public void a() {
                a.this.f3523g.a();
                a.this.f3522f = true;
                this.f3526a.a();
            }

            @Override // c.d.j.n.e, c.d.j.n.l0
            public void b() {
                if (a.this.f3521e.g()) {
                    a.this.f3523g.c();
                }
            }
        }

        a(k<c.d.j.k.d> kVar, k0 k0Var, boolean z, c.d.j.q.d dVar) {
            super(kVar);
            this.f3522f = false;
            this.f3521e = k0Var;
            Boolean m = this.f3521e.f().m();
            this.f3519c = m != null ? m.booleanValue() : z;
            this.f3520d = dVar;
            this.f3523g = new u(o0.this.f3514a, new C0090a(o0.this), 100);
            this.f3521e.a(new b(o0.this, kVar));
        }

        private c.d.j.k.d a(c.d.j.k.d dVar) {
            c.d.j.e.f n = this.f3521e.f().n();
            return (n.d() || !n.c()) ? dVar : b(dVar, n.b());
        }

        private Map<String, String> a(c.d.j.k.d dVar, c.d.j.e.e eVar, c.d.j.q.b bVar, String str) {
            String str2;
            if (!this.f3521e.e().a(this.f3521e.a())) {
                return null;
            }
            String str3 = dVar.A() + "x" + dVar.f();
            if (eVar != null) {
                str2 = eVar.f3266a + "x" + eVar.f3267b;
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(dVar.g()));
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f3523g.b()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(bVar));
            return c.d.d.d.f.a(hashMap);
        }

        private void a(c.d.j.k.d dVar, int i, c.d.i.c cVar) {
            c().a((cVar == c.d.i.b.f3144a || cVar == c.d.i.b.k) ? b(dVar) : a(dVar), i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c.d.j.k.d dVar, int i, c.d.j.q.c cVar) {
            this.f3521e.e().a(this.f3521e.a(), "ResizeAndRotateProducer");
            c.d.j.o.c f2 = this.f3521e.f();
            c.d.d.g.j mo191a = o0.this.f3515b.mo191a();
            try {
                c.d.j.q.b a2 = cVar.a(dVar, mo191a, f2.n(), f2.l(), null, 85);
                if (a2.a() == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                Map<String, String> a3 = a(dVar, f2.l(), a2, cVar.a());
                c.d.d.h.a a4 = c.d.d.h.a.a(mo191a.mo193a());
                try {
                    c.d.j.k.d dVar2 = new c.d.j.k.d(a4);
                    dVar2.a(c.d.i.b.f3144a);
                    dVar2.C();
                    this.f3521e.e().a(this.f3521e.a(), "ResizeAndRotateProducer", a3);
                    if (a2.a() != 1) {
                        i |= 16;
                    }
                    c().a(dVar2, i);
                    c.d.j.k.d.c(dVar2);
                } finally {
                    c.d.d.h.a.b(a4);
                }
            } catch (Exception e2) {
                this.f3521e.e().a(this.f3521e.a(), "ResizeAndRotateProducer", e2, null);
                if (c.d.j.n.b.a(i)) {
                    c().a(e2);
                }
            } finally {
                mo191a.close();
            }
        }

        private c.d.j.k.d b(c.d.j.k.d dVar) {
            return (this.f3521e.f().n().a() || dVar.i() == 0 || dVar.i() == -1) ? dVar : b(dVar, 0);
        }

        private c.d.j.k.d b(c.d.j.k.d dVar, int i) {
            c.d.j.k.d b2 = c.d.j.k.d.b(dVar);
            dVar.close();
            if (b2 != null) {
                b2.f(i);
            }
            return b2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.j.k.d dVar, int i) {
            if (this.f3522f) {
                return;
            }
            boolean a2 = c.d.j.n.b.a(i);
            if (dVar == null) {
                if (!a2) {
                    return;
                }
                c().a(null, 1);
                return;
            }
            c.d.i.c g2 = dVar.g();
            c.d.j.o.c f2 = this.f3521e.f();
            c.d.j.q.c createImageTranscoder = this.f3520d.createImageTranscoder(g2, this.f3519c);
            c.d.d.d.i.a(createImageTranscoder);
            c.d.d.k.e b2 = o0.b(f2, dVar, createImageTranscoder);
            if (!a2 && b2 == c.d.d.k.e.UNSET) {
                return;
            }
            if (b2 != c.d.d.k.e.YES) {
                a(dVar, i, g2);
            } else if (!this.f3523g.a(dVar, i)) {
            } else {
                if (!a2 && !this.f3521e.g()) {
                    return;
                }
                this.f3523g.c();
            }
        }
    }

    public o0(Executor executor, c.d.d.g.h hVar, j0<c.d.j.k.d> j0Var, boolean z, c.d.j.q.d dVar) {
        c.d.d.d.i.a(executor);
        this.f3514a = executor;
        c.d.d.d.i.a(hVar);
        this.f3515b = hVar;
        c.d.d.d.i.a(j0Var);
        this.f3516c = j0Var;
        c.d.d.d.i.a(dVar);
        this.f3518e = dVar;
        this.f3517d = z;
    }

    private static boolean a(c.d.j.e.f fVar, c.d.j.k.d dVar) {
        return !fVar.a() && (c.d.j.q.e.b(fVar, dVar) != 0 || b(fVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c.d.d.k.e b(c.d.j.o.c cVar, c.d.j.k.d dVar, c.d.j.q.c cVar2) {
        if (dVar == null || dVar.g() == c.d.i.c.f3152b) {
            return c.d.d.k.e.UNSET;
        }
        if (!cVar2.a(dVar.g())) {
            return c.d.d.k.e.NO;
        }
        return c.d.d.k.e.a(a(cVar.n(), dVar) || cVar2.a(dVar, cVar.n(), cVar.l()));
    }

    private static boolean b(c.d.j.e.f fVar, c.d.j.k.d dVar) {
        if (!fVar.c() || fVar.a()) {
            dVar.d(0);
            return false;
        }
        return c.d.j.q.e.f3659a.contains(Integer.valueOf(dVar.e()));
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        this.f3516c.a(new a(kVar, k0Var, this.f3517d, this.f3518e), k0Var);
    }
}
