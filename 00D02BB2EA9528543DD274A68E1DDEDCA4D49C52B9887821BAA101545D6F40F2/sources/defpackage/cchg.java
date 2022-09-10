package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cchg  reason: default package */
/* loaded from: classes4.dex */
final class cchg implements DialogInterface.OnCancelListener {
    final /* synthetic */ cchj a;

    public cchg(cchj cchjVar) {
        this.a = cchjVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.a.bg()) {
            this.a.J().g().e();
        }
    }
}
