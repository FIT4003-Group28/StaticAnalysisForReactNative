package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: btfd  reason: default package */
/* loaded from: classes4.dex */
final class btfd implements DialogInterface.OnClickListener {
    final /* synthetic */ dcdc a;
    final /* synthetic */ btff b;

    public btfd(btff btffVar, dcdc dcdcVar) {
        this.b = btffVar;
        this.a = dcdcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cqkp b = ((cqix) this.a.get(i)).b();
        if (b instanceof btfn) {
            this.b.ae = ((btfn) b).d();
            this.b.ah = -1;
        }
        dialogInterface.dismiss();
    }
}
