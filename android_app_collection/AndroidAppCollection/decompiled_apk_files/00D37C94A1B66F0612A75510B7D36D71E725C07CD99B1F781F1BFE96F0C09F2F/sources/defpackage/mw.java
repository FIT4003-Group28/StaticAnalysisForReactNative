package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
/* compiled from: PG */
/* renamed from: mw  reason: default package */
/* loaded from: classes3.dex */
final class mw implements Runnable {
    final /* synthetic */ mx a;

    public mw(mx mxVar) {
        this.a = mxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx mxVar = this.a;
        if (!mxVar.e) {
            return;
        }
        if (mxVar.c) {
            mxVar.c = false;
            mv mvVar = mxVar.a;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            mvVar.e = currentAnimationTimeMillis;
            mvVar.g = -1L;
            mvVar.f = currentAnimationTimeMillis;
            mvVar.h = 0.5f;
        }
        mv mvVar2 = this.a.a;
        if ((mvVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > mvVar2.g + mvVar2.i) || !this.a.b()) {
            this.a.e = false;
            return;
        }
        mx mxVar2 = this.a;
        if (mxVar2.d) {
            mxVar2.d = false;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            mxVar2.b.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (mvVar2.f == 0) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        float a = mvVar2.a(currentAnimationTimeMillis2);
        long j = mvVar2.f;
        mvVar2.f = currentAnimationTimeMillis2;
        this.a.f.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - j)) * (((-4.0f) * a * a) + (a * 4.0f)) * mvVar2.d));
        lj.H(this.a.b, this);
    }
}
