package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: akzl  reason: default package */
/* loaded from: classes.dex */
public final class akzl extends ValueAnimator {
    final /* synthetic */ akzm a;

    /* JADX INFO: Access modifiers changed from: protected */
    public akzl(akzm akzmVar) {
        this.a = akzmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j) {
        long startDelay = getStartDelay() + getDuration();
        if (startDelay == 0) {
            super.setDuration(j);
            return;
        }
        double d = j;
        double d2 = startDelay;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double startDelay2 = getStartDelay();
        Double.isNaN(startDelay2);
        long j2 = (long) (d3 * startDelay2);
        super.setStartDelay(j2);
        super.setDuration(j - j2);
    }

    public final void b(long j) {
        super.setDuration(j);
        akzm akzmVar = this.a;
        int i = akzm.m;
        akzmVar.q();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        b(j);
        return this;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    /* renamed from: setDuration  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ ValueAnimator mo0setDuration(long j) {
        b(j);
        return this;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        super.setStartDelay(j);
        akzm akzmVar = this.a;
        int i = akzm.m;
        akzmVar.q();
    }
}
