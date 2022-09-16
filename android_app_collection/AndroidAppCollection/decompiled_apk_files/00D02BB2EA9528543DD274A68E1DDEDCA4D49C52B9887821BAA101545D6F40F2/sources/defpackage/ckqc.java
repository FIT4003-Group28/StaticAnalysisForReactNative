package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: ckqc  reason: default package */
/* loaded from: classes.dex */
public enum ckqc implements ckqd {
    FIFE,
    FIFE_MERGE,
    FIFE_GOOD_QUALITY,
    FIFE_LOWER_QUALITY,
    FIFE_LOW_QUALITY,
    FIFE_GOOD_QUALITY_NO_EXPERIMENT_LOGGING,
    FIFE_LOWER_QUALITY_NO_EXPERIMENT_LOGGING,
    FIFE_LOW_QUALITY_NO_EXPERIMENT_LOGGING,
    FIFE_REPLACEMENT,
    FIFE_SMART_CROP,
    FIFE_SMART_CROP_MERGE,
    FIFE_MONOGRAM_CIRCLE_CROP,
    FIFE_MONOGRAM_CIRCLE_CROP_GREYSCALE,
    FIFE_CIRCLE_CROP_NOT_USER_PROFILE,
    FIFE_MONOGRAM,
    FIFE_BLUR_80,
    FIFE_BLUR_AND_LIGHTEN,
    PANORAMIO,
    PANORAMIO_LIMIT_LARGE,
    ALLEYCAT,
    ALLEYCAT_LIMIT_LARGE,
    FULLY_QUALIFIED,
    PAINT_FE_SCALE1,
    PAINT_FE_SCALE2;

    private static String b(String str, int i, int i2, int i3) {
        int i4 = 2048 / i3;
        return Uri.parse(str).buildUpon().appendQueryParameter("w", String.valueOf(Math.min(i4, i / i3))).appendQueryParameter("h", String.valueOf(Math.min(i4, i2 / i3))).appendQueryParameter("scale", String.valueOf(i3)).toString();
    }

    @Override // defpackage.ckqd
    public final String a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        switch (ordinal()) {
            case 0:
                return ckqj.a(ckqj.c(i, i2, -1, scaleType), str);
            case 1:
                dsnh b = ckqj.b(str);
                b.a();
                ckqj.d(b, i, i2, -1, scaleType);
                return ckqj.a(b, str);
            case 2:
            case 5:
                return ckqj.a(ckqj.c(i, i2, 1, scaleType), str);
            case 3:
            case 6:
                return ckqj.a(ckqj.c(i, i2, 2, scaleType), str);
            case 4:
            case 7:
                return ckqj.a(ckqj.c(i, i2, 3, scaleType), str);
            case 8:
                StringBuffer stringBuffer = new StringBuffer(str.length());
                Matcher matcher = ckqg.f.matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    dbsk.s(group);
                    char charAt = group.charAt(0);
                    if (charAt == '$') {
                        matcher.appendReplacement(stringBuffer, "\\$");
                    } else if (charAt == 'h') {
                        matcher.appendReplacement(stringBuffer, Integer.toString(i2));
                    } else if (charAt != 'w') {
                        String valueOf = String.valueOf(str);
                        throw new RuntimeException(valueOf.length() != 0 ? "Unsupported replace FIFE variable in URL ".concat(valueOf) : new String("Unsupported replace FIFE variable in URL "));
                    } else {
                        matcher.appendReplacement(stringBuffer, Integer.toString(i));
                    }
                }
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            case 9:
                dsnh c = ckqj.c(i, i2, -1, null);
                c.j();
                return ckqj.a(c, str);
            case 10:
                dsnh b2 = ckqj.b(str);
                b2.j();
                b2.a();
                ckqj.d(b2, i, i2, -1, null);
                return ckqj.a(b2, str);
            case 11:
                dsnh c2 = ckqj.c(i, i2, -1, null);
                c2.e(true);
                c2.b(0);
                c2.i();
                c2.h();
                return ckqj.a(c2, str);
            case 12:
                dsnh c3 = ckqj.c(i, i2, -1, null);
                c3.e(true);
                c3.b(0);
                c3.i();
                c3.h();
                c3.g("bw=1");
                return ckqj.a(c3, str);
            case 13:
                dsnh c4 = ckqj.c(i, i2, -1, null);
                c4.e(true);
                c4.b(0);
                c4.i();
                return ckqj.a(c4, str);
            case 14:
                dsnh c5 = ckqj.c(i, i2, -1, scaleType);
                c5.h();
                return ckqj.a(c5, str);
            case 15:
                dsnh c6 = ckqj.c(i, i2, -1, scaleType);
                c6.g("Soften=1,80,0");
                return ckqj.a(c6, str);
            case 16:
                dsnh c7 = ckqj.c(i, i2, -1, scaleType);
                c7.g("Soften=1,300,0:backlight=1,0.5:BasicTint=1,50,ffffff");
                return ckqj.a(c7, str);
            case 17:
                return ckqg.u(i, i2, str, false);
            case 18:
                return ckqg.u(i, i2, str, true);
            case 19:
                return ckqg.v(i, i2, str, false);
            case 20:
                return ckqg.v(i, i2, str, true);
            case 21:
            default:
                return str;
            case 22:
                return b(str, i, i2, 1);
            case 23:
                return b(str, i, i2, 2);
        }
    }
}
