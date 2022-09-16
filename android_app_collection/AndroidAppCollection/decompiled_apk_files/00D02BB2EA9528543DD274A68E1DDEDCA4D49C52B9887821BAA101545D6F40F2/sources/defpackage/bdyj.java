package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdyj  reason: default package */
/* loaded from: classes3.dex */
public final class bdyj extends cqqw {
    final /* synthetic */ bdyk a;

    public bdyj(bdyk bdykVar) {
        this.a = bdykVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.a.j.l().a(recyclerView, i, i2);
        bhjf bhjfVar = this.a.i;
        if (bhjfVar != null) {
            bhjfVar.q().a(recyclerView, i, i2);
        }
    }
}
