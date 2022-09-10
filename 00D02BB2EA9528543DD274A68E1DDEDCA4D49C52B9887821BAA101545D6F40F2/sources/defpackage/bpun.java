package defpackage;
/* compiled from: PG */
/* renamed from: bpun  reason: default package */
/* loaded from: classes4.dex */
public final class bpun {
    public static dnqe a(dnqe dnqeVar, dnpv dnpvVar, String str) {
        dnpv[] dnpvVarArr = {dnpvVar};
        dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
        dsqpVar.bC(dnqeVar);
        dnps dnpsVar = (dnps) dsqpVar;
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar2 = dnqe.i;
        ((dnqe) dnpsVar.b).h = dnqe.ck();
        dcep M = dcep.M(dnpvVarArr);
        for (dnpw dnpwVar : dnqeVar.h) {
            dnpv b = dnpv.b(dnpwVar.b);
            if (b == null) {
                b = dnpv.UNKNOWN_TAG;
            }
            if (!M.contains(b)) {
                if (dnpsVar.c) {
                    dnpsVar.bF();
                    dnpsVar.c = false;
                }
                dnqe dnqeVar3 = (dnqe) dnpsVar.b;
                dnpwVar.getClass();
                dnqeVar3.b();
                dnqeVar3.h.add(dnpwVar);
            }
        }
        dnpt bZ = dnpw.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnpw dnpwVar2 = (dnpw) bZ.b;
        dnpwVar2.b = dnpvVar.v;
        int i = dnpwVar2.a | 1;
        dnpwVar2.a = i;
        str.getClass();
        dnpwVar2.a = i | 2;
        dnpwVar2.c = str;
        dnpsVar.a(bZ);
        return dnpsVar.bK();
    }
}
