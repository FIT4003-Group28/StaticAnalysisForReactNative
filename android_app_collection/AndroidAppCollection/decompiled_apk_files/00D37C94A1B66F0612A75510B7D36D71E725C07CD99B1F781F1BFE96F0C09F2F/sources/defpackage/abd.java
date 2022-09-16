package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abd  reason: default package */
/* loaded from: classes.dex */
public final class abd extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ abh b;

    public abd(abh abhVar) {
        this.b = abhVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View g;
        yo k;
        if (!this.a || (g = this.b.g(motionEvent)) == null || (k = this.b.m.k(g)) == null) {
            return;
        }
        abh abhVar = this.b;
        if (!abhVar.j.i(abhVar.m, k)) {
            return;
        }
        int pointerId = motionEvent.getPointerId(0);
        int i = this.b.i;
        if (pointerId != i) {
            return;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        abh abhVar2 = this.b;
        abhVar2.c = x;
        abhVar2.d = y;
        abhVar2.f = 0.0f;
        abhVar2.e = 0.0f;
        if (!abhVar2.j.j()) {
            return;
        }
        this.b.m(k, 2);
    }
}
