package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oeo  reason: default package */
/* loaded from: classes3.dex */
public final class oeo extends ne {
    final /* synthetic */ oeq a;

    public oeo(oeq oeqVar) {
        this.a = oeqVar;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        if ((recyclerView.n instanceof LinearLayoutManager) && hqs.k(recyclerView)) {
            int b = this.a.a.b();
            oeq oeqVar = this.a;
            if (b == oeqVar.h) {
                return;
            }
            oeqVar.h = b;
            oes oesVar = oeqVar.f;
            if (oesVar == null) {
                return;
            }
            oesVar.lD(ajfy.NEXT);
        }
    }
}
