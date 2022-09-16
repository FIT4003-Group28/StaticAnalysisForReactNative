package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: obd  reason: default package */
/* loaded from: classes3.dex */
public final class obd extends ne {
    final /* synthetic */ obe a;

    public obd(obe obeVar) {
        this.a = obeVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        obe obeVar = this.a;
        Runnable runnable = obeVar.b;
        if (runnable != null) {
            if (i == 1) {
                obeVar.b = null;
            } else if (i != 0) {
            } else {
                recyclerView.post(runnable);
                this.a.b = null;
            }
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
    }
}
