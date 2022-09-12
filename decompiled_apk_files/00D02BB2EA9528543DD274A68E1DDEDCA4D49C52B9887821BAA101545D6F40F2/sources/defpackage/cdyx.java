package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: cdyx  reason: default package */
/* loaded from: classes4.dex */
final class cdyx implements View.OnTouchListener {
    final /* synthetic */ cdyy a;

    public cdyx(cdyy cdyyVar) {
        this.a = cdyyVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dzvx.c(view, "<anonymous parameter 0>");
        dzvx.c(motionEvent, "event");
        if (motionEvent.getActionMasked() == 1) {
            cdyy cdyyVar = this.a;
            if (!cdyyVar.F) {
                return false;
            }
            cdyyVar.H.a();
            return false;
        }
        return false;
    }
}
