package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjod  reason: default package */
/* loaded from: classes4.dex */
final class cjod implements View.OnLayoutChangeListener {
    final /* synthetic */ cjoo a;

    public cjod(cjoo cjooVar) {
        this.a = cjooVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (i8 - i6 != i9) {
            ahin ahinVar = this.a.aR;
            if (ahinVar != null) {
                ahinVar.I(i9);
            }
            this.a.aT.n(i9);
            cjoo cjooVar = this.a;
            if (!cjooVar.aY) {
                return;
            }
            ahin ahinVar2 = cjooVar.aR;
            if (ahinVar2 != null) {
                ahinVar2.F(false);
            }
            cqkx.p(this.a.aT);
        }
    }
}
