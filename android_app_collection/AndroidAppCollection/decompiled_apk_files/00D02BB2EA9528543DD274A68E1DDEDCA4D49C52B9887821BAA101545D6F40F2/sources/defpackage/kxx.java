package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kxx  reason: default package */
/* loaded from: classes7.dex */
final class kxx implements View.OnLayoutChangeListener {
    final /* synthetic */ kya a;

    public kxx(kya kyaVar) {
        this.a = kyaVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.c(true, view.isAttachedToWindow());
    }
}
