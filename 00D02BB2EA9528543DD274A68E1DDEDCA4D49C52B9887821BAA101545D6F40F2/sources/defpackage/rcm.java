package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: rcm  reason: default package */
/* loaded from: classes7.dex */
final class rcm implements View.OnLayoutChangeListener {
    final /* synthetic */ rcn a;

    public rcm(rcn rcnVar) {
        this.a = rcnVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        jdi jdiVar = this.a.b;
        if (jdiVar == null) {
            return;
        }
        jdiVar.f();
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        this.a.f(bzmk.VISIBLE);
    }
}
