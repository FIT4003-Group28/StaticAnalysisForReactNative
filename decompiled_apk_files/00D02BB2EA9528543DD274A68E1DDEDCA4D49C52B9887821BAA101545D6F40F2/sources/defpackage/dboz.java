package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
/* compiled from: PG */
@Deprecated
/* renamed from: dboz  reason: default package */
/* loaded from: classes5.dex */
public final class dboz {
    public static final dcdn<dboy, Integer> a = dcdn.k(dboy.GET_SE_CARD_BALANCE, 930190515);
    private final Context b;

    public dboz(Context context) {
        this.b = context;
    }

    private final PackageInfo c(String str, int i) {
        try {
            return this.b.getPackageManager().getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final boolean d(String str) {
        return cnnm.a(this.b).b(str);
    }

    public final boolean a() {
        PackageInfo b;
        PackageInfo c = c("com.felicanetworks.mfc", Build.VERSION.SDK_INT >= 24 ? 512 : 0);
        if ((c != null || cpke.d(this.b.getContentResolver(), "google_wallet:tp2_use_fake_se_sdk", false)) && (b = b()) != null) {
            return !"com.google.android.apps.walletnfcrel".equals(b.packageName) || c != null;
        }
        return false;
    }

    public final PackageInfo b() {
        PackageInfo c = c("com.google.commerce.tapandpay.dev", 0);
        if (c == null || !d("com.google.commerce.tapandpay.dev")) {
            PackageInfo c2 = c("com.google.android.apps.walletnfcrel", 0);
            if (c2 != null && d("com.google.android.apps.walletnfcrel")) {
                return c2;
            }
            return null;
        }
        return c;
    }
}
