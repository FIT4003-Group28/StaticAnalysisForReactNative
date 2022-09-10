package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: czuw  reason: default package */
/* loaded from: classes5.dex */
public final class czuw implements pp {
    final /* synthetic */ CoordinatorLayout a;
    final /* synthetic */ AppBarLayout b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;
    final /* synthetic */ AppBarLayout.BaseBehavior e;

    public czuw(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.e = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = view;
        this.d = i;
    }

    @Override // defpackage.pp
    public final boolean a(View view) {
        this.e.y(this.a, this.b, this.c, this.d, new int[]{0, 0});
        return true;
    }
}
