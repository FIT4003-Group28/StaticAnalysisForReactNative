package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rzf  reason: default package */
/* loaded from: classes7.dex */
public final class rzf extends cqiw<sax> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqjg c = cqjg.a();
    public static final cqjg d = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, sax saxVar, Context context, cqiv cqivVar) {
        sax saxVar2 = saxVar;
        if (saxVar2.d().booleanValue() || saxVar2.o().booleanValue()) {
            cqivVar.c(new ryp());
        } else if (saxVar2.p().booleanValue()) {
            cqivVar.a(new ryu(), saxVar2);
        } else if (saxVar2.j().isEmpty()) {
            cqivVar.c(new ryv());
        } else {
            cqivVar.f(new rze(), saxVar2.j());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<sax> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.z(ibm.b()), hye.b(cqgr.bq(cqrp.d(48.0d)), cqgr.cd(-1), cqgr.bV(cqrp.d(16.0d)), cqgr.bD(cqrp.d(4.0d)), cqgr.bL(cqrp.d(20.0d)), cqgr.bO(cqrp.d(20.0d)), cqgr.z(ibm.b()), cqgr.cW(cqgr.q(ryn.a)), iue.c(ryo.a), cqgr.gq(cqgr.aJ(16), cqgr.bR(cqrp.d(16.0d)), ibq.y(), cqgr.eL(Integer.valueOf((int) R.string.COMMUTE_SETUP_STATION_PICKER_SEARCH)))), GmmRecyclerView.aw(C(), cqgr.aT(a), cqgr.cd(-1), cqgr.bp(-1)));
    }
}
