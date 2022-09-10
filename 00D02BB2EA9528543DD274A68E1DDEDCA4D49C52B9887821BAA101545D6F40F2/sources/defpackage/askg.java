package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: askg  reason: default package */
/* loaded from: classes2.dex */
final class askg implements DialogInterface.OnClickListener {
    final /* synthetic */ askm a;

    public askg(askm askmVar) {
        this.a = askmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        askm askmVar = this.a;
        if (askmVar.an) {
            askmVar.af.i(cjtd.a(dtxw.ar));
        } else if (askmVar.ao) {
            askmVar.af.i(cjtd.a(dtxj.dt));
        } else if (askmVar.ap) {
            askmVar.af.i(cjtd.a(dtxj.f11do));
        }
        askl asklVar = this.a.ad;
        if (asklVar != null) {
            asklVar.a();
        }
    }
}
