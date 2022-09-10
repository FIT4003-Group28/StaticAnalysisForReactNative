package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqzh  reason: default package */
/* loaded from: classes4.dex */
public final class bqzh extends cqqw {
    final /* synthetic */ bqzm a;
    private boolean b;

    public bqzh(bqzm bqzmVar) {
        this.a = bqzmVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (this.b) {
                bqzm bqzmVar = this.a;
                brla.b(bqzmVar.bb, bqzmVar.b);
                return;
            }
            bqzm bqzmVar2 = this.a;
            brla.a(bqzmVar2.bb, bqzmVar2.b);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.b = i2 > 0;
    }
}
