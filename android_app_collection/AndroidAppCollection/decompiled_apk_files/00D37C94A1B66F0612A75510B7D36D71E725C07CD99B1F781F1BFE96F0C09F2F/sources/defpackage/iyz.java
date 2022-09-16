package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iyz  reason: default package */
/* loaded from: classes3.dex */
public final class iyz implements View.OnLayoutChangeListener {
    final /* synthetic */ iza a;

    public iyz(iza izaVar) {
        this.a = izaVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 != i8 - i6) {
            this.a.b();
        }
    }
}
