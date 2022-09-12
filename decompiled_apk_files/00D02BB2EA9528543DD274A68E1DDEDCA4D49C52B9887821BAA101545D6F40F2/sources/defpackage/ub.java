package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ub  reason: default package */
/* loaded from: classes.dex */
public final class ub {
    public final Context a;

    private ub(Context context) {
        this.a = context;
    }

    public static ub a(Context context) {
        return new ub(context);
    }

    public final int b() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    public final boolean c() {
        return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public final int d() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, sj.a, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = this.a.getResources();
        if (!c()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public final int e() {
        return this.a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }
}
