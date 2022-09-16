package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: czvf  reason: default package */
/* loaded from: classes5.dex */
final class czvf implements czvb {
    final /* synthetic */ czvg a;

    public czvf(czvg czvgVar) {
        this.a = czvgVar;
    }

    @Override // defpackage.czuz
    public final void h(AppBarLayout appBarLayout, int i) {
        czvg czvgVar = this.a;
        czvgVar.c = i;
        ow owVar = czvgVar.d;
        int d = owVar != null ? owVar.d() : 0;
        int childCount = this.a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.a.getChildAt(i2);
            czve czveVar = (czve) childAt.getLayoutParams();
            czvm i3 = czvg.i(childAt);
            int i4 = czveVar.a;
            if (i4 == 1) {
                i3.c(akn.b(-i, 0, this.a.l(childAt)));
            } else if (i4 == 2) {
                i3.c(Math.round((-i) * czveVar.b));
            }
        }
        this.a.k();
        czvg czvgVar2 = this.a;
        if (czvgVar2.b != null && d > 0) {
            od.i(czvgVar2);
        }
        this.a.a.q(Math.abs(i) / ((this.a.getHeight() - od.A(this.a)) - d));
    }
}
