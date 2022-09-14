package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zp  reason: default package */
/* loaded from: classes7.dex */
public final class zp implements Runnable {
    final /* synthetic */ zq a;

    public zp(zq zqVar) {
        this.a = zqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zq zqVar = this.a;
        zqVar.d();
        View view = zqVar.c;
        if (!view.isEnabled() || view.isLongClickable() || !zqVar.b()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        zqVar.d = true;
    }
}
