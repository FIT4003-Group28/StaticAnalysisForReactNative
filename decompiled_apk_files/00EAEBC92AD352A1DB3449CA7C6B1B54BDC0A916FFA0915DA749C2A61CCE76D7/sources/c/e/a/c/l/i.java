package c.e.a.c.l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f4748a;

    /* renamed from: b  reason: collision with root package name */
    private long f4749b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f4750c;

    /* renamed from: d  reason: collision with root package name */
    private int f4751d;

    /* renamed from: e  reason: collision with root package name */
    private int f4752e;

    public i(long j, long j2) {
        this.f4748a = 0L;
        this.f4749b = 300L;
        this.f4750c = null;
        this.f4751d = 0;
        this.f4752e = 1;
        this.f4748a = j;
        this.f4749b = j2;
    }

    public i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f4748a = 0L;
        this.f4749b = 300L;
        this.f4750c = null;
        this.f4751d = 0;
        this.f4752e = 1;
        this.f4748a = j;
        this.f4749b = j2;
        this.f4750c = timeInterpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        iVar.f4751d = valueAnimator.getRepeatCount();
        iVar.f4752e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f4734b : interpolator instanceof AccelerateInterpolator ? a.f4735c : interpolator instanceof DecelerateInterpolator ? a.f4736d : interpolator;
    }

    public long a() {
        return this.f4748a;
    }

    public void a(Animator animator) {
        animator.setStartDelay(a());
        animator.setDuration(b());
        animator.setInterpolator(c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(d());
            valueAnimator.setRepeatMode(e());
        }
    }

    public long b() {
        return this.f4749b;
    }

    public TimeInterpolator c() {
        TimeInterpolator timeInterpolator = this.f4750c;
        return timeInterpolator != null ? timeInterpolator : a.f4734b;
    }

    public int d() {
        return this.f4751d;
    }

    public int e() {
        return this.f4752e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (a() != iVar.a() || b() != iVar.b() || d() != iVar.d() || e() != iVar.e()) {
            return false;
        }
        return c().getClass().equals(iVar.c().getClass());
    }

    public int hashCode() {
        return (((((((((int) (a() ^ (a() >>> 32))) * 31) + ((int) (b() ^ (b() >>> 32)))) * 31) + c().getClass().hashCode()) * 31) + d()) * 31) + e();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + a() + " duration: " + b() + " interpolator: " + c().getClass() + " repeatCount: " + d() + " repeatMode: " + e() + "}\n";
    }
}
