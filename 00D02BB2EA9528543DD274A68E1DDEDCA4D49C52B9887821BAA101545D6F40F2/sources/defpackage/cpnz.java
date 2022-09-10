package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: cpnz  reason: default package */
/* loaded from: classes5.dex */
final class cpnz implements View.OnTouchListener {
    final /* synthetic */ cpoj a;

    public cpnz(cpoj cpojVar) {
        this.a = cpojVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        cpoj cpojVar = this.a;
        cpojVar.i.onTouchEvent(motionEvent);
        boolean z = cpojVar.j.onTouchEvent(motionEvent) || cpojVar.i.isInProgress();
        int action = motionEvent.getAction() & 255;
        if (z || action != 1) {
            return z;
        }
        cpqb<T, D> cpqbVar = cpojVar.k;
        for (cppy cppyVar : cpqbVar.b) {
            ViewParent viewParent = cpqbVar.a;
        }
        return false;
    }
}
