package defpackage;
/* renamed from: btpi  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btpi implements dbrn {
    static final dbrn a = new btpi();

    private btpi() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        ilo iloVar = (ilo) obj;
        dppu bZ = dppv.g.bZ();
        String B = iloVar.B();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dppv dppvVar = (dppv) bZ.b;
        B.getClass();
        dppvVar.a |= 8;
        dppvVar.e = B;
        akqi ai = iloVar.ai();
        if (ai != null && (ai.b != 0 || ai.c != 0)) {
            dpsm bZ2 = dpsn.d.bZ();
            long j = ai.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpsn dpsnVar = (dpsn) bZ2.b;
            int i = dpsnVar.a | 1;
            dpsnVar.a = i;
            dpsnVar.b = j;
            long j2 = ai.c;
            dpsnVar.a = i | 2;
            dpsnVar.c = j2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dppv dppvVar2 = (dppv) bZ.b;
            dpsn bK = bZ2.bK();
            bK.getClass();
            dppvVar2.b = bK;
            dppvVar2.a |= 1;
        }
        if (iloVar.aj() != null) {
            dpum h = iloVar.aj().h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dppv dppvVar3 = (dppv) bZ.b;
            h.getClass();
            dppvVar3.c = h;
            dppvVar3.a |= 2;
        }
        dppq bZ3 = dppt.e.bZ();
        dppv dppvVar4 = (dppv) bZ.b;
        if ((dppvVar4.a & 1) != 0) {
            dpsn dpsnVar2 = dppvVar4.b;
            if (dpsnVar2 == null) {
                dpsnVar2 = dpsn.d;
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dppt dpptVar = (dppt) bZ3.b;
            dpsnVar2.getClass();
            dpptVar.c = dpsnVar2;
            dpptVar.b = 2;
        } else {
            dpum dpumVar = dppvVar4.c;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dppt dpptVar2 = (dppt) bZ3.b;
            dpumVar.getClass();
            dpptVar2.c = dpumVar;
            dpptVar2.b = 3;
        }
        dpoy bZ4 = dppl.m.bZ();
        String n = iloVar.n();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dppl dpplVar = (dppl) bZ4.b;
        n.getClass();
        dpplVar.a |= 16;
        dpplVar.e = n;
        dppv bK2 = bZ.bK();
        bK2.getClass();
        dpplVar.c = bK2;
        dpplVar.b = 2;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dppl dpplVar2 = (dppl) bZ4.b;
        dppt bK3 = bZ3.bK();
        bK3.getClass();
        dpplVar2.d = bK3;
        dpplVar2.a |= 1;
        return bZ4;
    }
}
