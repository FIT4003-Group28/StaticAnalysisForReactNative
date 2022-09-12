package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: gwp  reason: default package */
/* loaded from: classes6.dex */
final class gwp implements View.OnTouchListener {
    final /* synthetic */ View a;

    public gwp(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.a.performClick();
        }
        return this.a.onTouchEvent(motionEvent);
    }
}
