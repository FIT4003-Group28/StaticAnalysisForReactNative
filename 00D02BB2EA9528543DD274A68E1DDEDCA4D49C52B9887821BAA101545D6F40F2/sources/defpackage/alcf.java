package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: alcf  reason: default package */
/* loaded from: classes2.dex */
public final class alcf {
    private static Iterable<dpce> A(Iterable<dpce> iterable, final int i) {
        return dcft.i(iterable, new dbsl(i) { // from class: alcd
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                dpce dpceVar = (dpce) obj;
                if (dpceVar != null) {
                    int a = dpcd.a(dpceVar.b);
                    if (a == 0) {
                        a = 1;
                    }
                    return a == i2;
                }
                return false;
            }
        });
    }

    @dzsi
    public static String a(dpce dpceVar) {
        douj e = e(dpceVar);
        if (e == null || (e.a & 2) == 0) {
            return null;
        }
        return e.c;
    }

    @dzsi
    public static String b(Iterable<dpce> iterable) {
        String str = null;
        for (dpce dpceVar : iterable) {
            String a = a(dpceVar);
            if (a != null) {
                str = a;
            }
        }
        return str;
    }

    @dzsi
    public static String c(dpce dpceVar) {
        douj e = e(dpceVar);
        if (e == null || (e.a & 4) == 0) {
            return null;
        }
        return e.e;
    }

    @dzsi
    public static String d(Iterable<dpce> iterable) {
        String str = null;
        for (dpce dpceVar : iterable) {
            String c = c(dpceVar);
            if (c != null) {
                str = c;
            }
        }
        return str;
    }

    @dzsi
    public static douj e(dpce dpceVar) {
        int i = 1;
        if ((dpceVar.a & 1) != 0) {
            int a = dpcd.a(dpceVar.b);
            if (a != 0) {
                i = a;
            }
            if ((i == 2 || i == 5 || i == 6) && (dpceVar.a & 4) != 0) {
                douj doujVar = dpceVar.d;
                if (doujVar == null) {
                    doujVar = douj.h;
                }
                int a2 = doug.a(doujVar.b);
                if (a2 != 0 && a2 == 4) {
                    return doujVar;
                }
            }
        }
        return null;
    }

    @dzsi
    public static String f(Iterable<dpce> iterable) {
        for (dpce dpceVar : iterable) {
            if (h(dpceVar)) {
                douj doujVar = dpceVar.d;
                if (doujVar == null) {
                    doujVar = douj.h;
                }
                return doujVar.c;
            }
        }
        return null;
    }

    @dzsi
    public static douj g(dpdy dpdyVar) {
        dphe dpheVar = dpdyVar.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        dpgw dpgwVar = dpheVar.d;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        if ((dpgwVar.a & 4) != 0) {
            douj doujVar = dpgwVar.d;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            if ((doujVar.a & 2) == 0) {
                return null;
            }
            douj doujVar2 = dpgwVar.d;
            return doujVar2 == null ? douj.h : doujVar2;
        }
        return null;
    }

    public static boolean h(dpce dpceVar) {
        douj doujVar = dpceVar.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        if ((doujVar.a & 2) != 0) {
            int a = dpcd.a(dpceVar.b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            return i == 1 || i == 4;
        }
        return false;
    }

    public static dcdc<dpce> i(Iterable<dpce> iterable) {
        dccx F = dcdc.F();
        boolean z = false;
        for (dpce dpceVar : iterable) {
            if (z || !h(dpceVar)) {
                F.g(dpceVar);
            } else {
                z = true;
            }
        }
        return F.f();
    }

    @dzsi
    public static String j(dpec dpecVar) {
        dqvj c = dqvj.c(dpecVar.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        dbsk.b(c != dqvj.TRANSIT, "For transit legs, use the renderable components inside the block transfers.");
        return b(dpecVar.n);
    }

    @dzsi
    public static String k(dpce dpceVar) {
        int a = dpcd.a(dpceVar.b);
        if (a != 0 && a == 6) {
            douj doujVar = dpceVar.d;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            int a2 = doug.a(doujVar.b);
            if (a2 == 0 || a2 != 4) {
                return null;
            }
            douj doujVar2 = dpceVar.d;
            if (doujVar2 == null) {
                doujVar2 = douj.h;
            }
            if ((doujVar2.a & 4) == 0) {
                return null;
            }
            douj doujVar3 = dpceVar.d;
            if (doujVar3 == null) {
                doujVar3 = douj.h;
            }
            return doujVar3.e;
        }
        return null;
    }

    @dzsi
    public static String l(Iterable<dpce> iterable) {
        String str = null;
        for (dpce dpceVar : iterable) {
            String k = k(dpceVar);
            if (k != null) {
                str = k;
            }
        }
        return str;
    }

    @dzsi
    public static dpce m(Iterable<dpce> iterable) {
        for (dpce dpceVar : iterable) {
            int a = dpcd.a(dpceVar.b);
            if (a != 0 && a == 6) {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                if ((doulVar.a & 1) == 0) {
                    continue;
                } else {
                    douj doujVar = dpceVar.d;
                    if (doujVar == null) {
                        doujVar = douj.h;
                    }
                    if ((doujVar.a & 2) == 0) {
                        return dpceVar;
                    }
                }
            }
        }
        return null;
    }

    @dzsi
    public static String n(Iterable<dpce> iterable) {
        doul doulVar;
        dpce m = m(iterable);
        if (m != null) {
            doulVar = m.c;
            if (doulVar == null) {
                doulVar = doul.f;
            }
        } else {
            doulVar = null;
        }
        if (doulVar != null) {
            return doulVar.b;
        }
        return null;
    }

    public static Iterable<dpce> o(Iterable<dpce> iterable) {
        return A(iterable, 6);
    }

    public static Iterable<dpce> p(Iterable<dpce> iterable) {
        return A(iterable, 16);
    }

    @dzsi
    public static String q(Iterable<dpce> iterable) {
        return z(iterable, 8);
    }

    @dzsi
    public static String r(Iterable<dpce> iterable) {
        return (String) dcft.m(Arrays.asList(z(iterable, 6), l(iterable)), dbss.NOT_NULL).f();
    }

    @dzsi
    public static String s(Iterable<dpce> iterable) {
        for (dpce dpceVar : iterable) {
            if ((dpceVar.a & 2) != 0) {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                return doulVar.b;
            }
        }
        return null;
    }

    @dzsi
    public static String t(dpec dpecVar) {
        return u(dpecVar.n);
    }

    @dzsi
    public static String u(Iterable<dpce> iterable) {
        for (dpce dpceVar : iterable) {
            if (dpceVar != null && (dpceVar.a & 4) != 0) {
                douj doujVar = dpceVar.d;
                if (doujVar == null) {
                    doujVar = douj.h;
                }
                if ((doujVar.a & 2) != 0) {
                    douj doujVar2 = dpceVar.d;
                    if (doujVar2 == null) {
                        doujVar2 = douj.h;
                    }
                    return doujVar2.c;
                }
            }
        }
        return null;
    }

    public static dpce v(@dzsi String str) {
        alce y = y();
        y.b(dbsj.e(str));
        return y.a();
    }

    public static dcdc<dpce> w(dpdy dpdyVar, boolean z) {
        Collection x;
        if (z) {
            dpdx dpdxVar = dpdyVar.g;
            if (dpdxVar == null) {
                dpdxVar = dpdx.d;
            }
            if (dpdxVar.c.size() > 0) {
                dpdx dpdxVar2 = dpdyVar.g;
                if (dpdxVar2 == null) {
                    dpdxVar2 = dpdx.d;
                }
                x = dpdxVar2.c;
                return dcdc.r(x);
            }
        }
        dphe dpheVar = dpdyVar.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        x = x(dpheVar, 0);
        return dcdc.r(x);
    }

    public static List<dpce> x(dphe dpheVar, int i) {
        dpgl dpglVar = dpheVar.l.get(i).b;
        if (dpglVar == null) {
            dpglVar = dpgl.g;
        }
        return dpglVar.b;
    }

    public static alce y() {
        return new alce();
    }

    @dzsi
    public static String z(Iterable<dpce> iterable, int i) {
        for (dpce dpceVar : iterable) {
            int a = dpcd.a(dpceVar.b);
            if (a == 0) {
                a = 1;
            }
            if (a == i && (dpceVar.a & 2) != 0) {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                if (!doulVar.b.isEmpty()) {
                    doul doulVar2 = dpceVar.c;
                    if (doulVar2 == null) {
                        doulVar2 = doul.f;
                    }
                    return doulVar2.b;
                }
            }
        }
        return null;
    }
}
