package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ilw  reason: default package */
/* loaded from: classes.dex */
public final class ilw {
    public boolean B;
    @dzsi
    dvyw F;
    @dzsi
    public dndr a;
    @dzsi
    public Boolean b;
    @dzsi
    public dqtl c;
    @dzsi
    public dnng d;
    @dzsi
    public dhjz e;
    @dzsi
    public Long f;
    @dzsi
    public dpxf g;
    @dzsi
    public dgfy h;
    @dzsi
    public djai i;
    @dzsi
    public dmbq j;
    @dzsi
    public doav k;
    @dzsi
    public doaz l;
    @dzsi
    public doco m;
    @dzsi
    public String n;
    @dzsi
    public String o;
    @dzsi
    public String p;
    @dzsi
    public String q;
    @dzsi
    public String r;
    @dzsi
    public String s;
    @dzsi
    public dvxb t;
    @dzsi
    public dwfl u;
    @dzsi
    public dvyy v;
    @dzsi
    public decq w;
    @dzsi
    public ilx x;
    public boolean y;
    public boolean z = false;
    public boolean A = false;
    public final List<dvxx> C = dchl.a();
    public final List<String> D = dchl.a();
    public final Set<altv> E = dcnm.h();
    public boolean G = false;

    public static void a(dnwe dnweVar) {
        dnwf dnwfVar = (dnwf) dnweVar.b;
        if ((dnwfVar.a & 64) != 0) {
            dnem dnemVar = dnwfVar.p;
            if (dnemVar == null) {
                dnemVar = dnem.h;
            }
            dsqp dsqpVar = (dsqp) dnemVar.cu(5);
            dsqpVar.bC(dnemVar);
            dnef dnefVar = (dnef) dsqpVar;
            if (dnefVar.c) {
                dnefVar.bF();
                dnefVar.c = false;
            }
            dnem dnemVar2 = (dnem) dnefVar.b;
            dnemVar2.c = null;
            dnemVar2.a &= -3;
            dnem.b(dnemVar2);
            dnem bK = dnefVar.bK();
            if (dnweVar.c) {
                dnweVar.bF();
                dnweVar.c = false;
            }
            dnwf dnwfVar2 = (dnwf) dnweVar.b;
            bK.getClass();
            dnwfVar2.p = bK;
            dnwfVar2.a |= 64;
        }
    }

    public static void b(dnwe dnweVar, eapd eapdVar, eapd eapdVar2, eapg eapgVar) {
        ArrayList arrayList = new ArrayList();
        long j = eapdVar.a;
        dose bZ = dosf.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dosf dosfVar = (dosf) bZ.b;
        int i = dosfVar.a | 1;
        dosfVar.a = i;
        dosfVar.b = j;
        long j2 = eapdVar2.a;
        int i2 = i | 2;
        dosfVar.a = i2;
        dosfVar.c = j2;
        dosfVar.a = i2 | 8;
        dosfVar.e = j2;
        dngp bZ2 = dngq.d.bZ();
        dngr bZ3 = dngs.h.bZ();
        int r = eapgVar.r();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dngs dngsVar = (dngs) bZ3.b;
        dngsVar.a |= 1;
        dngsVar.b = r;
        int s = eapgVar.s() - 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dngs dngsVar2 = (dngs) bZ3.b;
        dngsVar2.a |= 2;
        dngsVar2.c = s;
        int t = eapgVar.t();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dngs dngsVar3 = (dngs) bZ3.b;
        dngsVar3.a |= 4;
        dngsVar3.d = t;
        dngs bK = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dngq dngqVar = (dngq) bZ2.b;
        bK.getClass();
        dngqVar.c = bK;
        dngqVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dosf dosfVar2 = (dosf) bZ.b;
        dngq bK2 = bZ2.bK();
        bK2.getClass();
        dosfVar2.d = bK2;
        dosfVar2.a |= 4;
        arrayList.add(bZ.bK());
        for (dosf dosfVar3 : Collections.unmodifiableList(((dnwf) dnweVar.b).n)) {
            if (dosfVar3.c <= j) {
                arrayList.add(dosfVar3);
            } else {
                j = Math.min(j, dosfVar3.b);
            }
        }
        dosf dosfVar4 = (dosf) arrayList.get(0);
        dsqp dsqpVar = (dsqp) dosfVar4.cu(5);
        dsqpVar.bC(dosfVar4);
        dose doseVar = (dose) dsqpVar;
        if (doseVar.c) {
            doseVar.bF();
            doseVar.c = false;
        }
        dosf dosfVar5 = (dosf) doseVar.b;
        dosfVar5.a |= 1;
        dosfVar5.b = j;
        arrayList.set(0, doseVar.bK());
        if (dnweVar.c) {
            dnweVar.bF();
            dnweVar.c = false;
        }
        ((dnwf) dnweVar.b).n = dnwf.ck();
        if (dnweVar.c) {
            dnweVar.bF();
            dnweVar.c = false;
        }
        dnwf dnwfVar = (dnwf) dnweVar.b;
        dnwfVar.b();
        dsod.bv(arrayList, dnwfVar.n);
    }

    public final void c(@dzsi altv altvVar) {
        if (altvVar == null) {
            return;
        }
        this.E.add(altvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(akqq akqqVar) {
        if (akqqVar == null) {
            return;
        }
        dhjy bZ = dhjz.e.bZ();
        double d = akqqVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        int i = dhjzVar.a | 2;
        dhjzVar.a = i;
        dhjzVar.c = d;
        double d2 = akqqVar.b;
        dhjzVar.a = i | 1;
        dhjzVar.b = d2;
        this.e = bZ.bK();
    }
}
