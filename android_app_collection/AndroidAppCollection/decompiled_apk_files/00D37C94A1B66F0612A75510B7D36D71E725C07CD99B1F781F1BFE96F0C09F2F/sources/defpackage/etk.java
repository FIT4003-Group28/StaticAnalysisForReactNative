package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: etk  reason: default package */
/* loaded from: classes3.dex */
public final class etk {
    @Backup
    public static final String AUTONAV_TOGGLE_USER_EDU_TRIGGERS_REMAINING = "autonav_toggle_user_edu_triggers_remaining";
    @Backup
    public static final String COUNTRY = "country";
    @SubstringBackup
    public static final String HINT_ID_PREFIX = "hint_id_prefix";
    @SubstringBackup
    public static final String HINT_LAST_SHOWN = "hint_last_shown";
    @Backup
    public static final String MOVING_THUMBNAILS_FIRST_ADD_TOOLTIP = "moving_thumbnails_first_add_tooltip";
    @Backup
    public static final String PIP_POLICY = "background_pip_policy_v2";
    @Backup
    public static final String RATE_LIMIT_PROMO_LAST_ALLOWED = "rate_limit_promo_last_allowed";
    @Backup
    public static final String RATE_LIMIT_SHOW_INTERSTITIAL_PROMO_LAST_ALLOWED = "rate_limit_show_interstitial_promo_last_allowed";
    @Backup
    public static final String SHOW_ACCOUNT_TAB_TUTORIAL = "show_accounts_tab_tutorial";
    @Backup
    public static final String SHOW_CHANNELS_NOTIFICATIONS_TUTORIAL = "show_channels_notifications_tutorial";
    @Backup
    public static final String SHOW_SUBSCRIBERS_TAB_TUTORIAL = "show_subscribers_tab_tutorial";
    @Backup
    public static final String SHOW_SUBS_CHANNELS_TUTORIAL = "show_subs_channels_tutorial";
    @Backup
    public static final String SHOW_TRENDING_TAB_TUTORIAL = "show_trending_tab_tutorial";
    @Backup
    public static final String TIME_FUSION_ENABLED = "time_fusion_enabled";
    @Backup
    public static final String TIME_LAST_BROWSE_CLING_SHOWN = "time_last_browse_cling_shown";
    @Backup
    public static final String TIME_LAST_WATCH_TUTORIAL_SHOWN = "time_last_watch_tutorial_shown";
    @Backup
    public static final String UPLOAD_PRIVACY = "upload_privacy";
    @Backup
    public static final String VIDEO_ZOOM_USER_EDUCATION_SHOWN = "video_zoom_user_education_shown";

