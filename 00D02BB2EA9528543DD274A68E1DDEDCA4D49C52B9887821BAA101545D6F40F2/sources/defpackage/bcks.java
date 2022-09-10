package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: bcks  reason: default package */
/* loaded from: classes3.dex */
public final class bcks implements View.OnTouchListener {
    private final cjtd a;
    private final cjqy b;
    private int c = 0;

    public bcks(cjtd cjtdVar, cjqy cjqyVar) {
        this.a = cjtdVar;
        this.b = cjqyVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int scrollX;
        if (motionEvent.getAction() == 1) {
            if (view instanceof RecyclerView) {
                scrollX = ((RecyclerView) view).computeHorizontalScrollOffset();
            } else {
                scrollX = view.getScrollX();
            }
            if (this.c != scrollX && this.a.l()) {
                this.b.m(new cjte(deaf.SWIPE), this.a);
                this.c = scrollX;
            }
            view.performClick();
        }
        return view.onTouchEvent(motionEvent);
    }
}
