package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: znx  reason: default package */
/* loaded from: classes7.dex */
public final class znx implements View.OnLayoutChangeListener {
    private final efc a;

    public znx(efc efcVar) {
        this.a = efcVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        egu c = this.a.c();
        if (c == null || (view2 = c.K) == null) {
            return;
        }
        view.setTranslationY(view2.getHeight() - c.i());
    }
}
