package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: elk  reason: default package */
/* loaded from: classes3.dex */
public final class elk {
    public static void a(View view, GradientDrawable gradientDrawable, apsx apsxVar, Resources resources) {
        apsx apsxVar2 = apsx.CHANNEL_STATUS_UNKNOWN;
        int ordinal = apsxVar.ordinal();
        if (ordinal == 1) {
            view.setVisibility(0);
            gradientDrawable.setColor(resources.getColor(R.color.channel_list_sub_menu_avatar_unread));
        } else if (ordinal == 2) {
            view.setVisibility(0);
            gradientDrawable.setColor(resources.getColor(R.color.channel_list_sub_menu_avatar_live));
        } else {
            view.setVisibility(4);
        }
    }

    public static String b(String str) {
        return str.length() != 0 ? "UC".concat(str) : new String("UC");
    }

    public static String c(String str) {
        if (str == null || !d(str)) {
            return null;
        }
        return str.substring(2);
    }

    public static boolean d(String str) {
        if (str != null) {
            return str.startsWith("VLPL") || str.startsWith("VLLL") || "VLWL".equals(str);
        }
        return false;
    }

    public static void f(ajrs ajrsVar, int i) {
        ajrsVar.f("setBackgroundColor", Integer.valueOf(i));
    }

    public static void g(Context context, ajrs ajrsVar, ajrx ajrxVar, boolean z) {
        ajrsVar.getClass();
        ajrsVar.f("setBackgroundColor", Integer.valueOf(z ? zhn.d(context, R.attr.yt10PercentLayer) : 0));
        ajrxVar.e(ajrsVar);
    }

    public static boolean h(wxp wxpVar) {
        return wxpVar != null && wxpVar.a() == 1;
    }

    public static int i(Activity activity) {
        return activity.getResources().getConfiguration().orientation;
    }

    public static boolean j(int i) {
        return i == 2;
    }

    public static boolean k(int i) {
        return i == 1;
    }

    public static boolean l(ezx ezxVar) {
        return !ezxVar.e() && !ezxVar.l();
    }

    public static int m(int i, boolean z) {
        if (i == 1) {
            return z ? 3 : 2;
        } else if (i != 2) {
            return 0;
        } else {
            return z ? 5 : 4;
        }
    }
}
