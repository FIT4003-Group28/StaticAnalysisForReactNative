package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ynf  reason: default package */
/* loaded from: classes7.dex */
public final class ynf {
    public static final dcdc<drsm> a = dcdc.j(drsm.ONLINE_TAXI, drsm.OFFLINE_TAXI, drsm.BICYCLE, drsm.DRIVE, drsm.TWO_WHEELER);

    public static cqtd a(yiq yiqVar) {
        drsm drsmVar;
        int i = yiqVar.a;
        if (i == 1) {
            dqvh b = dqvh.b(((Integer) yiqVar.b).intValue());
            if (b == null) {
                b = dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN;
            }
            return b(b);
        }
        if (i == 2) {
            drsmVar = drsm.b(((Integer) yiqVar.b).intValue());
            if (drsmVar == null) {
                drsmVar = drsm.UNSPECIFIED_NON_TRANSIT_MODE;
            }
        } else {
            drsmVar = drsm.UNSPECIFIED_NON_TRANSIT_MODE;
        }
        dqvh dqvhVar = dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN;
        int ordinal = drsmVar.ordinal();
        if (ordinal == 0) {
            return null;
        }
        switch (ordinal) {
            case 2:
                return iut.a(cqrt.f(2131232230));
            case 3:
                return iut.a(iup.e(R.raw.ic_rickshaw));
            case 4:
                return iut.a(iup.e(R.raw.ic_qu_two_wheeler));
            case 5:
                return iut.a(iup.e(R.raw.ic_mod_taxi));
            case 6:
                return iut.a(cqrt.f(2131232223));
            case 7:
                return iut.a(cqrt.f(2131232178));
            default:
                int i2 = drsmVar.j;
                return null;
        }
    }

    public static cqtd b(dqvh dqvhVar) {
        drsm drsmVar = drsm.UNSPECIFIED_NON_TRANSIT_MODE;
        dqvh dqvhVar2 = dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN;
        switch (dqvhVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return iut.a(cqrt.f(2131232227));
            case 2:
                return iut.a(cqrt.f(2131232232));
            case 3:
                return iut.a(cqrt.f(2131232233));
            case 4:
                return iut.a(cqrt.f(2131232452));
            case 5:
                return iut.a(cqrt.f(2131232453));
            case 6:
                return iut.a(cqrt.f(2131232226));
            default:
                int i = dqvhVar.h;
                return null;
        }
    }

    public static yiq c(dqvh dqvhVar) {
        yip bZ = yiq.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiq yiqVar = (yiq) bZ.b;
        yiqVar.b = Integer.valueOf(dqvhVar.h);
        yiqVar.a = 1;
        return bZ.bK();
    }

    public static yiq d(drsm drsmVar) {
        yip bZ = yiq.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiq yiqVar = (yiq) bZ.b;
        yiqVar.b = Integer.valueOf(drsmVar.j);
        yiqVar.a = 2;
        return bZ.bK();
    }

    public static dcep<dqvh> e(yis yisVar) {
        return dcbg.b(yisVar.a).o(ymp.a).s(ymw.a).B();
    }

    public static dcep<drsm> f(yis yisVar) {
        return dcbg.b(yisVar.a).o(ymx.a).s(ymy.a).B();
    }

    public static dcep<yiq> g(yis yisVar, douz douzVar) {
        final dcep<dqvh> e = e(yisVar);
        dcbg s = dcbg.b(dcbg.b(h(douzVar)).o(new dbsl(e) { // from class: ymz
            private final dcep a;

            {
                this.a = e;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcdc<drsm> dcdcVar = ynf.a;
                return !this.a.contains((dqvh) obj);
            }
        }).B()).s(ynb.a);
        final dcep<drsm> f = f(yisVar);
        return dcbg.d(s, dcbg.b(dcbg.b(i(douzVar)).o(new dbsl(f) { // from class: yna
            private final dcep a;

            {
                this.a = f;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcdc<drsm> dcdcVar = ynf.a;
                return !this.a.contains((drsm) obj);
            }
        }).B()).s(ync.a)).B();
    }

    public static dcdc<dqvh> h(douz douzVar) {
        return dcbg.b(douzVar.b).s(ynd.a).z();
    }

    public static dcdc<drsm> i(douz douzVar) {
        return dcbg.b(douzVar.f).o(yne.a).s(ymq.a).z();
    }

    public static dcdc<yiq> j(douz douzVar) {
        return dcbg.d(dcbg.b(h(douzVar)).s(ymr.a), dcbg.b(i(douzVar)).s(yms.a)).z();
    }

    public static boolean k(douz douzVar) {
        return dcft.j(douzVar.d, ymv.a);
    }

    public static void l(dwbd dwbdVar, yis yisVar, btvo btvoVar) {
        dcep<dqvh> e = e(yisVar);
        if (dwbdVar.c) {
            dwbdVar.bF();
            dwbdVar.c = false;
        }
        dwbk dwbkVar = dwbk.s;
        ((dwbk) dwbdVar.b).j = dwbk.ck();
        if (!e.isEmpty()) {
            final boolean z = btvoVar.getDirectionsPageParameters().C;
            dcdc r = dcdc.r(dcbg.c(dqvh.values()).o(ymt.a).o(new dbsl(z) { // from class: ymu
                private final boolean a;

                {
                    this.a = z;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    boolean z2 = this.a;
                    dqvh dqvhVar = (dqvh) obj;
                    dcdc<drsm> dcdcVar = ynf.a;
                    return dqvhVar != dqvh.TRANSIT_VEHICLE_TYPE_RAIL || z2;
                }
            }).z());
            int size = r.size();
            for (int i = 0; i < size; i++) {
                dqvh dqvhVar = (dqvh) r.get(i);
                if (!e.contains(dqvhVar)) {
                    dpgr bZ = dpgs.c.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dpgs dpgsVar = (dpgs) bZ.b;
                    dpgsVar.b = dqvhVar.h;
                    dpgsVar.a |= 1;
                    if (dwbdVar.c) {
                        dwbdVar.bF();
                        dwbdVar.c = false;
                    }
                    dwbk dwbkVar2 = (dwbk) dwbdVar.b;
                    dpgs bK = bZ.bK();
                    bK.getClass();
                    dwbkVar2.c();
                    dwbkVar2.j.add(bK);
                }
            }
        }
    }
}
