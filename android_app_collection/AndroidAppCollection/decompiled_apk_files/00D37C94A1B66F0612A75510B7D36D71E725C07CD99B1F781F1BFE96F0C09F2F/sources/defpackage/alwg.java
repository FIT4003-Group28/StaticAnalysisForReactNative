package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: alwg  reason: default package */
/* loaded from: classes.dex */
public final class alwg {
    static Bundle a = null;
    public static Bundle b = null;
    private static final String e = "alwg";
    private static alwg f = null;
    private static ContentObserver g = null;
    private static int h = 0;
    private static int i = 1;
    Bundle c;
    final EnumMap d;

    private alwg(Context context) {
        this.c = null;
        EnumMap enumMap = new EnumMap(alwe.class);
        this.d = enumMap;
        Bundle bundle = this.c;
        if (bundle == null || bundle.isEmpty()) {
            try {
                this.c = context.getContentResolver().call(e(), "getOverlayConfig", (String) null, (Bundle) null);
                enumMap.clear();
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(e, "Fail to get config from suw provider");
            }
        }
        if (m(context)) {
            if (g != null) {
                try {
                    context.getContentResolver().unregisterContentObserver(g);
                    g = null;
                } catch (IllegalArgumentException | NullPointerException | SecurityException e2) {
                    String str = e;
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    sb.append("Failed to unregister content observer: ");
                    sb.append(valueOf);
                    Log.w(str, sb.toString());
                }
            }
            Uri e3 = e();
            try {
                g = new alwf();
                context.getContentResolver().registerContentObserver(e3, true, g);
            } catch (IllegalArgumentException | NullPointerException | SecurityException e4) {
                String str2 = e;
                String valueOf2 = String.valueOf(e3);
                String valueOf3 = String.valueOf(e4);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42 + String.valueOf(valueOf3).length());
                sb2.append("Failed to register content observer for ");
                sb2.append(valueOf2);
                sb2.append(": ");
                sb2.append(valueOf3);
                Log.w(str2, sb2.toString());
            }
        }
    }

    static Uri e() {
        return new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }

    public static synchronized alwg f(Context context) {
        alwg alwgVar;
        synchronized (alwg.class) {
            Configuration configuration = context.getResources().getConfiguration();
            if (f == null) {
                h = configuration.uiMode & 48;
                i = configuration.orientation;
            } else if (!m(context) || (configuration.uiMode & 48) == h) {
                if (configuration.orientation != i) {
                    i = configuration.orientation;
                    i();
                }
                alwgVar = f;
            } else {
                h = configuration.uiMode & 48;
                i();
            }
            f = new alwg(context);
            alwgVar = f;
        }
        return alwgVar;
    }

    public static synchronized void i() {
        synchronized (alwg.class) {
            f = null;
            a = null;
            b = null;
        }
    }

    public static boolean m(Context context) {
        if (a == null) {
            try {
                a = context.getContentResolver().call(e(), "isSuwDayNightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(e, "SetupWizard DayNight supporting status unknown; return as false.");
                a = null;
                return false;
            }
        }
        Bundle bundle = a;
        return bundle != null && bundle.getBoolean("isSuwDayNightEnabled", false);
    }

    public static boolean n(Context context) {
        if (b == null) {
            try {
                b = context.getContentResolver().call(e(), "isExtendedPartnerConfigEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(e, "SetupWizard extended partner configs supporting status unknown; return as false.");
                b = null;
                return false;
            }
        }
        Bundle bundle = b;
        return bundle != null && bundle.getBoolean("isExtendedPartnerConfigEnabled", false);
    }

    private static float q(Context context, TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public final float a(Context context, alwe alweVar) {
        return b(context, alweVar, 0.0f);
    }

    public final float b(Context context, alwe alweVar, float f2) {
        if (alweVar.bj != 6) {
            throw new IllegalArgumentException("Not a dimension resource");
        }
        if (!this.d.containsKey(alweVar)) {
            try {
                alwh g2 = g(context, alweVar.bi);
                Resources resources = g2.b;
                int i2 = g2.a;
                resources.getDimension(i2);
                TypedValue typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                if (typedValue.type == 5) {
                    this.d.put((EnumMap) alweVar, (alwe) typedValue);
                    return q(context, (TypedValue) this.d.get(alweVar));
                }
                String hexString = Integer.toHexString(i2);
                String hexString2 = Integer.toHexString(typedValue.type);
                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(hexString2).length());
                sb.append("Resource ID #0x");
                sb.append(hexString);
                sb.append(" type #0x");
                sb.append(hexString2);
                sb.append(" is not valid");
                throw new Resources.NotFoundException(sb.toString());
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return f2;
            }
        }
        return q(context, (TypedValue) this.d.get(alweVar));
    }

    public final int c(Context context, alwe alweVar) {
        int color;
        if (alweVar.bj != 3) {
            throw new IllegalArgumentException("Not a color resource");
        }
        if (!this.d.containsKey(alweVar)) {
            int i2 = 0;
            try {
                alwh g2 = g(context, alweVar.bi);
                Resources resources = g2.b;
                int i3 = g2.a;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i3, typedValue, true);
                if (typedValue.type == 1 && typedValue.data == 0) {
                    return 0;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    color = resources.getColor(i3, null);
                } else {
                    color = resources.getColor(i3);
                }
                i2 = color;
                this.d.put((EnumMap) alweVar, (alwe) Integer.valueOf(i2));
                return i2;
            } catch (NullPointerException unused) {
                return i2;
            }
        }
        return ((Integer) this.d.get(alweVar)).intValue();
    }

    public final Drawable d(Context context, alwe alweVar) {
        if (alweVar.bj != 4) {
            throw new IllegalArgumentException("Not a drawable resource");
        }
        if (!this.d.containsKey(alweVar)) {
            Drawable drawable = null;
            try {
                alwh g2 = g(context, alweVar.bi);
                Resources resources = g2.b;
                int i2 = g2.a;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                if (typedValue.type == 1 && typedValue.data == 0) {
                    return null;
                }
                drawable = resources.getDrawable(i2, null);
                this.d.put((EnumMap) alweVar, (alwe) drawable);
                return drawable;
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return drawable;
            }
        }
        return (Drawable) this.d.get(alweVar);
    }

    final alwh g(Context context, String str) {
        Bundle bundle = this.c.getBundle(str);
        Bundle bundle2 = this.c.getBundle("fallbackConfig");
        if (bundle2 != null) {
            bundle.putBundle("fallbackConfig", bundle2.getBundle(str));
        }
        alwh a2 = alwh.a(context, bundle);
        Resources resources = a2.b;
        Configuration configuration = resources.getConfiguration();
        if (!m(context) && (configuration.uiMode & 48) == 32) {
            if (a2 == null) {
                Log.w(e, "resourceEntry is null, skip to force day mode.");
            } else {
                configuration.uiMode = (configuration.uiMode & (-49)) | 16;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
        return a2;
    }

    public final String h(Context context, alwe alweVar) {
        if (alweVar.bj != 5) {
            throw new IllegalArgumentException("Not a string resource");
        }
        if (!this.d.containsKey(alweVar)) {
            try {
                alwh g2 = g(context, alweVar.bi);
                String string = g2.b.getString(g2.a);
                try {
                    this.d.put((EnumMap) alweVar, (alwe) string);
                    return string;
                } catch (NullPointerException unused) {
                    return string;
                }
            } catch (NullPointerException unused2) {
                return null;
            }
        }
        return (String) this.d.get(alweVar);
    }

    public final boolean j(Context context, alwe alweVar, boolean z) {
        if (alweVar.bj != 2) {
            throw new IllegalArgumentException("Not a bool resource");
        }
        if (!this.d.containsKey(alweVar)) {
            try {
                alwh g2 = g(context, alweVar.bi);
                z = g2.b.getBoolean(g2.a);
                this.d.put((EnumMap) alweVar, (alwe) Boolean.valueOf(z));
                return z;
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return z;
            }
        }
        return ((Boolean) this.d.get(alweVar)).booleanValue();
    }

    public final boolean k() {
        Bundle bundle = this.c;
        return bundle != null && !bundle.isEmpty();
    }

    public final boolean l(alwe alweVar) {
        return k() && this.c.containsKey(alweVar.bi);
    }

    public final float o(Context context, alwe alweVar) {
        if (alweVar.bj != 7) {
            throw new IllegalArgumentException("Not a fraction resource");
        }
        if (!this.d.containsKey(alweVar)) {
            try {
                alwh g2 = g(context, alweVar.bi);
                float fraction = g2.b.getFraction(g2.a, 1, 1);
                try {
                    this.d.put((EnumMap) alweVar, (alwe) Float.valueOf(fraction));
                    return fraction;
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return fraction;
                }
            } catch (Resources.NotFoundException | NullPointerException unused2) {
                return 0.0f;
            }
        }
        return ((Float) this.d.get(alweVar)).floatValue();
    }

    public final int p(Context context, alwe alweVar) {
        if (alweVar.bj != 1) {
            throw new IllegalArgumentException("Not a integer resource");
        }
        if (!this.d.containsKey(alweVar)) {
            try {
                alwh g2 = g(context, alweVar.bi);
                int integer = g2.b.getInteger(g2.a);
                try {
                    this.d.put((EnumMap) alweVar, (alwe) Integer.valueOf(integer));
                    return integer;
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return integer;
                }
            } catch (Resources.NotFoundException | NullPointerException unused2) {
                return 0;
            }
        }
        return ((Integer) this.d.get(alweVar)).intValue();
    }
}
