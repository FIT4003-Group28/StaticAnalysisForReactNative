package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: adm  reason: default package */
/* loaded from: classes.dex */
public final class adm extends dp {
    public final Handler a = new Handler(Looper.getMainLooper());
    public ady b;

    private final void aG() {
        this.b.i = false;
        if (ap()) {
            eo F = F();
            aei aeiVar = (aei) F.f("androidx.biometric.FingerprintDialogFragment");
            if (aeiVar == null) {
                return;
            }
            if (aeiVar.ap()) {
                aeiVar.ku();
                return;
            }
            ex l = F.l();
            l.m(aeiVar);
            l.k();
        }
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        super.S(i, i2, intent);
        if (i == 1) {
            this.b.k = false;
            if (i2 == -1) {
                new adr(null, 1);
                aF();
                return;
            }
            o(10, N(R.string.generic_error_user_canceled));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        if (!this.b.m) {
            if (s()) {
                this.b.h = i;
                if (i == 1) {
                    aE(adj.b(rb(), 10));
                }
            }
            aea f = this.b.f();
            CancellationSignal cancellationSignal = f.a;
            if (cancellationSignal != null) {
                try {
                    adz.b(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                f.a = null;
            }
            akl aklVar = f.b;
            if (aklVar == null) {
                return;
            }
            try {
                aklVar.a();
            } catch (NullPointerException e2) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
            }
            f.b = null;
        }
    }

    public final void aE(CharSequence charSequence) {
        ady adyVar = this.b;
        if (adyVar.k) {
            return;
        }
        if (!adyVar.j) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        adyVar.j = false;
        adyVar.j().execute(new adc(this, charSequence));
    }

    public final void aF() {
        ady adyVar = this.b;
        if (!adyVar.j) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            adyVar.j = false;
            adyVar.j().execute(new ade(this, 2));
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.b.i = false;
        aG();
        if (!this.b.k && ap()) {
            ex l = F().l();
            l.m(this);
            l.k();
        }
        Context rb = rb();
        if (rb != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29 || str == null) {
                return;
            }
            for (String str2 : rb.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                if (str.equals(str2)) {
                    ady adyVar = this.b;
                    adyVar.l = true;
                    this.a.postDelayed(new adl(adyVar), 600L);
                    return;
                }
            }
        }
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Context a = adv.a(this);
        if (a == null) {
            return;
        }
        this.b = adv.b(a);
        new WeakReference(mJ());
        ady adyVar = this.b;
        if (adyVar.n == null) {
            adyVar.n = new t();
        }
        adyVar.n.e(this, new add(this, 1));
        ady adyVar2 = this.b;
        if (adyVar2.o == null) {
            adyVar2.o = new t();
        }
        adyVar2.o.e(this, new add(this));
        ady adyVar3 = this.b;
        if (adyVar3.p == null) {
            adyVar3.p = new t();
        }
        adyVar3.p.e(this, new add(this, 2));
        ady adyVar4 = this.b;
        if (adyVar4.q == null) {
            adyVar4.q = new t();
        }
        adyVar4.q.e(this, new add(this, 3));
        ady adyVar5 = this.b;
        if (adyVar5.r == null) {
            adyVar5.r = new t();
        }
        adyVar5.r.e(this, new add(this, 4));
        ady adyVar6 = this.b;
        if (adyVar6.t == null) {
            adyVar6.t = new t();
        }
        adyVar6.t.e(this, new add(this, 5));
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        if (Build.VERSION.SDK_INT != 29 || !acy.c(this.b.d())) {
            return;
        }
        ady adyVar = this.b;
        adyVar.m = true;
        this.a.postDelayed(new adl(adyVar, 2), 250L);
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        if (Build.VERSION.SDK_INT >= 29 || this.b.k) {
            return;
        }
        dt mJ = mJ();
        if (mJ != null && mJ.isChangingConfigurations()) {
            return;
        }
        a(0);
    }

    public final void n() {
        Context a = adv.a(this);
        if (a == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client Context not found.");
            return;
        }
        KeyguardManager c = adn.c(a);
        if (c == null) {
            o(12, N(R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence i = this.b.i();
        CharSequence h = this.b.h();
        this.b.s();
        if (h == null) {
            h = null;
        }
        Intent a2 = adg.a(c, i, h);
        if (a2 == null) {
            o(14, N(R.string.generic_error_no_device_credential));
            return;
        }
        this.b.k = true;
        if (s()) {
            aG();
        }
        a2.setFlags(134742016);
        startActivityForResult(a2, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i, CharSequence charSequence) {
        aE(charSequence);
        d();
    }

    public final void p(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = N(R.string.default_error_msg);
        }
        this.b.p(2);
        this.b.o(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adm.q():void");
    }

    public final boolean r() {
        return Build.VERSION.SDK_INT <= 28 && acy.c(this.b.d());
    }

    public final boolean s() {
        if (Build.VERSION.SDK_INT >= 28) {
            Context a = adv.a(this);
            if (a != null && this.b.e != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (Build.VERSION.SDK_INT == 28) {
                    if (str != null) {
                        for (String str3 : a.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                            if (str.equalsIgnoreCase(str3)) {
                                return true;
                            }
                        }
                    }
                    if (adi.c(a, str2, R.array.crypto_fingerprint_fallback_prefixes)) {
                        return true;
                    }
                }
            }
            return Build.VERSION.SDK_INT == 28 && !ado.b(rb());
        }
        return true;
    }
}
