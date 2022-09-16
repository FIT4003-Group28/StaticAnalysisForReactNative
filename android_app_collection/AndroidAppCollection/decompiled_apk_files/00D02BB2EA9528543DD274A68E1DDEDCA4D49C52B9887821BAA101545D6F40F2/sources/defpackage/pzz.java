package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: pzz  reason: default package */
/* loaded from: classes7.dex */
public final class pzz extends cqiw<qaa> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, qaa qaaVar, Context context, cqiv cqivVar) {
        qaa qaaVar2 = qaaVar;
        int size = qaaVar2.b().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                cqivVar.c(ict.p(false, new cqmp[0]));
            }
            cqivVar.a(new pzy(), qaaVar2.b().get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<qaa> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.z(ibm.b()), hxc.a(hxc.b(pzk.a)), GmmRecyclerView.aw(C(), new cqmp[0]));
    }
}
