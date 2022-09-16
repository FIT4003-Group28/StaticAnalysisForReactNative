package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.google.vr.sdk.proto.Display$DisplayParams;
import java.lang.reflect.Field;
import java.util.Date;
/* compiled from: PG */
/* renamed from: axds  reason: default package */
/* loaded from: classes2.dex */
public final class axds {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final axdr b(Display display) {
        if (!a()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.view.DisplayInfo");
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            Display.class.getDeclaredMethod("getDisplayInfo", cls).invoke(display, newInstance);
            Field declaredField = cls.getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            return axdr.e(declaredField.get(newInstance));
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Failed to fetch DisplayCutout from Display: ");
            sb.append(valueOf);
            Log.e("AndroidPCompat", sb.toString());
            return null;
        }
    }

    public static void c(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void d() {
        c(true);
        c(true);
    }

    public static float e(Display$DisplayParams display$DisplayParams) {
        if (display$DisplayParams == null || !display$DisplayParams.hasBottomBezelHeight()) {
            return 0.003f;
        }
        return display$DisplayParams.getBottomBezelHeight();
    }

    public static float f(float f) {
        return 0.0254f / f;
    }

    public static DisplayMetrics g(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            int i = displayMetrics.widthPixels;
            displayMetrics.widthPixels = displayMetrics.heightPixels;
            displayMetrics.heightPixels = i;
        }
        float f = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = f;
        return displayMetrics;
    }

    public static DisplayMetrics h(Display display, Display$DisplayParams display$DisplayParams) {
        DisplayMetrics g = g(display);
        if (display$DisplayParams != null) {
            if (display$DisplayParams.hasXPpi()) {
                g.xdpi = display$DisplayParams.getXPpi();
            }
            if (display$DisplayParams.hasYPpi()) {
                g.ydpi = display$DisplayParams.getYPpi();
            }
        }
        return g;
    }

    public static Display i(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static String j(Context context) {
        Resources resources = context.getResources();
        try {
            return resources.getString(resources.getIdentifier("display_manager_hdmi_display_name", "string", "android"));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static Activity k(Context context) {
        Context baseContext;
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if ((context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != context) {
            return k(baseContext);
        }
        return null;
    }

    public static ComponentName l(Context context) {
        if (context instanceof axff) {
            return ((axff) context).a();
        }
        Activity k = k(context);
        if (k == null) {
            return null;
        }
        return k.getComponentName();
    }

    public static long n(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date o(long j) {
        return new Date((j - 2082844800) * 1000);
    }

    public static int p(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            StringBuilder sb = new StringBuilder(98);
            sb.append("A cast to int has gone wrong. Please contact the mp4parser discussion group (");
            sb.append(j);
            sb.append(")");
            throw new RuntimeException(sb.toString());
        }
        return (int) j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static axgq q(String str) {
        char c;
        switch (str.hashCode()) {
            case 85182:
                if (str.equals("VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 85183:
                if (str.equals("VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2020668:
                if (str.equals("AV1X")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2194728:
                if (str.equals("H264")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 68036687:
                if (str.equals("H265X")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                return axgq.VP9;
            }
            if (c == 2) {
                return axgq.H264;
            }
            if (c == 3) {
                return axgq.H265X;
            }
            if (c == 4) {
                return axgq.AV1X;
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "VideoCodecType has no value named ".concat(valueOf) : new String("VideoCodecType has no value named "));
        }
        return axgq.VP8;
    }

    public static ayoi m(View view) {
        if (view != null) {
            return new axll(view);
        }
        throw new NullPointerException("view == null");
    }
}
