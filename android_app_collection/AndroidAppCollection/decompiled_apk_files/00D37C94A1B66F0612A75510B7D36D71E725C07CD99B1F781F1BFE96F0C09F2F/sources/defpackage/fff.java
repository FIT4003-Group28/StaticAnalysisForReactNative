package defpackage;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fff  reason: default package */
/* loaded from: classes3.dex */
public final class fff extends ffg {
    public static final /* synthetic */ int g = 0;
    public final azqb a;
    public final int b;
    public final int c;
    public final long d = 1500;
    public final Runnable e = new ffe(this);
    final /* synthetic */ ffh f;

    public fff(ffh ffhVar, azqb azqbVar, int i, int i2) {
        this.f = ffhVar;
        this.a = azqbVar;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        this.f.removeCallbacks(this.e);
        if (b() == 1.0f) {
            f();
            return;
        }
        d();
        this.f.postInvalidate();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f.invalidate();
    }
}
