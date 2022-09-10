package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajnd  reason: default package */
/* loaded from: classes2.dex */
public final class ajnd {
    public final ailf a;
    private final Executor b;
    private final cqat c;

    public ajnd(Executor executor, cqat cqatVar, ailf ailfVar) {
        this.b = executor;
        this.c = cqatVar;
        this.a = ailfVar;
    }

    public final dehn<ajnc> a(final dcep<btlu> dcepVar) {
        final deig d = deig.d();
        final dcdc q = dcdc.q(dcft.o(dcepVar, new dbrn(this) { // from class: ajmy
            private final ajnd a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ailf ailfVar = this.a.a;
                dbsg<btlu> i = dbsg.i((btlu) obj);
                aiiv aiivVar = (aiiv) ailfVar;
                eapd eapdVar = new eapd(aiivVar.h.a().b());
                deig d2 = deig.d();
                dkof dkofVar = aiivVar.g.a().getLocationSharingParameters().q;
                if (dkofVar == null) {
                    dkofVar = dkof.s;
                }
                boolean z = !dkofVar.p;
                dbsg<aile> b = aiivVar.d.a().b(i);
                if (b.a() && !b.b().b(eapdVar)) {
                    d2.j(b);
                } else if (!z) {
                    d2.j(dbpy.a);
                } else {
                    aiivVar.k.a().a((btlu) ((dbsu) i).a).Pk(new Runnable(aiivVar, i, eapdVar, d2) { // from class: aiin
                        private final aiiv a;
                        private final dbsg b;
                        private final eapd c;
                        private final deig d;

                        {
                            this.a = aiivVar;
                            this.b = i;
                            this.c = eapdVar;
                            this.d = d2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final aiiv aiivVar2 = this.a;
                            final dbsg dbsgVar = this.b;
                            final eapd eapdVar2 = this.c;
                            final deig deigVar = this.d;
                            deha.l(dcdc.r(aiivVar2.m)).b(new Callable(aiivVar2, dbsgVar, eapdVar2, deigVar) { // from class: aiit
                                private final aiiv a;
                                private final dbsg b;
                                private final eapd c;
                                private final deig d;

                                {
                                    this.a = aiivVar2;
                                    this.b = dbsgVar;
                                    this.c = eapdVar2;
                                    this.d = deigVar;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    aiiv aiivVar3 = this.a;
                                    dbsg<btlu> dbsgVar2 = this.b;
                                    eapd eapdVar3 = this.c;
                                    deig deigVar2 = this.d;
                                    dbsg<aile> b2 = aiivVar3.d.a().b(dbsgVar2);
                                    if (!b2.a() || b2.b().b(eapdVar3)) {
                                        deigVar2.j(dbpy.a);
                                    } else {
                                        deigVar2.j(b2);
                                    }
                                    return new Object();
                                }
                            }, aiivVar2.f.a());
                        }
                    }, aiivVar.f.a());
                }
                return d2;
            }
        }));
        final eapd eapdVar = new eapd(this.c.b());
        deha.l(q).b(new Callable(q, eapdVar, d, dcepVar) { // from class: ajmz
            private final dcdc a;
            private final eapd b;
            private final deig c;
            private final dcep d;

            {
                this.a = q;
                this.b = eapdVar;
                this.c = d;
                this.d = dcepVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dcdc dcdcVar = this.a;
                eapd eapdVar2 = this.b;
                deig deigVar = this.c;
                dcep<btlu> dcepVar2 = this.d;
                Iterable<dbsg> o = dcft.o(dcdcVar, ajna.a);
                dcen N = dcep.N();
                boolean z = false;
                boolean z2 = true;
                for (dbsg dbsgVar : o) {
                    if (!dbsgVar.a() || ((aile) dbsgVar.b()).b(eapdVar2)) {
                        N.b(aild.UNABLE_TO_DETERMINE_ELIGIBILITY);
                        z2 = false;
                    } else {
                        aile aileVar = (aile) dbsgVar.b();
                        z2 &= aileVar.g();
                        if (!aileVar.i()) {
                            N.i(aileVar.j());
                        }
                    }
                }
                ajjw ajjwVar = new ajjw();
                if (dcepVar2 != null) {
                    ajjwVar.a = dcepVar2;
                    if (true == z2) {
                        z = true;
                    }
                    ajjwVar.b = Boolean.valueOf(z);
                    dcep<aild> f = N.f();
                    if (f != null) {
                        ajjwVar.c = f;
                        String str = ajjwVar.a == null ? " accounts" : "";
                        if (ajjwVar.b == null) {
                            str = str.concat(" eligibleToBecomePrimary");
                        }
                        if (ajjwVar.c == null) {
                            str = String.valueOf(str).concat(" ineligibleToReportReasons");
                        }
                        if (!str.isEmpty()) {
                            String valueOf = String.valueOf(str);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                        }
                        deigVar.j(new ajjx(ajjwVar.a, ajjwVar.b.booleanValue(), ajjwVar.c));
                        return new Object();
                    }
                    throw new NullPointerException("Null ineligibleToReportReasons");
                }
                throw new NullPointerException("Null accounts");
            }
        }, this.b);
        return d;
    }
}
