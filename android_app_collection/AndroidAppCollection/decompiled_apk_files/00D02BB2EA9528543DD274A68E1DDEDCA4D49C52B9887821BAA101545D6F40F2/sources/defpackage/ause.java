package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: PG */
/* renamed from: ause  reason: default package */
/* loaded from: classes2.dex */
public final class ause {
    public static Intent a(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        }
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", str);
            intent.setFlags(268435456);
        }
        return intent;
    }
}
