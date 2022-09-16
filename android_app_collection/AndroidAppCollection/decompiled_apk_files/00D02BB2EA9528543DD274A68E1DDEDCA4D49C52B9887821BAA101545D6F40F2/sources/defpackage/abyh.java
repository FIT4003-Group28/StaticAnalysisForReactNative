package defpackage;
/* compiled from: PG */
/* renamed from: abyh  reason: default package */
/* loaded from: classes2.dex */
public final class abyh implements Runnable {
    public final btrm b;
    public final dxio<bnsn> c;
    public final akox d;
    public final abwq e;
    @dzsi
    public alad h;
    private final cqat i;
    private final dxio<araj> j;
    private final bvrb k;
    private long l;
    private boolean m;
    @dzsi
    private bvpk n;
    public final abyg a = new abyg(this);
    public alad f = alad.a;
    public alad g = alad.a;

    public abyh(cqat cqatVar, btrm btrmVar, dxio<bnsn> dxioVar, dxio<araj> dxioVar2, akox akoxVar, bvrb bvrbVar, abwq abwqVar) {
        this.i = cqatVar;
        this.b = btrmVar;
        this.c = dxioVar;
        this.j = dxioVar2;
        this.d = akoxVar;
        this.k = bvrbVar;
        this.e = abwqVar;
    }

    public static dhjx d(akox akoxVar, alad aladVar) {
        alaa b = alad.b(aladVar);
        akoxVar.o(b);
        return akoxVar.Y(b.a());
    }

    public final void a(long j) {
        bvpk bvpkVar = this.n;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        bvpk a = bvpk.a(new Runnable(this) { // from class: abyd
            private final abyh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                abyh abyhVar = this.a;
                akzh l = abyhVar.d.l();
                if (l == null) {
                    return;
                }
                alad p = l.p();
                alad aladVar = abyhVar.h;
                if (aladVar == null || !akqq.v(aladVar.i, p.i, 100.0d) || Math.abs(aladVar.k - p.k) / aladVar.k > 0.05d) {
                    abyhVar.h = p;
                    abyhVar.a(200L);
                    return;
                }
                abyhVar.c(p);
            }
        });
        this.n = a;
        this.k.a(a, bvrj.UI_THREAD, j);
    }

    public final synchronized void b() {
        long e = this.l - this.i.e();
        if (e <= 0) {
            if (this.j.a().m().i() == amwd.OFF) {
                alad aladVar = this.g;
                alad aladVar2 = this.f;
                aksi r = this.d.l().r();
                double e2 = akqo.e(r.c().S(), r.e().S());
                if (Math.abs(aladVar.k - aladVar2.k) > 0.3d || akqo.e(aladVar.i, aladVar2.i) > e2 * 0.05d) {
                    this.f = this.g;
                    this.k.b(new Runnable(this) { // from class: abye
                        private final abyh a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            abyh abyhVar = this.a;
                            abyhVar.c(abyhVar.d.l().p());
                        }
                    }, bvrj.UI_THREAD);
                }
            }
            this.m = false;
            return;
        }
        this.k.a(new Runnable(this) { // from class: abyf
            private final abyh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        }, bvrj.BACKGROUND_THREADPOOL, e);
        this.m = true;
    }

    public final void c(alad aladVar) {
        bvpk bvpkVar = this.n;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        this.e.g(d(this.d, aladVar));
        this.e.d();
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        alaa b = alad.b(this.d.l().p());
        this.d.o(b);
        alad a = b.a();
        if (!a.equals(this.g)) {
            this.g = a;
            this.l = this.i.e() + 500;
            if (!this.m) {
                b();
            }
        }
    }
}
