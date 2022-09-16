package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: chfs  reason: default package */
/* loaded from: classes4.dex */
public final class chfs extends cqiw<chmz> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    private static final Boolean c;

    static {
        Boolean bool = new Boolean(false);
        cqny.e(bool, new chfr());
        c = bool;
    }

    private static cqmn<chmz> e(int i) {
        cqgq n = cqgr.n();
        n.d = 800;
        n.e = Long.valueOf(i * 300);
        n.a = Float.valueOf(1.0f);
        return cqmn.a(cqgr.i(0), n.b());
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, chmz chmzVar, Context context, cqiv cqivVar) {
        chmz chmzVar2 = chmzVar;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            cqivVar.f(new chgd(), chmzVar2.g());
            return;
        }
        for (chmx chmxVar : chmzVar2.d()) {
            cqivVar.a(chmxVar.b().booleanValue() ? new chgk() : new chgm(), chmxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<chmz> a() {
        Boolean r = cqjv.r(F(), E());
        Float valueOf = Float.valueOf(1.0f);
        cqgq n = cqgr.n();
        n.d = 800;
        n.h(cqrp.d(dcyn.a));
        n.a = valueOf;
        return cqgr.gk(cqgr.bw(17), cqjv.k(E(), cqgr.ce(cqrp.f(500.0d)), cqgr.cd(-2)), cqgr.ca(valueOf), cqgr.gd(cqgr.bw(17), cqgr.bp(-2), cqgr.cd(-2), cqgr.dr(1), cqgr.gd(cqgr.aG(cqjv.t(G(), B().m())), cqgr.bV(cqrp.d(18.0d)), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(1), cqgr.aT(a), cqgr.i(Float.valueOf(0.0f)), cqgr.fr(cqrp.d(40.0d)), n.b(), WebImageView.a(cqjv.k(c, WebImageView.k(B().e()), WebImageView.k(B().f())))), cqgr.gd(cqgr.dr(1), e(1), cqjv.k(E(), cqgr.bV(cqrp.d(dcyn.a)), cqgr.bV(cqrp.d(19.0d))), cqgr.bp(-2), cqgr.cd(-2), cqgr.bR(irh.d()), cqgr.bG(irh.d()), cqgr.bw(1), cqgr.ck(D(1))), cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.bV(cqrp.d(22.0d)), cqjv.k(cqjv.v(B().h()), cqgr.bD(cqrp.d(16.0d)), cqgr.bD(cqrp.d(dcyn.a))), cqgr.bw(1), e(2), cqjv.k(r, cqgr.dr(0), cqgr.dr(1)), cqgr.aT(b), cqgr.ck(D(2))), cqgr.gd(cqgr.aD(cqjv.v(B().h())), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(1), cqgr.aJ(1), e(2), cqgr.fO(new chgd(), B().h(), new cqmp[0]))));
    }
}
