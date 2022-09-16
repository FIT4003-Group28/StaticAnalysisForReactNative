package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: qsg  reason: default package */
/* loaded from: classes4.dex */
public final class qsg extends dh {
    public Dialog ae;
    public DialogInterface.OnCancelListener af;
    private Dialog ag;

    @Override // defpackage.dh, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.af;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog dialog = this.ae;
        if (dialog == null) {
            this.c = false;
            if (this.ag == null) {
                Context rb = rb();
                qnm.b(rb);
                this.ag = new AlertDialog.Builder(rb).create();
            }
            return this.ag;
        }
        return dialog;
    }
}
