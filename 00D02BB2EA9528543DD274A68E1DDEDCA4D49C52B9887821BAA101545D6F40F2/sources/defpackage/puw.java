package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: puw  reason: default package */
/* loaded from: classes7.dex */
public final class puw implements View.OnLayoutChangeListener {
    final /* synthetic */ puy a;

    public puw(puy puyVar) {
        this.a = puyVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.bq();
        this.a.br();
    }
}
