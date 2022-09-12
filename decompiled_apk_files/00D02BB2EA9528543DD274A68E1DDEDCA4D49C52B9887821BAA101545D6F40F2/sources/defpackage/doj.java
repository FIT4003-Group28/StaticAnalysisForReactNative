package defpackage;

import android.util.DisplayMetrics;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: doj  reason: default package */
/* loaded from: classes6.dex */
public enum doj {
    ONBOARDING_AWARENESS_IMAGE("https://www.gstatic.com/maps/ar/onboarding/%s/onboarding_awareness.png"),
    ONBOARDING_CAMERA_IMAGE("https://www.gstatic.com/maps/ar/onboarding/%s/onboarding_camera_v2.png"),
    INDOOR_WARNING_IMAGE("https://www.gstatic.com/maps/ar/indoor/%s/Indoor_Detection_v1b.png"),
    DRIVING_WARNING_IMAGE("https://www.gstatic.com/maps/ar/drivingwarning/%s/image.png"),
    LITE_MODE_INSTRUCTION("https://www.gstatic.com/maps/ar/calibration/%s/lite_mode_instruction.png"),
    NIGHT_WARNING_IMAGE("https://www.gstatic.com/maps/ar/night/%s/night_time_v3.png"),
    TIMEOUT_DAY_IMAGE("https://www.gstatic.com/maps/ar/timeout/%s/timeout_image_v3.png"),
    TIMEOUT_NIGHT_IMAGE("https://www.gstatic.com/maps/ar/night/%s/night_time_v3.png"),
    OTHER_MODE_TOOLTIP_PROMO_IMAGE("https://www.gstatic.com/maps/ar/tutorial/%s/arwn_other_mode_tooltip_promo_v2.png");
    
    private final String j;

    doj(String str) {
        this.j = str;
    }

    public final void a(WebImageView webImageView, DisplayMetrics displayMetrics) {
        webImageView.o(b(displayMetrics));
    }

    public final jic b(DisplayMetrics displayMetrics) {
        int i = displayMetrics.densityDpi;
        return new jic(String.format(this.j, i >= 640 ? "xxxhdpi" : i >= 480 ? "xxhdpi" : i >= 320 ? "xhdpi" : i >= 240 ? "hdpi" : "mdpi"), ckqc.FULLY_QUALIFIED, 0, 100);
    }
}
