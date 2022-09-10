package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adzm  reason: default package */
/* loaded from: classes.dex */
public final class adzm extends cqiw<aeeq> {
    private final Integer a;

    public adzm(Integer num) {
        super(num);
        this.a = num;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final /* bridge */ /* synthetic */ cqiv NL(int i, aeeq aeeqVar, Context context) {
        aeeq aeeqVar2 = aeeqVar;
        cqiv cqivVar = new cqiv();
        if (!aeeqVar2.a().booleanValue() || aeeqVar2.b().isEmpty()) {
            cqivVar.c(new adzl());
        } else {
            for (cqix<?> cqixVar : aeeqVar2.b()) {
                cqivVar.e(cqixVar);
            }
        }
        return cqivVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aeeq> a() {
        Integer valueOf = Integer.valueOf((int) R.id.scrollable_card_stream_container);
        return aefx.f(cqgr.bp(-1), cqgr.cd(-1), cqgr.aR(this.a), cqgr.e(R.id.home_tab_strip), aefx.d(valueOf), aefx.a(adzb.a), cqgr.fY(cqic.f(adzc.a, new cqmp[0]), cqgr.bs(adzd.a), cqgr.cd(-1), cqgr.x(ibk.b()), cqgr.bZ(new adzk(new Object[0])), cqgr.dE(adze.a), GmmRecyclerView.aw(C(), cqgr.bs(adzf.a), cqgr.cd(-1), cqgr.aR(valueOf), cqgr.L(false), cqgr.P(false), cqgr.cZ(adzg.a), cqqx.v(adzh.a), cqqx.p(null), cqjv.f(cqfe.VERTICAL_SCROLL_BAR_ENABLED, adzi.a)), cqgr.gc(cqgr.cd(-1), cqgr.bq(cqrp.d(5.0d)), cqgr.eE(ibp.b()), cqic.f(adzj.a, new cqmp[0]))));
    }
}
