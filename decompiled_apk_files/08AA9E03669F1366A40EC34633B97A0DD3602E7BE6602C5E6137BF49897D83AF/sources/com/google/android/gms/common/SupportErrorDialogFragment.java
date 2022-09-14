package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.n;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes.dex */
public class SupportErrorDialogFragment extends h {
    private Dialog mDialog = null;
    private DialogInterface.OnCancelListener zzap = null;

    public static SupportErrorDialogFragment newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.mDialog = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.zzap = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // android.support.v4.app.h, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.zzap != null) {
            this.zzap.onCancel(dialogInterface);
        }
    }

    @Override // android.support.v4.app.h
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.mDialog == null) {
            setShowsDialog(false);
        }
        return this.mDialog;
    }

    @Override // android.support.v4.app.h
    public void show(n nVar, String str) {
        super.show(nVar, str);
    }
}
