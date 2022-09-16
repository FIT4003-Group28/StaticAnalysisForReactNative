package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: akee  reason: default package */
/* loaded from: classes.dex */
public final class akee implements View.OnTouchListener {
    private final aked a = new aked(null);

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.a(akef.b(view, 1.0f, akef.a(view), 100));
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            this.a.b(akef.b(view, akef.a(view), 1.0f, 400));
            return false;
        }
    }
}
