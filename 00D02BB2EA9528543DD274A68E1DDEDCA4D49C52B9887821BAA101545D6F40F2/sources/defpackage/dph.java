package defpackage;
/* compiled from: PG */
/* renamed from: dph  reason: default package */
/* loaded from: classes6.dex */
public final class dph {
    public static boolean a(btvo btvoVar, dbty<dtm> dbtyVar) {
        dknv dknvVar = btvoVar.getAugmentedRealityParameters().a;
        if (dknvVar == null) {
            dknvVar = dknv.v;
        }
        return dknvVar.b || dbtyVar.a().c;
    }

    public static boolean b(btvo btvoVar, dbty<dtm> dbtyVar) {
        if (!a(btvoVar, dbtyVar)) {
            return false;
        }
        dknv dknvVar = btvoVar.getAugmentedRealityParameters().a;
        if (dknvVar == null) {
            dknvVar = dknv.v;
        }
        if (dknvVar.j) {
            return true;
        }
        dte dteVar = dbtyVar.a().b;
        if (dteVar == null) {
            dteVar = dte.w;
        }
        return dteVar.p;
    }

    public static boolean c(btvo btvoVar, dbty<dtm> dbtyVar) {
        if (!a(btvoVar, dbtyVar)) {
            return false;
        }
        dknv dknvVar = btvoVar.getAugmentedRealityParameters().a;
        if (dknvVar == null) {
            dknvVar = dknv.v;
        }
        if (dknvVar.k) {
            return true;
        }
        dte dteVar = dbtyVar.a().b;
        if (dteVar == null) {
            dteVar = dte.w;
        }
        return dteVar.o;
    }

    public static boolean d(btvo btvoVar, dbty<dtm> dbtyVar) {
        if (!a(btvoVar, dbtyVar)) {
            return false;
        }
        dknv dknvVar = btvoVar.getAugmentedRealityParameters().a;
        if (dknvVar == null) {
            dknvVar = dknv.v;
        }
        return dknvVar.r;
    }

    public static boolean e(btvo btvoVar, dbty<dtm> dbtyVar) {
        if (!a(btvoVar, dbtyVar)) {
            return false;
        }
        dknv dknvVar = btvoVar.getAugmentedRealityParameters().a;
        if (dknvVar == null) {
            dknvVar = dknv.v;
        }
        return dknvVar.s;
    }
}
