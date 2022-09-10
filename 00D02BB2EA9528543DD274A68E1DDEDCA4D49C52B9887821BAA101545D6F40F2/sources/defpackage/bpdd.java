package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: bpdd  reason: default package */
/* loaded from: classes3.dex */
final class bpdd implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ bpdf a;

    public bpdd(bpdf bpdfVar) {
        this.a = bpdfVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (!this.a.d.isEmpty() && this.a.e().booleanValue() && i >= 0 && i < this.a.d.size()) {
            bpdf bpdfVar = this.a;
            if (i == bpdfVar.b) {
                return;
            }
            bpdfVar.b = i;
            bpdfVar.c = bpdfVar.d.get(i).b();
            bpdf bpdfVar2 = this.a;
            bpdfVar2.a.b = bpdfVar2.c;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
