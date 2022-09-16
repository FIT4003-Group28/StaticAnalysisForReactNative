package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: gia  reason: default package */
/* loaded from: classes3.dex */
public final class gia implements View.OnTouchListener {
    private final /* synthetic */ int c;
    public static final /* synthetic */ gia b = new gia(4);
    public static final /* synthetic */ gia a = new gia(2);

    public gia() {
    }

    public gia(int i) {
        this.c = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.c;
        if (i == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            view.onTouchEvent(motionEvent);
            return true;
        } else if (i == 2) {
            long j = gxk.a;
            return true;
        } else if (i != 3) {
            if (i != 4) {
                return true;
            }
            String str = umx.ae;
            return true;
        } else {
            int action = motionEvent.getAction();
            if (action == 0) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
            view.onTouchEvent(motionEvent);
            return true;
        }
    }
}
