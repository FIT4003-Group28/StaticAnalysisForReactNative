package defpackage;

import java.util.HashMap;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: xaz  reason: default package */
/* loaded from: classes7.dex */
public class xaz {
    public final wvp a;
    private final gce b;
    private final btvo c;
    private final vtn d;
    private final wvi e;

    public xaz(wvp wvpVar, gce gceVar, btvo btvoVar, vtn vtnVar, wvi wviVar) {
        this.a = wvpVar;
        this.b = gceVar;
        this.c = btvoVar;
        this.d = vtnVar;
        this.e = wviVar;
    }

    @dzsi
    public static final drhh g(drhn drhnVar, djws djwsVar) {
        drhw drhwVar;
        drhw drhwVar2;
        djwr djwrVar;
        djwq djwqVar;
        if ((drhnVar.a & 16) != 0) {
            drhh drhhVar = drhnVar.f;
            return drhhVar == null ? drhh.k : drhhVar;
        }
        drhx drhxVar = drhnVar.e;
        if (drhxVar == null) {
            drhxVar = drhx.c;
        }
        if (drhxVar.a == 1) {
            drhwVar = (drhw) drhxVar.b;
        } else {
            drhwVar = drhw.b;
        }
        if (drhwVar.a.size() == 1) {
            drhx drhxVar2 = drhnVar.e;
            if (drhxVar2 == null) {
                drhxVar2 = drhx.c;
            }
            if (drhxVar2.a == 1) {
                drhwVar2 = (drhw) drhxVar2.b;
            } else {
                drhwVar2 = drhw.b;
            }
            String str = drhwVar2.a.get(0).b;
            if (djwsVar.a == 5) {
                djwrVar = (djwr) djwsVar.b;
            } else {
                djwrVar = djwr.b;
            }
            Iterator<djwq> it = djwrVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    djwqVar = null;
                    break;
                }
                djwqVar = it.next();
                if (djwqVar.a.equals(str)) {
                    break;
                }
            }
            if (djwqVar != null) {
                drhh drhhVar2 = djwqVar.b;
                return drhhVar2 == null ? drhh.k : drhhVar2;
            }
        }
        return null;
    }

    public static final boolean h(drhn drhnVar) {
        if ((drhnVar.a & 8) != 0) {
            dcdc g = dcdc.g(drhl.REALTIME_FROM_AGENCY, drhl.REALTIME_FROM_UGC);
            drhl b = drhl.b(drhnVar.c);
            if (b == null) {
                b = drhl.UNKNOWN_ATTRIBUTE_SOURCE;
            }
            return g.contains(b);
        }
        return false;
    }

    @dzsi
    public final drhn a(djpk djpkVar, dpjb dpjbVar, drhj drhjVar) {
        drhn drhnVar;
        HashMap<drhj, drhn> a = this.a.a(djpkVar);
        if (a == null || (drhnVar = a.get(drhjVar)) == null) {
            for (drhn drhnVar2 : dpjbVar.d) {
                drhj drhjVar2 = drhnVar2.b;
                if (drhjVar2 == null) {
                    drhjVar2 = drhj.c;
                }
                if (drhjVar2.equals(drhjVar)) {
                    return drhnVar2;
                }
            }
            return null;
        }
        return drhnVar;
    }

    @dzsi
    public final drhh b(@dzsi drhn drhnVar) {
        if (drhnVar != null) {
            wvi wviVar = this.e;
            drhj drhjVar = drhnVar.b;
            if (drhjVar == null) {
                drhjVar = drhj.c;
            }
            return g(drhnVar, wviVar.a(drhjVar));
        }
        return null;
    }

    @dzsi
    public final cqtd c(drhh drhhVar, boolean z, boolean z2, vtk vtkVar) {
        return d(drhhVar, z, z2, vtkVar, false);
    }

    public final boolean f() {
        return this.c.getTransitPagesParameters().K;
    }

    @dzsi
    public final drhn i(@dzsi String str, dpjb dpjbVar) {
        if (str != null) {
            djpj bZ = djpk.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djpk djpkVar = (djpk) bZ.b;
            str.getClass();
            djpkVar.a |= 8;
            djpkVar.d = str;
            djpk bK = bZ.bK();
            drhi bZ2 = drhj.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drhj drhjVar = (drhj) bZ2.b;
            drhjVar.a |= 1;
            drhjVar.b = "crowdedness";
            return a(bK, dpjbVar, bZ2.bK());
        }
        return null;
    }

    public static cqtd e(cqtd cqtdVar, boolean z, boolean z2) {
        if (!z) {
            return iut.a(cqtdVar);
        }
        return cqrt.i(iut.a(cqtdVar), z2 ? ibl.aq() : ibm.T());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[ORIG_RETURN, RETURN] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cqtd d(defpackage.drhh r3, final boolean r4, boolean r5, @defpackage.dzsi final defpackage.vtk r6, final boolean r7) {
        /*
            r2 = this;
            r0 = 0
            if (r7 != 0) goto Lc
            gce r1 = r2.b
            boolean r1 = r1.h()
            if (r1 == 0) goto Lc
            r0 = 1
        Lc:
            if (r5 == 0) goto L24
            if (r4 != 0) goto L24
            if (r0 == 0) goto L1b
            int r5 = r3.a
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L1b
            java.lang.String r3 = r3.j
            goto L43
        L1b:
            int r5 = r3.a
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L24
            java.lang.String r3 = r3.i
            goto L43
        L24:
            if (r0 == 0) goto L38
            if (r4 != 0) goto L38
            int r5 = r3.a
            r0 = r5 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L31
            java.lang.String r3 = r3.h
            goto L43
        L31:
            r5 = r5 & 32
            if (r5 == 0) goto L38
            java.lang.String r3 = r3.f
            goto L43
        L38:
            int r5 = r3.a
            r5 = r5 & 64
            if (r5 == 0) goto L41
            java.lang.String r3 = r3.g
            goto L43
        L41:
            java.lang.String r3 = r3.e
        L43:
            if (r3 == 0) goto L64
            if (r6 == 0) goto L55
            vtn r5 = r2.d
            bvlw r0 = defpackage.bvlw.a
            xay r1 = new xay
            r1.<init>(r6, r4, r7)
            cqtd r3 = r5.f(r3, r0, r1)
            goto L5d
        L55:
            vtn r5 = r2.d
            bvlw r6 = defpackage.bvlw.a
            cqtd r3 = r5.e(r3, r6)
        L5d:
            if (r3 == 0) goto L64
            cqtd r3 = e(r3, r4, r7)
            return r3
        L64:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xaz.d(drhh, boolean, boolean, vtk, boolean):cqtd");
    }
}
