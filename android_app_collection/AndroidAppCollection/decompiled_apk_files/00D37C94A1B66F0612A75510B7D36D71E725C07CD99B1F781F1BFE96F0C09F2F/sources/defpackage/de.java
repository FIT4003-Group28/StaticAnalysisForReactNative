package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: de  reason: default package */
/* loaded from: classes3.dex */
public final class de implements DialogInterface.OnDismissListener {
    final /* synthetic */ dh a;

    public de(dh dhVar) {
        this.a = dhVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dh dhVar = this.a;
        Dialog dialog = dhVar.d;
        if (dialog != null) {
            dhVar.onDismiss(dialog);
        }
    }
}
