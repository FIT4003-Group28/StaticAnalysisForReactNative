package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bngb  reason: default package */
/* loaded from: classes3.dex */
final class bngb implements View.OnClickListener {
    final /* synthetic */ bngc a;

    public bngb(bngc bngcVar) {
        this.a = bngcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cdje e = cdjf.e();
        e.c(chbv.NEVER_SHOW);
        ((cdit) e).b = this.a.a;
        cdjf a = e.a();
        cdjj cdjjVar = (cdjj) this.a.b.a();
        if (cdjjVar != null) {
            cdjjVar.a(this.a.c, a);
        }
    }
}
