package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: czus  reason: default package */
/* loaded from: classes5.dex */
public final class czus {
    public int a = 0;
    public int b = 1;
    private final long c;
    private final long d;
    private final TimeInterpolator e;

    public czus(long j, long j2, TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.a);
            valueAnimator.setRepeatMode(this.b);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.e;
        return timeInterpolator != null ? timeInterpolator : czum.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czus)) {
            return false;
        }
        czus czusVar = (czus) obj;
        if (this.c != czusVar.c || this.d != czusVar.d || this.a != czusVar.a || this.b != czusVar.b) {
            return false;
        }
        return b().getClass().equals(czusVar.b().getClass());
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.d;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + b().getClass().hashCode()) * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.c + " duration: " + this.d + " interpolator: " + b().getClass() + " repeatCount: " + this.a + " repeatMode: " + this.b + "}\n";
    }
}
