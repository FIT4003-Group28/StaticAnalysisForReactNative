package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: czut  reason: default package */
/* loaded from: classes5.dex */
public final class czut implements nq {
    final /* synthetic */ AppBarLayout a;

    public czut(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // defpackage.nq
    public final ow a(View view, ow owVar) {
        AppBarLayout appBarLayout = this.a;
        ow owVar2 = true != od.M(appBarLayout) ? null : owVar;
        if (!Objects.equals(appBarLayout.r, owVar2)) {
            appBarLayout.r = owVar2;
            appBarLayout.e();
            appBarLayout.requestLayout();
        }
        return owVar;
    }
}
