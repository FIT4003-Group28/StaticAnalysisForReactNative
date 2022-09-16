package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akeq  reason: default package */
/* loaded from: classes.dex */
public final class akeq {
    private static final amup a;

    static {
        amum amumVar = new amum();
        avgg avggVar = avgg.THEME_ATTRIBUTE_BACKGROUND1;
        Integer valueOf = Integer.valueOf((int) R.attr.ytBrandBackgroundSolid);
        amumVar.f(avggVar, valueOf);
        amumVar.f(avgg.THEME_ATTRIBUTE_BACKGROUND2, Integer.valueOf((int) R.attr.ytGeneralBackgroundA));
        amumVar.f(avgg.THEME_ATTRIBUTE_BACKGROUND3, Integer.valueOf((int) R.attr.ytGeneralBackgroundB));
        amumVar.f(avgg.THEME_ATTRIBUTE_SEPARATOR, Integer.valueOf((int) R.attr.ytSeparator));
        amumVar.f(avgg.THEME_ATTRIBUTE_CHIP_BACKGROUND, Integer.valueOf((int) R.attr.ytChipBackground));
        amumVar.f(avgg.THEME_ATTRIBUTE_TEXT1, Integer.valueOf((int) R.attr.ytTextPrimary));
        amumVar.f(avgg.THEME_ATTRIBUTE_TEXT2, Integer.valueOf((int) R.attr.ytTextSecondary));
        avgg avggVar2 = avgg.THEME_ATTRIBUTE_TEXT3;
        Integer valueOf2 = Integer.valueOf((int) R.attr.ytTextDisabled);
        amumVar.f(avggVar2, valueOf2);
        amumVar.f(avgg.THEME_ATTRIBUTE_SELECTED_NAV_TEXT, Integer.valueOf((int) R.attr.ytSelectedNavText));
        amumVar.f(avgg.THEME_ATTRIBUTE_BRAND_RED, Integer.valueOf((int) R.attr.ytBrandRed));
        amumVar.f(avgg.THEME_ATTRIBUTE_STATIC_BLUE, Integer.valueOf((int) R.attr.ytStaticBlue));
        amumVar.f(avgg.THEME_ATTRIBUTE_STATIC_BRAND_BLACK, Integer.valueOf((int) R.attr.ytStaticBrandBlack));
        amumVar.f(avgg.THEME_ATTRIBUTE_STATIC_YELLOW, Integer.valueOf((int) R.attr.ytStaticYellow));
        amumVar.f(avgg.THEME_ATTRIBUTE_STATIC_GREEN, Integer.valueOf((int) R.attr.ytStaticGreen));
        amumVar.f(avgg.THEME_ATTRIBUTE_STATIC_WHITE, Integer.valueOf((int) R.attr.ytStaticWhite));
        amumVar.f(avgg.THEME_ATTRIBUTE_STATIC_GREY, Integer.valueOf((int) R.attr.ytStaticGrey));
        amumVar.f(avgg.THEME_ATTRIBUTE_ICON1, Integer.valueOf((int) R.attr.ytIcon1));
        amumVar.f(avgg.THEME_ATTRIBUTE_ICON2, Integer.valueOf((int) R.attr.ytIcon2));
        amumVar.f(avgg.THEME_ATTRIBUTE_UNSELECTED_NAV_ICON, Integer.valueOf((int) R.attr.ytBrandIconInactive));
        amumVar.f(avgg.THEME_ATTRIBUTE_SELECTED_NAV_ICON, Integer.valueOf((int) R.attr.ytBrandIconActive));
        amumVar.f(avgg.THEME_ATTRIBUTE_HEADER_ICON, Integer.valueOf((int) R.attr.ytHeaderIcon));
        amumVar.f(avgg.THEME_ATTRIBUTE_BADGE_BACKGROUND1, Integer.valueOf((int) R.attr.ytBadgeBackground1));
        amumVar.f(avgg.THEME_ATTRIBUTE_BADGE_BACKGROUND2, Integer.valueOf((int) R.attr.ytBadgeBackground2));
        amumVar.f(avgg.THEME_ATTRIBUTE_BADGE_TEXT1, Integer.valueOf((int) R.attr.ytBadgeText1));
        amumVar.f(avgg.THEME_ATTRIBUTE_BADGE_TEXT2, Integer.valueOf((int) R.attr.ytBadgeText2));
        amumVar.f(avgg.THEME_ATTRIBUTE_STATIC_DARK_BACKGROUND1, Integer.valueOf((int) R.attr.ytStaticDarkBackground1));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_MUTED_BACKGROUND, Integer.valueOf((int) R.attr.adMutedBackground));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_BLUE, Integer.valueOf((int) R.attr.adBlue));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_BACKGROUND1, Integer.valueOf((int) R.attr.adBackground1));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_BACKGROUND2, Integer.valueOf((int) R.attr.adBackground2));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_OVERLAY_BACKGROUND, Integer.valueOf((int) R.attr.adOverlayBackground));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_TEXT1, Integer.valueOf((int) R.attr.adText1));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_TEXT2, Integer.valueOf((int) R.attr.adText2));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_TEXT3, Integer.valueOf((int) R.attr.adText3));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_TEXT4, Integer.valueOf((int) R.attr.adText4));
        amumVar.f(avgg.THEME_ATTRIBUTE_AD_SEPARATOR1, Integer.valueOf((int) R.attr.adSeparator1));
        amumVar.f(avgg.THEME_ATTRIBUTE_ICON_DISABLED, Integer.valueOf((int) R.attr.ytIconDisabled));
        amumVar.f(avgg.THEME_ATTRIBUTE_TEXT_DISABLED, valueOf2);
        amumVar.f(avgg.THEME_ATTRIBUTE_ICON_INACTIVE, Integer.valueOf((int) R.attr.ytIconInactive));
        amumVar.f(avgg.THEME_ATTRIBUTE_TEXT_PRIMARY_INVERSE, Integer.valueOf((int) R.attr.ytTextPrimaryInverse));
        amumVar.f(avgg.THEME_ATTRIBUTE_SUGGESTED_ACTION, Integer.valueOf((int) R.attr.ytSuggestedAction));
        amumVar.f(avgg.THEME_ATTRIBUTE_ERROR_BACKGROUND, Integer.valueOf((int) R.attr.ytErrorBackground));
        amumVar.f(avgg.THEME_ATTRIBUTE_BRAND_BACKGROUND_SOLID, valueOf);
        amumVar.f(avgg.THEME_ATTRIBUTE_THEMED_BLUE, Integer.valueOf((int) R.attr.ytThemedBlue));
        amumVar.f(avgg.THEME_ATTRIBUTE_THEMED_GREEN, Integer.valueOf((int) R.attr.ytThemedGreen));
        amumVar.f(avgg.THEME_ATTRIBUTE_OVERLAY_BACKGROUND_MEDIUM, Integer.valueOf((int) R.attr.ytOverlayBackgroundMedium));
        amumVar.f(avgg.THEME_ATTRIBUTE_OVERLAY_BACKGROUND_MEDIUM_LIGHT, Integer.valueOf((int) R.attr.ytOverlayBackgroundMediumLight));
        a = amumVar.b();
    }

    public static int a(Context context, avgg avggVar, int i) {
        amup amupVar = a;
        return amupVar.containsKey(avggVar) ? zhn.j(context, ((Integer) amupVar.get(avggVar)).intValue()).orElse(i) : i;
    }

    public static ampq b(Context context, avgg avggVar) {
        amup amupVar = a;
        if (amupVar.containsKey(avggVar)) {
            try {
                return ampq.j(Integer.valueOf(zhn.d(context, ((Integer) amupVar.get(avggVar)).intValue())));
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                return amon.a;
            }
        }
        return amon.a;
    }
}
