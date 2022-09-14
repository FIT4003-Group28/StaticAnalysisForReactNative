package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwkq  reason: default package */
/* loaded from: classes4.dex */
public final class bwkq extends cqiw<bwob> {
    public static final cqjg a = cqjg.a();
    public static final cqjb<bwob, cqtv> b = new bwko();

    public static void e(bwob bwobVar, cqiv cqivVar) {
        bwoc c = bwobVar.c();
        jbf d = bwobVar.d();
        if (c != null) {
            if (bwobVar.a().c().booleanValue()) {
                cqivVar.a(new bwlv(), c);
            } else {
                cqivVar.a(new bwlt(), c);
            }
        } else if (d == null) {
        } else {
            if (cqivVar.i() > 0) {
                gva.c(cqivVar, d, new glw(), new bwkp(), new ije());
            } else {
                cqivVar.a(new glw(), d);
            }
        }
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bwob bwobVar, Context context, cqiv cqivVar) {
        bwob bwobVar2 = bwobVar;
        cjzo a2 = cjzp.a(context);
        bwoh g = bwobVar2.g();
        if (g == null || g.c().isEmpty()) {
            oah.d(a2, bwobVar2.a(), cqivVar);
        } else {
            cqivVar.g(g.c());
        }
        oah.e(bwobVar2.a(), cqivVar);
        e(bwobVar2, cqivVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bwob> a() {
        cqjb<bwob, cqiv> C = C();
        cqjb<bwob, cqtv> cqjbVar = b;
        return cjyn.f(C, cqgr.dS(cqjbVar), cqgr.dH(cqjbVar), cqgr.aR(Integer.valueOf((int) R.id.odelay_page_layout_root)), cqgr.aT(a), cqjv.l(bwkm.a, iuy.h(), iuy.i()), cqqx.x(bwkn.a));
    }
}
