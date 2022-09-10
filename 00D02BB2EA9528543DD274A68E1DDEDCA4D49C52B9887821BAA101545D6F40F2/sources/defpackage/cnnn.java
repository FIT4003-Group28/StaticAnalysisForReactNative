package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cnnn  reason: default package */
/* loaded from: classes.dex */
public final class cnnn extends ex {
    public Dialog ad;
    public DialogInterface.OnCancelListener ae;
    private Dialog af;

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ae;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // defpackage.ex
    public final Dialog q(Bundle bundle) {
        Dialog dialog = this.ad;
        if (dialog == null) {
            this.c = false;
            if (this.af == null) {
                this.af = new AlertDialog.Builder(J()).create();
            }
            return this.af;
        }
        return dialog;
    }
}
