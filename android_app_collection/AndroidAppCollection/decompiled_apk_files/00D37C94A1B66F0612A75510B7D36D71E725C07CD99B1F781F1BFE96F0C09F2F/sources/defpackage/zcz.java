package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zcz  reason: default package */
/* loaded from: classes4.dex */
public final class zcz extends ne {
    final /* synthetic */ zda a;

    public zcz(zda zdaVar) {
        this.a = zdaVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        zda zdaVar = this.a;
        if (recyclerView != zdaVar.b) {
            return;
        }
        for (SwipeLayout swipeLayout : zdaVar.a) {
            if (swipeLayout.isAttachedToWindow() && swipeLayout.r()) {
                swipeLayout.f();
            }
        }
    }
}
