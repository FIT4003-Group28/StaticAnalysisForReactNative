package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wof  reason: default package */
/* loaded from: classes7.dex */
public final class wof extends cqiw<wpu> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, wpu wpuVar, Context context, cqiv cqivVar) {
        wpu wpuVar2 = wpuVar;
        if (!wpuVar2.h().booleanValue()) {
            cqivVar.c(new wnl());
        } else if (wpuVar2.o().booleanValue() && !wpuVar2.f().booleanValue()) {
            cqivVar.a(new wnq(), wpuVar2.p());
        } else if (!wpuVar2.m().booleanValue()) {
            cqivVar.a(new wnq(), wpuVar2.q());
        } else if (!wpuVar2.g().booleanValue() && dcft.w(wpuVar2.r())) {
            cqivVar.a(new wnq(), wpuVar2.q());
        } else {
            cqivVar.c(new wnk());
            cqivVar.f(new wpk(), wpuVar2.s());
            xiv y = wpuVar2.y();
            if (y != null) {
                cqivVar.a(new wov(), y);
            }
            if (wpuVar2.C().booleanValue()) {
                for (xia xiaVar : wpuVar2.u()) {
                    if (xiaVar.a().a()) {
                        cqivVar.a(new xie(), xiaVar.a().b());
                    }
                    cqivVar.f(new wpk(), xiaVar.b());
                }
            } else {
                cqivVar.f(new wpk(), wpuVar2.t());
            }
            if (wpuVar2.g().booleanValue()) {
                cqivVar.c(new wnr());
            } else if (wpuVar2.x().booleanValue()) {
                cqivVar.a(new wnu(), wpuVar2.w());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<wpu> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.dU(cqrp.d(12.0d)), cqgr.x(ibk.b()), iue.d(wnv.a, cqkz.a(dtyc.eH)), cqgr.gd(cqgr.aR(Integer.valueOf(ztb.a)), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.fP(new wor(), wnw.a, new cqmp[0]), cqgr.gs(cqgr.bq(cqrp.d(dcyn.a)), cqgr.bV(cqrp.d(8.0d)), cqgr.bD(cqrp.d(-8.0d)), cqgr.aR(Integer.valueOf(ztb.b))), cqgr.fP(new wmv(), wnx.a, cqgr.aF(wny.a)), cqgr.gs(cqgr.bq(cqrp.d(8.0d)), cqgr.aI(wnz.a)), zvk.a(zuv.e(C(), cqqx.q(woa.a), cqgr.aR(Integer.valueOf(wos.a)), cqgr.aT(zaa.a), zuv.a(wos.e()), itj.i(dtyc.eR)), cqgr.cd(-1), cqgr.bp(-1), itj.i(dtyc.eK), cqgr.fP(new cjbp(), wob.a, new cqmp[0])), new cqmh(zvo.class, zvn.a(Integer.valueOf((int) R.string.NET_FAIL_TITLE)), cqgr.aI(woc.a), itj.i(dtyc.eJ), new cqmh(zvn.class, zvn.a(Integer.valueOf((int) R.string.NET_FAIL_RETRY_BUTTON)), cqgr.cW(cqgr.q(wod.a)), iue.d(woe.a, cqkz.a(dtyc.fc))))));
    }
}
