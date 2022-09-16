package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: kvv  reason: default package */
/* loaded from: classes3.dex */
final class kvv extends ne {
    final /* synthetic */ kvz a;

    public kvv(kvz kvzVar) {
        this.a = kvzVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        if (i == 1) {
            zag.i(this.a.aH);
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        kvz kvzVar = this.a;
        kvzVar.aK = Math.max(kvzVar.aK, kvzVar.aG.L());
    }
}
