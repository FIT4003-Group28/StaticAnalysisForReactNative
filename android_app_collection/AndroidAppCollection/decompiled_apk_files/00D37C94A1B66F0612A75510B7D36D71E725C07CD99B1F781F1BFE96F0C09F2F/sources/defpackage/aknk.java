package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aknk  reason: default package */
/* loaded from: classes.dex */
final class aknk implements View.OnLayoutChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ aknr b;

    public aknk(aknr aknrVar, int i) {
        this.b = aknrVar;
        this.a = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.b.ag.getHeight() != this.a) {
            this.b.ag.removeOnLayoutChangeListener(this);
            this.b.aI(false);
        }
    }
}
