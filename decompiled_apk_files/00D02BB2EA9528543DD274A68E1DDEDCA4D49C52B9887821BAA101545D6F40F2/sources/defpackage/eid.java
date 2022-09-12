package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: eid  reason: default package */
/* loaded from: classes.dex */
final class eid implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ eif b;

    public eid(eif eifVar, View view) {
        this.b = eifVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        eif eifVar = this.b;
        if (!eifVar.b) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else if (eifVar.c || this.a.isShown()) {
            if (!this.b.c || !this.a.isShown()) {
                return;
            }
            eif eifVar2 = this.b;
            eifVar2.c = false;
            eifVar2.a.start();
        } else {
            eif eifVar3 = this.b;
            eifVar3.c = true;
            eifVar3.a.end();
        }
    }
}
