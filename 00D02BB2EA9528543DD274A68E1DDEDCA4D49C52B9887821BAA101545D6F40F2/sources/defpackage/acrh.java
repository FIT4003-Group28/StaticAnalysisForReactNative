package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: acrh  reason: default package */
/* loaded from: classes2.dex */
final class acrh implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ acrk a;

    public acrh(acrk acrkVar) {
        this.a = acrkVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        acrk acrkVar = this.a;
        if (i == acrkVar.d) {
            return;
        }
        acrkVar.d(i);
        this.a.a.m(new cjte(deaf.TAP), cjtd.a(dtxk.R));
        acro acroVar = (acro) this.a.c;
        if (!acroVar.a.j(i)) {
            return;
        }
        cqkx.p(acroVar.a);
        cqkx.p(acroVar.a.d);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
