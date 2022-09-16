package defpackage;
/* compiled from: PG */
/* renamed from: ajst  reason: default package */
/* loaded from: classes.dex */
public final class ajst {
    public final ajss a = new ajss();
    public final ajss b = new ajss();
    public final ajss c = new ajss();
    public final ajss d = new ajss();

    public static ajsr a(ajss ajssVar, yo yoVar) {
        Class b = b(yoVar);
        if (b != null) {
            return ajssVar.a(b);
        }
        return null;
    }

    public static Class b(yo yoVar) {
        ajru g;
        if (yoVar == null) {
            g = null;
        } else if (yoVar instanceof ajrz) {
            g = ((ajrz) yoVar).t;
        } else {
            g = akel.g(yoVar.a);
        }
        if (g != null) {
            return g.getClass();
        }
        return null;
    }
}
