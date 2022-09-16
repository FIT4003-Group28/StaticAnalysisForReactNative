package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.l;
/* loaded from: classes.dex */
public class SupportErrorDialogFragment extends DialogFragment {
    private Dialog k0 = null;
    private DialogInterface.OnCancelListener l0 = null;

    public static SupportErrorDialogFragment a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        com.google.android.gms.common.internal.s.a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.k0 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.l0 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void a(l lVar, String str) {
        super.a(lVar, str);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog n(Bundle bundle) {
        if (this.k0 == null) {
            i(false);
        }
        return this.k0;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.l0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
