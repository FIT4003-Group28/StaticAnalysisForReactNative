package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: alow  reason: default package */
/* loaded from: classes.dex */
final class alow implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;

    public alow(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.getVisibility();
    }
}
