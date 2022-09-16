package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: albv  reason: default package */
/* loaded from: classes2.dex */
public final class albv {
    private static final dcqe d = dcqe.c("albv");
    public static final dcep<dquc> a = dcep.B(dquc.SVG);
    public static final dcep<dquc> b = dcep.B(dquc.PNG);
    public static final dcep<dquc> c = dcep.C(dquc.SVG, dquc.PNG);

    public static dcdc<dvxj> a() {
        return dcdc.h(dvxj.SVG_LIGHT, dvxj.SVG_DARK, dvxj.SVG_INCIDENT_LIGHT);
    }

    public static int b(Context context) {
        return cqrp.d(19.0d).e(context);
    }

    public static cqtv c() {
        return cqrp.d(19.0d);
    }

    public static void d(Collection<String> collection, douj doujVar) {
        for (doui douiVar : doujVar.d) {
            if ((douiVar.a & 1) != 0) {
                collection.add(e(douiVar.b));
            }
        }
    }

    public static String e(String str) {
        if (str.startsWith("http:") || str.startsWith("https:")) {
            return str;
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:");
    }

    public static void f(vtn vtnVar, dopk dopkVar) {
        ArrayList arrayList = new ArrayList();
        l(dopkVar, arrayList, new HashSet());
        if (!arrayList.isEmpty()) {
            vtnVar.k(arrayList);
        }
    }

    public static void g(vtn vtnVar, djxo djxoVar) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (djxn djxnVar : djxoVar.d) {
            dphe dpheVar = djxnVar.b;
            if (dpheVar == null) {
                dpheVar = dphe.x;
            }
            dpce dpceVar = dpheVar.i;
            if (dpceVar == null) {
                dpceVar = dpce.f;
            }
            if ((dpceVar.a & 4) != 0) {
                dphe dpheVar2 = djxnVar.b;
                if (dpheVar2 == null) {
                    dpheVar2 = dphe.x;
                }
                dpce dpceVar2 = dpheVar2.i;
                if (dpceVar2 == null) {
                    dpceVar2 = dpce.f;
                }
                douj doujVar = dpceVar2.d;
                if (doujVar == null) {
                    doujVar = douj.h;
                }
                p(arrayList, hashSet, doujVar, c);
            }
            dphe dpheVar3 = djxnVar.b;
            if (dpheVar3 == null) {
                dpheVar3 = dphe.x;
            }
            for (dotv dotvVar : dpheVar3.l) {
                dpgl dpglVar = dotvVar.b;
                if (dpglVar == null) {
                    dpglVar = dpgl.g;
                }
                for (dpce dpceVar3 : dpglVar.b) {
                    if ((dpceVar3.a & 4) != 0) {
                        douj doujVar2 = dpceVar3.d;
                        if (doujVar2 == null) {
                            doujVar2 = douj.h;
                        }
                        p(arrayList, hashSet, doujVar2, c);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            vtnVar.k(arrayList);
        }
    }

    public static void h(vtn vtnVar, Iterable<? extends dssj> iterable) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (dssj dssjVar : iterable) {
            if (dssjVar instanceof dopk) {
                l((dopk) dssjVar, arrayList, hashSet);
            } else if (dssjVar instanceof dpie) {
                dpec dpecVar = ((dpie) dssjVar).d;
                if (dpecVar == null) {
                    dpecVar = dpec.o;
                }
                m(arrayList, hashSet, dpecVar.n);
            } else if (dssjVar instanceof djyk) {
                djyk djykVar = (djyk) dssjVar;
                if ((djykVar.a & 8) != 0) {
                    douj doujVar = djykVar.c;
                    if (doujVar == null) {
                        doujVar = douj.h;
                    }
                    o(arrayList, hashSet, doujVar);
                }
                m(arrayList, hashSet, djykVar.b);
                m(arrayList, hashSet, djykVar.d);
                for (djzg djzgVar : djykVar.e) {
                    m(arrayList, hashSet, djzgVar.a);
                    for (djzf djzfVar : djzgVar.b) {
                        m(arrayList, hashSet, djzfVar.b);
                        m(arrayList, hashSet, djzfVar.a);
                        for (djze djzeVar : djzfVar.c) {
                            m(arrayList, hashSet, djzeVar.a);
                        }
                    }
                }
            } else if (dssjVar instanceof dnvi) {
                dnvi dnviVar = (dnvi) dssjVar;
                m(arrayList, hashSet, dnviVar.c);
                for (dpgl dpglVar : dnviVar.f) {
                    m(arrayList, hashSet, dpglVar.b);
                }
            } else if (dssjVar instanceof dpce) {
                douj doujVar2 = ((dpce) dssjVar).d;
                if (doujVar2 == null) {
                    doujVar2 = douj.h;
                }
                o(arrayList, hashSet, doujVar2);
            } else {
                bvoo.h("Unexpected icon container %s", dssjVar);
            }
        }
        if (!arrayList.isEmpty()) {
            vtnVar.k(arrayList);
        }
    }

    public static List<douj> i(dopk dopkVar) {
        dccx F = dcdc.F();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (doph dophVar : dopkVar.e) {
            for (douj doujVar : dophVar.c) {
                int a2 = doug.a(doujVar.b);
                if (a2 != 0 && a2 == 4) {
                    arrayList.clear();
                    p(arrayList, hashSet2, doujVar, c);
                    if (!arrayList.isEmpty()) {
                        String str = ((dvxl) arrayList.get(0)).d;
                        if (!dbsj.d(str) && !hashSet.contains(str)) {
                            hashSet.add(str);
                            F.g(doujVar);
                        }
                    }
                }
            }
        }
        return F.f();
    }

    @dzsi
    public static douj j(dopk dopkVar) {
        return (douj) dcft.r(i(dopkVar), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static String k(douj doujVar, dcep<dquc> dcepVar, dque dqueVar) {
        if (doujVar.d.size() != 0) {
            for (doui douiVar : doujVar.d) {
                dquc b2 = dquc.b(douiVar.c);
                if (b2 == null) {
                    b2 = dquc.PNG;
                }
                if (dcepVar.contains(b2)) {
                    dque b3 = dque.b(douiVar.d);
                    if (b3 == null) {
                        b3 = dque.CONTEXT_DEFAULT;
                    }
                    if (b3 == dqueVar && (douiVar.a & 1) != 0) {
                        String str = douiVar.b;
                        if (!str.isEmpty()) {
                            return e(str);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static void l(dopk dopkVar, List<dvxl> list, Set<String> set) {
        for (doom doomVar : dopkVar.f) {
            for (douj doujVar : doomVar.a) {
                o(list, set, doujVar);
            }
            for (douj doujVar2 : doomVar.b) {
                o(list, set, doujVar2);
            }
            for (dooo doooVar : doomVar.c) {
                m(list, set, doooVar.c);
            }
        }
        for (doph dophVar : dopkVar.e) {
            for (douj doujVar3 : dophVar.c) {
                p(list, set, doujVar3, c);
            }
            for (dooo doooVar2 : dophVar.d) {
                n(list, set, doooVar2.c, c);
            }
        }
        for (dopf dopfVar : dopkVar.w) {
            for (douj doujVar4 : dopfVar.f) {
                o(list, set, doujVar4);
            }
        }
    }

    private static void m(List<dvxl> list, Set<String> set, Iterable<dpce> iterable) {
        n(list, set, iterable, a);
    }

    private static void n(List<dvxl> list, Set<String> set, Iterable<dpce> iterable, dcep<dquc> dcepVar) {
        for (dpce dpceVar : iterable) {
            douj doujVar = dpceVar.d;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            p(list, set, doujVar, dcepVar);
        }
    }

    private static void o(List<dvxl> list, Set<String> set, douj doujVar) {
        p(list, set, doujVar, a);
    }

    private static void p(List<dvxl> list, Set<String> set, douj doujVar, dcep<dquc> dcepVar) {
        String str = doujVar.c;
        if (dbsj.d(str) || set.contains(str)) {
            return;
        }
        set.add(str);
        q(list, doujVar, dcepVar, str, dque.CONTEXT_DEFAULT, dvxj.SVG_LIGHT);
        q(list, doujVar, dcepVar, str, dque.CONTEXT_DARK_BACKGROUND, dvxj.SVG_DARK);
    }

    private static void q(List<dvxl> list, douj doujVar, dcep<dquc> dcepVar, String str, dque dqueVar, dvxj dvxjVar) {
        String k = k(doujVar, dcepVar, dqueVar);
        if (dbsj.d(k)) {
            return;
        }
        dvxk bZ = dvxl.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvxl dvxlVar = (dvxl) bZ.b;
        str.getClass();
        int i = dvxlVar.a | 1;
        dvxlVar.a = i;
        dvxlVar.b = str;
        dvxlVar.c = dvxjVar.u;
        int i2 = i | 2;
        dvxlVar.a = i2;
        k.getClass();
        dvxlVar.a = i2 | 4;
        dvxlVar.d = k;
        list.add(bZ.bK());
    }
}
