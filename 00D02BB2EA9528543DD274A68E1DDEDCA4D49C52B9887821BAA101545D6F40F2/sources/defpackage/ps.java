package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
/* compiled from: PG */
/* renamed from: ps  reason: default package */
/* loaded from: classes7.dex */
final class ps implements Runnable {
    final /* synthetic */ pt a;

    public ps(pt ptVar) {
        this.a = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pt ptVar = this.a;
        if (!ptVar.e) {
            return;
        }
        if (ptVar.c) {
            ptVar.c = false;
            pr prVar = ptVar.a;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            prVar.e = currentAnimationTimeMillis;
            prVar.g = -1L;
            prVar.f = currentAnimationTimeMillis;
            prVar.h = 0.5f;
        }
        pr prVar2 = this.a.a;
        if ((prVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > prVar2.g + prVar2.i) || !this.a.a()) {
            this.a.e = false;
            return;
        }
        pt ptVar2 = this.a;
        if (ptVar2.d) {
            ptVar2.d = false;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            ptVar2.b.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (prVar2.f == 0) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        float a = prVar2.a(currentAnimationTimeMillis2);
        long j = prVar2.f;
        prVar2.f = currentAnimationTimeMillis2;
        this.a.e((int) (((float) (currentAnimationTimeMillis2 - j)) * (((-4.0f) * a * a) + (a * 4.0f)) * prVar2.d));
        od.j(this.a.b, this);
    }
}
