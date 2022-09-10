package defpackage;

import defpackage.dssj;
import java.io.IOException;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: csqe  reason: default package */
/* loaded from: classes5.dex */
public final class csqe<T extends dssj> implements csps<Void, Collection<cspy<T>>> {
    public final String a;
    public final dspy<dtrw, T> b;
    private final csnt c;

    public csqe(csnt csntVar, String str, dspy<dtrw, T> dspyVar) {
        this.c = csntVar;
        this.a = str;
        this.b = dspyVar;
    }

    @Override // defpackage.csps
    public final /* bridge */ /* synthetic */ dehn a() {
        csnt csntVar = this.c;
        dcdc f = dcdc.f(dspd.b);
        csnu c = csnv.c();
        ((csnn) c).b = 1;
        return deew.g(csntVar.a(f, c.a()), new defg(this) { // from class: csqd
            private final csqe a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csqe csqeVar = this.a;
                csnx csnxVar = (csnx) obj;
                if (csnxVar.a().size() != 1) {
                    throw new csqa(String.format("The response returned from the server contains %d lookup results, while only one is expected.", Integer.valueOf(csnxVar.a().size())));
                }
                if (((csoa) csnxVar.a().get(0)).c() != 2) {
                    throw new cspz(csqeVar.a);
                }
                dbsk.l(((csoa) csnxVar.a().get(0)).a().a());
                dspd dspdVar = (dspd) ((csoa) csnxVar.a().get(0)).a().b();
                dsqa c2 = dsqa.c();
                dtsa dtsaVar = dtsa.b;
                try {
                    dspj s = dspdVar.s();
                    dsqw dsqwVar = (dsqw) dtsaVar.cu(4);
                    try {
                        try {
                            dstc b = dsst.a.b(dsqwVar);
                            b.f(dsqwVar, dspk.n(s), c2);
                            b.j(dsqwVar);
                            try {
                                s.b(0);
                                dsqw.cv(dsqwVar);
                                dccx F = dcdc.F();
                                for (dtrw dtrwVar : ((dtsa) dsqwVar).a) {
                                    F.g(new csqb(dtrwVar, csqeVar.b));
                                }
                                return deha.a(F.f());
                            } catch (dsrm e) {
                                throw e;
                            }
                        } catch (IOException e2) {
                            if (!(e2.getCause() instanceof dsrm)) {
                                throw new dsrm(e2.getMessage());
                            }
                            throw ((dsrm) e2.getCause());
                        }
                    } catch (RuntimeException e3) {
                        if (e3.getCause() instanceof dsrm) {
                            throw ((dsrm) e3.getCause());
                        }
                        throw e3;
                    }
                } catch (dsrm e4) {
                    throw e4;
                }
            }
        }, dege.a);
    }
}
