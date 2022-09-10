package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmlc  reason: default package */
/* loaded from: classes.dex */
public final class dmlc {
    public static double a(dpuq dpuqVar) {
        return c(dpuqVar).t();
    }

    public static dcvs b(dpum dpumVar) {
        return dcvs.b(dpumVar.b, dpumVar.c);
    }

    public static dcvu c(dpuq dpuqVar) {
        dpum dpumVar = dpuqVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        dcvs b = b(dpumVar);
        dpum dpumVar2 = dpuqVar.c;
        if (dpumVar2 == null) {
            dpumVar2 = dpum.d;
        }
        return dcvu.f(b, b(dpumVar2));
    }
}
