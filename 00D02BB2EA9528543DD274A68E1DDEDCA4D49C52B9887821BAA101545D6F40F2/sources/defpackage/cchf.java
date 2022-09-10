package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cchf  reason: default package */
/* loaded from: classes4.dex */
final class cchf implements DialogInterface.OnClickListener {
    final /* synthetic */ cchj a;

    public cchf(cchj cchjVar) {
        this.a = cchjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cchj cchjVar = this.a;
        if (!cchjVar.aD) {
            return;
        }
        if (i == -1) {
            if (!cchjVar.bg()) {
                return;
            }
            this.a.q();
            this.a.g.n(cchi.CHECKING);
        } else if (!cchjVar.bg()) {
        } else {
            this.a.J().g().e();
        }
    }
}
