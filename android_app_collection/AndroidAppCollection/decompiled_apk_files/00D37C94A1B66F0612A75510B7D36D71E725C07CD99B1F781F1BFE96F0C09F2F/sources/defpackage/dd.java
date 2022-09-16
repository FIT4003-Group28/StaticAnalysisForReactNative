package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dd  reason: default package */
/* loaded from: classes3.dex */
public final class dd implements DialogInterface.OnCancelListener {
    final /* synthetic */ dh a;

    public dd(dh dhVar) {
        this.a = dhVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dh dhVar = this.a;
        Dialog dialog = dhVar.d;
        if (dialog != null) {
            dhVar.onCancel(dialog);
        }
    }
}
