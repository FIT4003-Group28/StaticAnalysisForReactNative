package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: czgm  reason: default package */
/* loaded from: classes5.dex */
public final class czgm implements czgl {
    private final czdb a;

    public czgm(czdb czdbVar) {
        this.a = czdbVar;
    }

    private static void c(List<cysn> list, long j, double d, cysj cysjVar, Iterable<dudl> iterable) {
        for (dudl dudlVar : iterable) {
            list.add(new cysn(j, dudlVar.c, d, cysjVar));
        }
    }

    private final void d(List<cysn> list, long j, dsia dsiaVar, cysj cysjVar, Double d) {
        double d2;
        cysj cysjVar2;
        cysj cysjVar3;
        dshi dshiVar;
        int i;
        dshi dshiVar2;
        dshi dshiVar3;
        for (dsgt dsgtVar : dsiaVar.c) {
            if (d != null) {
                d2 = d.doubleValue();
            } else {
                dsgv dsgvVar = dsgtVar.d;
                if (dsgvVar == null) {
                    dsgvVar = dsgv.f;
                }
                dsgd dsgdVar = dsgvVar.d;
                if (dsgdVar == null) {
                    dsgdVar = dsgd.d;
                }
                d2 = dsgdVar.c;
            }
            if (cysjVar != null) {
                cysjVar3 = cysjVar;
            } else {
                int a = dsgs.a(dsgtVar.b);
                int i2 = a - 1;
                if (a == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    cysjVar2 = cysj.EMAIL;
                } else if (i2 == 1) {
                    cysjVar2 = cysj.PHONE;
                } else if (i2 != 2) {
                    cysjVar3 = null;
                } else {
                    if (dsgtVar.b == 4) {
                        dshiVar = (dshi) dsgtVar.c;
                    } else {
                        dshiVar = dshi.e;
                    }
                    int a2 = dshh.a(dshiVar.b);
                    int i3 = a2 - 1;
                    if (a2 == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        cysjVar2 = cysj.IN_APP_EMAIL;
                    } else if (i3 == 1) {
                        cysjVar2 = cysj.IN_APP_PHONE;
                    } else if (i3 == 2) {
                        cysjVar2 = cysj.IN_APP_GAIA;
                    } else {
                        cysjVar2 = cysj.IN_APP_NOTIFICATION_TARGET;
                    }
                }
                cysjVar3 = cysjVar2;
            }
            dsgv dsgvVar2 = dsgtVar.d;
            if (dsgvVar2 == null) {
                dsgvVar2 = dsgv.f;
            }
            g(list, j, dsgvVar2, d2, cysjVar3);
            if (dsgtVar.b == 2) {
                f(list, j, (dshb) dsgtVar.c, d2, cysjVar3);
            }
            if (dsgtVar.b == 3) {
                i = 3;
                e(list, j, (dsic) dsgtVar.c, d2, cysjVar3);
            } else {
                i = 3;
            }
            if (dsgtVar.b == 4) {
                int a3 = dshh.a(((dshi) dsgtVar.c).b);
                int i4 = a3 - 1;
                if (a3 == 0) {
                    throw null;
                }
                String str = "";
                if (i4 == 0) {
                    dsgw bZ = dshb.f.bZ();
                    if (dsgtVar.b == 4) {
                        dshiVar3 = (dshi) dsgtVar.c;
                    } else {
                        dshiVar3 = dshi.e;
                    }
                    if (dshiVar3.b == 2) {
                        str = (String) dshiVar3.c;
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dshb dshbVar = (dshb) bZ.b;
                    str.getClass();
                    dshbVar.a |= 1;
                    dshbVar.b = str;
                    f(list, j, bZ.bK(), d2, cysjVar3);
                } else if (i4 == 1) {
                    dsib bZ2 = dsic.d.bZ();
                    if (dsgtVar.b == 4) {
                        dshiVar2 = (dshi) dsgtVar.c;
                    } else {
                        dshiVar2 = dshi.e;
                    }
                    if (dshiVar2.b == i) {
                        str = (String) dshiVar2.c;
                    }
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dsic dsicVar = (dsic) bZ2.b;
                    str.getClass();
                    dsicVar.a |= 2;
                    dsicVar.c = str;
                    e(list, j, bZ2.bK(), d2, cysjVar3);
                }
            }
        }
    }

    private static final void f(List<cysn> list, long j, dshb dshbVar, double d, cysj cysjVar) {
        if (!dshbVar.b.isEmpty()) {
            c(list, j, d, cysjVar, dudm.c(dshbVar.b, true));
        }
    }

    private static final void g(List<cysn> list, long j, dsgv dsgvVar, double d, cysj cysjVar) {
        dshv dshvVar = dsgvVar.c;
        if (dshvVar == null) {
            dshvVar = dshv.e;
        }
        if (dshvVar.b.isEmpty()) {
            return;
        }
        dcdc<dudl> c = czdb.c(dshvVar.b);
        dcdc<dudl> c2 = dudm.c(dshvVar.b, false);
        dcen N = dcep.N();
        N.i(c);
        N.i(c2);
        c(list, j, d, cysjVar, N.f());
    }

    @Override // defpackage.czgl
    public final void b(cyqg cyqgVar, dsgk dsgkVar) {
        a(cyqgVar.d, cyqgVar.a, dsgkVar);
    }

    private final void e(List<cysn> list, long j, dsic dsicVar, double d, cysj cysjVar) {
        c(list, j, d, cysjVar, this.a.a(!dsicVar.c.isEmpty() ? dsicVar.c : dsicVar.b));
    }

    @Override // defpackage.czgl
    public final void a(List<cysn> list, long j, dsgk dsgkVar) {
        dsia dsiaVar;
        dshf dshfVar;
        int a = dsgj.a(dsgkVar.a);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                if (dsgkVar.a == 1) {
                    dsiaVar = (dsia) dsgkVar.b;
                } else {
                    dsiaVar = dsia.e;
                }
                d(list, j, dsiaVar, null, null);
                return;
            } else if (i != 1) {
                return;
            } else {
                if (dsgkVar.a == 2) {
                    dshfVar = (dshf) dsgkVar.b;
                } else {
                    dshfVar = dshf.e;
                }
                dsgv dsgvVar = dshfVar.a;
                if (dsgvVar == null) {
                    dsgvVar = dsgv.f;
                }
                dsgd dsgdVar = dsgvVar.d;
                if (dsgdVar == null) {
                    dsgdVar = dsgd.d;
                }
                double d = dsgdVar.c;
                dsgv dsgvVar2 = dshfVar.a;
                if (dsgvVar2 == null) {
                    dsgvVar2 = dsgv.f;
                }
                g(list, j, dsgvVar2, d, cysj.GROUP);
                dsgv dsgvVar3 = dshfVar.a;
                if (dsgvVar3 == null) {
                    dsgvVar3 = dsgv.f;
                }
                dshv dshvVar = dsgvVar3.c;
                if (dshvVar == null) {
                    dshvVar = dshv.e;
                }
                if (!dshvVar.b.isEmpty()) {
                    return;
                }
                for (dsia dsiaVar2 : dshfVar.b) {
                    d(list, j, dsiaVar2, cysj.GROUP, Double.valueOf(d));
                }
                return;
            }
        }
        throw null;
    }
}
