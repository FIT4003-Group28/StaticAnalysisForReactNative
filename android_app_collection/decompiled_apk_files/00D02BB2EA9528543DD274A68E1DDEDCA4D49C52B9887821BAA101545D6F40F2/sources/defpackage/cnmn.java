package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cnmn  reason: default package */
/* loaded from: classes.dex */
public final class cnmn extends DialogFragment {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    private Dialog c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.c == null) {
                this.c = new AlertDialog.Builder(getActivity()).create();
            }
            return this.c;
        }
        return dialog;
    }
}
