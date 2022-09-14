package android.support.v7.widget;

import android.os.Build;
import android.view.View;
/* compiled from: TooltipCompat.java */
/* loaded from: classes.dex */
public class ao {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ap.a(view, charSequence);
        }
    }
}
