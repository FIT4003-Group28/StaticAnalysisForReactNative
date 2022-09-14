package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afv  reason: default package */
/* loaded from: classes2.dex */
public final class afv extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ aga b;

    public afv(aga agaVar) {
        this.b = agaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View l;
        acl V;
        if (!this.a || (l = this.b.l(motionEvent)) == null || (V = this.b.m.V(l)) == null) {
            return;
        }
        aga agaVar = this.b;
        if (!agaVar.j.e(agaVar.m, V)) {
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
        aga agaVar2 = this.b;
        agaVar2.c = x;
        agaVar2.d = y;
        agaVar2.f = 0.0f;
        agaVar2.e = 0.0f;
        if (!agaVar2.j.f()) {
            return;
        }
        this.b.f(V, 2);
    }
}
