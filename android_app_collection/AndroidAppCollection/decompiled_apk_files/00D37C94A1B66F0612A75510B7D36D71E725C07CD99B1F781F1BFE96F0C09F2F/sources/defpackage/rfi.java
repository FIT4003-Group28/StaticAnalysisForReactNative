package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: PG */
/* renamed from: rfi  reason: default package */
/* loaded from: classes4.dex */
public final class rfi {
    public static final int a;

    static {
        int i = 33554432;
        if (Build.VERSION.SDK_INT < 31 && (Build.VERSION.SDK_INT < 30 || Build.VERSION.CODENAME.length() != 1 || Build.VERSION.CODENAME.charAt(0) < 'S' || Build.VERSION.CODENAME.charAt(0) > 'Z')) {
            i = 0;
        }
        a = i;
    }

    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, i2);
    }

    public static PendingIntent b(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, intent, i2);
    }
}
