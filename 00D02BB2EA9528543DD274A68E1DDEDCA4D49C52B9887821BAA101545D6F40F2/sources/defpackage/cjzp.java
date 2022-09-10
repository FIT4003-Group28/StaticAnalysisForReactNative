package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cjzp  reason: default package */
/* loaded from: classes4.dex */
public final class cjzp {
    public static cjzo a(Context context) {
        return ((cjyt) btsq.c(cjyt.class, context)).vZ();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [cqkp] */
    @dzsi
    public static cjzq<?> b(cjzo cjzoVar, Context context, cjzt cjztVar, dtkx dtkxVar) {
        cjzq<?> cjzqVar;
        dbsi<dtig, dtlf> d = cjzoVar.d(dtkxVar);
        if (d == null) {
            cjzqVar = null;
        } else {
            dcou<dtig, dtle, cjzm<?>> dcouVar = cjzoVar.a;
            dtig dtigVar = d.a;
            dtle b = dtle.b(d.b.b);
            if (b == null) {
                b = dtle.INVALID_STYLE;
            }
            cjzm<?> b2 = dcouVar.b(dtigVar, b);
            cjzqVar = new cjzq<>(b2.a.a(), b2.b, b2.c.a(context, cjztVar, dtkxVar, d.b));
        }
        if (cjzqVar == null) {
            if (dtle.b(dtkxVar.c.get(0).b) == null) {
                dtle dtleVar = dtle.INVALID_STYLE;
            }
            dtle dtleVar2 = dtle.INVALID_STYLE;
            return null;
        }
        return cjzqVar;
    }

    public static boolean c(cjzo cjzoVar, dtkx dtkxVar) {
        dtlf e = cjzoVar.e(dtkxVar);
        if (e == null) {
            return true;
        }
        dtle b = dtle.b(e.b);
        if (b == null) {
            b = dtle.INVALID_STYLE;
        }
        if (!b.equals(dtle.FOOTER_EXPAND)) {
            return e.d;
        }
        return true;
    }

    public static boolean d(cjzo cjzoVar, dtkx dtkxVar) {
        dtlf e = cjzoVar.e(dtkxVar);
        if (e == null) {
            return true;
        }
        return e.e;
    }
}
