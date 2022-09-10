package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* compiled from: PG */
/* renamed from: czzk  reason: default package */
/* loaded from: classes5.dex */
public final class czzk extends czza {
    final /* synthetic */ ExtendedFloatingActionButton c;
    private final czzn d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czzk(ExtendedFloatingActionButton extendedFloatingActionButton, czyy czyyVar, czzn czznVar, boolean z) {
        super(extendedFloatingActionButton, czyyVar);
        this.c = extendedFloatingActionButton;
        this.d = czznVar;
        this.e = z;
    }

    @Override // defpackage.czza, defpackage.daad
    public final void c(Animator animator) {
        super.c(animator);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.l = this.e;
        extendedFloatingActionButton.m = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // defpackage.czza, defpackage.daad
    public final void d() {
        super.d();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.m = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = this.d.e().width;
        layoutParams.height = this.d.e().height;
    }

    @Override // defpackage.czza, defpackage.daad
    public final AnimatorSet f() {
        czur a = a();
        if (a.b("width")) {
            PropertyValuesHolder[] c = a.c("width");
            c[0].setFloatValues(this.c.getWidth(), this.d.a());
            a.d("width", c);
        }
        if (a.b("height")) {
            PropertyValuesHolder[] c2 = a.c("height");
            c2[0].setFloatValues(this.c.getHeight(), this.d.b());
            a.d("height", c2);
        }
        if (a.b("paddingStart")) {
            PropertyValuesHolder[] c3 = a.c("paddingStart");
            c3[0].setFloatValues(od.w(this.c), this.d.c());
            a.d("paddingStart", c3);
        }
        if (a.b("paddingEnd")) {
            PropertyValuesHolder[] c4 = a.c("paddingEnd");
            c4[0].setFloatValues(od.x(this.c), this.d.d());
            a.d("paddingEnd", c4);
        }
        if (a.b("labelOpacity")) {
            PropertyValuesHolder[] c5 = a.c("labelOpacity");
            boolean z = this.e;
            float f = 1.0f;
            float f2 = true != z ? 1.0f : 0.0f;
            if (true != z) {
                f = 0.0f;
            }
            c5[0].setFloatValues(f2, f);
            a.d("labelOpacity", c5);
        }
        return super.g(a);
    }

    @Override // defpackage.daad
    public final void h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.l = this.e;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = this.d.e().width;
        layoutParams.height = this.d.e().height;
        od.y(this.c, this.d.c(), this.c.getPaddingTop(), this.d.d(), this.c.getPaddingBottom());
        this.c.requestLayout();
    }

    @Override // defpackage.daad
    public final int i() {
        return this.e ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.daad
    public final boolean j() {
        boolean z = this.e;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        return z == extendedFloatingActionButton.l || extendedFloatingActionButton.f == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }

    @Override // defpackage.daad
    public final void k() {
    }
}
