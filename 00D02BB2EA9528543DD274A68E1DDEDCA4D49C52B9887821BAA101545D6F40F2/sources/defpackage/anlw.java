package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anlw  reason: default package */
/* loaded from: classes2.dex */
final class anlw {
    static final Comparator<dmki<anms, anmq>> a = new anlv();
    static final long b = TimeUnit.MINUTES.toSeconds(20);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x064d, code lost:
        if (r10 == 3) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
        if (r9.equals(r12.g) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
        if (r4.j.b().a.a() != false) goto L239;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dbsg<defpackage.aoge> a(defpackage.aoge r19, java.util.List<defpackage.dmki<defpackage.anms, defpackage.anmq>> r20) {
        /*
            Method dump skipped, instructions count: 1771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anlw.a(aoge, java.util.List):dbsg");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<anlp> b(dngs dngsVar, Iterable<anlp> iterable) {
        final dclz e = dclz.e(Long.valueOf(aogc.f(dngsVar)), Long.valueOf(aogc.h(dngsVar)));
        return dcdc.q(dcft.i(iterable, new dbsl(e) { // from class: anlt
            private final dclz a;

            {
                this.a = e;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dclz dclzVar = this.a;
                anlp anlpVar = (anlp) obj;
                return anlpVar.g() <= anlpVar.h() && (dclzVar.a(Long.valueOf(anlpVar.g())) || dclzVar.a(Long.valueOf(anlpVar.h())));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<anms> c(Iterable<dvay> iterable) {
        dccx F = dcdc.F();
        for (dvay dvayVar : iterable) {
            dwyn dwynVar = dvayVar.f;
            if (dwynVar == null) {
                dwynVar = dwyn.d;
            }
            eaou k = eaou.k((int) d(dwynVar.c));
            dwyn dwynVar2 = dvayVar.g;
            if (dwynVar2 == null) {
                dwynVar2 = dwyn.d;
            }
            F.g(anms.a(dvayVar, k, eaou.k((int) d(dwynVar2.c))));
        }
        return F.f();
    }

    private static long d(long j) {
        return TimeUnit.MINUTES.toMillis(j);
    }

    private static dvay e(ArrayList<dvay> arrayList) {
        dvak dvakVar;
        dval bZ = dvay.u.bZ();
        dvau bZ2 = dvav.e.bZ();
        dvay dvayVar = (dvay) new anlu().m(arrayList);
        if (dvayVar.b == 9) {
            dvakVar = (dvak) dvayVar.c;
        } else {
            dvakVar = dvak.e;
        }
        dqjl b2 = dqjl.b(dvakVar.b);
        if (b2 == null) {
            b2 = dqjl.UNKNOWN_ACTIVITY_TYPE;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvav dvavVar = (dvav) bZ2.b;
        dvavVar.d = b2.L;
        dvavVar.a |= 2;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            dvay dvayVar2 = arrayList.get(i2);
            if (dvayVar2.b == 9) {
                i += ((dvak) dvayVar2.c).c;
            }
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvav dvavVar2 = (dvav) bZ2.b;
        dvavVar2.a |= 1;
        dvavVar2.c = i;
        dvav dvavVar3 = (dvav) bZ2.b;
        dsrj<dvay> dsrjVar = dvavVar3.b;
        if (!dsrjVar.a()) {
            dvavVar3.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(arrayList, dvavVar3.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar3 = (dvay) bZ.b;
        dvav bK = bZ2.bK();
        bK.getClass();
        dvayVar3.c = bK;
        dvayVar3.b = 14;
        dvax dvaxVar = dvax.TRAVEL;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar4 = (dvay) bZ.b;
        dvayVar4.m = dvaxVar.f;
        dvayVar4.a |= 64;
        dwyn dwynVar = arrayList.get(0).f;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar5 = (dvay) bZ.b;
        dwynVar.getClass();
        dvayVar5.f = dwynVar;
        dvayVar5.a |= 4;
        dwyn dwynVar2 = ((dvay) dcft.s(arrayList)).g;
        if (dwynVar2 == null) {
            dwynVar2 = dwyn.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar6 = (dvay) bZ.b;
        dwynVar2.getClass();
        dvayVar6.g = dwynVar2;
        dvayVar6.a |= 8;
        dvap dvapVar = arrayList.get(0).e;
        if (dvapVar == null) {
            dvapVar = dvap.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar7 = (dvay) bZ.b;
        dvapVar.getClass();
        dvayVar7.e = dvapVar;
        dvayVar7.a |= 2;
        return bZ.bK();
    }
}
