package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csop  reason: default package */
/* loaded from: classes5.dex */
public final class csop implements csnt {
    public final csof a;
    private final csnt b;

    public csop(csnt csntVar, csof csofVar) {
        this.b = csntVar;
        this.a = csofVar;
    }

    @Override // defpackage.csnm
    public final dehn<csnx<dspd>> a(final Iterable<dspd> iterable, final csnv csnvVar) {
        if (csnvVar.a()) {
            return b(iterable, csnvVar);
        }
        return deew.g(deee.g(deew.h(degp.q(this.a.a(iterable, csnvVar)), csoh.a, dege.a), Throwable.class, new dbrn() { // from class: csoi
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                return dbpy.a;
            }
        }, dege.a), new defg(this, iterable, csnvVar) { // from class: csog
            private final csop a;
            private final Iterable b;
            private final csnv c;

            {
                this.a = this;
                this.b = iterable;
                this.c = csnvVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csop csopVar = this.a;
                Iterable<dspd> iterable2 = this.b;
                csnv csnvVar2 = this.c;
                final dbsg dbsgVar = (dbsg) obj;
                if (!dbsgVar.a()) {
                    return csopVar.b(iterable2, csnvVar2);
                }
                dcdc q = dcdc.q(dcft.o(dcft.i(csor.c(iterable2, ((csnx) dbsgVar.b()).a()), csoj.a), csok.a));
                if (q.isEmpty()) {
                    return deha.a((csnx) dbsgVar.b());
                }
                return deew.h(csopVar.b(q, csnvVar2), new dbrn(dbsgVar) { // from class: csol
                    private final dbsg a;

                    {
                        this.a = dbsgVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        dbsg dbsgVar2 = this.a;
                        csnw b = csnx.b();
                        dcdc<csoa> a = ((csnx) dbsgVar2.b()).a();
                        dcdc a2 = ((csnx) obj2).a();
                        dccx F = dcdc.F();
                        Iterator<E> it = a2.iterator();
                        for (csoa csoaVar : a) {
                            if (csnz.b(csoaVar.c())) {
                                F.g(csoaVar);
                            } else {
                                F.g((csoa) it.next());
                            }
                        }
                        b.b(F.f());
                        return b.a();
                    }
                }, dege.a);
            }
        }, dege.a);
    }

    public final dehn<csnx<dspd>> b(final Iterable<dspd> iterable, csnv csnvVar) {
        return deew.g(this.b.a(iterable, csnvVar), new defg(this, iterable) { // from class: csom
            private final csop a;
            private final Iterable b;

            {
                this.a = this;
                this.b = iterable;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dehn b;
                csop csopVar = this.a;
                Iterable iterable2 = this.b;
                final csnx csnxVar = (csnx) obj;
                csof csofVar = csopVar.a;
                dbsk.s(iterable2);
                dbsk.s(csnxVar);
                synchronized (((csoe) csofVar).b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        dcpe listIterator = csor.c(iterable2, csnxVar.a()).listIterator();
                        while (listIterator.hasNext()) {
                            csor csorVar = (csor) listIterator.next();
                            ((csoe) csofVar).b.put((dspd) csorVar.a(), new csob((csoa) csorVar.b(), currentTimeMillis));
                        }
                    } catch (IllegalStateException e) {
                        b = deha.b(e);
                    }
                }
                b = deha.a(null);
                return deew.h(deee.g(degp.q(b), Exception.class, new dbrn() { // from class: cson
                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Exception exc = (Exception) obj2;
                        return null;
                    }
                }, dege.a), new dbrn(csnxVar) { // from class: csoo
                    private final csnx a;

                    {
                        this.a = csnxVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Void r2 = (Void) obj2;
                        return this.a;
                    }
                }, dege.a);
            }
        }, dege.a);
    }
}
