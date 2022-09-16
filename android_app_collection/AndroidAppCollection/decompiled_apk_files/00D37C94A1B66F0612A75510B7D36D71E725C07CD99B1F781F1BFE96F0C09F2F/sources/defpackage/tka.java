package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tka  reason: default package */
/* loaded from: classes4.dex */
public final class tka implements View.OnAttachStateChangeListener {
    final /* synthetic */ tkc a;

    public tka(tkc tkcVar) {
        this.a = tkcVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        tkc tkcVar = this.a;
        tkcVar.k = false;
        if (!tkcVar.l) {
            tkcVar.j.g(tkcVar.i, tkcVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        tkc tkcVar = this.a;
        tkcVar.k = true;
        if (tkcVar.m) {
            tkcVar.j();
            tkcVar.j.e(tkcVar.i);
            return;
        }
        tkcVar.j.h(tkcVar.i);
    }
}
