package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iqj  reason: default package */
/* loaded from: classes3.dex */
public final class iqj implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ iqp a;

    public iqj(iqp iqpVar) {
        this.a = iqpVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.s();
        Object selectedItem = adapterView.getSelectedItem();
        if (selectedItem instanceof aqrc) {
            iqp iqpVar = this.a;
            arag aragVar = ((aqrc) selectedItem).l;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            zag.m(iqpVar.al, aafv.a(aragVar, iqpVar.af, false));
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
