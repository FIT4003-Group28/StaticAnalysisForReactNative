package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;
/* compiled from: PG */
/* renamed from: lus  reason: default package */
/* loaded from: classes3.dex */
public final class lus extends ne {
    final /* synthetic */ MainCollapsingToolbarLayout a;

    public lus(MainCollapsingToolbarLayout mainCollapsingToolbarLayout) {
        this.a = mainCollapsingToolbarLayout;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.a;
        boolean z = false;
        if (mainCollapsingToolbarLayout.isLaidOut() && !mainCollapsingToolbarLayout.isInEditMode()) {
            z = true;
        }
        if (!mainCollapsingToolbarLayout.d(z)) {
            this.a.b((RecyclerView) null);
        }
    }
}
