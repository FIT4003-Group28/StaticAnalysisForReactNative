package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: alie  reason: default package */
/* loaded from: classes.dex */
public final class alie implements mu {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ boolean b;

    public alie(AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // defpackage.mu
    public final boolean a(View view) {
        this.a.l(this.b);
        return true;
    }
}
