package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: ydz  reason: default package */
/* loaded from: classes4.dex */
public final class ydz {
    private static final anay a = anay.o();

    public static boolean a(Context context) {
        try {
            return zhn.m(context) == 1;
        } catch (Resources.NotFoundException e) {
            ((anav) ((anav) ((anav) a.g()).h(e)).i("com/google/android/libraries/youtube/commerce/red/ui/DarkThemeUtil", "isDarkTheme", 31, "DarkThemeUtil.java")).q("No ytThemeType attribute in current theme.");
            return false;
        }
    }
}
