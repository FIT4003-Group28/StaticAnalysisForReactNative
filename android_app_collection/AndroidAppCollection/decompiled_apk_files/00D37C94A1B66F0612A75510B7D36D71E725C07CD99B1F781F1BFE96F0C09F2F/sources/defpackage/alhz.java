package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: alhz  reason: default package */
/* loaded from: classes.dex */
public final class alhz {
    public int a = 0;
    public int b = 1;
    private final long c;
    private final long d;
    private final TimeInterpolator e;

    public alhz(long j, long j2, TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.e;
        return timeInterpolator != null ? timeInterpolator : alhv.b;
    }

    public final void b(Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.a);
            valueAnimator.setRepeatMode(this.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alhz)) {
            return false;
        }
        alhz alhzVar = (alhz) obj;
        if (this.c != alhzVar.c || this.d != alhzVar.d || this.a != alhzVar.a || this.b != alhzVar.b) {
            return false;
        }
        return a().getClass().equals(alhzVar.a().getClass());
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.d;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + a().getClass().hashCode()) * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.c + " duration: " + this.d + " interpolator: " + a().getClass() + " repeatCount: " + this.a + " repeatMode: " + this.b + "}\n";
    }
}
