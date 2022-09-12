package defpackage;

import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arms  reason: default package */
/* loaded from: classes2.dex */
public final class arms extends cqiw<arna> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<arna> a() {
        cqlc cqlcVar = armq.a;
        cqgq n = cqgr.n();
        n.d = 200;
        n.a = Float.valueOf(1.0f);
        cqnf b = n.b();
        cqgq n2 = cqgr.n();
        n2.d = 200;
        n2.a = Float.valueOf(0.0f);
        cqmj gs = cqgr.gs(cqjv.l(cqlcVar, b, n2.b()), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ire.d()));
        gs.f(new cqmp[0]);
        cqmp[] cqmpVarArr = {cqic.c(armp.a, new cqmp[0])};
        cqmj bt = cqgr.bt(R.layout.beta_banner, new cqmp[0]);
        bt.f(new cqmp[0]);
        cqmj fY = cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqgr.x(cqta.f()), cqgr.bY(cqjd.j(), cqjd.s()), cqgr.fP(new armo(), armr.a, new cqmp[0]));
        fY.f(new cqmp[0]);
        cqmj a2 = MapViewContainer.a(cqgr.bp(1000), cqgr.cd(1000), cqgr.bC(-1000), MapViewContainer.f(false), cqgr.bY(cqjd.j()));
        a2.f(new cqmp[0]);
        cqmj gj = cqgr.gj(cqgr.bp(-1), cqgr.cd(-1), bt, fY, a2);
        gj.f(cqmpVarArr);
        return cqgr.gj(cqgr.bp(-1), cqgr.cd(-1), cqgr.z(ire.d()), gs, gj);
    }
}
