package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: kzl  reason: default package */
/* loaded from: classes3.dex */
final class kzl implements View.OnTouchListener {
    final /* synthetic */ awdu a;
    final /* synthetic */ ajrs b;

    public kzl(awdu awduVar, ajrs ajrsVar) {
        this.a = awduVar;
        this.b = ajrsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            awdu awduVar = this.a;
            if ((awduVar.b & 4) == 0) {
                return false;
            }
            this.b.a.H(3, new acte(awduVar.g.I()), null);
            return false;
        }
        return false;
    }
}
