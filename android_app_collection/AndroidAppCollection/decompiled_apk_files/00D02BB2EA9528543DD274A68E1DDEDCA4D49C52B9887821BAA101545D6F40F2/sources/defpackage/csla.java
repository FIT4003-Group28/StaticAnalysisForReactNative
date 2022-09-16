package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: csla  reason: default package */
/* loaded from: classes5.dex */
public final class csla {
    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                return true;
            }
        } else if (!ValueAnimator.areAnimatorsEnabled()) {
            return true;
        }
        return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
    }
}
