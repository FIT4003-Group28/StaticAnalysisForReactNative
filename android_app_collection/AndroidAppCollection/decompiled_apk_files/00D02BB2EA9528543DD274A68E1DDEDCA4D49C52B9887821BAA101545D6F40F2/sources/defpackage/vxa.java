package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: vxa  reason: default package */
/* loaded from: classes7.dex */
public class vxa {
    static final dquf a;
    public static final /* synthetic */ int b = 0;
    private static final dcqe c = dcqe.c("vxa");
    private static final dcdc<dqut> d = dcdc.f(dqut.US_WA_GOOD_TO_GO);
    private static final dcdc<vux> e = dcdc.f(vux.GOOD_TO_GO);
    private final btvo f;
    private final dxio<bvsf> g;
    private final dxio<bvjj> h;
    private final dxio<vxo> i;
    @dzsi
    private final dxio<qeg> j;
    @dzsi
    private final dxio<vpd> k;
    @dzsi
    private final dxio<qef> l;
    private final dbsg<dxio<qbw>> m;
    private final dbsg<dxio<wtu>> n;
    private final dbsg<dxio<qfw>> o;
    private final dbsg<dxio<yzs>> p;
    private final dbsg<dxio<ymn>> q;
    @dzsi
    private final qbv r;

    static {
        dqua bZ = dquf.c.bZ();
        bZ.a(dque.CONTEXT_DEFAULT);
        bZ.a(dque.CONTEXT_DARK_BACKGROUND);
        bZ.a(dque.CONTEXT_MAP);
        bZ.a(dque.CONTEXT_MAP_NIGHT_MODE);
        bZ.a(dque.CONTEXT_MOBILE_STEP_THROUGH);
        bZ.b(dquc.SVG);
        bZ.b(dquc.PNG);
        a = bZ.bK();
    }

    public vxa(btvo btvoVar, dxio<bvsf> dxioVar, dxio<bvjj> dxioVar2, dxio<vxo> dxioVar3, @dzsi dxio<qeg> dxioVar4, @dzsi dxio<vpd> dxioVar5, @dzsi dxio<qef> dxioVar6, dbsg<dxio<qbw>> dbsgVar, dbsg<dxio<wtu>> dbsgVar2, dbsg<dxio<qfw>> dbsgVar3, dbsg<dxio<yzs>> dbsgVar4, dbsg<dxio<ymn>> dbsgVar5, @dzsi qbv qbvVar) {
        this.f = btvoVar;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.i = dxioVar3;
        this.j = dxioVar4;
        this.k = dxioVar5;
        this.l = dxioVar6;
        this.m = dbsgVar;
        this.n = dbsgVar2;
        this.o = dbsgVar3;
        this.p = dbsgVar4;
        this.q = dbsgVar5;
        this.r = qbvVar;
    }

