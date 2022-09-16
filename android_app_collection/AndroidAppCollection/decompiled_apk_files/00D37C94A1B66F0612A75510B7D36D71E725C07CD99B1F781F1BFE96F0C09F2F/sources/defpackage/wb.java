package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: wb  reason: default package */
/* loaded from: classes4.dex */
final class wb implements Runnable {
    final /* synthetic */ wc a;
    private final /* synthetic */ int b;

    public wb(wc wcVar) {
        this.a = wcVar;
    }

    public wb(wc wcVar, int i) {
        this.b = i;
        this.a = wcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            wc wcVar = this.a;
            wcVar.d();
            View view = wcVar.c;
            if (!view.isEnabled() || view.isLongClickable() || !wcVar.b()) {
                return;
            }
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            wcVar.d = true;
            return;
        }
        ViewParent parent = this.a.c.getParent();
        if (parent == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }
}
