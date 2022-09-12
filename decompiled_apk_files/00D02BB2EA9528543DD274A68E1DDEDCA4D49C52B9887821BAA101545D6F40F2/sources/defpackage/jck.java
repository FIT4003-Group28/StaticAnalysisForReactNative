package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: jck  reason: default package */
/* loaded from: classes7.dex */
final class jck implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ cqjz b;
    final /* synthetic */ jcm c;

    public jck(View view, cqjz cqjzVar, jcm jcmVar) {
        this.a = view;
        this.b = cqjzVar;
        this.c = jcmVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.n(jcm.b, null);
        View view = this.a;
        view.setTranslationX(this.c.c.a(view.getContext()));
        View view2 = this.a;
        view2.setTranslationY(this.c.e.a(view2.getContext()));
        this.a.setScaleX(this.c.g);
        this.a.setScaleY(this.c.g);
        this.a.setAlpha(this.c.i);
        View view3 = this.a;
        view3.setRotation(bvox.f(bvox.a(view3), 0.0f));
        this.a.animate().translationX(this.c.d.a(this.a.getContext())).translationY(this.c.f.a(this.a.getContext())).scaleX(this.c.h).scaleY(this.c.h).alpha(this.c.j).rotation(bvox.f(bvox.a(this.a), 0.0f)).setDuration(this.c.n).setInterpolator(this.c.m).setStartDelay(this.c.o).start();
        return true;
    }
}
