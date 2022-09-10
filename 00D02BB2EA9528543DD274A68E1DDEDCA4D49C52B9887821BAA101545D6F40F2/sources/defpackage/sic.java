package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: sic  reason: default package */
/* loaded from: classes7.dex */
public class sic {
    public final dxio<axwq> a;
    public final dbuj<dndr, azva> b;
    private final dehp e;
    private final Executor f;
    private final btrm g;
    private final sia h = new sia(this);
    private final AtomicBoolean i;
    private final dbwx<dndr, azva> j;
    private static final azva d = azva.a(dndr.UNKNOWN_ALIAS_TYPE, 0L, akqi.a, "", null, null, null);
    public static final axwu c = new shz();

    public sic(dxio<axwq> dxioVar, Executor executor, btrm btrmVar, dehp dehpVar) {
        shy shyVar = new shy(this);
        this.j = shyVar;
        this.a = dxioVar;
        this.e = dehpVar;
        this.f = executor;
        this.g = btrmVar;
        dbuo<Object, Object> a = dbuo.a();
        a.f(1);
        a.i(2);
        a.h(1L, TimeUnit.MINUTES);
        a.k(shyVar);
        this.b = a.e();
        this.i = new AtomicBoolean(false);
    }

    private final synchronized void h() {
        if (this.i.compareAndSet(false, true)) {
            btrm btrmVar = this.g;
            sia siaVar = this.h;
            dceq a = dcet.a();
            a.b(azre.class, new sid(0, azre.class, siaVar, bvrj.UI_THREAD));
            a.b(azrh.class, new sid(1, azrh.class, siaVar, bvrj.UI_THREAD));
            btrmVar.g(siaVar, a.a());
        }
    }

    private static boolean i(@dzsi dndr dndrVar) {
        return dndrVar == dndr.HOME || dndrVar == dndr.WORK;
    }

    @dzsi
    private static azva j(@dzsi azva azvaVar) {
        if (azvaVar == d) {
            return null;
        }
        return azvaVar;
    }

    public final dehn<qjn> a() {
        azva b = this.b.b(dndr.HOME);
        azva b2 = this.b.b(dndr.WORK);
        if (b == null && b2 == null && this.a.a().f().isDone()) {
            dcdc<azva> n = this.a.a().n();
            azva g = azva.g(n, dndr.HOME);
            b2 = azva.g(n, dndr.WORK);
            b = g;
        }
        if (b == null || b2 == null) {
            return this.e.c(new Callable(this) { // from class: shv
                private final sic a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.b();
                }
            });
        }
        return deha.a(qjn.i(j(b), j(b2)));
    }

    public final qjn b() {
        bvrj.UI_THREAD.d();
        azva b = this.b.b(dndr.HOME);
        azva b2 = this.b.b(dndr.WORK);
        if (b == null || b2 == null) {
            dcdc dcdcVar = (dcdc) deha.s(this.a.a().m());
            if (b == null) {
                b = azva.g(dcdcVar, dndr.HOME);
            }
            if (b2 == null) {
                b2 = azva.g(dcdcVar, dndr.WORK);
            }
        }
        return qjn.i(j(b), j(b2));
    }

    public final void c(final sib sibVar) {
        final dehn<qjn> a = a();
        a.Pk(new Runnable(sibVar, a) { // from class: shw
            private final sib a;
            private final dehn b;

            {
                this.a = sibVar;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a((qjn) deha.s(this.b));
            }
        }, this.f);
    }

    public final void d(final dndr dndrVar, final axwy axwyVar) {
        dbsk.b(i(dndrVar), "Only supports AliasType of HOME or WORK");
        this.b.d(dndrVar, d);
        h();
        this.e.execute(new Runnable(this, dndrVar, axwyVar) { // from class: shx
            private final sic a;
            private final dndr b;
            private final axwy c;

            {
                this.a = this;
                this.b = dndrVar;
                this.c = axwyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                sic sicVar = this.a;
                dndr dndrVar2 = this.b;
                axwy axwyVar2 = this.c;
                azva g = azva.g((dcdc) deha.s(sicVar.a.a().m()), dndrVar2);
                if (g == null || g.e == null) {
                    return;
                }
                axwyVar2.Q(dndrVar2, sic.c, null, false, 0L);
            }
        });
    }

    public final void e(azva azvaVar) {
        dbsk.b(i(azvaVar.a), "Only supports AliasType of HOME or WORK");
        this.b.d(azvaVar.a, azvaVar);
        h();
    }

    public final void f(dndr dndrVar, azre azreVar) {
        akqq akqqVar;
        azva b = this.b.b(dndrVar);
        if (b != null) {
            akqq akqqVar2 = b.e;
            dcdc<azwv> b2 = azreVar.b();
            int size = b2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    akqqVar = null;
                    break;
                }
                azwv azwvVar = b2.get(i);
                i++;
                if (azwvVar.g() == dndrVar) {
                    akqqVar = azwvVar.c();
                    break;
                }
            }
            if (akqqVar2 == null || akqqVar == null) {
                if (akqqVar2 != null || akqqVar != null) {
                    return;
                }
            } else if (!akqo.c(akqqVar2, akqqVar, 1.0E-4d)) {
                return;
            }
            dbuj<dndr, azva> dbujVar = this.b;
            dbsk.s(dndrVar);
            ((dbvu) dbujVar).a.remove(dndrVar);
        }
    }

    public final synchronized void g() {
        if (this.i.compareAndSet(true, false)) {
            this.g.a(this.h);
        }
    }
}
