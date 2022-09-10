package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: ammz  reason: default package */
/* loaded from: classes.dex */
final class ammz implements View.OnHoverListener {
    final /* synthetic */ View a;
    final /* synthetic */ aljd b;

    public ammz(View view, aljd aljdVar) {
        this.a = view;
        this.b = aljdVar;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean b;
        if (!this.a.isEnabled() || !this.a.isClickable()) {
            return false;
        }
        alit alitVar = this.b.f;
        if (motionEvent.getAction() == 9) {
            b = alitVar.k.a(motionEvent);
        } else {
            if (motionEvent.getAction() == 7) {
                b = alitVar.k.b(motionEvent);
            }
            return this.a.onHoverEvent(motionEvent);
        }
        if (b) {
            return true;
        }
        return this.a.onHoverEvent(motionEvent);
    }
}
