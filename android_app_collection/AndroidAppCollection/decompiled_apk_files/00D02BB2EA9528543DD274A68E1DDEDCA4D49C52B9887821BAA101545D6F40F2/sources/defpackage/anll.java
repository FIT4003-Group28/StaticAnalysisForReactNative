package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anll  reason: default package */
/* loaded from: classes2.dex */
public final class anll {
    public final eaou a;
    public final eaou b;
    public final dpop c;
    public final boolean d;

    private anll(eaou eaouVar, eaou eaouVar2, dpop dpopVar, boolean z) {
        this.a = eaouVar;
        this.b = eaouVar2;
        this.c = dpopVar;
        this.d = z;
    }

    public static dbsg<anll> a(dnsc dnscVar, dbsg<dvyw> dbsgVar, dbsg<dvay> dbsgVar2, boolean z) {
        dbsg dbsgVar3;
        dnic dnicVar = dnscVar.d;
        if (dnicVar == null) {
            dnicVar = dnic.f;
        }
        dnhz dnhzVar = dnicVar.c;
        if (dnhzVar == null) {
            dnhzVar = dnhz.e;
        }
        dnib dnibVar = dnhzVar.c;
        if (dnibVar == null) {
            dnibVar = dnib.e;
        }
        dbsg<eaou> b = b(dnibVar, dbsgVar, dbsgVar2, z, true);
        dnic dnicVar2 = dnscVar.d;
        if (dnicVar2 == null) {
            dnicVar2 = dnic.f;
        }
        dnhz dnhzVar2 = dnicVar2.d;
        if (dnhzVar2 == null) {
            dnhzVar2 = dnhz.e;
        }
        dnib dnibVar2 = dnhzVar2.c;
        if (dnibVar2 == null) {
            dnibVar2 = dnib.e;
        }
        dbsg<eaou> b2 = b(dnibVar2, dbsgVar, dbsgVar2, z, false);
        if (!b.a() || !b2.a()) {
            return dbpy.a;
        }
        dnic dnicVar3 = dnscVar.d;
        if (dnicVar3 == null) {
            dnicVar3 = dnic.f;
        }
        eaou b3 = b.b();
        eaou b4 = b2.b();
        int i = dnicVar3.a;
        if ((i & 1) != 0) {
            dpop dpopVar = dnicVar3.b;
            if (dpopVar == null) {
                dpopVar = dpop.d;
            }
            eaph eaphVar = new eaph(dpopVar.b, b3);
            dpop dpopVar2 = dnicVar3.b;
            if (dpopVar2 == null) {
                dpopVar2 = dpop.d;
            }
            if (!d(eaphVar, new eaph(dpopVar2.c, b4))) {
                dbsgVar3 = dbpy.a;
            } else {
                dpop dpopVar3 = dnicVar3.b;
                if (dpopVar3 == null) {
                    dpopVar3 = dpop.d;
                }
                dbsgVar3 = dbsg.i(dpopVar3);
            }
        } else {
            if ((i & 2) != 0 && (i & 4) != 0) {
                dnhz dnhzVar3 = dnicVar3.c;
                if (dnhzVar3 == null) {
                    dnhzVar3 = dnhz.e;
                }
                dnhz dnhzVar4 = dnicVar3.d;
                if (dnhzVar4 == null) {
                    dnhzVar4 = dnhz.e;
                }
                int i2 = dnhzVar3.a;
                if ((i2 & 4) == 0 || (dnhzVar4.a & 4) == 0) {
                    if ((i2 & 1) == 0 || (dnhzVar4.a & 1) == 0) {
                        bvoo.h("Neither millis nor local_time of InstantSpec is populated", new Object[0]);
                    } else {
                        dngs dngsVar = dnhzVar3.b;
                        if (dngsVar == null) {
                            dngsVar = dngs.h;
                        }
                        dngs dngsVar2 = dnhzVar4.b;
                        if (dngsVar2 == null) {
                            dngsVar2 = dngs.h;
                        }
                        if (!d(aogc.c(dngsVar), aogc.c(dngsVar2))) {
                            dbsgVar3 = dbpy.a;
                        } else {
                            dpoo bZ = dpop.d.bZ();
                            long j = aogc.c(dngsVar).a(b3).a;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dpop dpopVar4 = (dpop) bZ.b;
                            dpopVar4.a = 1 | dpopVar4.a;
                            dpopVar4.b = j;
                            long j2 = aogc.c(dngsVar2).a(b4).a;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dpop dpopVar5 = (dpop) bZ.b;
                            dpopVar5.a |= 2;
                            dpopVar5.c = j2;
                            dbsgVar3 = dbsg.i(bZ.bK());
                        }
                    }
                } else if (!d(new eaph(dnhzVar3.d, b3), new eaph(dnhzVar4.d, b4))) {
                    dbsgVar3 = dbpy.a;
                } else {
                    dpoo bZ2 = dpop.d.bZ();
                    long j3 = dnhzVar3.d;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dpop dpopVar6 = (dpop) bZ2.b;
                    int i3 = 1 | dpopVar6.a;
                    dpopVar6.a = i3;
                    dpopVar6.b = j3;
                    long j4 = dnhzVar4.d;
                    dpopVar6.a = i3 | 2;
                    dpopVar6.c = j4;
                    dbsgVar3 = dbsg.i(bZ2.bK());
                }
            }
            dbsgVar3 = dbpy.a;
        }
        if (!dbsgVar3.a()) {
            return dbpy.a;
        }
        eaou b5 = b.b();
        eaou b6 = b2.b();
        dpop dpopVar7 = (dpop) dbsgVar3.b();
        dnic dnicVar4 = dnscVar.d;
        if (dnicVar4 == null) {
            dnicVar4 = dnic.f;
        }
        return dbsg.i(new anll(b5, b6, dpopVar7, dnicVar4.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.dbsg<defpackage.eaou> b(defpackage.dnib r8, defpackage.dbsg<defpackage.dvyw> r9, defpackage.dbsg<defpackage.dvay> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anll.b(dnib, dbsg, dbsg, boolean, boolean):dbsg");
    }

    private static dbsg<eaou> c(dniu dniuVar, dvyw dvywVar) {
        int a = dnit.a(dniuVar.c);
        if ((a == 0 || a == 1) && dniuVar.b.equals(dvywVar.g) && (dvywVar.b & 262144) != 0) {
            try {
                return dbsg.i(eaou.j(dvywVar.ad));
            } catch (IllegalArgumentException unused) {
                bvoo.h("Could not parse timezone id: %s", dvywVar.ad);
            }
        }
        return dbpy.a;
    }

    private static boolean d(eaph eaphVar, eaph eaphVar2) {
        return eaphVar.m() == eaphVar2.m() && eaphVar.n() == eaphVar2.n() && eaphVar.o() == eaphVar2.o() && eaphVar.q() >= 6 && eaphVar2.q() >= 6;
    }
}
