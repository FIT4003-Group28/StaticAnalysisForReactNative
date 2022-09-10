package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: rhq  reason: default package */
/* loaded from: classes7.dex */
public final class rhq {
    public static dcep<Integer> a(rhj rhjVar) {
        return (dcep) rhjVar.b.b.h(rhl.a).c(dcmr.a);
    }

    public static void b(rhj rhjVar, dcep<Integer> dcepVar) {
        rie a = rhjVar.b.a();
        dcdc<rid> dcdcVar = a.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            final rid ridVar = dcdcVar.get(i);
            a.b = dcbg.b(a.b).o(new dbsl(ridVar) { // from class: ric
                private final rid a;

                {
                    this.a = ridVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return ((rid) obj) != this.a;
                }
            }).z();
        }
        dcpd<Integer> it = dcepVar.iterator();
        while (it.hasNext()) {
            a.a().a(it.next().intValue());
        }
    }

    public static rim c(rhj rhjVar) {
        if (rhjVar.c().size() < 2) {
            throw new NoSuchElementException();
        }
        String a = rhjVar.c().get(0).a();
        String a2 = rhjVar.c().get(1).a();
        ril c = ril.c(a, a2);
        rim rimVar = rhjVar.c.get(c);
        if (rimVar != null) {
            return rimVar;
        }
        rin rinVar = rhjVar.a;
        dnlj bZ = dnlm.e.bZ();
        dnlk bZ2 = dnll.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnll dnllVar = (dnll) bZ2.b;
        a.getClass();
        dnllVar.a |= 1;
        dnllVar.b = a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnlm dnlmVar = (dnlm) bZ.b;
        dnll bK = bZ2.bK();
        bK.getClass();
        dnlmVar.b = bK;
        dnlmVar.a |= 1;
        dnlk bZ3 = dnll.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnll dnllVar2 = (dnll) bZ3.b;
        a2.getClass();
        dnllVar2.a = 1 | dnllVar2.a;
        dnllVar2.b = a2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnlm dnlmVar2 = (dnlm) bZ.b;
        dnll bK2 = bZ3.bK();
        bK2.getClass();
        dnlmVar2.c = bK2;
        dnlmVar2.a |= 2;
        rim a3 = rin.a(bZ.bK());
        rhjVar.c.put(c, a3);
        return a3;
    }

    public static dbsg<dnlg> d(rhj rhjVar) {
        dbsg j;
        List<rhy> c = rhjVar.c();
        if (c.size() < 2) {
            j = dbpy.a;
        } else {
            j = dbsg.j(rhjVar.c.get(ril.c(c.get(0).a(), c.get(1).a())));
        }
        return (dbsg) j.h(rho.a).c(dbpy.a);
    }

    public static void e(rhj rhjVar, dnlg dnlgVar) {
        rim c = c(rhjVar);
        dnlj ca = dnlm.e.ca(c.a);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dnlm) ca.b).d = dnlm.ck();
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnlm dnlmVar = (dnlm) ca.b;
        dnlgVar.getClass();
        dnlmVar.b();
        dnlmVar.d.add(dnlgVar);
        c.a = ca.bK();
    }

    public static void f(rhj rhjVar) {
        rim c = c(rhjVar);
        dnlj ca = dnlm.e.ca(c.a);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dnlm) ca.b).d = dnlm.ck();
        c.a = ca.bK();
    }
}
