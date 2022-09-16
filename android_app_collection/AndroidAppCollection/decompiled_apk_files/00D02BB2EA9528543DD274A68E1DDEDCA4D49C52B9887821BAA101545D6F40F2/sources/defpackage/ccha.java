package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: ccha  reason: default package */
/* loaded from: classes4.dex */
final class ccha implements DialogInterface.OnClickListener {
    final /* synthetic */ cchc a;

    public ccha(cchc cchcVar) {
        this.a = cchcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cchc cchcVar = this.a;
        if (!cchcVar.aD) {
            return;
        }
        if (i == -1) {
            if (!cchcVar.bg()) {
                return;
            }
            this.a.i();
        } else if (!cchcVar.bg()) {
        } else {
            this.a.J().g().e();
        }
    }
}
