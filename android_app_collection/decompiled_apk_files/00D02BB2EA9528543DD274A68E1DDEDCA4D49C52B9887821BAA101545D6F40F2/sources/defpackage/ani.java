package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ani  reason: default package */
/* loaded from: classes.dex */
public final class ani implements Runnable {
    final /* synthetic */ anj a;

    public ani(anj anjVar) {
        this.a = anjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View h;
        int width;
        anj anjVar = this.a;
        int i = anjVar.b.h;
        int i2 = anjVar.a;
        if (i2 == 3) {
            h = anjVar.c.h(3);
            width = (h != null ? -h.getWidth() : 0) + i;
        } else {
            h = anjVar.c.h(5);
            width = anjVar.c.getWidth() - i;
        }
        if (h != null) {
            if (((i2 != 3 || h.getLeft() >= width) && (i2 == 3 || h.getLeft() <= width)) || anjVar.c.a(h) != 0) {
                return;
            }
            anjVar.b.d(h, width, h.getTop());
            ((anf) h.getLayoutParams()).c = true;
            anjVar.c.invalidate();
            anjVar.n();
            ank ankVar = anjVar.c;
            if (ankVar.e) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = ankVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                ankVar.getChildAt(i3).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            ankVar.e = true;
        }
    }
}
