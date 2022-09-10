package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajad  reason: default package */
/* loaded from: classes2.dex */
public final class ajad implements aila {
    private final ailb<aigo> a;
    private final akpm b;
    private final dxio<akzh> c;
    private final btvo d;
    private final aigf e;
    private final cqat f;
    private final gll g;
    private final aidm h;
    private final Executor i;
    @dzsi
    private ajac j;
    @dzsi
    private akqq k;
    private boolean l = false;
    private final aige m = new aige(this) { // from class: ajaa
        private final ajad a;

        {
            this.a = this;
        }

        @Override // defpackage.aige
        public final void a() {
            ajad ajadVar = this.a;
            if (ajadVar.d()) {
                ajadVar.e(false);
            }
        }
    };

    public ajad(ailb<aigo> ailbVar, akpm akpmVar, dxio<akzh> dxioVar, btvo btvoVar, aigf aigfVar, cqat cqatVar, gll gllVar, aidm aidmVar, Executor executor) {
        this.a = ailbVar;
        this.b = akpmVar;
        this.c = dxioVar;
        this.d = btvoVar;
        this.e = aigfVar;
        this.f = cqatVar;
        this.g = gllVar;
        this.h = aidmVar;
        this.i = executor;
    }

    public final synchronized void a(ajac ajacVar) {
        this.a.c(this);
        this.j = ajacVar;
        this.h.c(((aizz) ajacVar).b.a());
        e(true);
        this.e.b(this.m);
    }

    @Override // defpackage.aila
    public final void b(dbsg<btlu> dbsgVar) {
        this.i.execute(new Runnable(this) { // from class: ajab
            private final ajad a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajad ajadVar = this.a;
                if (!ajadVar.d()) {
                    return;
                }
                ajadVar.e(false);
            }
        });
    }

    public final synchronized void c() {
        this.a.d(this);
        this.j = null;
        this.h.d();
        this.e.d(this.m);
    }

    public final synchronized boolean d() {
        return this.j != null;
    }

    public final synchronized void e(boolean z) {
        dbsg<ahvg> dbsgVar;
        if (!d()) {
            return;
        }
        dbsg<aigo> b = this.a.b(((aizz) this.j).a);
        if (b.a()) {
            dbsgVar = b.b().b(((aizz) this.j).b);
        } else {
            dbsgVar = dbpy.a;
        }
        if (!dbsgVar.a()) {
            c();
            return;
        }
        ahvg b2 = dbsgVar.b();
        dbsg<dhjz> a = aibw.a(b2, this.f.b());
        if (!a.a() || (a.b().a & 2) == 0 || (a.b().a & 1) == 0) {
            return;
        }
        akqq akqqVar = new akqq(a.b().c, a.b().b);
        if (z) {
            if (!this.l || !akqqVar.equals(this.k)) {
                dbsg<Integer> h = b2.h();
                float f = 15.0f;
                if (h.a() && h.b().intValue() > 0) {
                    int intValue = h.b().intValue();
                    akzh a2 = this.c.a();
                    double r = akra.f(akqqVar).r();
                    double d = intValue;
                    Double.isNaN(d);
                    double d2 = r * d;
                    f = Math.min((float) Math.floor(akyx.c(a2, (float) (d2 + d2), Math.min(a2.y(), a2.z()))), 15.0f);
                }
                akpm akpmVar = this.b;
                akyc m = akyt.m(akqqVar, f, this.g.b());
                m.b = f(akqqVar, f);
                akpmVar.p(m);
            }
        } else if (!akqqVar.equals(this.k)) {
            akpm akpmVar2 = this.b;
            akyc j = akyt.j(akqqVar, this.c.a().k(), this.g.b());
            j.b = f(akqqVar, -1.0f);
            akpmVar2.p(j);
        }
        this.k = akqqVar;
        this.l = z;
    }

    final int f(akqq akqqVar, float f) {
        alad p = this.c.a().p();
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = Math.abs(f - p.k);
        }
        return (f2 > ((float) this.d.getNavigationParameters().a.B) || p.j.y(akra.f(akqqVar)) / ((float) alyh.m((int) p.k)) > 6.0f) ? 0 : -1;
    }
}
