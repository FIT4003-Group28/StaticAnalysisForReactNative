package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: alia  reason: default package */
/* loaded from: classes.dex */
public final class alia implements kj {
    final /* synthetic */ AppBarLayout a;

    public alia(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // defpackage.kj
    public final mb a(View view, mb mbVar) {
        AppBarLayout appBarLayout = this.a;
        mb mbVar2 = true != lj.af(appBarLayout) ? null : mbVar;
        if (!Objects.equals(appBarLayout.d, mbVar2)) {
            appBarLayout.d = mbVar2;
            appBarLayout.n();
            appBarLayout.requestLayout();
        }
        return mbVar;
    }
}
