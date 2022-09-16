package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: kkx  reason: default package */
/* loaded from: classes3.dex */
public final class kkx implements View.OnTouchListener {
    final /* synthetic */ kkz a;

    public kkx(kkz kkzVar) {
        this.a = kkzVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.a.p = (int) motionEvent.getRawX();
            this.a.q = (int) motionEvent.getRawY();
            view.performClick();
            return true;
        }
        return false;
    }
}
