package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cslv  reason: default package */
/* loaded from: classes5.dex */
final class cslv implements View.OnLayoutChangeListener {
    final /* synthetic */ csme a;

    public cslv(csme csmeVar) {
        this.a = csmeVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.b();
        csme csmeVar = this.a;
        csmeVar.e(csmeVar.m());
        this.a.removeOnLayoutChangeListener(this);
    }
}
