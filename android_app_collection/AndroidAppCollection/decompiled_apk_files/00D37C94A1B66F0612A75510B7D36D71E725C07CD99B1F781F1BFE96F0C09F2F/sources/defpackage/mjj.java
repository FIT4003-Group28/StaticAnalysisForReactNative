package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: mjj  reason: default package */
/* loaded from: classes3.dex */
final class mjj implements View.OnTouchListener {
    final /* synthetic */ mjk a;

    public mjj(mjk mjkVar) {
        this.a = mjkVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.b.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }
}
