package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: blvw  reason: default package */
/* loaded from: classes3.dex */
public final class blvw implements Serializable {
    public final dcdc<blvu> a;
    @dzsi
    public String b;
    @dzsi
    private Integer c;

    public blvw(dcdc<blvu> dcdcVar) {
        this.a = dcdcVar;
    }

    public blvw(dvyp dvypVar) {
        dgko dgkoVar;
        dgjq dgjqVar;
        dccx F = dcdc.F();
        for (dgkg dgkgVar : dvypVar.b) {
            int i = dgkgVar.a;
            if ((i & 2) != 0 && (i & 16) != 0) {
                dgjw b = dgjw.b(dgkgVar.i);
                if ((b == null ? dgjw.UNKNOWN : b) != dgjw.UNKNOWN) {
                    if (dgkgVar.b == 3) {
                        dgjq dgjqVar2 = (dgjq) dgkgVar.c;
                        if ((dgjqVar2.a & 1) != 0) {
                            for (dgkm dgkmVar : dgjqVar2.c) {
                                if ((dgkmVar.a & 2) != 0 && dgkmVar.c.c() > 0 && (dgkmVar.a & 8) != 0 && !dgkmVar.d.isEmpty()) {
                                    blvs d = d(dgkgVar);
                                    if (dgkgVar.b == 3) {
                                        dgjqVar = (dgjq) dgkgVar.c;
                                    } else {
                                        dgjqVar = dgjq.d;
                                    }
                                    d.o = blvt.MULTIPLE_CHOICE;
                                    d.n = dgjqVar.b;
                                    d.p = dcdc.r(dgjqVar.c);
                                    F.g(d.a());
                                }
                            }
                        }
                    }
                    if (dgkgVar.b == 14) {
                        dgko dgkoVar2 = (dgko) dgkgVar.c;
                        dgks dgksVar = dgkoVar2.a;
                        if (((dgksVar == null ? dgks.c : dgksVar).a & 1) != 0) {
                            dgku dgkuVar = dgkoVar2.b;
                            if (((dgkuVar == null ? dgku.c : dgkuVar).a & 1) != 0) {
                                F.g(c(dgkgVar, false));
                                blvs d2 = d(dgkgVar);
                                if (dgkgVar.b == 14) {
                                    dgkoVar = (dgko) dgkgVar.c;
                                } else {
                                    dgkoVar = dgko.c;
                                }
                                dgku dgkuVar2 = dgkoVar.b;
                                dgkuVar2 = dgkuVar2 == null ? dgku.c : dgkuVar2;
                                d2.o = blvt.REVIEW;
                                d2.n = dgkuVar2.b;
                                d2.h = false;
                                F.g(d2.a());
                            }
                        }
                    }
                    if (dgkgVar.b == 13) {
                        dgks dgksVar2 = ((dgkq) dgkgVar.c).a;
                        if (((dgksVar2 == null ? dgks.c : dgksVar2).a & 1) != 0) {
                            F.g(c(dgkgVar, true));
                        }
                    }
                }
            }
        }
        this.a = F.f();
        this.b = (dvypVar.a & 2) != 0 ? dvypVar.c : null;
        this.c = Integer.valueOf(dvypVar.d);
    }

    private static blvu c(dgkg dgkgVar, boolean z) {
        dgko dgkoVar;
        dgks dgksVar;
        dgkq dgkqVar;
        blvs d = d(dgkgVar);
        if (z) {
            if (dgkgVar.b == 13) {
                dgkqVar = (dgkq) dgkgVar.c;
            } else {
                dgkqVar = dgkq.b;
            }
            dgksVar = dgkqVar.a;
            if (dgksVar == null) {
                dgksVar = dgks.c;
            }
        } else {
            if (dgkgVar.b == 14) {
                dgkoVar = (dgko) dgkgVar.c;
            } else {
                dgkoVar = dgko.c;
            }
            dgksVar = dgkoVar.a;
            if (dgksVar == null) {
                dgksVar = dgks.c;
            }
        }
        d.o = blvt.RATING;
        d.n = dgksVar.b;
        return d.a();
    }

    private static blvs d(dgkg dgkgVar) {
        dbsg<dgci> dbsgVar;
        blvs d = blvu.d();
        d.a = dgkgVar.e;
        d.b = dgkgVar.f;
        d.d = dgkgVar.h;
        int i = 1;
        d.e = (dgkgVar.a & 1) != 0 ? dgkgVar.d : "";
        dgjw b = dgjw.b(dgkgVar.i);
        if (b == null) {
            b = dgjw.UNKNOWN;
        }
        d.f = b;
        dgju dgjuVar = dgkgVar.j;
        if (dgjuVar == null) {
            dgjuVar = dgju.c;
        }
        d.g = dgjuVar;
        if ((dgkgVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            dgci dgciVar = dgkgVar.n;
            if (dgciVar == null) {
                dgciVar = dgci.a;
            }
            dbsgVar = dbsg.i(dgciVar);
        } else {
            dbsgVar = dbpy.a;
        }
        d.r = dbsgVar;
        d.q = dgkgVar.g;
        if ((dgkgVar.a & 4096) != 0) {
            dgkf dgkfVar = dgkgVar.k;
            if (dgkfVar == null) {
                dgkfVar = dgkf.d;
            }
            d.i = dgkfVar.a;
            dgkf dgkfVar2 = dgkgVar.k;
            if (dgkfVar2 == null) {
                dgkfVar2 = dgkf.d;
            }
            d.j = dgkfVar2.b;
            dgkf dgkfVar3 = dgkgVar.k;
            if (dgkfVar3 == null) {
                dgkfVar3 = dgkf.d;
            }
            int a = dgke.a(dgkfVar3.c);
            if (a != 0) {
                i = a;
            }
            d.s = i;
        } else {
            d.s = 1;
        }
        if ((dgkgVar.a & 8192) != 0) {
            dgkb dgkbVar = dgkgVar.l;
            if (dgkbVar == null) {
                dgkbVar = dgkb.e;
            }
            d.k = dgkbVar.a;
            dgkb dgkbVar2 = dgkgVar.l;
            if (dgkbVar2 == null) {
                dgkbVar2 = dgkb.e;
            }
            d.l = dgkbVar2.b;
            dgkb dgkbVar3 = dgkgVar.l;
            if (dgkbVar3 == null) {
                dgkbVar3 = dgkb.e;
            }
            dgka b2 = dgka.b(dgkbVar3.c);
            if (b2 == null) {
                b2 = dgka.UNKNOWN_CATEGORY;
            }
            d.m = b2;
            dgkb dgkbVar4 = dgkgVar.l;
            if (dgkbVar4 == null) {
                dgkbVar4 = dgkb.e;
            }
            d.h = dgkbVar4.d;
        } else {
            d.m = dgka.UNKNOWN_CATEGORY;
        }
        d.c = dgkgVar.m;
        return d;
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }
}
