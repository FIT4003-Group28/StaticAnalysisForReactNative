package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: qth  reason: default package */
/* loaded from: classes7.dex */
final class qth implements View.OnLayoutChangeListener {
    final /* synthetic */ qtj a;

    public qth(qtj qtjVar) {
        this.a = qtjVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mw<Integer> mwVar;
        int i9 = i4 - i2;
        if (i9 == i8 - i6 || (mwVar = this.a.e) == null) {
            return;
        }
        mwVar.a(Integer.valueOf(i9));
    }
}
