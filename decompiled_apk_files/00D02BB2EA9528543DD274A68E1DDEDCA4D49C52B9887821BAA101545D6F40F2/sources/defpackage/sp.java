package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
/* compiled from: PG */
/* renamed from: sp  reason: default package */
/* loaded from: classes.dex */
final class sp extends sr {
    private final ObjectAnimator a;
    private final boolean b;

    public sp(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        sq sqVar = new sq(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(sqVar.a);
        ofInt.setInterpolator(sqVar);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // defpackage.sr
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.sr
    public final void b() {
        this.a.cancel();
    }

    @Override // defpackage.sr
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.sr
    public final void d() {
        this.a.reverse();
    }
}