    private etk() {
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, e("settings.SettingsActivity")).putExtra(":android:show_fragment", e("settings.GeneralPrefsFragment")).setFlags(335544320);
    }

    public static Intent b(Context context) {
        return new Intent().setClassName(context, e("settings.SettingsActivity")).putExtra(":android:show_fragment", e("settings.OfflinePrefsFragment")).setFlags(335544320);
    }

    public static Intent c(Context context) {
        return new Intent().setClassName(context, e("settings.SettingsActivity")).putExtra(":android:show_fragment", e("settings.videoquality.VideoQualityPrefsFragment")).setFlags(335544320);
    }

    public static Intent d(Context context) {
        return new Intent().setClassName(context, "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity").setFlags(335544320).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
    }

    public static String e(String str) {
        return str.length() != 0 ? "com.google.android.apps.youtube.app.".concat(str) : new String("com.google.android.apps.youtube.app.");
    }

    public static boolean f(ezx ezxVar) {
        return ezxVar.f() && !ezxVar.d() && !ezxVar.e();
    }

    public static apzg g(PlaybackStartDescriptor playbackStartDescriptor) {
        aopc aopcVar;
        apzg apzgVar = playbackStartDescriptor.b;
        if (apzgVar != null) {
            return apzgVar;
        }
        if (playbackStartDescriptor.t()) {
            aopcVar = (aopc) aijk.f(playbackStartDescriptor.l(), playbackStartDescriptor.k(), playbackStartDescriptor.a()).mo52toBuilder();
        } else {
            aopcVar = (aopc) aikb.f(playbackStartDescriptor.l(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), 0.0f).mo52toBuilder();
        }
        aoob x = aoob.x(playbackStartDescriptor.y());
        aopcVar.copyOnWrite();
        apzg apzgVar2 = (apzg) aopcVar.instance;
        apzgVar2.b |= 1;
        apzgVar2.c = x;
        return (apzg) aopcVar.mo39build();
    }

    public static void h(ajmy ajmyVar, fer ferVar, ImageView imageView, String str, avhn avhnVar, ajmu ajmuVar) {
        ajmyVar.getClass();
        ferVar.getClass();
        imageView.getClass();
        ajmyVar.e(imageView);
        fep b = ferVar.b(str);
        Bitmap a = ferVar.a(str);
        if (a != null && !a.isRecycled()) {
            imageView.setScaleType(b.b);
            imageView.setImageBitmap(a);
        } else if (avhnVar == null) {
        } else {
            if (ajmuVar == null) {
                ajmuVar = ajmu.a;
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ajmyVar.k(imageView, avhnVar, ajmuVar);
        }
    }

    public static boolean i(apzg apzgVar) {
        aijl d = PlaybackStartDescriptor.d();
        d.a = apzgVar;
        PlaybackStartDescriptor a = d.a();
        return !"".equals(a.l()) || !"".equals(a.k());
    }

    public static CharSequence j(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        alj a = alj.a();
        return a == null ? charSequence : a.b(charSequence.toString());
    }

    public static void k(Rect rect, float f, Rect rect2) {
        rect.getClass();
        rect2.getClass();
        aqxo.p(f >= 0.0f);
        if (f == 1.0f) {
            rect2.set(rect);
            return;
        }
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int width = rect.width();
        int height = rect.height();
        int round = Math.round(width * f);
        int round2 = Math.round(height * f);
        rect2.left = centerX - (round / 2);
        rect2.top = centerY - (round2 / 2);
        rect2.right = rect2.left + round;
        rect2.bottom = rect2.top + round2;
    }

    public static void l(float f, Rect rect, Rect rect2) {
        double width = rect.width();
        double height = rect.height();
        Double.isNaN(width);
        Double.isNaN(height);
        if (f < width / height) {
            int width2 = (int) (rect.width() / f);
            rect2.set(rect.left, rect.top - ((width2 - rect.height()) / 2), rect.right, rect.top + ((width2 + rect.height()) / 2));
            return;
        }
        int height2 = (int) (rect.height() * f);
        rect2.set(rect.left - ((height2 - rect.width()) / 2), rect.top, rect.left + ((rect.width() + height2) / 2), rect.bottom);
    }

    public static void m(float f, Rect rect, Rect rect2) {
        double width = rect.width();
        double height = rect.height();
        Double.isNaN(width);
        Double.isNaN(height);
        if (f < width / height) {
            int height2 = (int) (rect.height() * f);
            rect2.set(rect.left + ((rect.width() - height2) / 2), rect.top, rect.left + ((rect.width() + height2) / 2), rect.bottom);
            return;
        }
        int width2 = (int) (rect.width() / f);
        rect2.set(rect.left, rect.top + ((rect.height() - width2) / 2), rect.right, rect.top + ((rect.height() + width2) / 2));
    }

    public static String n(Context context) {
        int myPid = Process.myPid();
        String q = q(myPid);
        if (q == null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return null;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        }
        return q;
    }

    public static int o(int i) {
        float f;
        float abs;
        int round;
        int round2;
        int round3;
        int alpha = Color.alpha(i);
        float max = Math.max(0.0f, Math.min(1.0f, 0.1f));
        if (max != 0.0f) {
            if (max == 1.0f) {
                return zdb.d(-16777216, alpha);
            }
            float[] fArr = new float[3];
            float red = Color.red(i) / 255.0f;
            float green = Color.green(i) / 255.0f;
            float blue = Color.blue(i) / 255.0f;
            float max2 = Math.max(red, Math.max(green, blue));
            float min = Math.min(red, Math.min(green, blue));
            float f2 = max2 - min;
            float f3 = (max2 + min) / 2.0f;
            if (max2 == min) {
                f = 0.0f;
                abs = 0.0f;
            } else {
                f = max2 == red ? ((green - blue) / f2) % 6.0f : max2 == green ? ((blue - red) / f2) + 2.0f : ((red - green) / f2) + 4.0f;
                abs = f2 / (1.0f - Math.abs((f3 + f3) - 1.0f));
            }
            fArr[0] = (f * 60.0f) % 360.0f;
            fArr[1] = abs;
            fArr[2] = f3;
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - max));
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[2];
            float abs2 = (1.0f - Math.abs((f6 + f6) - 1.0f)) * f5;
            float f7 = f6 - (0.5f * abs2);
            float abs3 = (1.0f - Math.abs(((f4 / 60.0f) % 2.0f) - 1.0f)) * abs2;
            switch (((int) f4) / 60) {
                case 0:
                    round = Math.round((abs2 + f7) * 255.0f);
                    round2 = Math.round((abs3 + f7) * 255.0f);
                    round3 = Math.round(f7 * 255.0f);
                    break;
                case 1:
                    round = Math.round((abs3 + f7) * 255.0f);
                    round2 = Math.round((abs2 + f7) * 255.0f);
                    round3 = Math.round(f7 * 255.0f);
                    break;
                case 2:
                    round = Math.round(f7 * 255.0f);
                    round2 = Math.round((abs2 + f7) * 255.0f);
                    round3 = Math.round((abs3 + f7) * 255.0f);
                    break;
                case 3:
                    round = Math.round(f7 * 255.0f);
                    round2 = Math.round((abs3 + f7) * 255.0f);
                    round3 = Math.round((abs2 + f7) * 255.0f);
                    break;
                case 4:
                    round = Math.round((abs3 + f7) * 255.0f);
                    round2 = Math.round(f7 * 255.0f);
                    round3 = Math.round((abs2 + f7) * 255.0f);
                    break;
                case 5:
                case 6:
                    round = Math.round((abs2 + f7) * 255.0f);
                    round2 = Math.round(f7 * 255.0f);
                    round3 = Math.round((abs3 + f7) * 255.0f);
                    break;
                default:
                    round = 0;
                    round3 = 0;
                    round2 = 0;
                    break;
            }
            return Color.argb(alpha, Math.max(0, Math.min((int) PrivateKeyType.INVALID, round)), Math.max(0, Math.min((int) PrivateKeyType.INVALID, round2)), Math.max(0, Math.min((int) PrivateKeyType.INVALID, round3)));
        }
        return i;
    }

    public static ghg p(biq biqVar, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (int) (i5 * i6 * 0.015f);
        if (biqVar != null) {
            ghh a = ghh.a(biqVar.c(bir.b), i7, i, i2, i4);
            ghh a2 = ghh.a(biqVar.c(bir.e), i7, i, i2, i4);
            ghh ghhVar = a.g ? a : a2.g ? a2 : null;
            if (ghhVar != null) {
                return ghhVar;
            }
            boolean z = a.e;
            ghh ghhVar2 = (!z || !a2.e) ? null : ((float) a.f) * 2.5f >= ((float) a2.f) ? a : a2;
            if (ghhVar2 != null) {
                return ghhVar2;
            }
            if (!z) {
                a = a2.e ? a2 : null;
            }
            if (a != null) {
                return a;
            }
        }
        return new ghg(o(i), i, i3, i2);
    }

    private static String q(int i) {
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            String str = new String(anhe.i(new File(sb.toString())).b(), Charset.forName("iso-8859-1"));
            int indexOf = str.indexOf(0);
            return indexOf > 0 ? str.substring(0, indexOf) : str;
        } catch (Error | Exception unused) {
            return null;
        }
    }
}
