package defpackage;

import java.util.EnumSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: yze  reason: default package */
/* loaded from: classes7.dex */
public final class yze {
    public final vwv a;
    public final ymn b;
    public final yzs c;
    public final btvo d;

    public yze(vwv vwvVar, yzs yzsVar, ymn ymnVar, btvo btvoVar) {
        this.d = btvoVar;
        this.a = vwvVar;
        this.c = yzsVar;
        this.b = ymnVar;
    }

    public static dpgn a(dqtz dqtzVar) {
        dpgm bZ = dpgn.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpgn dpgnVar = (dpgn) bZ.b;
        dpgnVar.b = dqtzVar.d;
        dpgnVar.a |= 1;
        return bZ.bK();
    }

    public static yiv b(dwao dwaoVar) {
        final Set B;
        dwbk dwbkVar = dwaoVar.f;
        if (dwbkVar == null) {
            dwbkVar = dwbk.s;
        }
        if (dwbkVar.j.isEmpty()) {
            B = EnumSet.allOf(dqvh.class);
        } else {
            dwbk dwbkVar2 = dwaoVar.f;
            if (dwbkVar2 == null) {
                dwbkVar2 = dwbk.s;
            }
            B = dcbg.b(dwbkVar2.j).s(yyx.a).B();
        }
        dwbk dwbkVar3 = dwaoVar.f;
        if (dwbkVar3 == null) {
            dwbkVar3 = dwbk.s;
        }
        dwbh dwbhVar = dwbkVar3.o;
        if (dwbhVar == null) {
            dwbhVar = dwbh.g;
        }
        dwbg dwbgVar = dwbhVar.c;
        if (dwbgVar == null) {
            dwbgVar = dwbg.g;
        }
        final EnumSet<drsm> c = c(dwbgVar);
        dwbg dwbgVar2 = dwbhVar.b;
        if (dwbgVar2 == null) {
            dwbgVar2 = dwbg.g;
        }
        EnumSet<drsm> c2 = c(dwbgVar2);
        yim bZ = yiv.e.bZ();
        yin bZ2 = yio.c.bZ();
        dwbk dwbkVar4 = dwaoVar.f;
        if (dwbkVar4 == null) {
            dwbkVar4 = dwbk.s;
        }
        boolean a = dcbg.b(dwbkVar4.m).r(yyy.a).a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        yio yioVar = (yio) bZ2.b;
        yioVar.a |= 1;
        yioVar.b = a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiv yivVar = (yiv) bZ.b;
        yio bK = bZ2.bK();
        bK.getClass();
        yivVar.d = bK;
        yivVar.a |= 4;
        yit bZ3 = yiu.c.bZ();
        dwbk dwbkVar5 = dwaoVar.f;
        if (dwbkVar5 == null) {
            dwbkVar5 = dwbk.s;
        }
        dqvb b = dqvb.b(dwbkVar5.i);
        if (b == null) {
            b = dqvb.TRANSIT_BEST;
        }
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        yiu yiuVar = (yiu) bZ3.b;
        yiuVar.b = b.f;
        yiuVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiv yivVar2 = (yiv) bZ.b;
        yiu bK2 = bZ3.bK();
        bK2.getClass();
        yivVar2.c = bK2;
        yivVar2.a |= 2;
        yir bZ4 = yis.b.bZ();
        bZ4.a(dcbg.b(c2).o(new dbsl(c) { // from class: yyz
            private final EnumSet a;

            {
                this.a = c;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !this.a.contains((drsm) obj);
            }
        }).s(yza.a).z());
        bZ4.a(dcbg.c(dqvh.values()).o(yzb.a).o(new dbsl(B) { // from class: yzc
            private final Set a;

            {
                this.a = B;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !this.a.contains((dqvh) obj);
            }
        }).s(yzd.a).z());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiv yivVar3 = (yiv) bZ.b;
        yis bK3 = bZ4.bK();
        bK3.getClass();
        yivVar3.b = bK3;
        yivVar3.a |= 1;
        return bZ.bK();
    }

    private static EnumSet<drsm> c(dwbg dwbgVar) {
        EnumSet<drsm> noneOf = EnumSet.noneOf(drsm.class);
        if (dwbgVar.f) {
            noneOf.add(drsm.BICYCLE);
        }
        if (dwbgVar.b) {
            noneOf.add(drsm.DRIVE);
        }
        if (dwbgVar.c) {
            noneOf.add(drsm.OFFLINE_TAXI);
        }
        if (dwbgVar.e) {
            noneOf.add(drsm.ONLINE_TAXI);
        }
        if (dwbgVar.d) {
            noneOf.add(drsm.TWO_WHEELER);
        }
        return noneOf;
    }
}
