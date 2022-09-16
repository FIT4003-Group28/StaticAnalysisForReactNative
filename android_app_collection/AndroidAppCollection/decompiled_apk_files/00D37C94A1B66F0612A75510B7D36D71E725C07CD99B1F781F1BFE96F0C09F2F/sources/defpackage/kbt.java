package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: kbt  reason: default package */
/* loaded from: classes3.dex */
public final class kbt implements zar {
    private final Interpolator a;

    public kbt(Interpolator interpolator) {
        this.a = interpolator;
    }

    @Override // defpackage.zar
    public final void a(View view, long j, zaq zaqVar) {
        view.setAlpha(1.0f);
        ln q = lj.q(view);
        q.c(0.0f);
        q.e(this.a);
        q.d(j);
        q.f(zav.b(zaqVar));
    }

    @Override // defpackage.zar
    public final void b(View view, long j, zaq zaqVar) {
        view.setAlpha(0.0f);
        ln q = lj.q(view);
        q.c(1.0f);
        q.e(this.a);
        q.d(j);
        q.f(zav.b(zaqVar));
    }

    @Override // defpackage.zar
    public final void c(View view) {
        lj.q(view).a();
        view.setAlpha(1.0f);
    }
}
