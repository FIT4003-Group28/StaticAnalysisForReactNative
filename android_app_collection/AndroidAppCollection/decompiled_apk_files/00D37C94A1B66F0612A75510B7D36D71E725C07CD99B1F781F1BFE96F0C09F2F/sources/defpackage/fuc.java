package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
/* compiled from: PG */
/* renamed from: fuc  reason: default package */
/* loaded from: classes3.dex */
public final class fuc extends amj {
    final /* synthetic */ BottomUiContainer a;

    public fuc(BottomUiContainer bottomUiContainer) {
        this.a = bottomUiContainer;
    }

    @Override // defpackage.amj
    public final int b(View view) {
        return view.getHeight();
    }

    @Override // defpackage.amj
    public final void c(View view, int i) {
        anf anfVar = this.a.h;
        if (anfVar != null) {
            anfVar.j();
        }
    }

    @Override // defpackage.amj
    public final void e(View view, float f, float f2) {
        int i = zew.i(this.a.getResources().getDisplayMetrics(), 10);
        int top = view.getTop();
        BottomUiContainer bottomUiContainer = this.a;
        if (top <= bottomUiContainer.i + i || f2 < 0.0f) {
            int top2 = view.getTop();
            BottomUiContainer bottomUiContainer2 = this.a;
            if (top2 <= bottomUiContainer2.i) {
                return;
            }
            bottomUiContainer2.k(f2);
            return;
        }
        View view2 = bottomUiContainer.d;
        if (view2 == null || view2 == bottomUiContainer.e) {
            return;
        }
        if (!bottomUiContainer.j) {
            bottomUiContainer.k(f2);
            return;
        }
        ftr ftrVar = bottomUiContainer.m;
        if (ftrVar != null) {
            ftrVar.a(0);
        }
        anf anfVar = bottomUiContainer.h;
        if (anfVar != null) {
            anfVar.j();
        }
        Animator animator = bottomUiContainer.f;
        if (animator != null) {
            animator.cancel();
        }
        anf f3 = bottomUiContainer.f(bottomUiContainer.d, f2);
        f3.f(new ftn(bottomUiContainer));
        bottomUiContainer.h = f3;
        View view3 = bottomUiContainer.d;
        bottomUiContainer.e = view3;
        bottomUiContainer.h.i(bottomUiContainer.i + view3.getHeight());
    }

    @Override // defpackage.amj
    public final boolean f(View view, int i) {
        BottomUiContainer bottomUiContainer = this.a;
        return bottomUiContainer.j && view == bottomUiContainer.d && view != bottomUiContainer.e;
    }

    @Override // defpackage.amj
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.amj
    public final int h(View view, int i) {
        int i2 = this.a.i;
        return akf.c(i, i2, view.getHeight() + i2);
    }

    @Override // defpackage.amj
    public final void i(View view, int i, int i2, int i3) {
        view.setAlpha(this.a.a(view, i2));
        BottomUiContainer bottomUiContainer = this.a;
        bottomUiContainer.j(bottomUiContainer.b(view));
    }
}
