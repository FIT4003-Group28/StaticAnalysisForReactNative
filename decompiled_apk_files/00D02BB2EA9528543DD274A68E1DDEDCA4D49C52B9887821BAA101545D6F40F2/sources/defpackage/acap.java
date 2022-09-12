package defpackage;

import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.layout.FixedAspectRatioLayout;
import defpackage.acba;
/* compiled from: PG */
/* renamed from: acap  reason: default package */
/* loaded from: classes2.dex */
public abstract class acap<V extends acba> extends cqiw<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<V> a() {
        cqlc cqlcVar = acai.a;
        cqlc cqlcVar2 = acaj.a;
        cqlc cqlcVar3 = acak.a;
        cqlc cqlcVar4 = acal.a;
        cqlc cqlcVar5 = acam.a;
        cqmj gc = cqgr.gc(cqgr.aF(cqjv.x(cqlcVar5)), cqgr.bq(abxz.f(20)), cqgr.ce(abxz.f(20)), cqgr.bA(abxz.f(10)), cqgr.bY(cqjd.i()), cqgr.eG(cqlcVar5));
        cqmj gq = cqgr.gq(cqgr.aI(cqlcVar4), cqgr.bp(-2), cqgr.cd(-1), cqgr.bR(abxz.f(12)), cqgr.bG(abxz.f(12)), cqgr.bY(cqjd.j()), cqgr.eN(5), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), ibq.n(), cqgr.eU(ibl.b()), cqgr.eM(cqlcVar3));
        cqmj gq2 = cqgr.gq(cqgr.aI(cqlcVar2), cqgr.bp(-2), cqgr.cd(-1), cqgr.bR(abxz.f(12)), cqgr.bG(abxz.f(12)), cqgr.eN(5), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), ibq.q(), cqgr.eU(ibl.b()), cqgr.eM(cqlcVar));
        gq2.g(cqjv.l(cqlcVar4, cqgr.bY(cqjd.x(gq)), cqgr.bY(cqjd.j())));
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), iue.c(acag.a), FixedAspectRatioLayout.a(itj.c(acah.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.k(true), e(), abpw.f(), cqgr.gj(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.dB(abxz.f(12)), gc, gq2, gq)), cqgr.cW(acan.a), cqgr.K(acao.a));
    }

    protected abstract cqmj<V> e();
}
