package defpackage;

import android.support.v4.widget.NestedScrollView;
import android.view.ViewTreeObserver;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
/* compiled from: PG */
/* renamed from: cdzw  reason: default package */
/* loaded from: classes4.dex */
final class cdzw implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ NestedScrollView a;
    final /* synthetic */ ceae b;

    public cdzw(NestedScrollView nestedScrollView, ceae ceaeVar) {
        this.a = nestedScrollView;
        this.b = ceaeVar;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ModAppBar modAppBar = this.b.ai;
        if (modAppBar != null) {
            modAppBar.l(this.a.getScrollY() != 0);
        }
    }
}
