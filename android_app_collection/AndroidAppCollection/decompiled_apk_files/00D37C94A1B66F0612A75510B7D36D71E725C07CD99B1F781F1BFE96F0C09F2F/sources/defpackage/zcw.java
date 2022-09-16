package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
/* compiled from: PG */
/* renamed from: zcw  reason: default package */
/* loaded from: classes4.dex */
public final class zcw extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ SwipeLayout a;

    public zcw(SwipeLayout swipeLayout) {
        this.a = swipeLayout;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (!this.a.r() && this.a.getParent() != null) {
            this.a.performLongClick();
        }
        this.a.o();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        if (!this.a.r()) {
            this.a.n(motionEvent.getX(), motionEvent.getY());
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (motionEvent.getX() < this.a.c.getLeft()) {
            View c = this.a.c();
            if (c == null) {
                return false;
            }
            c.performClick();
            return false;
        } else if (motionEvent.getX() >= this.a.c.getRight()) {
            View d = this.a.d();
            if (d == null) {
                return false;
            }
            d.performClick();
            return false;
        } else if (this.a.r()) {
            return false;
        } else {
            this.a.performClick();
            this.a.n(motionEvent.getX(), motionEvent.getY());
            return false;
        }
    }
}
