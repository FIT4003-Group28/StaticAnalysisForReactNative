package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* renamed from: xiq  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class xiq implements cqjb {
    static final cqjb a = new xiq();

    private xiq() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        zcv zcvVar = (zcv) cqkpVar;
        String f = xiu.f(zcvVar, context);
        if (TextUtils.isEmpty(f)) {
            return "";
        }
        Object e = xiu.e(zcvVar.a(), xiu.k, xiu.h, xiu.e, ibm.c());
        String f2 = zcvVar.f();
        bvsx bvsxVar = new bvsx(context.getResources());
        bvsv a2 = bvsxVar.a(f);
        a2.i();
        a2.l(((cqss) e).b(context));
        if (TextUtils.isEmpty(f2)) {
            return a2.c();
        }
        bvsv a3 = bvsxVar.a(f2);
        a3.l(ibm.o().b(context));
        bvsu b = bvsxVar.b("%s %s");
        b.a(a2, a3);
        return b.c();
    }
}
