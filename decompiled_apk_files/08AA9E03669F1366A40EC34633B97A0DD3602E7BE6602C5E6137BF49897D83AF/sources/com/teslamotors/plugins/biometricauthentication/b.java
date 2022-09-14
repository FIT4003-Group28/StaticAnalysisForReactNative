package com.teslamotors.plugins.biometricauthentication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.teslamotors.plugins.biometricauthentication.c;
import d.a.b.a;
import d.a.d.a;
/* compiled from: FingerprintAuthenticationDialogFragment.java */
@TargetApi(23)
/* loaded from: classes.dex */
public class b extends DialogFragment implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private Button f5138a;

    /* renamed from: b  reason: collision with root package name */
    private Button f5139b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f5140c;

    /* renamed from: d  reason: collision with root package name */
    private c f5141d;
    private af e;
    private boolean f = false;

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        setStyle(0, 16974545);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f = false;
        String string = getArguments().getString("title", "");
        String string2 = getArguments().getString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE, "");
        String string3 = getArguments().getString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_FALLBACK_TITLE);
        if (string.isEmpty() && !string2.isEmpty()) {
            string2 = "";
            string = string2;
        }
        Dialog dialog = getDialog();
        dialog.setTitle(string);
        dialog.setCanceledOnTouchOutside(false);
        View inflate = layoutInflater.inflate(a.d.fingerprint_dialog_container, viewGroup, false);
        this.f5140c = (TextView) inflate.findViewById(a.c.fingerprint_message);
        if (string2.isEmpty()) {
            this.f5140c.setVisibility(8);
        } else {
            this.f5140c.setText(string2);
        }
        this.f5138a = (Button) inflate.findViewById(a.c.cancel_button);
        this.f5138a.setText(getString(a.C0122a.biometric_fingerprint_cancel_button));
        this.f5138a.setOnClickListener(new View.OnClickListener() { // from class: com.teslamotors.plugins.biometricauthentication.b.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!b.this.f) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString(BiometricAuthenticationModule.RESULT, BiometricAuthenticationModule.BIOMETRICS_ERROR_USER_CANCELLED);
                    b.this.e.a(writableNativeMap);
                    b.this.f = true;
                }
                b.this.dismiss();
            }
        });
        this.f5139b = (Button) inflate.findViewById(a.c.second_dialog_button);
        this.f5139b.setText(string3);
        this.f5139b.setOnClickListener(new View.OnClickListener() { // from class: com.teslamotors.plugins.biometricauthentication.b.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!b.this.f) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString(BiometricAuthenticationModule.RESULT, BiometricAuthenticationModule.BIOMETRICS_ERROR_USER_SELECTED_FALLBACK);
                    b.this.e.a(writableNativeMap);
                    b.this.f = true;
                }
                b.this.dismiss();
            }
        });
        this.f5141d = new c((FingerprintManager) getContext().getSystemService("fingerprint"), (ImageView) inflate.findViewById(a.c.fingerprint_icon), (TextView) inflate.findViewById(a.c.fingerprint_status), this.f5139b, this.f5138a, this);
        return inflate;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f5141d.a((FingerprintManager.CryptoObject) null);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        dismiss();
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.teslamotors.plugins.biometricauthentication.c.a
    public void a() {
        if (!this.f) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(BiometricAuthenticationModule.RESULT, BiometricAuthenticationModule.BIOMETRICS_ERROR_NO_ERROR);
            this.e.a(writableNativeMap);
            this.f = true;
        }
        dismiss();
    }

    @Override // com.teslamotors.plugins.biometricauthentication.c.a
    public void b() {
        this.f5141d.a();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(BiometricAuthenticationModule.RESULT, BiometricAuthenticationModule.BIOMETRICS_ERROR_USER_CANCELLED);
            this.e.a(writableNativeMap);
            this.f = true;
        }
        this.f5141d.a();
    }

    public void a(af afVar) {
        this.e = afVar;
    }
}
