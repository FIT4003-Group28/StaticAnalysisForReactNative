package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: sie  reason: default package */
/* loaded from: classes7.dex */
public abstract class sie {
    private static final dcqe a = dcqe.c("sie");

    public static sie c(Context context, qjn qjnVar) {
        return new shn(f(context, qjnVar.a(), dpjs.ENTITY_TYPE_HOME), f(context, qjnVar.b(), dpjs.ENTITY_TYPE_WORK));
    }

    @dzsi
    private static amvh f(Context context, @dzsi azva azvaVar, dpjs dpjsVar) {
        if (azvaVar == null) {
            return null;
        }
        dpjs g = amvj.g(azvaVar.a);
        if (g == null) {
            bvoo.h("Unrecognised aliasType %s.", azvaVar.a);
            return null;
        } else if (!dpjsVar.equals(g)) {
            bvoo.h("Expected entity type %s, was %s.", dpjsVar, g);
            return null;
        } else {
            amvg P = amvh.P();
            P.a = dpjsVar;
            P.c = azvaVar.c;
            P.d = azvaVar.e;
            P.j = azvaVar.e(context);
            P.k = true;
            P.b = azvaVar.d;
            return P.a();
        }
    }

    @dzsi
    public abstract amvh a();

    @dzsi
    public abstract amvh b();

    public final dcdc<amvh> d() {
        amvh a2 = a();
        amvh b = b();
        if (a2 == null || b == null) {
            return dcdc.e();
        }
        return dcdc.g(a2, b);
    }

    public final dcdc<amvh> e() {
        amvh a2 = a();
        amvh b = b();
        if (a2 == null || b == null) {
            return dcdc.e();
        }
        return dcdc.g(b, a2);
    }
}
