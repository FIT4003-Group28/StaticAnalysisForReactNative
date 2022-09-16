package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aicl  reason: default package */
/* loaded from: classes.dex */
final class aicl implements View.OnLayoutChangeListener {
    final /* synthetic */ aicm a;

    public aicl(aicm aicmVar) {
        this.a = aicmVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        aicm aicmVar = this.a;
        aicmVar.i(aicmVar.a, false);
        this.a.removeOnLayoutChangeListener(this);
    }
}
