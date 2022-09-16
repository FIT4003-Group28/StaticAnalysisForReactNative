package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: kkt  reason: default package */
/* loaded from: classes3.dex */
final class kkt implements View.OnTouchListener {
    final /* synthetic */ kkv a;

    public kkt(kkv kkvVar) {
        this.a = kkvVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.a.i = (int) motionEvent.getRawX();
            this.a.j = (int) motionEvent.getRawY();
            view.performClick();
            return true;
        }
        return false;
    }
}
