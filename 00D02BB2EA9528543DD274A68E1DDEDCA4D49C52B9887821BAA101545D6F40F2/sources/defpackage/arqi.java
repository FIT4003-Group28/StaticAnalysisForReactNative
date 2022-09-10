package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: arqi  reason: default package */
/* loaded from: classes2.dex */
final class arqi implements DialogInterface.OnClickListener {
    final /* synthetic */ cjql a;
    final /* synthetic */ String b;
    final /* synthetic */ arqk c;

    public arqi(arqk arqkVar, cjql cjqlVar, String str) {
        this.c = arqkVar;
        this.a = cjqlVar;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.c.b.j(this.a, cjtd.a(dtxv.ab));
        arqu arquVar = this.c.a;
        String str = this.b;
        arquVar.b.ac(bvjk.jf, str);
        if (!str.equals(arquVar.p())) {
            arquVar.r();
        } else {
            arquVar.d.j();
        }
        dialogInterface.dismiss();
    }
}
