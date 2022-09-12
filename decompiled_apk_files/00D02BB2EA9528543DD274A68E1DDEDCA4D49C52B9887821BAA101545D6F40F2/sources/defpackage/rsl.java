package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rsl  reason: default package */
/* loaded from: classes7.dex */
public final class rsl extends cqiw<sak> {
    public static final cqtd a = iut.a(iup.e(R.drawable.header_confetti_left));
    public static final cqtd b = iut.a(iup.e(R.drawable.header_confetti_right));
    public static final cqtv c = cqrp.d(48.0d);
    public static final cqtv d = cqrp.d(8.0d);
    public static final cqjg e = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, sak sakVar, Context context, cqiv cqivVar) {
        sak sakVar2 = sakVar;
        cqivVar.a(new rsj(), sakVar2);
        for (sad sadVar : sakVar2.b()) {
            if (sadVar.i().booleanValue()) {
                cqivVar.a(new rrh(), sadVar);
            }
        }
        cqivVar.a(new rsk(), cqkp.T);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<sak> a() {
        return zvk.b(GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.b())), new cqmp[0]);
    }
}
