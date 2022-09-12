package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: uif  reason: default package */
/* loaded from: classes7.dex */
final class uif implements View.OnLayoutChangeListener {
    final /* synthetic */ uig a;

    public uif(uig uigVar) {
        this.a = uigVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        uil uilVar = this.a.f;
        if (uilVar != null) {
            uilVar.c(view.getHeight());
        }
    }
}
