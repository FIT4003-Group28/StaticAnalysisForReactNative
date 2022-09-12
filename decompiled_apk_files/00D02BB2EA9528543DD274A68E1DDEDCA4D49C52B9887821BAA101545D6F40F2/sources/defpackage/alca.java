package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: alca  reason: default package */
/* loaded from: classes2.dex */
public final class alca {
    public static final dclu<doza> a;
    private static final dcqe b = dcqe.c("alca");
    private static final dclu<GmmNotice> c;
    private static final dcdn<qda, Comparator<GmmNotice>> d;

    static {
        dclu g = dcln.a.g(albx.a);
        c = g;
        a = dclu.f(doza.INFORMATION, doza.WARNING, doza.ALERT, doza.CRITICAL);
        dcdg p = dcdn.p();
        p.f(qda.DESCENDING_IMPORTANCE, g.c());
        p.f(qda.DESCENDING_SEVERITY, alby.a);
        d = p.b();
    }

    private static String A(Iterable<dpce> iterable) {
        return dbrz.f(' ').j().g(dcbg.b(iterable).s(new albz()));
    }

    public static int a(doza dozaVar) {
        doza dozaVar2 = doza.ALERT;
        int ordinal = dozaVar.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? 2131231805 : 2131231806;
        }
        return 2131231807;
    }

    public static int b(doza dozaVar) {
        doza dozaVar2 = doza.ALERT;
        int ordinal = dozaVar.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? 2131231424 : 2131231425;
        }
        return 2131231426;
    }

    public static cqtd c(GmmNotice gmmNotice) {
        dozy b2 = dozy.b(gmmNotice.c().f);
        if (b2 == null) {
            b2 = dozy.UNKNOWN;
        }
        if (b2.equals(dozy.BUSYNESS)) {
            dwag d2 = gmmNotice.d();
            if (d2 != null) {
                dvvo dvvoVar = d2.a;
                if (dvvoVar == null) {
                    dvvoVar = dvvo.e;
                }
                if ((dvvoVar.a & 2) != 0) {
                    return cqrt.g(2131232829, ibm.T());
                }
            }
            return cqrt.g(2131232829, ibm.p());
        }
        doza b3 = doza.b(gmmNotice.c().e);
        if (b3 == null) {
            b3 = doza.INFORMATION;
        }
        return cqrt.f(a(b3));
    }

    public static cqtd d(GmmNotice gmmNotice) {
        dozy b2 = dozy.b(gmmNotice.c().f);
        if (b2 == null) {
            b2 = dozy.UNKNOWN;
        }
        if (b2.equals(dozy.BUSYNESS)) {
            dwag d2 = gmmNotice.d();
            if (d2 != null) {
                dvvo dvvoVar = d2.a;
                if (dvvoVar == null) {
                    dvvoVar = dvvo.e;
                }
                if ((dvvoVar.a & 2) != 0) {
                    return cqrt.g(2131232829, ibm.T());
                }
            }
            return cqrt.g(2131232829, ibm.p());
        }
        doza b3 = doza.b(gmmNotice.c().e);
        if (b3 == null) {
            b3 = doza.INFORMATION;
        }
        return cqrt.f(b(b3));
    }

    @Deprecated
    public static int e(doza dozaVar) {
        doza dozaVar2 = doza.ALERT;
        int ordinal = dozaVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? R.color.transit_notice_severity_alert : R.color.transit_notice_severity_information : R.color.transit_notice_severity_warning;
    }

    public static cqss f(doza dozaVar) {
        doza dozaVar2 = doza.ALERT;
        int ordinal = dozaVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return ibm.x();
            }
            return ibm.D();
        }
        return iva.b(ibl.ao(), ibl.T());
    }

    public static cqss g(GmmNotice gmmNotice) {
        dwag d2;
        dozy b2 = dozy.b(gmmNotice.c().f);
        if (b2 == null) {
            b2 = dozy.UNKNOWN;
        }
        if (!b2.equals(dozy.BUSYNESS) || (d2 = gmmNotice.d()) == null) {
            doza b3 = doza.b(gmmNotice.c().e);
            if (b3 == null) {
                b3 = doza.INFORMATION;
            }
            return f(b3);
        }
        dvvo dvvoVar = d2.a;
        if (dvvoVar == null) {
            dvvoVar = dvvo.e;
        }
        if ((dvvoVar.a & 2) == 0) {
            return ibm.t();
        }
        return ibm.p();
    }

    public static String h(Context context, doza dozaVar) {
        doza dozaVar2 = doza.ALERT;
        int ordinal = dozaVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return context.getString(R.string.INFORMATION_SEVERITY_CONTENT_DESCRIPTION);
            }
            return context.getString(R.string.ALERT_SEVERITY_CONTENT_DESCRIPTION);
        }
        return context.getString(R.string.WARNING_SEVERITY_CONTENT_DESCRIPTION);
    }

    public static dozc i(@dzsi List<dozz> list) {
        if (list != null) {
            for (dozz dozzVar : list) {
                if ((dozzVar.a & 8) != 0) {
                    dozy b2 = dozy.b(dozzVar.f);
                    if (b2 == null) {
                        b2 = dozy.UNKNOWN;
                    }
                    if (b2 == dozy.SIDE_OF_ROAD && (dozzVar.a & 33554432) != 0) {
                        dozc b3 = dozc.b(dozzVar.w);
                        return b3 == null ? dozc.NONE : b3;
                    }
                }
            }
        }
        return dozc.NONE;
    }

    public static List<String> j(dozz dozzVar) {
        ArrayList a2 = dchl.a();
        if ((dozzVar.a & 8388608) != 0) {
            douj doujVar = dozzVar.u;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            albv.d(a2, doujVar);
        }
        if ((dozzVar.a & 16777216) != 0) {
            douj doujVar2 = dozzVar.v;
            if (doujVar2 == null) {
                doujVar2 = douj.h;
            }
            albv.d(a2, doujVar2);
        }
        return a2;
    }

    public static dcep<Long> k(dozz dozzVar) {
        dozs dozsVar;
        dcen N = dcep.N();
        if (dozzVar.b == 22) {
            dozsVar = (dozs) dozzVar.c;
        } else {
            dozsVar = dozs.q;
        }
        for (String str : dozsVar.k) {
            try {
                N.b(Long.valueOf(decu.d(str)));
            } catch (NumberFormatException unused) {
                bvoo.h("Non-numeric incident id %s", str);
            }
        }
        return N.f();
    }

    public static dbsi<String, String> l(douj doujVar) {
        return dbsi.a(albv.k(doujVar, albv.b, dque.CONTEXT_MAP), albv.k(doujVar, albv.b, dque.CONTEXT_MAP_NIGHT_MODE));
    }

    public static dbsi<String, String> m(dozz dozzVar) {
        if ((dozzVar.a & 16777216) != 0) {
            douj doujVar = dozzVar.v;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            return n(doujVar);
        }
        return dbsi.a(null, null);
    }

    public static dbsi<String, String> n(douj doujVar) {
        return dbsi.a(albv.k(doujVar, albv.a, dque.CONTEXT_DEFAULT), albv.k(doujVar, albv.a, dque.CONTEXT_DARK_BACKGROUND));
    }

    public static String o(dozz dozzVar, boolean z) {
        String k;
        douj doujVar = dozzVar.v;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        return (!z || (k = albv.k(doujVar, albv.a, dque.CONTEXT_DARK_BACKGROUND)) == null) ? albv.k(doujVar, albv.a, dque.CONTEXT_DEFAULT) : k;
    }

    public static String p(dozz dozzVar) {
        return A(dozzVar.m);
    }

    public static String q(dozz dozzVar) {
        return A(dozzVar.n);
    }

    public static String r(dozz dozzVar) {
        return A(dozzVar.o);
    }

    public static boolean s(dozz dozzVar) {
        doza b2 = doza.b(dozzVar.e);
        if (b2 == null) {
            b2 = doza.INFORMATION;
        }
        return b2 == doza.CRITICAL;
    }

    @dzsi
    public static GmmNotice t(Iterable<GmmNotice> iterable) {
        if (!iterable.iterator().hasNext() || dcbg.b(iterable).p(albw.a)) {
            return null;
        }
        return (GmmNotice) c.m(iterable);
    }

    @dzsi
    public static dozz u(Iterable<dozz> iterable) {
        GmmNotice t = t(GmmNotice.g(iterable));
        if (t != null) {
            return t.c();
        }
        return null;
    }

    @dzsi
    public static doza v(Iterable<dozz> iterable) {
        GmmNotice w = w(GmmNotice.g(iterable));
        if (w != null) {
            doza b2 = doza.b(w.c().e);
            return b2 == null ? doza.INFORMATION : b2;
        }
        return null;
    }

    @dzsi
    public static GmmNotice w(Iterable<GmmNotice> iterable) {
        GmmNotice gmmNotice = null;
        for (GmmNotice gmmNotice2 : iterable) {
            if (gmmNotice != null) {
                doza b2 = doza.b(gmmNotice2.c().e);
                if (b2 == null) {
                    b2 = doza.INFORMATION;
                }
                doza b3 = doza.b(gmmNotice.c().e);
                if (b3 == null) {
                    b3 = doza.INFORMATION;
                }
                if (y(b2, b3)) {
                }
            }
            gmmNotice = gmmNotice2;
        }
        return gmmNotice;
    }

    @dzsi
    public static dozz x(Iterable<dozz> iterable) {
        dozz dozzVar = null;
        for (dozz dozzVar2 : iterable) {
            if (dozzVar != null) {
                doza b2 = doza.b(dozzVar2.e);
                if (b2 == null) {
                    b2 = doza.INFORMATION;
                }
                doza b3 = doza.b(dozzVar.e);
                if (b3 == null) {
                    b3 = doza.INFORMATION;
                }
                if (y(b2, b3)) {
                }
            }
            dozzVar = dozzVar2;
        }
        return dozzVar;
    }

    public static boolean y(@dzsi doza dozaVar, @dzsi doza dozaVar2) {
        if (dozaVar == null) {
            return false;
        }
        if (dozaVar2 == null) {
            return true;
        }
        try {
            return a.compare(dozaVar, dozaVar2) > 0;
        } catch (ClassCastException e) {
            bvoo.f(e);
            return false;
        }
    }

    public static dcdc<GmmNotice> z(List<GmmNotice> list, qda qdaVar) {
        if (qdaVar.equals(qda.PRESERVED)) {
            return dcdc.r(list);
        }
        Comparator<GmmNotice> comparator = d.get(qdaVar);
        if (comparator == null) {
            bvoo.h("No Comparator<Notice> for NoticeOrdering %s is found. Please check NOTICE_ORDERING_COMPARATOR_MAP.", qdaVar.toString());
        }
        dbsk.s(comparator);
        return dcdc.w(comparator, list);
    }
}
