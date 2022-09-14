package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ytf  reason: default package */
/* loaded from: classes7.dex */
public final class ytf implements View.OnLayoutChangeListener {
    final /* synthetic */ yth a;

    public ytf(yth ythVar) {
        this.a = ythVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.f();
        view.removeOnLayoutChangeListener(this);
    }
}
