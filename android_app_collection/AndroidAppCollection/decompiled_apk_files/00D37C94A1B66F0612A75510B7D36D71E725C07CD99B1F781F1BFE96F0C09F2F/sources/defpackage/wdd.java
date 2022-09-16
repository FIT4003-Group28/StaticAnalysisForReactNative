package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wdd  reason: default package */
/* loaded from: classes4.dex */
final class wdd extends FingerprintManager.AuthenticationCallback {
    private final wda a;

    public wdd(wda wdaVar) {
        this.a = wdaVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((wbn) this.a).f();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        wbn wbnVar = (wbn) this.a;
        if (wbnVar.e > 0) {
            zag.m(wbnVar.c, wbnVar.a.getString(R.string.retry_fingerprint));
            wbnVar.e--;
            return;
        }
        wbnVar.f();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        final wbn wbnVar = (wbn) this.a;
        wbnVar.b.setImageResource(2131232506);
        wbnVar.g();
        wbnVar.b.postDelayed(new Runnable() { // from class: wbl
            @Override // java.lang.Runnable
            public final void run() {
                wbn.this.d.j(1);
            }
        }, 500L);
    }
}
