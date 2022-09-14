package defpackage;

import android.text.TextUtils;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: amb  reason: default package */
/* loaded from: classes2.dex */
public final class amb {
    static {
        new Locale("", "");
    }

    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
