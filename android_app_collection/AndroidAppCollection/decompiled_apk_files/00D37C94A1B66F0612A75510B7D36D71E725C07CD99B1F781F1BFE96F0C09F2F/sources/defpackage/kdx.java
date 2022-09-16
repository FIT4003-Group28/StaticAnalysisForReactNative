package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: kdx  reason: default package */
/* loaded from: classes3.dex */
public final class kdx implements View.OnTouchListener {
    final /* synthetic */ kdy a;

    public kdx(kdy kdyVar) {
        this.a = kdyVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.k.getClass();
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.k.e((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        view.performClick();
        return true;
    }
}
