package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: cdzx  reason: default package */
/* loaded from: classes4.dex */
final class cdzx implements View.OnTouchListener {
    final /* synthetic */ ceae a;

    public cdzx(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dzvx.b(motionEvent, "event");
        if (motionEvent.getAction() == 1) {
            this.a.w();
            return false;
        }
        return false;
    }
}
