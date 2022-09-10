package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: arra  reason: default package */
/* loaded from: classes2.dex */
final class arra implements DialogInterface.OnClickListener {
    final /* synthetic */ cjql a;
    final /* synthetic */ arrb b;

    public arra(arrb arrbVar, cjql cjqlVar) {
        this.b = arrbVar;
        this.a = cjqlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.b.j(this.a, cjtd.a(dtxv.am));
        this.b.a.h();
        dialogInterface.dismiss();
    }
}
