package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cbcv  reason: default package */
/* loaded from: classes4.dex */
public final class cbcv {
    @dzsi
    private final dijn a;
    private final Map<djjd, djjg> b;
    private final Map<djjd, djjg> c;

    public cbcv(@dzsi dijn dijnVar) {
        Map<djjd, djjg> map;
        this.a = dijnVar;
        if (dijnVar != null) {
            map = k(dijnVar, false);
        } else {
            map = dcmn.a;
        }
        this.b = map;
        this.c = dijnVar != null ? k(dijnVar, true) : dcmn.a;
    }

    private static Map<djjd, djjg> k(dijn dijnVar, boolean z) {
        djjg djjgVar;
        dcdg p = dcdn.p();
        for (djjj djjjVar : dijnVar.d) {
            djjd b = djjd.b(djjjVar.b);
            if (b == null) {
                b = djjd.UNKNOWN_PROPERTY_TYPE;
            }
            if (z) {
                djjgVar = djjjVar.d;
                if (djjgVar == null) {
                    djjgVar = djjg.c;
                }
            } else {
                djjgVar = djjjVar.c;
                if (djjgVar == null) {
                    djjgVar = djjg.c;
                }
            }
            p.f(b, djjgVar);
        }
        return p.b();
    }

    @dzsi
    private final djjg l(djjd djjdVar, int i) {
        djjg djjgVar = this.b.get(djjdVar);
        if (djjgVar == null || djjf.a(djjgVar.a) != i) {
            return null;
        }
        return djjgVar;
    }

    public final String a() {
        dijn dijnVar = this.a;
        return dijnVar != null ? dijnVar.b : "";
    }

    @dzsi
    public final String b(djjd djjdVar) {
        djjg l = l(djjdVar, 2);
        if (l != null) {
            return l.a == 1 ? (String) l.b : "";
        }
        return null;
    }

    @dzsi
    public final String c(djjd djjdVar) {
        djjg j = j(djjdVar, 2);
        if (j != null) {
            return j.a == 1 ? (String) j.b : "";
        }
        return null;
    }

    @dzsi
    public final dpvi d(djjd djjdVar) {
        djjg l = l(djjdVar, 3);
        if (l != null) {
            if (l.a == 2) {
                return (dpvi) l.b;
            }
            return dpvi.g;
        }
        return null;
    }

    @dzsi
    public final dpvi e(djjd djjdVar) {
        djjg j = j(djjdVar, 3);
        if (j != null) {
            if (j.a == 2) {
                return (dpvi) j.b;
            }
            return dpvi.g;
        }
        return null;
    }

    @dzsi
    public final djji f() {
        djjg l = l(djjd.LOCATION, 4);
        if (l != null) {
            if (l.a == 3) {
                return (djji) l.b;
            }
            return djji.d;
        }
        return null;
    }

    @dzsi
    public final dpum g() {
        djjg l = l(djjd.LOCATION, 5);
        if (l != null) {
            if (l.a == 4) {
                return (dpum) l.b;
            }
            return dpum.d;
        }
        return null;
    }

    @dzsi
    public final dprz h() {
        djjg l = l(djjd.EXPERIENCE_CATEGORY, 9);
        if (l != null) {
            if (l.a == 8) {
                dprz b = dprz.b(((Integer) l.b).intValue());
                return b == null ? dprz.EXPERIENCE_CATEGORY_UNKNOWN : b;
            }
            return dprz.EXPERIENCE_CATEGORY_UNKNOWN;
        }
        return null;
    }

    @dzsi
    public final dpsd i() {
        djjg l = l(djjd.OCCURRENCE_PATTERN, 8);
        if (l != null) {
            if (l.a == 7) {
                return (dpsd) l.b;
            }
            return dpsd.f;
        }
        return null;
    }

    @dzsi
    public final djjg j(djjd djjdVar, int i) {
        djjg djjgVar = this.c.get(djjdVar);
        if (djjgVar == null || djjf.a(djjgVar.a) != i) {
            return null;
        }
        return djjgVar;
    }
}
