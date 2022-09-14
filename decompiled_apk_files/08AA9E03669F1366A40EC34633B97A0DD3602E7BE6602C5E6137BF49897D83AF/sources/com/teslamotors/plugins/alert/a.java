package com.teslamotors.plugins.alert;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.teslamotors.plugins.alert.AlertPromptModule;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
import d.a.a.a;
import java.util.Arrays;
import java.util.List;
/* compiled from: AlertFragment.java */
@SuppressLint({"ValidFragment"})
/* loaded from: classes.dex */
public class a extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f5135a = Arrays.asList("login-password", "secure-text");

    /* renamed from: b  reason: collision with root package name */
    private final AlertPromptModule.a f5136b;

    public a() {
        this.f5136b = null;
    }

    @SuppressLint({"ValidFragment"})
    public a(AlertPromptModule.a aVar, Bundle bundle) {
        this.f5136b = aVar;
        setArguments(bundle);
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
        if (bundle.containsKey(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE)) {
            title.setMessage(bundle.getString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        if (bundle.containsKey("alert_type")) {
            View inflate = LayoutInflater.from(context).inflate(a.b.alert_prompt_dialog_fragment, (ViewGroup) null);
            boolean contains = f5135a.contains(bundle.getString("alert_type", "default"));
            EditText editText = (EditText) inflate.findViewById(a.C0119a.inputValue);
            if (contains) {
                editText.setInputType(GmsClientSupervisor.DEFAULT_BIND_FLAGS);
                editText.setSelection(editText.getText().length());
            }
            if (bundle.containsKey("default_value")) {
                editText.setHint(bundle.getString("default_value"));
            }
            title.setView(inflate);
        }
        return title.create();
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog a2 = a(getActivity(), getArguments(), this);
        a2.getWindow().setSoftInputMode(4);
        return a2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f5136b != null) {
            EditText editText = (EditText) ((AlertDialog) dialogInterface).findViewById(a.C0119a.inputValue);
            String str = null;
            if (editText != null) {
                str = editText.getText().toString();
            }
            this.f5136b.a(dialogInterface, i, str);
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f5136b != null) {
            this.f5136b.onDismiss(dialogInterface);
        }
    }
}
