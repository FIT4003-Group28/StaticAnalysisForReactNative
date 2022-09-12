package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: cvpo  reason: default package */
/* loaded from: classes5.dex */
public final class cvpo {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean c(Context context, String str) {
        return akm.d(context, str) == 0;
    }

    public static boolean d(Context context) {
        return ako.a() && context.getApplicationInfo().targetSdkVersion >= 26;
    }
}
