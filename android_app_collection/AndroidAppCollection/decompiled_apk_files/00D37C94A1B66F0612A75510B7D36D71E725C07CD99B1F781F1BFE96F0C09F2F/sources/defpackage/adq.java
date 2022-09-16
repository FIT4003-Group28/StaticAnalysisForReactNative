package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.util.Log;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: adq  reason: default package */
/* loaded from: classes.dex */
public final class adq {
    private final BiometricManager a;
    private final hu b;
    private final adp c;

    public adq(adp adpVar) {
        this.c = adpVar;
        hu huVar = null;
        this.a = Build.VERSION.SDK_INT >= 29 ? adn.b(adpVar.a) : null;
        this.b = Build.VERSION.SDK_INT <= 29 ? hu.b(adpVar.a) : huVar;
    }

    public static adq a(Context context) {
        return new adq(new adp(context));
    }

    private final int c() {
        hu huVar = this.b;
        if (huVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        } else if (!huVar.d()) {
            return 12;
        } else {
            return !this.b.c() ? 11 : 0;
        }
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 30) {
            BiometricManager biometricManager = this.a;
            if (biometricManager == null) {
                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            return ado.a(biometricManager, PrivateKeyType.INVALID);
        } else if (!acy.d(PrivateKeyType.INVALID)) {
            return -2;
        } else {
            if (adn.c(this.c.a) != null) {
                if (acy.c(PrivateKeyType.INVALID)) {
                    return !this.c.a() ? 11 : 0;
                } else if (Build.VERSION.SDK_INT == 29) {
                    BiometricManager biometricManager2 = this.a;
                    if (biometricManager2 == null) {
                        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                        return 1;
                    }
                    return adn.a(biometricManager2);
                } else if (Build.VERSION.SDK_INT == 28) {
                    if (ado.b(this.c.a)) {
                        if (!this.c.a()) {
                            return c();
                        }
                        return c() != 0 ? -1 : 0;
                    }
                } else {
                    return c();
                }
            }
            return 12;
        }
    }
}
