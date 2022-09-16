package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: uwb  reason: default package */
/* loaded from: classes4.dex */
public final class uwb {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public uwb(Context context) {
        uul.b();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
