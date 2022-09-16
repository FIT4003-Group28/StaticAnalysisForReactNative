package com.teslamotors.plugins.biometricauthentication;

import android.annotation.TargetApi;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import d.a.b.a;
import d.a.d.a;
/* compiled from: FingerprintUiHelper.java */
@TargetApi(23)
/* loaded from: classes.dex */
public class c extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a  reason: collision with root package name */
    Runnable f5144a = new Runnable() { // from class: com.teslamotors.plugins.biometricauthentication.c.3
        @Override // java.lang.Runnable
        public void run() {
            c.this.f5147d.setTextColor(c.this.f5147d.getResources().getColor(a.C0120a.hint_color, null));
            c.this.f5147d.setText(c.this.f5147d.getResources().getString(a.C0122a.biometric_fingerprint_hint));
            c.this.f5146c.setImageResource(a.b.ic_fp_40px);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final FingerprintManager f5145b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f5146c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f5147d;
    private Button e;
    private Button f;
    private a g;
    private CancellationSignal h;
    private boolean i;

    /* compiled from: FingerprintUiHelper.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public c(FingerprintManager fingerprintManager, ImageView imageView, TextView textView, Button button, Button button2, a aVar) {
        this.f5146c = imageView;
        this.f5147d = textView;
        this.e = button;
        this.f = button2;
        this.g = aVar;
        this.f5145b = fingerprintManager;
    }

    public void a(FingerprintManager.CryptoObject cryptoObject) {
        this.h = new CancellationSignal();
        this.i = false;
        this.f5145b.authenticate(cryptoObject, this.h, 0, this, null);
        this.f5146c.setImageResource(a.b.ic_fp_40px);
    }

    public void a() {
        if (this.h != null) {
            this.i = true;
            this.h.cancel();
            this.h = null;
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.i || i == 5) {
            return;
        }
        a(charSequence, i == 7);
        this.f5146c.postDelayed(new Runnable() { // from class: com.teslamotors.plugins.biometricauthentication.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.g.b();
            }
        }, 1600L);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        a(charSequence, false);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationFailed() {
        a(this.f5146c.getResources().getString(a.C0122a.biometric_fingerprint_not_recognized), false);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.f5147d.removeCallbacks(this.f5144a);
        this.f5146c.setImageResource(a.b.ic_fingerprint_success);
        this.f5147d.setTextColor(this.f5147d.getResources().getColor(a.C0120a.success_color, null));
        this.f5147d.setText(this.f5147d.getResources().getString(a.C0122a.biometric_fingerprint_success));
        this.e.setEnabled(false);
        this.f.setEnabled(false);
        this.f5146c.postDelayed(new Runnable() { // from class: com.teslamotors.plugins.biometricauthentication.c.2
            @Override // java.lang.Runnable
            public void run() {
                c.this.g.a();
            }
        }, 1300L);
    }

    private void a(CharSequence charSequence, boolean z) {
        this.f5146c.setImageResource(a.b.ic_fingerprint_error);
        this.f5147d.setText(charSequence);
        this.f5147d.setTextColor(this.f5147d.getResources().getColor(a.C0120a.warning_color, null));
        this.f5147d.removeCallbacks(this.f5144a);
        if (!z) {
            this.f5147d.postDelayed(this.f5144a, 1600L);
        }
    }
}
