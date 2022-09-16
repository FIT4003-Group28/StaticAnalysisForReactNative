package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cchb  reason: default package */
/* loaded from: classes4.dex */
final class cchb implements DialogInterface.OnCancelListener {
    final /* synthetic */ cchc a;

    public cchb(cchc cchcVar) {
        this.a = cchcVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.a.bg()) {
            this.a.J().g().e();
        }
    }
}
