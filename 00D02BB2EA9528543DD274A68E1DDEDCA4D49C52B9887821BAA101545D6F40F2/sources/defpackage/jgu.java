package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: jgu  reason: default package */
/* loaded from: classes7.dex */
public final class jgu extends FrameLayout {
    @dzsi
    private RecyclerView a;
    private final Rect b;
    private boolean c;

    public jgu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        ((jgw) bttc.a(jgw.class, this)).Fb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RecyclerView recyclerView = (RecyclerView) cqkx.e(this, jgv.a, RecyclerView.class);
        this.a = recyclerView;
        if (recyclerView != null) {
            this.b.set(0, 0, recyclerView.getWidth(), recyclerView.getHeight());
            for (RecyclerView recyclerView2 = recyclerView; recyclerView2 != this; recyclerView2 = (View) recyclerView2.getParent()) {
                this.b.offset(recyclerView2.getLeft(), recyclerView2.getTop());
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RecyclerView recyclerView = this.a;
        if (recyclerView == null) {
            return false;
        }
        if (!this.c) {
            float y = motionEvent.getY();
            boolean z = ((float) this.b.top) <= y && y <= ((float) this.b.bottom) && recyclerView.isShown();
            this.c = z;
            if (!z) {
                return false;
            }
        }
        motionEvent.offsetLocation(-this.b.left, -this.b.top);
        boolean dispatchTouchEvent = recyclerView.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation(this.b.left, this.b.top);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.c = false;
        }
        return dispatchTouchEvent;
    }
}
