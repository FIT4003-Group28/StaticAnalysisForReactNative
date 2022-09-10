package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: ammy  reason: default package */
/* loaded from: classes.dex */
final class ammy implements View.OnTouchListener {
    final /* synthetic */ View a;
    final /* synthetic */ aljd b;

    public ammy(View view, aljd aljdVar) {
        this.a = view;
        this.b = aljdVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.a.isEnabled() || !this.a.isClickable()) {
            return false;
        }
        this.b.e(motionEvent);
        return true;
    }
}
