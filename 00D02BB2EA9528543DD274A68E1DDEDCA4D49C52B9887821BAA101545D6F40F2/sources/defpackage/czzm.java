package defpackage;

import android.animation.Animator;
import com.google.android.apps.maps.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* compiled from: PG */
/* renamed from: czzm  reason: default package */
/* loaded from: classes5.dex */
public final class czzm extends czza {
    final /* synthetic */ ExtendedFloatingActionButton c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czzm(ExtendedFloatingActionButton extendedFloatingActionButton, czyy czyyVar) {
        super(extendedFloatingActionButton, czyyVar);
        this.c = extendedFloatingActionButton;
    }

    @Override // defpackage.czza, defpackage.daad
    public final void c(Animator animator) {
        super.c(animator);
        this.c.setVisibility(0);
        this.c.c = 2;
    }

    @Override // defpackage.czza, defpackage.daad
    public final void d() {
        super.d();
        this.c.c = 0;
    }

    @Override // defpackage.daad
    public final void h() {
        this.c.setVisibility(0);
        this.c.setAlpha(1.0f);
        this.c.setScaleY(1.0f);
        this.c.setScaleX(1.0f);
    }

    @Override // defpackage.daad
    public final int i() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.daad
    public final boolean j() {
        return this.c.g();
    }

    @Override // defpackage.daad
    public final void k() {
    }
}