    private final void e(dwal dwalVar, dqvj dqvjVar, vul vulVar, boolean z) {
        dowr dowrVar = ((dwao) dwalVar.b).g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        dowi ca = dowr.m.ca(dowrVar);
        dxio<vpd> dxioVar = this.k;
        if (dxioVar != null) {
            dowl l = dxioVar.a().l();
            vpc b2 = vph.b(l);
            if (b2 == null) {
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                ((dowr) ca.b).i = dowr.ck();
            } else {
                vph.h(b2, ca, l);
            }
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ((dowr) ca.b).j = dowr.ck();
            dowo bZ = dowq.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dowq dowqVar = (dowq) bZ.b;
            dowqVar.b = 1;
            dowqVar.a |= 1;
            ca.a(bZ.bK());
            dowo bZ2 = dowq.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dowq dowqVar2 = (dowq) bZ2.b;
            dowqVar2.b = 2;
            dowqVar2.a |= 1;
            ca.a(bZ2.bK());
            if (this.k.a().d(vpc.MANILA)) {
                dowo bZ3 = dowq.c.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dowq dowqVar3 = (dowq) bZ3.b;
                dowqVar3.b = 3;
                dowqVar3.a |= 1;
                ca.a(bZ3.bK());
            }
            if (this.k.a().d(vpc.SANTIAGO)) {
                dowo bZ4 = dowq.c.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dowq dowqVar4 = (dowq) bZ4.b;
                dowqVar4.b = 4;
                dowqVar4.a |= 1;
                ca.a(bZ4.bK());
            }
        }
        dpev dpevVar = dowrVar.g;
        if (dpevVar == null) {
            dpevVar = dpev.g;
        }
        dper bZ5 = dpev.g.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dpev dpevVar2 = (dpev) bZ5.b;
        dpevVar2.d = 2;
        int i = dpevVar2.a | 64;
        dpevVar2.a = i;
        if ((dpevVar.a & 1) != 0) {
            dspd dspdVar = dpevVar.b;
            dspdVar.getClass();
            dpevVar2.a = i | 1;
            dpevVar2.b = dspdVar;
        }
        duov directionsPageParameters = this.f.getDirectionsPageParameters();
        vul vulVar2 = vul.DIRECTIONS_UI;
        int ordinal = vulVar.ordinal();
        if (ordinal == 0) {
            int a2 = duos.a(directionsPageParameters.d);
            if (a2 == 0) {
                a2 = 2;
            }
            int i2 = a2 - 1;
            if (i2 == 2) {
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dpev dpevVar3 = (dpev) bZ5.b;
                dpevVar3.f = 1;
                dpevVar3.a |= 256;
            } else if (i2 == 3) {
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dpev dpevVar4 = (dpev) bZ5.b;
                dpevVar4.f = 2;
                dpevVar4.a |= 256;
            }
        } else if (ordinal == 2) {
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dpev dpevVar5 = (dpev) bZ5.b;
            dpevVar5.e = 2;
            dpevVar5.a |= 128;
        } else if (ordinal == 4) {
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dpev dpevVar6 = (dpev) bZ5.b;
            dpevVar6.f = 2;
            dpevVar6.a |= 256;
        }
        dpev bK = bZ5.bK();
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dowr dowrVar2 = (dowr) ca.b;
        bK.getClass();
        dowrVar2.g = bK;
        dowrVar2.a |= 128;
        boolean z2 = !vxq.a(dqvj.DRIVE) || vulVar != vul.DIRECTIONS_UI;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dowr dowrVar3 = (dowr) ca.b;
        dowrVar3.a |= 512;
        dowrVar3.h = z2;
        if (this.f.getCommuteDrivingImmersiveParameters() != null && this.f.getCommuteDrivingImmersiveParameters().d && ((z || dqvjVar == dqvj.DRIVE) && vulVar == vul.COMMUTE_IMMERSIVE)) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dowr dowrVar4 = (dowr) ca.b;
            dowrVar4.a |= 16;
            dowrVar4.e = true;
            dowr dowrVar5 = (dowr) ca.b;
            dowrVar5.a |= 64;
            dowrVar5.f = true;
        }
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dowr dowrVar6 = (dowr) ca.b;
        dowrVar6.k = 1;
        dowrVar6.a |= 16384;
        dowr bK2 = ca.bK();
        if (dwalVar.c) {
            dwalVar.bF();
            dwalVar.c = false;
        }
        dwao dwaoVar = (dwao) dwalVar.b;
        bK2.getClass();
        dwaoVar.g = bK2;
        dwaoVar.a |= 4;
    }

    private final boolean f() {
        return this.f.getDirectionsPageParameters().x && this.f.getDirectionsPageParameters().y;
    }

    private static boolean g(dqut dqutVar, dquw dquwVar) {
        for (dquv dquvVar : dquwVar.a) {
            dqut b2 = dqut.b(dquvVar.b);
            if (b2 == null) {
                b2 = dqut.UNKNOWN_PASS_TYPE;
                continue;
            }
            if (b2 == dqutVar) {
                return true;
            }
        }
        return false;
    }

    private static void h(dqvj dqvjVar, int i, vul vulVar) {
        if ((vulVar == vul.NAVIGATION_ONLY || vulVar == vul.FREE_NAV) && i != 3) {
            bvoo.h("Non-STRICT options being requested in a navigation context.", new Object[0]);
        }
        if (vulVar == vul.TRIP_MODE_ALTERNATES) {
            if (dqvjVar == dqvj.TRANSIT && i == 3) {
                return;
            }
            bvoo.h("TRIP_MODE_ALTERNATES context is only valid for TRANSIT travel mode and STRICT filtering.", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0575 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.dwao i(defpackage.dwao r18, defpackage.dqvj r19, int r20, defpackage.vul r21) {
        /*
            Method dump skipped, instructions count: 1781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxa.i(dwao, dqvj, int, vul):dwao");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.dphq j(defpackage.dqvj r7, int r8, defpackage.vul r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxa.j(dqvj, int, vul, boolean):dphq");
    }

    private final void k(dwal dwalVar, dqvj dqvjVar, int i, vul vulVar, boolean z) {
        dcdc g;
        dwbk dwbkVar = ((dwao) dwalVar.b).f;
        if (dwbkVar == null) {
            dwbkVar = dwbk.s;
        }
        dwbd ca = dwbk.s.ca(dwbkVar);
        dwbk dwbkVar2 = (dwbk) ca.b;
        if ((dwbkVar2.a & 2048) != 0) {
            vul vulVar2 = vul.DIRECTIONS_UI;
            int a2 = dqvf.a(dwbkVar2.k);
            if (a2 == 0) {
                a2 = 2;
            }
            int i2 = a2 - 1;
            if (i2 != 1 && i2 != 5 && i2 != 6 && i2 != 7) {
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dwbk dwbkVar3 = (dwbk) ca.b;
                dwbkVar3.k = 6;
                dwbkVar3.a |= 2048;
            }
        } else {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwbk dwbkVar4 = (dwbk) ca.b;
            dwbkVar4.k = 6;
            dwbkVar4.a |= 2048;
        }
        duov directionsPageParameters = this.f.getDirectionsPageParameters();
        boolean z2 = directionsPageParameters != null && directionsPageParameters.f;
        dpgm bZ = dpgn.c.bZ();
        dqtz dqtzVar = dqtz.IC_FARE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpgn dpgnVar = (dpgn) bZ.b;
        dpgnVar.b = dqtzVar.d;
        dpgnVar.a |= 1;
        dpgn bK = bZ.bK();
        dpgm bZ2 = dpgn.c.bZ();
        dqtz dqtzVar2 = dqtz.NORMAL_FARE;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpgn dpgnVar2 = (dpgn) bZ2.b;
        dpgnVar2.b = dqtzVar2.d;
        dpgnVar2.a |= 1;
        dpgn bK2 = bZ2.bK();
        if (!z2) {
            g = dcdc.f(bK2);
        } else {
            if (f() && this.q.a()) {
                yio yioVar = this.q.b().a().a().d;
                if (yioVar == null) {
                    yioVar = yio.c;
                }
                if (!yioVar.b) {
                    g = dcdc.g(bK2, bK);
                }
            }
            g = dcdc.g(bK, bK2);
        }
        if (Collections.unmodifiableList(((dwbk) ca.b).m).isEmpty()) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwbk dwbkVar5 = (dwbk) ca.b;
            dwbkVar5.e();
            dsod.bv(g, dwbkVar5.m);
        } else {
            List<dpgn> unmodifiableList = Collections.unmodifiableList(((dwbk) ca.b).m);
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ((dwbk) ca.b).m = dwbk.ck();
            for (final dpgn dpgnVar3 : unmodifiableList) {
                if (dcft.j(g, new dbsl(dpgnVar3) { // from class: vwz
                    private final dpgn a;

                    {
                        this.a = dpgnVar3;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        dpgn dpgnVar4 = this.a;
                        int i3 = vxa.b;
                        dqtz b2 = dqtz.b(((dpgn) obj).b);
                        if (b2 == null) {
                            b2 = dqtz.UNKNOWN_FARE;
                        }
                        dqtz b3 = dqtz.b(dpgnVar4.b);
                        if (b3 == null) {
                            b3 = dqtz.UNKNOWN_FARE;
                        }
                        return b2 == b3;
                    }
                })) {
                    ca.b(dpgnVar3);
                }
            }
        }
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwbk.f((dwbk) ca.b);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwbk.h((dwbk) ca.b);
        if (f() && this.q.a()) {
            yis yisVar = this.q.b().a().a().b;
            if (yisVar == null) {
                yisVar = yis.b;
            }
            ynf.l(ca, yisVar, this.f);
        }
        if (!z && ((vulVar != vul.DIRECTIONS_UI && vulVar != vul.TRIP_MODE_ALTERNATES) || (((!this.f.getMultimodalDirectionsParameters().d || i != 2) && dqvjVar != dqvj.TRANSIT) || !this.p.a()))) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwbk dwbkVar6 = (dwbk) ca.b;
            dwbkVar6.o = null;
            dwbkVar6.a &= -32769;
        } else {
            dwbh a3 = this.p.b().a().a();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwbk dwbkVar7 = (dwbk) ca.b;
            a3.getClass();
            dwbkVar7.o = a3;
            dwbkVar7.a |= 32768;
        }
        qbv qbvVar = this.r;
        if (qbvVar != null && qbvVar.a()) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwbk dwbkVar8 = (dwbk) ca.b;
            dwbkVar8.a |= 131072;
            dwbkVar8.q = true;
            dpgo bZ3 = dpgq.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dpgq dpgqVar = (dpgq) bZ3.b;
            dpgqVar.a |= 1;
            dpgqVar.b = true;
            if (this.r.b()) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dpgq dpgqVar2 = (dpgq) bZ3.b;
                dpgqVar2.c = 1;
                dpgqVar2.a |= 2;
            } else if (this.r.d()) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dpgq dpgqVar3 = (dpgq) bZ3.b;
                dpgqVar3.c = 2;
                dpgqVar3.a |= 2;
            }
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwbk dwbkVar9 = (dwbk) ca.b;
            dpgq bK3 = bZ3.bK();
            bK3.getClass();
            dwbkVar9.r = bK3;
            dwbkVar9.a |= 262144;
        }
        if (dwalVar.c) {
            dwalVar.bF();
            dwalVar.c = false;
        }
        dwao dwaoVar = (dwao) dwalVar.b;
        dwbk bK4 = ca.bK();
        bK4.getClass();
        dwaoVar.f = bK4;
        dwaoVar.a |= 2;
    }

    public final dwao a(dwao dwaoVar) {
        EnumSet<vux> a2 = this.i.a().a();
        if (a2 == null || a2.isEmpty()) {
            return dwaoVar;
        }
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        int i = 1;
        boolean z = dwaoVar.o || a2.contains(vux.AVOID_FERRIES);
        boolean z2 = dowrVar.b || a2.contains(vux.AVOID_HIGHWAYS);
        boolean z3 = dowrVar.c || a2.contains(vux.AVOID_TOLLS);
        dsqp dsqpVar = (dsqp) dowrVar.cu(5);
        dsqpVar.bC(dowrVar);
        dowi dowiVar = (dowi) dsqpVar;
        if (dowiVar.c) {
            dowiVar.bF();
            dowiVar.c = false;
        }
        dowr dowrVar2 = (dowr) dowiVar.b;
        int i2 = dowrVar2.a | 1;
        dowrVar2.a = i2;
        dowrVar2.b = z2;
        dowrVar2.a = i2 | 2;
        dowrVar2.c = z3;
        dcdc<dqut> dcdcVar = d;
        int size = dcdcVar.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            dqut dqutVar = dcdcVar.get(i3);
            dquw dquwVar = dowrVar.l;
            if (dquwVar == null) {
                dquwVar = dquw.b;
            }
            boolean z4 = g(dqutVar, dquwVar) || a2.contains(e.get(i4));
            dquw dquwVar2 = ((dowr) dowiVar.b).l;
            if (dquwVar2 == null) {
                dquwVar2 = dquw.b;
            }
            if (!z4) {
                dqur ca = dquw.b.ca(dquwVar2);
                for (int i5 = 0; i5 < dquwVar2.a.size(); i5++) {
                    dqut b2 = dqut.b(dquwVar2.a.get(i5).b);
                    if (b2 == null) {
                        b2 = dqut.UNKNOWN_PASS_TYPE;
                    }
                    if (b2 == dqutVar) {
                        ca.b(i5);
                    }
                }
                dquw bK = ca.bK();
                if (dowiVar.c) {
                    dowiVar.bF();
                    dowiVar.c = false;
                }
                dowr dowrVar3 = (dowr) dowiVar.b;
                bK.getClass();
                dowrVar3.l = bK;
                dowrVar3.a |= 32768;
            } else if (!g(dqutVar, dquwVar2)) {
                dquu bZ = dquv.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dquv dquvVar = (dquv) bZ.b;
                dquvVar.b = dqutVar.c;
                dquvVar.a |= i;
                dqur ca2 = dquw.b.ca(dquwVar2);
                ca2.a(bZ.bK());
                dquw bK2 = ca2.bK();
                if (dowiVar.c) {
                    dowiVar.bF();
                    dowiVar.c = false;
                }
                dowr dowrVar4 = (dowr) dowiVar.b;
                bK2.getClass();
                dowrVar4.l = bK2;
                dowrVar4.a |= 32768;
            }
            i4++;
            i3++;
            i = 1;
        }
        dxio<vpd> dxioVar = this.k;
        if (dxioVar != null) {
            dowl l = dxioVar.a().l();
            vpc b3 = vph.b(l);
            if (b3 == null) {
                if (dowiVar.c) {
                    dowiVar.bF();
                    dowiVar.c = false;
                }
                ((dowr) dowiVar.b).i = dowr.ck();
            } else {
                vph.h(b3, dowiVar, l);
            }
        }
        dsqp dsqpVar2 = (dsqp) dwaoVar.cu(5);
        dsqpVar2.bC(dwaoVar);
        dwal dwalVar = (dwal) dsqpVar2;
        if (dwalVar.c) {
            dwalVar.bF();
            dwalVar.c = false;
        }
        dwao dwaoVar2 = (dwao) dwalVar.b;
        dwaoVar2.a |= 1024;
        dwaoVar2.o = z;
        dowr bK3 = dowiVar.bK();
        if (dwalVar.c) {
            dwalVar.bF();
            dwalVar.c = false;
        }
        dwao dwaoVar3 = (dwao) dwalVar.b;
        bK3.getClass();
        dwaoVar3.g = bK3;
        dwaoVar3.a |= 4;
        return dwalVar.bK();
    }

    public final dwao b(dqvj dqvjVar, int i, vul vulVar) {
        h(dqvjVar, i, vulVar);
        return i(dwao.R, dqvjVar, i, vulVar);
    }

    public final dwao c(dqvj dqvjVar, int i, vul vulVar) {
        h(dqvjVar, 3, vulVar);
        return a(i(dwao.R, dqvjVar, 3, vulVar));
    }

    public final dwao d(@dzsi dwao dwaoVar, dqvj dqvjVar, int i, vul vulVar) {
        if (dwaoVar == null) {
            h(dqvjVar, i, vulVar);
            dwaoVar = dwao.R;
        }
        dwao i2 = i(dwaoVar, dqvjVar, i, vulVar);
        return !vxi.e(i2) ? a(i2) : i2;
    }
}
