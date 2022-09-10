package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caan  reason: default package */
/* loaded from: classes4.dex */
public final class caan extends cqqw {
    final /* synthetic */ caaw a;

    public caan(caaw caawVar) {
        this.a = caawVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        caaw caawVar = this.a;
        if (caawVar.aD) {
            if (caawVar.be != 0) {
                caawVar.bs();
            } else {
                caawVar.br(recyclerView, false);
            }
        }
    }
}
