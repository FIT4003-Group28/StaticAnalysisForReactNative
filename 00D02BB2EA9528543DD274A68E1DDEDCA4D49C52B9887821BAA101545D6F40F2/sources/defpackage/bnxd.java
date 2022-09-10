package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bnxd  reason: default package */
/* loaded from: classes3.dex */
final class bnxd implements DialogInterface.OnClickListener {
    final /* synthetic */ bnxf a;

    public bnxd(bnxf bnxfVar) {
        this.a = bnxfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            bnxi bnxiVar = this.a.a;
            ilo iloVar = bnxiVar.a;
            dbsk.s(iloVar);
            bnxiVar.aJ(iloVar);
        }
    }
}
