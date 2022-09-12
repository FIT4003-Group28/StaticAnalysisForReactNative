package defpackage;
/* compiled from: PG */
/* renamed from: amuk  reason: default package */
/* loaded from: classes2.dex */
public abstract class amuk {
    public static boolean d(dpan dpanVar) {
        int i = dpanVar.a;
        if ((i & 2) == 0 || (i & 4) == 0) {
            return false;
        }
        douj doujVar = dpanVar.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        return ((doujVar.a & 2) == 0 || (dpanVar.a & 1) == 0) ? false : true;
    }

    public static amuk e(dpan dpanVar) {
        dbsk.a(d(dpanVar));
        String str = dpanVar.c;
        douj doujVar = dpanVar.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        return new amso(str, new jhk(doujVar.c), dpanVar.b);
    }

    public abstract String a();

    public abstract jhk b();

    public abstract String c();
}
