package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vrl  reason: default package */
/* loaded from: classes7.dex */
public final class vrl implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ dcdc a;
    final /* synthetic */ vrn b;

    public vrl(vrn vrnVar, dcdc dcdcVar) {
        this.b = vrnVar;
        this.a = dcdcVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        vrn vrnVar = this.b;
        if (vrnVar.a != null) {
            vrnVar.b = (vqx) this.a.get(i);
        }
        cqkx.p(this.b);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
