package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aogo  reason: default package */
/* loaded from: classes2.dex */
public class aogo implements Serializable {
    public final dcdc<bvrt<duzn>> a;
    @dzsi
    public transient dcep<Integer> b;
    private final eapy c;
    @dzsi
    private transient dcep<Integer> d;
    @dzsi
    private transient dcep<Integer> e;

    public aogo(eapy eapyVar, dcdc<duzn> dcdcVar) {
        this.a = (dcdc) bvrt.c(dcdcVar, new dccx());
        this.c = eapyVar;
    }

    public static duzn c(bvrt<duzn> bvrtVar) {
        return bvrtVar.e((dssr) duzn.e.cu(7), duzn.e);
    }

    public final dcep<Integer> a() {
        if (this.d == null) {
            dcen N = dcep.N();
            dcdc<bvrt<duzn>> dcdcVar = this.a;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                duzn c = c(dcdcVar.get(i));
                dngs dngsVar = c.a;
                if (dngsVar == null) {
                    dngsVar = dngs.h;
                }
                aogb e = aogb.e(dngsVar);
                if (!c.b) {
                    N.b(Integer.valueOf(((aofo) e).a));
                }
            }
            this.d = N.f();
        }
        return this.d;
    }

    public final dcep<Integer> b() {
        if (this.e == null) {
            dcen N = dcep.N();
            dcdc<bvrt<duzn>> dcdcVar = this.a;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                duzn c = c(dcdcVar.get(i));
                dngs dngsVar = c.a;
                if (dngsVar == null) {
                    dngsVar = dngs.h;
                }
                aogb e = aogb.e(dngsVar);
                if (c.b && c.c > 0) {
                    N.b(Integer.valueOf(((aofo) e).a));
                }
            }
            this.e = N.f();
        }
        return this.e;
    }

    public final void d(eapg eapgVar) {
        dbsk.j(this.c.equals(new eapy(eapgVar)), "%s does not contain %s", this.c, eapgVar);
    }
}
