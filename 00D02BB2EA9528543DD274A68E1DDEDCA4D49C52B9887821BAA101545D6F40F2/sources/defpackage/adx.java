package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adx  reason: default package */
/* loaded from: classes2.dex */
public final class adx extends abx {
    boolean a = false;
    final /* synthetic */ adz b;

    public adx(adz adzVar) {
        this.b = adzVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i != 0 || !this.a) {
            return;
        }
        this.a = false;
        this.b.g();
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
