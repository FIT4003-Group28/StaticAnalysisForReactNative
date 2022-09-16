package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ief  reason: default package */
/* loaded from: classes3.dex */
final class ief implements View.OnLayoutChangeListener {
    final /* synthetic */ ieh a;

    public ief(ieh iehVar) {
        this.a = iehVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.c.setY(i4);
    }
}
