package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aber  reason: default package */
/* loaded from: classes2.dex */
public final class aber implements abfi {
    public final abuq a;

    public aber(abuq abuqVar) {
        this.a = abuqVar;
    }

    @Override // defpackage.abfi
    public final List<absp> a(dhym dhymVar) {
        djcy djcyVar;
        ArrayList arrayList = new ArrayList();
        for (dhyl dhylVar : dhymVar.b) {
            int a = dhyk.a(dhylVar.a);
            int i = a - 1;
            if (a == 0) {
                throw null;
            }
            if (i != 1) {
                int i2 = dhylVar.a;
            } else {
                abnr abnrVar = new abnr();
                if (dhylVar.a == 12) {
                    djcyVar = (djcy) dhylVar.b;
                } else {
                    djcyVar = djcy.b;
                }
                arrayList.add(new abtf(abnrVar, new iwe(dcbg.b(djcyVar.a).s(new dbrn(this) { // from class: abeq
                    private final aber a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        djcw djcwVar = (djcw) obj;
                        abuq abuqVar = this.a.a;
                        gga a2 = abuqVar.a.a();
                        abuq.a(a2, 1);
                        ahjq a3 = abuqVar.b.a();
                        abuq.a(a3, 2);
                        bnjv a4 = abuqVar.c.a();
                        abuq.a(a4, 3);
                        gll a5 = abuqVar.d.a();
                        abuq.a(a5, 4);
                        akpm a6 = abuqVar.e.a();
                        abuq.a(a6, 5);
                        bvsl a7 = abuqVar.f.a();
                        abuq.a(a7, 6);
                        dxio a8 = ((dxjh) abuqVar.g).a();
                        abuq.a(a8, 7);
                        dxio a9 = ((dxjh) abuqVar.h).a();
                        abuq.a(a9, 8);
                        abuq.a(djcwVar, 9);
                        return new abup(a2, a3, a4, a5, a6, a7, a8, a9, djcwVar);
                    }
                }).z()), true));
            }
        }
        return dcdc.r(arrayList);
    }

    @Override // defpackage.abfi
    public final List b(dhym dhymVar) {
        return dcdc.e();
    }
}
