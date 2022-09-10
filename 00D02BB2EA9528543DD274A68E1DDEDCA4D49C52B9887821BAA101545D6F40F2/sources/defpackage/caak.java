package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caak  reason: default package */
/* loaded from: classes4.dex */
public final class caak implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ caaw a;

    public caak(caaw caawVar) {
        this.a = caawVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        caaw caawVar = this.a;
        gga ggaVar = caawVar.aE;
        RecyclerView recyclerView = caawVar.g;
        if (caawVar.aD && ggaVar != null && recyclerView != null) {
            if (caawVar.be != 0) {
                caawVar.bs();
            } else {
                caawVar.br(recyclerView, true);
            }
            this.a.aA.b(recyclerView);
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
    }
}
