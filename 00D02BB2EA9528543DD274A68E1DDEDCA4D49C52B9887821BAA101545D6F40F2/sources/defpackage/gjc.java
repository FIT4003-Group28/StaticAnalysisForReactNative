package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjc  reason: default package */
/* loaded from: classes6.dex */
public final class gjc extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ egu b;
    final /* synthetic */ boolean c;
    final /* synthetic */ egr d;
    final /* synthetic */ boolean e;
    final /* synthetic */ MainLayout f;

    public gjc(MainLayout mainLayout, ViewGroup viewGroup, egu eguVar, boolean z, egr egrVar, boolean z2) {
        this.f = mainLayout;
        this.a = viewGroup;
        this.b = eguVar;
        this.c = z;
        this.d = egrVar;
        this.e = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setLayerType(0, null);
        if (this.b.an) {
            return;
        }
        this.a.setVisibility(4);
        if (!this.c) {
            this.d.c(this.a);
        }
        if (this.e) {
            return;
        }
        this.f.setAllowLayoutDuringAnimation(true);
        this.f.G(null);
        this.f.setAllowLayoutDuringAnimation(false);
        if (!this.c) {
            return;
        }
        ehl.a(this.a);
        this.f.V.b.setVisibility(8);
    }
}
