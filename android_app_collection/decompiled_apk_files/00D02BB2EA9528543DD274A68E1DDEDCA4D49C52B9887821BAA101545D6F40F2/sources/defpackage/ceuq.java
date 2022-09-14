package defpackage;

import android.view.View;
import android.widget.AdapterView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ceuq  reason: default package */
/* loaded from: classes4.dex */
public final class ceuq implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ceus a;

    public ceuq(ceus ceusVar) {
        this.a = ceusVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ceus ceusVar = this.a;
        ceusVar.l(adapterView);
        cerv<T> cervVar = (cerv) ceusVar.b.getItem(i);
        if (cervVar == 0) {
            return;
        }
        cjql cjqlVar = ceusVar.c.get(i);
        if (cjqlVar != null) {
            ceusVar.a.n(cjqlVar, new cjte(deaf.TAP), cervVar.c);
        }
        if (cervVar == ceusVar.e) {
            return;
        }
        ceusVar.e = cervVar;
        cexc cexcVar = (cexc) ceusVar.d;
        cefe cefeVar = (cefe) cexcVar.a.f;
        djbl djblVar = (djbl) cefeVar.b;
        dsqp dsqpVar = (dsqp) djblVar.cu(5);
        dsqpVar.bC(djblVar);
        djbi djbiVar = (djbi) dsqpVar;
        djbk djbkVar = ((cerw) cervVar.b).g;
        if (djbiVar.c) {
            djbiVar.bF();
            djbiVar.c = false;
        }
        djbl djblVar2 = (djbl) djbiVar.b;
        djbl djblVar3 = djbl.e;
        djbkVar.getClass();
        djblVar2.b = djbkVar;
        djblVar2.a |= 1;
        cefeVar.b = djbiVar.bK();
        cefeVar.h();
        cexcVar.a.c.clear();
        cqkx.p(cexcVar.a);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        this.a.l(adapterView);
    }
}
