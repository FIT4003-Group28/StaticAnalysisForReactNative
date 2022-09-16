package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: alio  reason: default package */
/* loaded from: classes.dex */
final class alio implements alik {
    final /* synthetic */ alip a;

    public alio(alip alipVar) {
        this.a = alipVar;
    }

    @Override // defpackage.alig
    public final void a(AppBarLayout appBarLayout, int i) {
        int height;
        alip alipVar = this.a;
        alipVar.g = i;
        mb mbVar = alipVar.h;
        int f = mbVar != null ? mbVar.f() : 0;
        int childCount = this.a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.a.getChildAt(i2);
            alin alinVar = (alin) childAt.getLayoutParams();
            aliv g = alip.g(childAt);
            int i3 = alinVar.a;
            if (i3 == 1) {
                g.c(akf.c(-i, 0, this.a.e(childAt)));
            } else if (i3 == 2) {
                g.c(Math.round((-i) * alinVar.b));
            }
        }
        this.a.m();
        alip alipVar2 = this.a;
        if (alipVar2.f != null && f > 0) {
            lj.G(alipVar2);
        }
        int height2 = (this.a.getHeight() - lj.f(this.a)) - f;
        int f2 = this.a.f();
        alky alkyVar = this.a.c;
        float f3 = height2;
        alkyVar.c = Math.min(1.0f, (height - f2) / f3);
        alkyVar.d = alkyVar.b();
        alip alipVar3 = this.a;
        alky alkyVar2 = alipVar3.c;
        alkyVar2.e = alipVar3.g + height2;
        alkyVar2.s(Math.abs(i) / f3);
    }
}
