package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: acjm  reason: default package */
/* loaded from: classes2.dex */
public final class acjm {
    public final bwqv a;
    public final cqat b;

    public acjm(bwqv bwqvVar, cqat cqatVar) {
        this.a = bwqvVar;
        this.b = cqatVar;
    }

    public final dehn<ackc> a() {
        return deew.g(this.a.l(bwrj.GEOFENCE_DATA, "STORED_GEOFENCE_INDEX_STORAGE_ID", (dssr) ackc.b.cu(7)), new defg(this) { // from class: acjj
            private final acjm a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                acjm acjmVar = this.a;
                ackc ackcVar = (ackc) obj;
                if (ackcVar == null) {
                    return deha.a(ackc.b);
                }
                long b = acjmVar.b.b();
                dsqp dsqpVar = (dsqp) ackcVar.cu(5);
                dsqpVar.bC(ackcVar);
                final acka ackaVar = (acka) dsqpVar;
                dccx F = dcdc.F();
                for (Map.Entry entry : Collections.unmodifiableMap(ackcVar.a).entrySet()) {
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (longValue != 0 && b > longValue) {
                        String str = (String) entry.getKey();
                        F.g(str);
                        ackaVar.a(str);
                    }
                }
                return deew.h(acjmVar.b(F.f()), new dbrn(ackaVar) { // from class: acjk
                    private final acka a;

                    {
                        this.a = ackaVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Void r2 = (Void) obj2;
                        return this.a.bK();
                    }
                }, dege.a);
            }
        }, dege.a);
    }

    public final dehn<Void> b(List<String> list) {
        final deig d = deig.d();
        dccx F = dcdc.F();
        for (String str : list) {
            F.g(this.a.i(bwrj.GEOFENCE_DATA, str));
        }
        deha.l(F.f()).b(new Callable(d) { // from class: acjl
            private final deig a;

            {
                this.a = d;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.j(null));
            }
        }, dege.a);
        return d;
    }

    public final dehn<Void> c(ackc ackcVar) {
        return this.a.h(bwrj.GEOFENCE_DATA, "STORED_GEOFENCE_INDEX_STORAGE_ID", ackcVar);
    }
}
