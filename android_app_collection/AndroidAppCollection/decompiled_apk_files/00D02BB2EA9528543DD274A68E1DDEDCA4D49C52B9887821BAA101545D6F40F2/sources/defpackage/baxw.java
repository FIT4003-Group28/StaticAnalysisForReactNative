package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.views.swiperefresh.SwipeRefreshableRecyclerView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: baxw  reason: default package */
/* loaded from: classes3.dex */
public final class baxw extends cqiw<bayl> {
    private static void e(List<bayj> list, cqiv cqivVar, bayo bayoVar, bayp baypVar) {
        boolean booleanValue = baypVar.a(bayoVar).booleanValue();
        if (booleanValue && list.size() > 20) {
            list = list.subList(0, 20);
        }
        f(list, cqivVar, !booleanValue);
        if (booleanValue) {
            cqivVar.a(new baxv(bayoVar), baypVar);
        }
    }

    private static void f(List<bayj> list, cqiv cqivVar, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            cqivVar.a(new baxb(cqrp.d(dcyn.a)), list.get(i));
            if (i < list.size() - 1 || z) {
                cqivVar.a(new gvb(), cqkp.T);
            }
        }
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bayl baylVar, Context context, cqiv cqivVar) {
        bayl baylVar2 = baylVar;
        if (baylVar2.i().a().booleanValue()) {
            cqivVar.a(new bawh(), baylVar2.i());
        } else {
            cqivVar.a(new baxo(), baylVar2);
        }
        baqh QK = baylVar2.QK();
        if (QK != null && !QK.Pd().isEmpty()) {
            cqivVar.a(new bane(), QK);
        }
        List<bayf> QJ = baylVar2.QJ();
        for (int i2 = 0; i2 < QJ.size(); i2++) {
            cqivVar.a(new bavb(), QJ.get(i2));
            if (i2 < QJ.size() - 1) {
                cqivVar.a(new gvb(), cqkp.T);
            }
        }
        if (!(baylVar2 instanceof bayp) || baylVar2.d().booleanValue()) {
            f(baylVar2.QI(), cqivVar, true);
        } else {
            List<bayj> QI = baylVar2.QI();
            bayp baypVar = (bayp) baylVar2;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (bayj bayjVar : QI) {
                if (bayjVar.n().booleanValue()) {
                    arrayList2.add(bayjVar);
                } else {
                    arrayList.add(bayjVar);
                }
            }
            if (baypVar.e().booleanValue()) {
                cqivVar.a(new baxm(), baypVar);
                cqivVar.a(new gvb(), cqkp.T);
            }
            if (baypVar.f().booleanValue()) {
                cqivVar.a(new baxt(), baypVar);
                cqivVar.a(new gvb(), cqkp.T);
            }
            cqivVar.a(new baxq(cqrt.l(R.string.YOUR_OWNED_LISTS), true, dtyg.T), cqkp.T);
            cqivVar.a(new gvb(), cqkp.T);
            e(arrayList, cqivVar, bayo.OWNED, baypVar);
            if (!arrayList2.isEmpty()) {
                cqivVar.a(new baxq(cqrt.l(R.string.YOUR_FOLLOWED_LISTS), true, dtyg.w), cqkp.T);
                cqivVar.a(new gvb(), cqkp.T);
                e(arrayList2, cqivVar, bayo.FOLLOWED, baypVar);
            }
            cqivVar.a(new baxq(cqrt.l(R.string.YOUR_VISITED_PLACES_LISTS), true, dtyg.Z), cqkp.T);
            cqivVar.a(new gvb(), cqkp.T);
            cqivVar.a(new aose(), baypVar.g());
            cqivVar.a(new gvb(), cqkp.T);
        }
        cqivVar.a(baylVar2.m() != null ? new baxn() : new baxo(), baylVar2);
        if (baylVar2.d().booleanValue()) {
            cqivVar.a(new baxr(), baylVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bayl> a() {
        return cqgr.gj(cqgr.bp(-1), cqgr.cd(-1), jkn.m(cqgr.au(baxc.a), cqgr.ee(baxd.a), cqgr.df(baxe.a), cqgr.gj(cqgr.gj(cqgr.aF(cqjv.x(baxf.a)), cqgr.fP(new bavs(), baxg.a, new cqmp[0])), SwipeRefreshableRecyclerView.av(cqgr.ck(C()), cqgr.er(true), cqqx.v(baxh.a), iue.c(baxi.a), cqgr.bp(-2), cqgr.cd(-1)))), cqgr.fY(cqgr.aF(cqjv.x(baxj.a)), cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.f(), cqjd.j()), cqgr.fR(new gvs(), baxk.a, new cqmp[0])));
    }
}
