package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: kpj  reason: default package */
/* loaded from: classes3.dex */
final class kpj implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ kpm a;

    public kpj(kpm kpmVar) {
        this.a = kpmVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object selectedItem = adapterView.getSelectedItem();
        if (selectedItem instanceof aqrc) {
            aqrc aqrcVar = (aqrc) selectedItem;
            if ((aqrcVar.b & 4096) != 0) {
                aafo aafoVar = this.a.a;
                apzg apzgVar = aqrcVar.j;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
            }
            if ((aqrcVar.b & 4096) != 0) {
                int bX = awwc.bX(aqrcVar.c == 6 ? ((Integer) aqrcVar.d).intValue() : 0);
                if (bX == 2 || bX == 3) {
                    this.a.c(1);
                }
            }
        }
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.a.c;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
