package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afzc  reason: default package */
/* loaded from: classes2.dex */
public final class afzc implements View.OnLayoutChangeListener {
    final /* synthetic */ afzm a;

    public afzc(afzm afzmVar) {
        this.a = afzmVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (i8 - i6 != i9) {
            this.a.au.I(i9);
            afzm afzmVar = this.a;
            if (!afzmVar.aw) {
                return;
            }
            afzmVar.au.F(false);
        }
    }
}
