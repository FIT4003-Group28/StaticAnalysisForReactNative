package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjmu  reason: default package */
/* loaded from: classes4.dex */
public enum cjmu {
    NAVIGATION_BLACK_TRANSLUCENT(R.color.mod_black_alpha20, 1),
    TRANSLUCENT_WHITE_BG_DARK_ICONS_DM_AWARE(R.color.mod_daynight_translucent_white_status_bar_background, 3),
    TRANSLUCENT_DARK_BG_WHITE_ICONS(R.color.mod_grey900_alpha60, 1),
    TRANSPARENT_BG_DARK_ICONS_DM_AWARE(R.color.mod_google_transparent, 3),
    TRANSPARENT_BG_WHITE_ICONS(R.color.mod_google_transparent, 1),
    TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE(R.color.mod_google_transparent, 4),
    NAVIGATION_DAY_MODE(R.color.navigation_status_bar_background, 2),
    LEGACY(R.color.mod_daynight_black_alpha20_status_bar, 1);
    
    public final int i;
    private final int j;

    cjmu(int i, int i2) {
        this.j = i;
        this.i = i2;
    }

    public final int a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return context.getResources().getColor(this.j);
        }
        return akm.c(context, this.j);
    }
}
