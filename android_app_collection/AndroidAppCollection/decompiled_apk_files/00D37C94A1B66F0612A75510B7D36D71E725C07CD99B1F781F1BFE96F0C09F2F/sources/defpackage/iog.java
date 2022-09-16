package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iog  reason: default package */
/* loaded from: classes3.dex */
public final class iog extends ne {
    final /* synthetic */ iou a;

    public iog(iou iouVar) {
        this.a = iouVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        fyg fygVar;
        fxz fxzVar;
        fyi a;
        if (i != 1 || (fxzVar = (fygVar = this.a.ae).e) == null || (a = fygVar.a(fxzVar)) == null) {
            return;
        }
        a.d();
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        fyi a;
        fyg fygVar = this.a.ae;
        fxz fxzVar = fygVar.e;
        if (fxzVar == null || (a = fygVar.a(fxzVar)) == null) {
            return;
        }
        a.a(recyclerView, i2);
    }
}
