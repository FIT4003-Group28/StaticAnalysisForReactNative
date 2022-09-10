package defpackage;
/* compiled from: PG */
/* renamed from: ccyb  reason: default package */
/* loaded from: classes4.dex */
public final class ccyb {
    public static final ccwb a;

    static {
        ccwa bZ = ccwb.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwb ccwbVar = (ccwb) bZ.b;
        int i = ccwbVar.a | 1;
        ccwbVar.a = i;
        ccwbVar.c = -1;
        ccwbVar.a = i | 2;
        ccwbVar.d = -1;
        a = bZ.bK();
    }

    public static ccwb a(dcdc<ccwi> dcdcVar) {
        dbsk.a(!dcdcVar.isEmpty());
        ccwa bZ = ccwb.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwb ccwbVar = (ccwb) bZ.b;
        dsrj<ccwi> dsrjVar = ccwbVar.b;
        if (!dsrjVar.a()) {
            ccwbVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(dcdcVar, ccwbVar.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwb ccwbVar2 = (ccwb) bZ.b;
        int i = ccwbVar2.a | 1;
        ccwbVar2.a = i;
        ccwbVar2.c = 0;
        ccwbVar2.a = i | 2;
        ccwbVar2.d = 0;
        ccwk b = b(dcdcVar.get(0));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwb ccwbVar3 = (ccwb) bZ.b;
        b.getClass();
        ccwbVar3.e = b;
        ccwbVar3.a |= 4;
        return bZ.bK();
    }

    public static ccwk b(ccwi ccwiVar) {
        ccwj bZ = ccwk.m.bZ();
        dgfb b = dgfb.b(ccwiVar.b);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwk ccwkVar = (ccwk) bZ.b;
        ccwkVar.b = b.f;
        ccwkVar.a |= 1;
        String str = ccwiVar.f;
        ccwk ccwkVar2 = (ccwk) bZ.b;
        str.getClass();
        ccwkVar2.b();
        ccwkVar2.d.add(str);
        ccxa ccxaVar = ccwiVar.c;
        if (ccxaVar == null) {
            ccxaVar = ccxa.f;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwk ccwkVar3 = (ccwk) bZ.b;
        ccxaVar.getClass();
        ccwkVar3.c = ccxaVar;
        ccwkVar3.a |= 2;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(ccwb ccwbVar) {
        ccwk ccwkVar = ccwbVar.e;
        if (ccwkVar == null) {
            ccwkVar = ccwk.m;
        }
        if (!ccwbVar.b.isEmpty() && ccwbVar.c < ccwbVar.b.size() && ccwkVar.d.size() == 1 && !ccwkVar.d.get(0).isEmpty()) {
            ccwi ccwiVar = ccwbVar.b.get(ccwbVar.c);
            if (ccwbVar.d < ccwiVar.d.size() && ccwkVar.d.get(0).equals(ccwiVar.f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ccwb d(ccwb ccwbVar) {
        if (c(ccwbVar)) {
            int i = ccwbVar.c;
            int i2 = ccwbVar.d + 1;
            ccwk ccwkVar = ccwbVar.e;
            if (ccwkVar == null) {
                ccwkVar = ccwk.m;
            }
            if (i2 == ccwbVar.b.get(ccwbVar.c).d.size()) {
                i++;
                if (i != ccwbVar.b.size()) {
                    ccwkVar = b(ccwbVar.b.get(i));
                    i2 = 0;
                } else {
                    return a;
                }
            }
            dsqp dsqpVar = (dsqp) ccwbVar.cu(5);
            dsqpVar.bC(ccwbVar);
            ccwa ccwaVar = (ccwa) dsqpVar;
            if (ccwaVar.c) {
                ccwaVar.bF();
                ccwaVar.c = false;
            }
            ccwb ccwbVar2 = (ccwb) ccwaVar.b;
            int i3 = ccwbVar2.a | 1;
            ccwbVar2.a = i3;
            ccwbVar2.c = i;
            int i4 = i3 | 2;
            ccwbVar2.a = i4;
            ccwbVar2.d = i2;
            ccwkVar.getClass();
            ccwbVar2.e = ccwkVar;
            ccwbVar2.a = i4 | 4;
            return ccwaVar.bK();
        }
        return a;
    }
}
