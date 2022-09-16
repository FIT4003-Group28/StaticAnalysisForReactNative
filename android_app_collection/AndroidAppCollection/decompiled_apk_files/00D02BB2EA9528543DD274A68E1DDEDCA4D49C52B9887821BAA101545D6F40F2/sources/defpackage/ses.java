package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.RadioButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ses  reason: default package */
/* loaded from: classes7.dex */
public final class ses extends cqqw {
    final /* synthetic */ seu a;

    public ses(seu seuVar) {
        this.a = seuVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        this.a.b.QA(recyclerView, i);
        if (i == 0) {
            rqg rqgVar = (rqg) recyclerView.l;
            int k = rqgVar.k();
            seu seuVar = this.a;
            seuVar.c = k;
            seuVar.a.a(true);
            this.a.i(k);
            int k2 = rqgVar.k();
            int i2 = 0;
            while (i2 < rqgVar.aJ()) {
                ((RadioButton) rqgVar.aK(i2)).setChecked(i2 == k2);
                i2++;
            }
            RadioButton radioButton = (RadioButton) rqgVar.I(k);
            radioButton.setChecked(true);
            radioButton.sendAccessibilityEvent(8);
            radioButton.sendAccessibilityEvent(4);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.a.c = ((rqg) recyclerView.l).k();
        this.a.a.a(false);
    }
}
