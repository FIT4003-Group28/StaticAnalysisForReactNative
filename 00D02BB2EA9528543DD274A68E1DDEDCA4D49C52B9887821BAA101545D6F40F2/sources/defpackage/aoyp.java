package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoyp  reason: default package */
/* loaded from: classes2.dex */
public final class aoyp extends cqiw<cqkp> {
    private final ckln<cqkp> a = new ckln<>();

    @Override // defpackage.cqiw
    protected final void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        cklj b = this.a.b(cqivVar, 2, aozr.b.e(context));
        b.d(new apan(), aphw.a);
        for (int i2 = 0; i2 < 4; i2++) {
            b.a(new aoyy(), cqkp.T);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cqkp> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(ibn.d()), cqgr.bG(ibn.d()), GmmRecyclerView.aw(C(), cqgr.aT(apkj.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.aR(Integer.valueOf((int) R.id.list_view)), ckln.a(this.a)));
    }
}
