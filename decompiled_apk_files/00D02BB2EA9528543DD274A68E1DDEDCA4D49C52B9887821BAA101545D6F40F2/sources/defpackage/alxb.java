package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: alxb  reason: default package */
/* loaded from: classes2.dex */
public final class alxb {
    public static int a(int i, Resources resources) {
        int i2 = i - 1;
        if (i2 != 2) {
            if (i2 == 3) {
                return resources.getColor(R.color.ad_pin_background_green);
            }
            return resources.getColor(R.color.ad_badge_background_yellow);
        }
        return resources.getColor(R.color.ad_badge_background_purple);
    }
}
