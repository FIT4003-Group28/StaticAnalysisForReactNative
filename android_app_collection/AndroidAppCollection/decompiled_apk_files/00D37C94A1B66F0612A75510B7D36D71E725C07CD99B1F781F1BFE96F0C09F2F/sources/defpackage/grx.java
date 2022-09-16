package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: grx  reason: default package */
/* loaded from: classes3.dex */
public final class grx {
    private static final long a = TimeUnit.HOURS.toMillis(48);
    private final Context b;
    private final SharedPreferences c;
    private final snc d;

    public grx(Context context, SharedPreferences sharedPreferences, snc sncVar) {
        this.b = context;
        this.c = sharedPreferences;
        this.d = sncVar;
    }

    public final void a() {
        long j;
        if (b()) {
            return;
        }
        long c = this.d.c();
        long j2 = this.c.getLong("lens_last_check_time", 0L);
        if (j2 > 0 && c - j2 < a) {
            return;
        }
        boolean z = false;
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            j = -1;
        }
        if (j >= 301130682) {
            z = true;
        }
        this.c.edit().putBoolean("lens_available", z).putLong("lens_last_check_time", c).apply();
    }

    public final boolean b() {
        return this.c.getBoolean("lens_available", false);
    }
}
