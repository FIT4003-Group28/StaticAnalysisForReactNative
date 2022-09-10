package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: bpcx  reason: default package */
/* loaded from: classes3.dex */
final class bpcx implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ bpcz a;

    public bpcx(bpcz bpczVar) {
        this.a = bpczVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i < 0 || i >= bpcz.a.size()) {
            return;
        }
        bpcz bpczVar = this.a;
        if (i == bpczVar.c) {
            return;
        }
        bpczVar.c = i;
        bpczVar.b.e = bpcz.a.get(this.a.c).b();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
