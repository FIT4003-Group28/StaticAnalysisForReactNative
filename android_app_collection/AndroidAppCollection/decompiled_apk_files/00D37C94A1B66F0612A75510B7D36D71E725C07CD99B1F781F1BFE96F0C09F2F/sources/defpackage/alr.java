package defpackage;

import android.text.TextUtils;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: alr  reason: default package */
/* loaded from: classes.dex */
public final class alr {
    static {
        new Locale("", "");
    }

    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
