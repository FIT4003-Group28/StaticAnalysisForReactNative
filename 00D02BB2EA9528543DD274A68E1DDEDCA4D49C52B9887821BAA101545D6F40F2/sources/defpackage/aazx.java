package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: aazx  reason: default package */
/* loaded from: classes2.dex */
final class aazx implements View.OnTouchListener {
    final /* synthetic */ View a;

    public aazx(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        cqjz<?> s = cqjz.s(this.a, bfix.a);
        View view2 = s == null ? null : s.c;
        if (view2 != null) {
            float height = view2.getHeight();
            motionEvent.offsetLocation(0.0f, height);
            boolean dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
            motionEvent.offsetLocation(0.0f, -height);
            return dispatchTouchEvent;
        }
        return false;
    }
}
