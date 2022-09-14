package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: arqj  reason: default package */
/* loaded from: classes2.dex */
final class arqj implements DialogInterface.OnClickListener {
    final /* synthetic */ cjql a;
    final /* synthetic */ arqk b;

    public arqj(arqk arqkVar, cjql cjqlVar) {
        this.b = arqkVar;
        this.a = cjqlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.b.j(this.a, cjtd.a(dtxv.ac));
        dialogInterface.dismiss();
    }
}
