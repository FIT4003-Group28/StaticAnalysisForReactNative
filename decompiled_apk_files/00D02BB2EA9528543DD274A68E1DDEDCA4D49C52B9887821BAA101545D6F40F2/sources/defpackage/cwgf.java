package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwgf  reason: default package */
/* loaded from: classes5.dex */
public final class cwgf {
    public final int a;
    public final int b;
    public final Drawable c;

    public cwgf(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, cwgg.a, R.attr.ogAccountMenuStyle, 2132017728);
        try {
            obtainStyledAttributes.getColor(7, a(context, R.color.og_background_light));
            obtainStyledAttributes.getColor(6, a(context, R.color.og_item_action_text_color_light));
            this.a = obtainStyledAttributes.getColor(14, a(context, R.color.og_default_icon_color_light));
            this.b = obtainStyledAttributes.getColor(15, a(context, R.color.og_incognito_top_tight_icon_color_light));
            obtainStyledAttributes.getColor(12, a(context, R.color.og_menu_title_color_light));
            obtainStyledAttributes.getColor(13, a(context, R.color.google_white));
            sl.b(context, obtainStyledAttributes.getResourceId(4, R.drawable.og_account_menu_ripple_light));
            obtainStyledAttributes.getBoolean(16, true);
            obtainStyledAttributes.getBoolean(11, false);
            this.c = sl.b(context, obtainStyledAttributes.getResourceId(5, R.drawable.googlelogo_standard_color_74x24_vd));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static int a(Context context, int i) {
        return context.getResources().getColor(i);
    }
}
