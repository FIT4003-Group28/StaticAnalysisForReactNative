package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: att  reason: default package */
/* loaded from: classes2.dex */
final class att implements DialogInterface.OnClickListener {
    final /* synthetic */ atu a;

    public att(atu atuVar) {
        this.a = atuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        atu atuVar = this.a;
        atuVar.ad = i;
        atuVar.ah = -1;
        dialogInterface.dismiss();
    }
}
