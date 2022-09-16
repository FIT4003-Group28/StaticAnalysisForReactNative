package defpackage;

import com.google.protos.youtube.api.innertube.AppPromoAdCtaRendererOuterClass;
import com.google.protos.youtube.api.innertube.CollapsibleAdCtaRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementsAdCtaRendererOuterClass;
/* compiled from: PG */
/* renamed from: wpt  reason: default package */
/* loaded from: classes4.dex */
public final class wpt {
    private static final amuk a;

    static {
        aopa createBuilder = aoym.a.createBuilder();
        createBuilder.copyOnWrite();
        aoym.a((aoym) createBuilder.instance);
        createBuilder.copyOnWrite();
        aoym aoymVar = (aoym) createBuilder.instance;
        aoymVar.c = 1;
        aoymVar.b = 1 | aoymVar.b;
        a = amuk.r((aoym) createBuilder.mo39build());
    }

    public static xgr a(xgr xgrVar, long j) {
        xgq a2 = xgrVar.a();
        a2.c(j);
        xgr a3 = a2.a();
        if (m(a3)) {
            boolean z = false;
            if (a3.h && !a3.e.isEmpty()) {
                amuk amukVar = a3.e;
                int size = amukVar.size();
                int i = 0;
                while (i < size) {
                    aoym aoymVar = (aoym) amukVar.get(i);
                    i++;
                    if (((float) j) >= aoymVar.d) {
                        int i2 = a3.k;
                        int b = aoyt.b(aoymVar.c);
                        if (b == 0) {
                            b = 1;
                        }
                        if (i2 != b) {
                            int b2 = aoyt.b(aoymVar.c);
                            if ((b2 != 0 && b2 == 2) || a3.k != 3) {
                                z = true;
                            }
                            xgq a4 = a3.a();
                            int b3 = aoyt.b(aoymVar.c);
                            if (b3 == 0) {
                                b3 = 1;
                            }
                            a4.k(b3);
                            a4.b(z);
                            a4.i(true);
                            return a4.a();
                        }
                        return l(a3);
                    }
                }
            } else if (a3.k != 3) {
                xgq a5 = a3.a();
                a5.k(3);
                a5.b(false);
                a5.i(true);
                return a5.a();
            }
            return l(a3);
        }
        return l(a3);
    }

    public static xgr b(xgr xgrVar, Object obj) {
        xgq a2 = xgrVar.a();
        a2.e(ampq.j(obj));
        return a2.a();
    }

    public static xgr c(xgr xgrVar, aijs aijsVar) {
        if (m(xgrVar)) {
            boolean z = xgrVar.h;
            boolean z2 = aijsVar == aijs.FULLSCREEN;
            if (z != z2) {
                xgq a2 = xgrVar.a();
                a2.d(z2);
                xgr a3 = a2.a();
                return a(a3, a3.f);
            }
            return l(xgrVar);
        }
        return l(xgrVar);
    }

    public static xgr d(aijs aijsVar, ario arioVar) {
        int i = arioVar.b;
        if (i == 133765738) {
            return i(aijsVar, (aphn) arioVar.c);
        }
        if (i == 156617590) {
            return j(aijsVar, (apza) arioVar.c);
        }
        if (i == 211734746) {
            return k(aijsVar, (aqtf) arioVar.c);
        }
        return xgr.a;
    }

    public static xgr e(aijs aijsVar, aunb aunbVar) {
        if (aunbVar.qn(AppPromoAdCtaRendererOuterClass.appPromoAdCtaRenderer)) {
            return i(aijsVar, (aphn) aunbVar.qm(AppPromoAdCtaRendererOuterClass.appPromoAdCtaRenderer));
        }
        if (aunbVar.qn(CollapsibleAdCtaRendererOuterClass.collapsibleAdCtaRenderer)) {
            return j(aijsVar, (apza) aunbVar.qm(CollapsibleAdCtaRendererOuterClass.collapsibleAdCtaRenderer));
        }
        if (aunbVar.qn(ElementsAdCtaRendererOuterClass.elementsAdCtaRenderer)) {
            return k(aijsVar, (aqtf) aunbVar.qm(ElementsAdCtaRendererOuterClass.elementsAdCtaRenderer));
        }
        return xgr.a;
    }

    public static xgr f(xgr xgrVar) {
        xgq a2 = xgrVar.a();
        a2.g(true);
        return a2.a();
    }

    public static void g(xgr xgrVar, wxc wxcVar) {
        if (xgrVar.c.h()) {
            wxcVar.b(xgrVar.c.c());
        }
    }

    public static boolean h(xgr xgrVar) {
        int i;
        return !xgrVar.i && (i = xgrVar.k) != 1 && i != 3 && !xgrVar.d.H();
    }

    private static xgr i(aijs aijsVar, aphn aphnVar) {
        xgq b = xgr.b();
        b.f(ampq.j(aphnVar));
        b.h(aphnVar.g);
        b.j(amuk.o(aphnVar.f));
        b.d(aijsVar == aijs.FULLSCREEN);
        return b.a();
    }

    private static xgr j(aijs aijsVar, apza apzaVar) {
        xgq b = xgr.b();
        b.f(ampq.j(apzaVar));
        b.h(apzaVar.g);
        b.j(amuk.o(apzaVar.f));
        b.d(aijsVar == aijs.FULLSCREEN);
        return b.a();
    }

    private static xgr k(aijs aijsVar, aqtf aqtfVar) {
        xgq b = xgr.b();
        b.f(ampq.j(aqtfVar));
        b.h(aqtfVar.c);
        b.j(a);
        b.d(aijsVar == aijs.FULLSCREEN);
        return b.a();
    }

    private static xgr l(xgr xgrVar) {
        if (xgrVar.j) {
            xgq a2 = xgrVar.a();
            a2.i(false);
            return a2.a();
        }
        return xgrVar;
    }

    private static boolean m(xgr xgrVar) {
        return xgrVar.b.h();
    }
}
