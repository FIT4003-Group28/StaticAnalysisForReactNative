package defpackage;

import android.text.TextUtils;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cstg  reason: default package */
/* loaded from: classes5.dex */
public final class cstg {
    public static String a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        String[] split = lowerCase.split("@", 2);
        if (split.length != 2) {
            return lowerCase;
        }
        String str2 = split[0];
        String str3 = split[1];
        return (TextUtils.equals(str3, "gmail.com") || TextUtils.equals(str3, "googlemail.com")) ? str2.replace(".", "").concat("@gmail.com") : lowerCase;
    }
}
