package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caam  reason: default package */
/* loaded from: classes4.dex */
public final class caam implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ caaw b;

    public caam(caaw caawVar, View view) {
        this.b = caawVar;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        cqtv d;
        if (i3 == i7) {
            return;
        }
        this.b.aV.onPreDraw();
        caaw caawVar = this.b;
        cabd cabdVar = caawVar.ae;
        if (caawVar.be == 0) {
            d = cqsg.g(cqrp.c(this.a.getHeight()), cqrp.d(5.0d));
        } else {
            d = cqsg.d(caawVar.aT(), this.b.aU());
        }
        cabdVar.s(d);
    }
}
