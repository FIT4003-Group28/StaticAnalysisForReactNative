package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: ctmt  reason: default package */
/* loaded from: classes5.dex */
public final class ctmt<T> implements degu<T> {
    public final ctml<T> a;
    final /* synthetic */ ctmu b;
    private final Random c = new Random();
    private int d = 0;
    private long e = 0;
    private final deig<T> f;

    public ctmt(ctmu ctmuVar, ctml<T> ctmlVar, deig<T> deigVar) {
        this.b = ctmuVar;
        this.a = ctmlVar;
        this.f = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        long min;
        if (this.d == 0) {
            min = this.a.a().b().c();
        } else {
            double d = this.e;
            double d2 = this.a.a().b().d();
            Double.isNaN(d);
            min = Math.min((long) (d * d2), this.a.a().b().b());
        }
        long nextInt = min + this.c.nextInt(this.a.a().b().e());
        if (this.d >= this.a.a().b().a() || !ctmu.a(dyjb.c(th))) {
            this.f.k(th);
            return;
        }
        this.d++;
        this.e = nextInt;
        this.b.a.postDelayed(new Runnable(this, this) { // from class: ctms
            private final ctmt a;
            private final degu b;

            {
                this.a = this;
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctmt ctmtVar = this.a;
                degu deguVar = this.b;
                ctml<T> ctmlVar = ctmtVar.a;
                ctmlVar.getClass();
                deha.q(deha.f(new deff(ctmlVar) { // from class: ctmo
                    private final ctml a;

                    {
                        this.a = ctmlVar;
                    }

                    @Override // defpackage.deff
                    public final dehn a() {
                        return this.a.b();
                    }
                }, cstu.b().a), deguVar, dege.a);
            }
        }, nextInt);
    }

    @Override // defpackage.degu
    public final void b(T t) {
        this.f.j(t);
    }
}
