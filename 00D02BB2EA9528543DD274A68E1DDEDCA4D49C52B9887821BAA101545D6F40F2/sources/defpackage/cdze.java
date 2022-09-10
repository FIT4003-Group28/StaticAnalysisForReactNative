package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: cdze  reason: default package */
/* loaded from: classes4.dex */
public final class cdze extends abi {
    final /* synthetic */ ceae a;

    public cdze(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // defpackage.abi
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a.ak;
        if (recyclerView != null) {
            recyclerView.n((i + i2) - 1);
        }
    }
}
