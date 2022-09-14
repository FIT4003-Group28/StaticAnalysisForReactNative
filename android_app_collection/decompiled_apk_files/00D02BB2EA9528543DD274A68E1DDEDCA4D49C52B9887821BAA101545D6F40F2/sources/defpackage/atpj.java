package defpackage;

import android.content.Context;
import android.os.Build;
import defpackage.atxz;
/* compiled from: PG */
/* renamed from: atpj  reason: default package */
/* loaded from: classes2.dex */
public abstract class atpj<T extends atxz> extends cqiw<T> {
    static final cqtv a = cqrp.f(32.0d);
    static final cqtv b = cqrp.f(60.0d);
    static final cqjb<atxz, Boolean> c = atot.a;
    static final cqjb<atxz, Boolean> d = atou.a;
    static final cqfc e = atov.a;
    public static final /* synthetic */ int f = 0;

    public static <T extends cqkp> cqmp<T> e() {
        return Build.VERSION.SDK_INT >= 28 ? cqgr.dv(iva.b(ibl.d(), ibl.b())) : (cqmp<T>) cqmp.e;
    }

    public static <T extends cqkp> cqmp<T> f() {
        return Build.VERSION.SDK_INT >= 28 ? cqgr.dw(iva.b(ibl.d(), ibl.a())) : (cqmp<T>) cqmp.e;
    }

    public static cqtd g(cqss cqssVar) {
        return aclp.b(cqssVar, cqssVar, cqrp.d(dcyn.a), atlt.c, true, true, false, false);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        atxz atxzVar = (atxz) cqkpVar;
        atxzVar.ac();
        if (i == 0) {
            if (atxzVar.I().size() < 2 && !atxzVar.ag().booleanValue()) {
                atpy.g(cqivVar, atxzVar);
            }
            for (atxw atxwVar : atxzVar.I()) {
                atpy.f(atxwVar, cqivVar);
            }
        } else if (i == 1) {
            for (jbi jbiVar : atxzVar.z()) {
                cqivVar.a(new atpi(), jbiVar);
            }
        }
    }
}
