package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.widget.Button;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acly  reason: default package */
/* loaded from: classes.dex */
public final class acly {
    public static int b(int i) {
        return i - 1;
    }

    public static final boolean c(Context context) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (ScreencastHostService.class.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static final void e(Context context) {
        context.getClass();
        context.getApplicationContext().startService(ScreencastHostService.c(context));
    }

    public static void a(Context context, Button button, int i) {
        Integer valueOf;
        int i2 = i - 1;
        Integer num = null;
        if (i2 == 2) {
            num = Integer.valueOf((int) R.drawable.lc_button_style_primary);
            valueOf = Integer.valueOf((int) R.color.lc_button_style_primary_text);
        } else if (i2 == 3) {
            num = Integer.valueOf((int) R.drawable.lc_button_style_destructive);
            valueOf = Integer.valueOf((int) R.color.lc_button_style_destructive_text);
        } else if (i2 == 13) {
            num = Integer.valueOf((int) R.drawable.lc_button_style_light_text);
            valueOf = Integer.valueOf((int) R.color.lc_button_style_blue_text);
        } else if (i2 != 15) {
            valueOf = null;
        } else {
            num = Integer.valueOf((int) R.drawable.lc_button_style_light_text);
            valueOf = Integer.valueOf((int) R.color.lc_button_style_light_text_text);
        }
        if (num != null) {
            button.setBackground(akf.a(context, num.intValue()));
            button.setTextColor(ake.d(context, valueOf.intValue()));
        }
    }
}
