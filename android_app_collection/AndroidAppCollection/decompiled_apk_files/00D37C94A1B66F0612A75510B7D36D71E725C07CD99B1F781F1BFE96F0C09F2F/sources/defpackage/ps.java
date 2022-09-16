package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
/* compiled from: PG */
/* renamed from: ps  reason: default package */
/* loaded from: classes4.dex */
final class ps extends pu {
    private final ObjectAnimator a;
    private final boolean b;

    public ps(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        pt ptVar = new pt(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(ptVar.a);
        ofInt.setInterpolator(ptVar);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // defpackage.pu
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.pu
    public final void b() {
        this.a.cancel();
    }

    @Override // defpackage.pu
    public final void c() {
        this.a.reverse();
    }

    @Override // defpackage.pu
    public final boolean d() {
        return this.b;
    }
}
