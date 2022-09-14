package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.facebook.react.modules.dialog.DialogModule;
/* loaded from: classes.dex */
public class AlertFragment extends DialogFragment implements DialogInterface.OnClickListener {
    private final DialogModule.b k0;

    public AlertFragment() {
        this.k0 = null;
    }

    @SuppressLint({"ValidFragment"})
    public AlertFragment(DialogModule.b bVar, Bundle bundle) {
        this.k0 = bVar;
        m(bundle);
    }

    public static Dialog a(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return title.create();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog n(Bundle bundle) {
        return a(g(), l(), this);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        DialogModule.b bVar = this.k0;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.b bVar = this.k0;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }
}
