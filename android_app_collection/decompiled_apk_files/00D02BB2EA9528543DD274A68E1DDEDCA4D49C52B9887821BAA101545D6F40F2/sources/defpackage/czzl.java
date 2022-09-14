package defpackage;

import android.animation.Animator;
import com.google.android.apps.maps.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* compiled from: PG */
/* renamed from: czzl  reason: default package */
/* loaded from: classes5.dex */
public final class czzl extends czza {
    final /* synthetic */ ExtendedFloatingActionButton c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czzl(ExtendedFloatingActionButton extendedFloatingActionButton, czyy czyyVar) {
        super(extendedFloatingActionButton, czyyVar);
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.czza, defpackage.daad
    public final void c(Animator animator) {
        super.c(animator);
        this.d = false;
        this.c.setVisibility(0);
        this.c.c = 1;
    }

    @Override // defpackage.czza, defpackage.daad
    public final void d() {
        super.d();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.c = 0;
        if (!this.d) {
            extendedFloatingActionButton.setVisibility(8);
        }
    }

    @Override // defpackage.czza, defpackage.daad
    public final void e() {
        super.e();
        this.d = true;
    }

    @Override // defpackage.daad
    public final void h() {
        this.c.setVisibility(8);
    }

    @Override // defpackage.daad
    public final int i() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.daad
    public final boolean j() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.c;
        return visibility == 0 ? i == 1 : i != 2;
    }

    @Override // defpackage.daad
    public final void k() {
    }
}
