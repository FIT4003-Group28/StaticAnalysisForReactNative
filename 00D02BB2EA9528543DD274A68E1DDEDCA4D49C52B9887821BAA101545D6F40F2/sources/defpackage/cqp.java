package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqp  reason: default package */
/* loaded from: classes5.dex */
public final class cqp implements DialogInterface.OnClickListener {
    final /* synthetic */ cqt a;

    public cqp(cqt cqtVar) {
        this.a = cqtVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cqz cqzVar;
        cqt cqtVar = this.a;
        if (cqtVar.aD && i == -1 && (cqzVar = cqtVar.aA) != null) {
            cqzVar.z().b(cjqm.a);
        }
    }
}
