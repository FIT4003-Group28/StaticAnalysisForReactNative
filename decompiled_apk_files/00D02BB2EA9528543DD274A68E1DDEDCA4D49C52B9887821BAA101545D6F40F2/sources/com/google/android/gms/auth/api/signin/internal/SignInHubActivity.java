package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SignInHubActivity extends ff {
    private static boolean m = false;
    public int k;
    public Intent l;
    private boolean n = false;
    private SignInConfiguration o;
    private boolean p;

    private final void j(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.o);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.n = true;
            l(17);
        }
    }

    private final void k() {
        apd.a(this).c(0, new cmug(this));
        m = false;
    }

    private final void l(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        m = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.n) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount == null || (googleSignInAccount = signInAccount.b) == null) {
                if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    l(intExtra);
                    return;
                }
            } else {
                cmtx.a(this).c(this.o.b, googleSignInAccount);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.p = true;
                this.k = i2;
                this.l = intent;
                k();
                return;
            }
        }
        l(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        dbsk.s(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            l(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            dbsk.s(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                setResult(0);
                finish();
                return;
            }
            this.o = signInConfiguration;
            if (bundle == null) {
                if (m) {
                    setResult(0);
                    l(12502);
                    return;
                }
                m = true;
                j(action);
                return;
            }
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.p = z;
            if (!z) {
                return;
            }
            this.k = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            dbsk.s(intent2);
            this.l = intent2;
            k();
        } else {
            if (String.valueOf(intent.getAction()).length() == 0) {
                new String("Unknown action: ");
            }
            finish();
        }
    }

    @Override // defpackage.ff, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        m = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.p);
        if (this.p) {
            bundle.putInt("signInResultCode", this.k);
            bundle.putParcelable("signInResultData", this.l);
        }
    }
}
