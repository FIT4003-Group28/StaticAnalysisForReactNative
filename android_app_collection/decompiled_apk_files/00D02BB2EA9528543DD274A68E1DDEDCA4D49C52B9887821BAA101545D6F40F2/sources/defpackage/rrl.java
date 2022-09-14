package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: rrl  reason: default package */
/* loaded from: classes7.dex */
public final class rrl extends cqiw<sag> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, sag sagVar, Context context, cqiv cqivVar) {
        cqiw rqyVar;
        for (sad sadVar : sagVar.b()) {
            if (sadVar.i().booleanValue()) {
                if (sadVar instanceof sae) {
                    rqyVar = new rre();
                    sadVar = (sae) sadVar;
                } else {
                    rqyVar = new rqy();
                }
                cqivVar.a(rqyVar, sadVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<sag> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.fP(new hxj(), rrk.a, new cqmp[0]), cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.b())), iue.i(new cqmp[0])));
    }
}
