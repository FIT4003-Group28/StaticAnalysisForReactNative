package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: akjq  reason: default package */
/* loaded from: classes2.dex */
public final class akjq extends cqiw<aklh> {
    public static final /* synthetic */ int a = 0;

    private final cqmp<aklh> e() {
        return cqmn.a(f(), h(), f(), h(), cqgr.bx(akjn.a));
    }

    private final cqmp<aklh> f() {
        cqhc a2 = cqhc.a();
        a2.e(cqjv.u(cqjv.v(B().e())), cqgr.ce(B().e()));
        a2.e(cqjv.u(cqjv.v(B().f())), cqgr.cd(-2));
        a2.c(i(dqiz.FIT_WIDTH), cqgr.cd(-1));
        a2.c(i(dqiz.FIT_HEIGHT), cqgr.cd(-2));
        return a2.b(cqgr.cd(-1));
    }

    private final cqmp<aklh> h() {
        cqhc a2 = cqhc.a();
        a2.e(cqjv.u(cqjv.v(B().e())), cqgr.bp(-2));
        a2.e(cqjv.u(cqjv.v(B().f())), cqgr.bq(B().f()));
        a2.c(i(dqiz.FIT_WIDTH), cqgr.bp(-2));
        a2.c(i(dqiz.FIT_HEIGHT), cqgr.bp(-1));
        return a2.b(cqgr.bp(-1));
    }

    private static cqjb<aklh, Boolean> i(final dqiz dqizVar) {
        return new cqjb(dqizVar) { // from class: akjo
            private final dqiz a;

            {
                this.a = dqizVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                dqiz dqizVar2 = this.a;
                int i = akjq.a;
                return Boolean.valueOf(((aklh) cqkpVar).g() == dqizVar2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aklh> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), akii.q(cqgr.aD(cqjv.v(B().d())), WebImageView.k(B().d()), cqgr.k(true), e(), akii.r(akjl.a)), new cqmh(akkx.class, cqgr.aH(akjp.a), eit.d(B().a()), eit.b(B().c()), e(), cqjv.e(akkv.a, akjm.a, akkx.g)));
    }
}
