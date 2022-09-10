package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: czux  reason: default package */
/* loaded from: classes5.dex */
public final class czux implements pp {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ boolean b;

    public czux(AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    @Override // defpackage.pp
    public final boolean a(View view) {
        this.a.setExpanded(this.b);
        return true;
    }
}
