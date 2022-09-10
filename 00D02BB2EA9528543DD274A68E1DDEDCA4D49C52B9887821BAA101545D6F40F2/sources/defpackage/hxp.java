package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
/* compiled from: PG */
/* renamed from: hxp  reason: default package */
/* loaded from: classes6.dex */
public final class hxp extends abx {
    private final ModAppBar a;

    public hxp(ModAppBar modAppBar) {
        this.a = modAppBar;
        modAppBar.q(true);
        modAppBar.l(false);
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.a.l(recyclerView.canScrollVertically(-1));
    }
}
