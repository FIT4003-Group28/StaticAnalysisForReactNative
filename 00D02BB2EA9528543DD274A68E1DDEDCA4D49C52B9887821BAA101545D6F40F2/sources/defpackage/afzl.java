package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afzl  reason: default package */
/* loaded from: classes2.dex */
public final class afzl implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ afzm a;

    public afzl(afzm afzmVar) {
        this.a = afzmVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.a.ax;
        if (view == null || !view.isShown()) {
            return true;
        }
        afzm afzmVar = this.a;
        if (afzmVar.ao.e(afzmVar.b)) {
            View view2 = this.a.ax;
            dbsk.s(view2);
            view2.requestFocus();
            this.a.ao.c(view2, 8);
        }
        this.a.ax = null;
        return true;
    }
}
