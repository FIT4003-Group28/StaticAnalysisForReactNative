package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: qqd  reason: default package */
/* loaded from: classes7.dex */
final class qqd implements View.OnLayoutChangeListener {
    final /* synthetic */ qqf a;

    public qqd(qqf qqfVar) {
        this.a = qqfVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        jdi jdiVar = this.a.a;
        if (jdiVar == null) {
            return;
        }
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        jdiVar.f();
        this.a.f(bzmk.VISIBLE);
    }
}
