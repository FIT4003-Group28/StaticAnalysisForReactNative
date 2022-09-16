package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zo  reason: default package */
/* loaded from: classes4.dex */
public final class zo extends ne {
    boolean a = false;
    final /* synthetic */ xz b;

    public zo(xz xzVar) {
        this.b = xzVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        if (i != 0 || !this.a) {
            return;
        }
        this.a = false;
        this.b.f();
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
