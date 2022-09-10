package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: ccgz  reason: default package */
/* loaded from: classes4.dex */
final class ccgz implements DialogInterface.OnClickListener {
    final /* synthetic */ cchc a;

    public ccgz(cchc cchcVar) {
        this.a = cchcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.bg()) {
            this.a.J().g().e();
            this.a.e.k(null, dkcp.CONTRIBUTE);
        }
    }
}
