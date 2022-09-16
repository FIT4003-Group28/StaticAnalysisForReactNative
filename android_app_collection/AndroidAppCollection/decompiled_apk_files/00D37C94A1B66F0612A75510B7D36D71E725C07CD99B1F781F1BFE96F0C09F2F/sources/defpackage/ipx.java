package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ipx  reason: default package */
/* loaded from: classes3.dex */
final class ipx implements View.OnLayoutChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ iqa b;

    public ipx(iqa iqaVar, int i) {
        this.b = iqaVar;
        this.a = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.b.ah.getHeight() != this.a) {
            this.b.ah.removeOnLayoutChangeListener(this);
            this.b.aI(false);
        }
    }
}
