package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoza  reason: default package */
/* loaded from: classes2.dex */
public final class aoza extends cqiw<aphq> {
    private final ckln<aphq> a = new ckln<>();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aphq aphqVar, Context context, cqiv cqivVar) {
        aphq aphqVar2 = aphqVar;
        cklj b = this.a.b(cqivVar, 2, aozr.c.e(context));
        b.d(new apan(), aphqVar2.a());
        for (aphr aphrVar : aphqVar2.b()) {
            b.a(new aozk(), aphrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aphq> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(aozr.d), cqgr.bG(aozr.d), cqgr.bV(aozr.d), GmmRecyclerView.aw(C(), cqgr.aR(Integer.valueOf((int) R.id.list_view)), cqgr.aT(apkj.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.ep(false), ckln.a(this.a), cqqx.v(aoyz.a)));
    }
}
