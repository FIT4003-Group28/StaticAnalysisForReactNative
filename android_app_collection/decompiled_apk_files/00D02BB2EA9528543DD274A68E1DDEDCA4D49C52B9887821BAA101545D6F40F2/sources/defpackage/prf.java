package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: prf  reason: default package */
/* loaded from: classes7.dex */
final class prf implements View.OnLayoutChangeListener {
    final /* synthetic */ prh a;

    public prf(prh prhVar) {
        this.a = prhVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        jdi jdiVar = this.a.b;
        if (jdiVar == null) {
            return;
        }
        jdiVar.f();
    }
}
