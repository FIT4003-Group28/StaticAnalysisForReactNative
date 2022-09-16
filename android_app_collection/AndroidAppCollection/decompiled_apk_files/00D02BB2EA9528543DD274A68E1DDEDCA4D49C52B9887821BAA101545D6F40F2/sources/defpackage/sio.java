package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: sio  reason: default package */
/* loaded from: classes7.dex */
public final class sio implements View.OnLayoutChangeListener {
    private final mw<Integer> a;
    private boolean b = true;

    public sio(mw<Integer> mwVar) {
        this.a = mwVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (this.b) {
            this.b = false;
            this.a.a(Integer.valueOf(i9));
        } else if (i9 == i8 - i6) {
        } else {
            this.a.a(Integer.valueOf(i9));
        }
    }
}
