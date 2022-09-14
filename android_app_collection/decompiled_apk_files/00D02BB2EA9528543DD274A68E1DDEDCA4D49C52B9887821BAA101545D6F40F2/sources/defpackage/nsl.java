package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: nsl  reason: default package */
/* loaded from: classes7.dex */
final class nsl implements View.OnLayoutChangeListener {
    final /* synthetic */ nsm a;

    public nsl(nsm nsmVar) {
        this.a = nsmVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        nsm nsmVar = this.a;
        nsmVar.setFocusCenter(nsmVar.a);
    }
}
