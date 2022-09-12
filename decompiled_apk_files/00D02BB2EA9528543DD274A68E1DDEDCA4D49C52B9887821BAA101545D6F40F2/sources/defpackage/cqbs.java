package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cqbs  reason: default package */
/* loaded from: classes5.dex */
public final class cqbs {
    public static String a(Context context) {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        return locale.toLanguageTag();
    }
}
