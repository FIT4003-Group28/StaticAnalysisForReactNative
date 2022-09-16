package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: knd  reason: default package */
/* loaded from: classes3.dex */
final class knd implements View.OnLayoutChangeListener {
    final /* synthetic */ kne a;

    public knd(kne kneVar) {
        this.a = kneVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        kne kneVar = this.a;
        kneVar.i = i4 - i2 > i3 - i;
        kneVar.d();
    }
}
