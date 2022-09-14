package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kpj  reason: default package */
/* loaded from: classes7.dex */
public class kpj {
    public final Context a;
    public final dndr b;
    public final dxio<axwq> c;
    public final btrm d;
    public final crzo<ldm> f;
    public final kcv g;
    private final Executor i;
    private final buyv j;
    public final crzo<kpg> e = new crzo<>(kpg.SET);
    kph h = new kph(this);

    public kpj(Context context, dndr dndrVar, dxio dxioVar, btrm btrmVar, buyv buyvVar, Executor executor, Executor executor2, kcv kcvVar) {
        dbsk.s(context);
        this.a = context;
        dbsk.s(dndrVar);
        this.b = dndrVar;
        dbsk.s(dxioVar);
        this.c = dxioVar;
        dbsk.s(btrmVar);
        this.d = btrmVar;
        dbsk.s(buyvVar);
        this.j = buyvVar;
        dbsk.s(executor);
        this.i = executor;
        dbsk.s(kcvVar);
        this.g = kcvVar;
        azva g = g((axwq) dxioVar.a(), dndrVar);
        crzo<ldm> crzoVar = new crzo<>(g != null ? ldm.g(g, "") : null);
        this.f = crzoVar;
        deha.q(((axwq) dxioVar.a()).f(), new kpi(dndrVar, (axwq) dxioVar.a(), crzoVar), executor2);
    }

    public static void f(dndr dndrVar, axwq axwqVar, crzo<ldm> crzoVar) {
        azva g = g(axwqVar, dndrVar);
        if (g != null) {
            crzoVar.b(ldm.g(g, ""));
        } else {
            crzoVar.b(null);
        }
    }

    @dzsi
    public static azva g(axwq axwqVar, dndr dndrVar) {
        dcdc<azva> n = axwqVar.n();
        int size = n.size();
        int i = 0;
        while (i < size) {
            azva azvaVar = n.get(i);
            i++;
            if (azvaVar.a.equals(dndrVar)) {
                return azvaVar;
            }
        }
        return null;
    }

    public final void a() {
        bvrj.UI_THREAD.c();
        btrm btrmVar = this.d;
        kph kphVar = this.h;
        dceq a = dcet.a();
        a.b(azre.class, new kpk(azre.class, kphVar));
        btrmVar.g(kphVar, a.a());
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        this.d.a(this.h);
    }

    public final crzm<kpg> c() {
        return this.e.a;
    }

    public final crzm<ldm> d() {
        return this.f.a;
    }

    public final void e(ldm ldmVar) {
        akqi akqiVar;
        dbsk.a(this.e.a.l() == kpg.SET);
        if (ldmVar.a == null || (akqiVar = ldmVar.h.d) == null || akqiVar.o() == null) {
            return;
        }
        this.e.b(kpg.UPDATING);
        this.f.b(ldmVar);
        h(baaq.b(this.b, ldmVar.a, ldmVar.h.d.o(), this.c.a().b(), null, null, new kpe(this.c.a(), this.d, this.b, ldmVar.a, ldmVar.h.d.o(), ldmVar.o(), azvb.UPDATE)));
    }

    public final void h(baaq baaqVar) {
        this.j.b(baaqVar.a, new kpf(this, baaqVar), this.i);
    }
}
