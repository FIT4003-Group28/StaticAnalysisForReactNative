package defpackage;
/* compiled from: PG */
/* renamed from: chnr  reason: default package */
/* loaded from: classes4.dex */
public final class chnr {
    public static final dpoj a() {
        eapg b = eapg.b(eaou.b);
        dpoi bZ = dpoj.e.bZ();
        int r = b.r();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpoj dpojVar = (dpoj) bZ.b;
        dpojVar.a |= 1;
        dpojVar.b = r;
        int s = b.s();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpoj dpojVar2 = (dpoj) bZ.b;
        dpojVar2.a |= 2;
        dpojVar2.c = s;
        int t = b.t();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpoj dpojVar3 = (dpoj) bZ.b;
        dpojVar3.a |= 4;
        dpojVar3.d = t;
        return bZ.bK();
    }
}
