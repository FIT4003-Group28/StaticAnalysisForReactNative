package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bnlw  reason: default package */
/* loaded from: classes3.dex */
final class bnlw implements View.OnLayoutChangeListener {
    final /* synthetic */ bnlx a;

    public bnlw(bnlx bnlxVar) {
        this.a = bnlxVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        this.a.a.j();
    }
}
