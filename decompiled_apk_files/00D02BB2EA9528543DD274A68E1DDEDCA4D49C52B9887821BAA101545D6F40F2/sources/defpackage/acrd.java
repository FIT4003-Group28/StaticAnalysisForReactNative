package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: acrd  reason: default package */
/* loaded from: classes2.dex */
final class acrd implements View.OnAttachStateChangeListener {
    final /* synthetic */ acrg a;

    public acrd(acrg acrgVar) {
        this.a = acrgVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        acrg acrgVar = this.a;
        Integer num = acrgVar.o;
        if (num != null) {
            acrgVar.p.g(Double.valueOf(num.doubleValue()));
        }
        acrg acrgVar2 = this.a;
        cpph<cpvm, Double> cpphVar = acrgVar2.k;
        if (cpphVar != null) {
            acrt acrtVar = acrgVar2.j;
            if (acrtVar.a.isRunning()) {
                acrtVar.a.end();
                acrtVar.a.removeAllUpdateListeners();
            }
            acrtVar.a.addUpdateListener(new acrs(acrtVar, cpphVar));
            acrtVar.a.start();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        acrg acrgVar = this.a;
        if (acrgVar.k != null) {
            acrgVar.j.a.removeAllUpdateListeners();
        }
    }
}
