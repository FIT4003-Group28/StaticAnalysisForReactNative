package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: bpyq  reason: default package */
/* loaded from: classes4.dex */
final class bpyq implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ bpyr a;

    public bpyq(bpyr bpyrVar) {
        this.a = bpyrVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i > 0) {
            dnfa.a();
            if (i >= 5) {
                return;
            }
            bpyp bpypVar = bpyp.values()[i];
            bpyr bpyrVar = this.a;
            bqgw bqgwVar = bpyrVar.a;
            int i2 = bqgwVar.f;
            int i3 = bpypVar.f;
            if (i2 == 0) {
                throw null;
            }
            if (i2 == i3) {
                return;
            }
            bqgwVar.f = i3;
            cqkx.p(bpyrVar);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
