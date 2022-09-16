package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bguj  reason: default package */
/* loaded from: classes3.dex */
public final class bguj extends cqiw<bgvl> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bgvl bgvlVar, Context context, cqiv cqivVar) {
        dcdc<bgvk> a = bgvlVar.a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            cqivVar.a(new bgui(), a.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bgvl> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.b()), GmmRecyclerView.aw(C(), cqqx.L()));
    }
}
