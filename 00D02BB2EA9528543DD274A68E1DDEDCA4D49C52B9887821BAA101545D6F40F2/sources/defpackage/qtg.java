package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: qtg  reason: default package */
/* loaded from: classes7.dex */
final class qtg implements View.OnLayoutChangeListener {
    final /* synthetic */ qtj a;

    public qtg(qtj qtjVar) {
        this.a = qtjVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        for (mw<Integer> mwVar : this.a.g) {
            mwVar.a(Integer.valueOf(i9));
        }
    }
}
