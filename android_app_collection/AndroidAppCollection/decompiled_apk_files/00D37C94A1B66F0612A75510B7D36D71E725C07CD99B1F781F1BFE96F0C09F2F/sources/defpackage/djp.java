package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: djp  reason: default package */
/* loaded from: classes3.dex */
public final class djp extends RecyclerView {
    public akcr W;
    public dkf aa;

    public djp(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dkf dkfVar = this.aa;
        if (dkfVar != null) {
            dkfVar.a.y();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        akcr akcrVar = this.W;
        if (akcrVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (akcrVar.a == null) {
            akcrVar.a = new zaa(this, true);
        }
        akcrVar.a.m(this, motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
