package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: ntw  reason: default package */
/* loaded from: classes7.dex */
final class ntw implements View.OnGenericMotionListener {
    final /* synthetic */ nud a;

    public ntw(nud nudVar) {
        this.a = nudVar;
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (this.a.k && motionEvent.getActionMasked() == 8) {
            float axisValue = motionEvent.getAxisValue(9);
            ntr ntrVar = this.a.m;
            if (ntrVar == null) {
                return true;
            }
            if (axisValue > 0.0f) {
                ntrVar.a();
                return true;
            }
            ntrVar.b();
            return true;
        }
        return false;
    }
}
