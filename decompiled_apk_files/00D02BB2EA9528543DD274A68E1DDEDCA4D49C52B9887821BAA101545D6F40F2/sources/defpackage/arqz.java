package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: arqz  reason: default package */
/* loaded from: classes2.dex */
final class arqz implements DialogInterface.OnClickListener {
    final /* synthetic */ cjql a;
    final /* synthetic */ arrb b;

    public arqz(arrb arrbVar, cjql cjqlVar) {
        this.b = arrbVar;
        this.a = cjqlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.b.j(this.a, cjtd.a(dtxv.al));
        this.b.a.g();
        dialogInterface.dismiss();
    }
}
