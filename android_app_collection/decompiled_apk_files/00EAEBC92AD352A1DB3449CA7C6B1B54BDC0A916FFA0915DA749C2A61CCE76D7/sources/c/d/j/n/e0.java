package c.d.j.n;

import android.os.SystemClock;
import c.d.j.n.f0;
import java.io.InputStream;
import java.util.Map;
/* loaded from: classes.dex */
public class e0 implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.d.g.h f3423a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.d.g.a f3424b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f3425c;

    /* loaded from: classes.dex */
    class a implements f0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f3426a;

        a(s sVar) {
            this.f3426a = sVar;
        }

        @Override // c.d.j.n.f0.a
        public void a() {
            e0.this.a(this.f3426a);
        }

        @Override // c.d.j.n.f0.a
        public void a(InputStream inputStream, int i) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("NetworkFetcher->onResponse");
            }
            e0.this.a(this.f3426a, inputStream, i);
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }

        @Override // c.d.j.n.f0.a
        public void a(Throwable th) {
            e0.this.a(this.f3426a, th);
        }
    }

    public e0(c.d.d.g.h hVar, c.d.d.g.a aVar, f0 f0Var) {
        this.f3423a = hVar;
        this.f3424b = aVar;
        this.f3425c = f0Var;
    }

    protected static float a(int i, int i2) {
        return i2 > 0 ? i / i2 : 1.0f - ((float) Math.exp((-i) / 50000.0d));
    }

    private Map<String, String> a(s sVar, int i) {
        if (!sVar.e().a(sVar.c())) {
            return null;
        }
        return this.f3425c.b(sVar, i);
    }

    protected static void a(c.d.d.g.j jVar, int i, c.d.j.e.a aVar, k<c.d.j.k.d> kVar) {
        c.d.j.k.d dVar;
        c.d.d.h.a a2 = c.d.d.h.a.a(jVar.mo193a());
        try {
            dVar = new c.d.j.k.d(a2);
        } catch (Throwable th) {
            th = th;
            dVar = null;
        }
        try {
            dVar.a(aVar);
            dVar.C();
            kVar.a(dVar, i);
            c.d.j.k.d.c(dVar);
            c.d.d.h.a.b(a2);
        } catch (Throwable th2) {
            th = th2;
            c.d.j.k.d.c(dVar);
            c.d.d.h.a.b(a2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar) {
        sVar.e().b(sVar.c(), "NetworkFetchProducer", null);
        sVar.a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar, Throwable th) {
        sVar.e().a(sVar.c(), "NetworkFetchProducer", th, null);
        sVar.e().a(sVar.c(), "NetworkFetchProducer", false);
        sVar.a().a(th);
    }

    private boolean b(s sVar) {
        if (!sVar.b().g()) {
            return false;
        }
        return this.f3425c.a(sVar);
    }

    protected void a(c.d.d.g.j jVar, s sVar) {
        Map<String, String> a2 = a(sVar, jVar.size());
        m0 e2 = sVar.e();
        e2.a(sVar.c(), "NetworkFetchProducer", a2);
        e2.a(sVar.c(), "NetworkFetchProducer", true);
        a(jVar, sVar.f() | 1, sVar.g(), sVar.a());
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        k0Var.e().a(k0Var.a(), "NetworkFetchProducer");
        s mo144a = this.f3425c.mo144a(kVar, k0Var);
        this.f3425c.a((f0) mo144a, (f0.a) new a(mo144a));
    }

    protected void a(s sVar, InputStream inputStream, int i) {
        c.d.d.g.h hVar = this.f3423a;
        c.d.d.g.j mo192a = i > 0 ? hVar.mo192a(i) : hVar.mo191a();
        byte[] mo186get = this.f3424b.mo186get(16384);
        while (true) {
            try {
                int read = inputStream.read(mo186get);
                if (read < 0) {
                    this.f3425c.a((f0) sVar, mo192a.size());
                    a(mo192a, sVar);
                    return;
                } else if (read > 0) {
                    mo192a.write(mo186get, 0, read);
                    b(mo192a, sVar);
                    sVar.a().a(a(mo192a.size(), i));
                }
            } finally {
                this.f3424b.a(mo186get);
                mo192a.close();
            }
        }
    }

    protected void b(c.d.d.g.j jVar, s sVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!b(sVar) || uptimeMillis - sVar.d() < 100) {
            return;
        }
        sVar.a(uptimeMillis);
        sVar.e().a(sVar.c(), "NetworkFetchProducer", "intermediate_result");
        a(jVar, sVar.f(), sVar.g(), sVar.a());
    }
}
