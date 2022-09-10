package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.viewpager.widget.ViewPager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdvh  reason: default package */
/* loaded from: classes3.dex */
public final class bdvh implements bdve {
    final /* synthetic */ bdvi a;

    public bdvh(bdvi bdviVar) {
        this.a = bdviVar;
    }

    @Override // defpackage.bdve
    public final void a(boolean z) {
        this.a.b = z;
    }

    @Override // defpackage.bdve
    public final void b(float f) {
        ViewPager viewPager = this.a.a;
        if (!viewPager.k) {
            if (viewPager.e) {
                return;
            }
            viewPager.k = true;
            viewPager.b(1);
            viewPager.f = 0.0f;
            viewPager.g = 0.0f;
            VelocityTracker velocityTracker = viewPager.i;
            if (velocityTracker == null) {
                viewPager.i = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
            viewPager.i.addMovement(obtain);
            obtain.recycle();
            viewPager.l = uptimeMillis;
        }
        this.a.a.s(f);
        this.a.c += f;
    }

    @Override // defpackage.bdve
    public final void d() {
        bdvi bdviVar = this.a;
        if (bdviVar.a.k) {
            bdviVar.c = 0.0f;
            ViewPager viewPager = this.a.a;
            if (viewPager.k) {
                if (viewPager.b != null) {
                    VelocityTracker velocityTracker = viewPager.i;
                    velocityTracker.computeCurrentVelocity(1000, viewPager.j);
                    int xVelocity = (int) velocityTracker.getXVelocity(viewPager.h);
                    viewPager.d = true;
                    int d = viewPager.d();
                    int scrollX = viewPager.getScrollX();
                    bay q = viewPager.q();
                    viewPager.g(viewPager.r(q.b, ((scrollX / d) - q.e) / q.d, xVelocity, (int) (viewPager.f - viewPager.g)), true, true, xVelocity);
                }
                viewPager.t();
                viewPager.k = false;
                return;
            }
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
    }

    @Override // defpackage.bdve
    public final float c(float f) {
        bdvi bdviVar = this.a;
        ViewPager viewPager = bdviVar.a;
        if (viewPager.k) {
            float f2 = bdviVar.c;
            if ((f2 <= 0.0f || f2 - f <= 0.0f) && (f2 >= 0.0f || f2 - f >= 0.0f)) {
                float f3 = f - f2;
                viewPager.s(-f2);
                this.a.c = 0.0f;
                return f3;
            }
            bdviVar.c = f2 - f;
            viewPager.s(-f);
            return 0.0f;
        }
        return f;
    }
}
