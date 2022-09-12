package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: daou  reason: default package */
/* loaded from: classes5.dex */
public final class daou {
    static Bundle a;
    private static daou d;
    private static ContentObserver e;
    public Bundle b;
    final EnumMap<daos, Object> c;

    private daou(Context context) {
        this.b = null;
        EnumMap<daos, Object> enumMap = new EnumMap<>(daos.class);
        this.c = enumMap;
        Bundle bundle = this.b;
        if (bundle == null || bundle.isEmpty()) {
            try {
                this.b = context.getContentResolver().call(i(), "getOverlayConfig", (String) null, (Bundle) null);
                enumMap.clear();
            } catch (IllegalArgumentException | SecurityException unused) {
            }
        }
        if (h(context)) {
            if (e != null) {
                try {
                    context.getContentResolver().unregisterContentObserver(e);
                    e = null;
                } catch (IllegalArgumentException | NullPointerException | SecurityException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    sb.append("Failed to unregister content observer: ");
                    sb.append(valueOf);
                    sb.toString();
                }
            }
            Uri i = i();
            try {
                e = new daot();
                context.getContentResolver().registerContentObserver(i, true, e);
            } catch (IllegalArgumentException | NullPointerException | SecurityException e3) {
                String valueOf2 = String.valueOf(i);
                String valueOf3 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42 + String.valueOf(valueOf3).length());
                sb2.append("Failed to register content observer for ");
                sb2.append(valueOf2);
                sb2.append(": ");
                sb2.append(valueOf3);
                sb2.toString();
            }
        }
    }

    public static synchronized daou a(Context context) {
        daou daouVar;
        synchronized (daou.class) {
            if (d == null) {
                d = new daou(context);
            }
            daouVar = d;
        }
        return daouVar;
    }

    public static synchronized void g() {
        synchronized (daou.class) {
            d = null;
            a = null;
        }
    }

    public static boolean h(Context context) {
        if (a == null) {
            try {
                a = context.getContentResolver().call(i(), "isSuwDayNightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                a = null;
                return false;
            }
        }
        Bundle bundle = a;
        return bundle != null && bundle.getBoolean("isSuwDayNightEnabled", false);
    }

    static Uri i() {
        return new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }

    private static float m(Context context, TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public final boolean b() {
        Bundle bundle = this.b;
        return bundle != null && !bundle.isEmpty();
    }

    public final int c(Context context, daos daosVar) {
        int color;
        if (daosVar.V != 3) {
            throw new IllegalArgumentException("Not a color resource");
        }
        if (!this.c.containsKey(daosVar)) {
            try {
                daov f = f(context, daosVar.U);
                Resources resources = f.c;
                int i = f.b;
                if (Build.VERSION.SDK_INT >= 23) {
                    color = resources.getColor(i, null);
                } else {
                    color = resources.getColor(i);
                }
                try {
                    this.c.put((EnumMap<daos, Object>) daosVar, (daos) Integer.valueOf(color));
                } catch (NullPointerException unused) {
                    return color;
                }
            } catch (NullPointerException unused2) {
                return 0;
            }
        } else {
            return ((Integer) this.c.get(daosVar)).intValue();
        }
    }

    public final Drawable d(Context context, daos daosVar) {
        if (daosVar.V != 4) {
            throw new IllegalArgumentException("Not a drawable resource");
        }
        if (!this.c.containsKey(daosVar)) {
            Drawable drawable = null;
            try {
                daov f = f(context, daosVar.U);
                Resources resources = f.c;
                int i = f.b;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                if (typedValue.type == 1 && typedValue.data == 0) {
                    return null;
                }
                drawable = resources.getDrawable(i, null);
                this.c.put((EnumMap<daos, Object>) daosVar, (daos) drawable);
                return drawable;
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return drawable;
            }
        }
        return (Drawable) this.c.get(daosVar);
    }

    public final String e(Context context, daos daosVar) {
        if (daosVar.V != 5) {
            throw new IllegalArgumentException("Not a string resource");
        }
        if (!this.c.containsKey(daosVar)) {
            try {
                daov f = f(context, daosVar.U);
                String string = f.c.getString(f.b);
                try {
                    this.c.put((EnumMap<daos, Object>) daosVar, (daos) string);
                    return string;
                } catch (NullPointerException unused) {
                    return string;
                }
            } catch (NullPointerException unused2) {
                return null;
            }
        }
        return (String) this.c.get(daosVar);
    }

    final daov f(Context context, String str) {
        Bundle bundle = this.b.getBundle(str);
        Bundle bundle2 = this.b.getBundle("fallbackConfig");
        if (bundle2 != null) {
            bundle.putBundle("fallbackConfig", bundle2.getBundle(str));
        }
        daov a2 = daov.a(context, bundle);
        if (!h(context) && ((UiModeManager) context.getSystemService("uimode")).getNightMode() == 2 && a2 != null) {
            Resources resources = a2.c;
            Configuration configuration = resources.getConfiguration();
            configuration.uiMode = (configuration.uiMode & (-49)) | 16;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return a2;
    }

    public final boolean j(Context context, daos daosVar) {
        if (daosVar.V != 2) {
            throw new IllegalArgumentException("Not a bool resource");
        }
        if (!this.c.containsKey(daosVar)) {
            try {
                daov f = f(context, daosVar.U);
                boolean z = f.c.getBoolean(f.b);
                try {
                    this.c.put((EnumMap<daos, Object>) daosVar, (daos) Boolean.valueOf(z));
                    return z;
                } catch (NullPointerException unused) {
                    return z;
                }
            } catch (NullPointerException unused2) {
                return false;
            }
        }
        return ((Boolean) this.c.get(daosVar)).booleanValue();
    }

    public final float k(Context context, daos daosVar) {
        if (daosVar.V != 6) {
            throw new IllegalArgumentException("Not a dimension resource");
        }
        if (!this.c.containsKey(daosVar)) {
            try {
                daov f = f(context, daosVar.U);
                Resources resources = f.c;
                int i = f.b;
                try {
                    TypedValue typedValue = new TypedValue();
                    resources.getValue(i, typedValue, true);
                    if (typedValue.type != 5) {
                        String hexString = Integer.toHexString(i);
                        String hexString2 = Integer.toHexString(typedValue.type);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(hexString2).length());
                        sb.append("Resource ID #0x");
                        sb.append(hexString);
                        sb.append(" type #0x");
                        sb.append(hexString2);
                        sb.append(" is not valid");
                        throw new Resources.NotFoundException(sb.toString());
                    }
                    this.c.put((EnumMap<daos, Object>) daosVar, (daos) typedValue);
                    return m(context, (TypedValue) this.c.get(daosVar));
                } catch (NullPointerException unused) {
                    return resources.getDimension(i);
                }
            } catch (NullPointerException unused2) {
                return 0.0f;
            }
        }
        return m(context, (TypedValue) this.c.get(daosVar));
    }

    public final float l(Context context, daos daosVar) {
        if (daosVar.V != 7) {
            throw new IllegalArgumentException("Not a fraction resource");
        }
        if (!this.c.containsKey(daosVar)) {
            try {
                daov f = f(context, daosVar.U);
                float fraction = f.c.getFraction(f.b, 1, 1);
                try {
                    this.c.put((EnumMap<daos, Object>) daosVar, (daos) Float.valueOf(fraction));
                    return fraction;
                } catch (NullPointerException unused) {
                    return fraction;
                }
            } catch (NullPointerException unused2) {
                return 0.0f;
            }
        }
        return ((Float) this.c.get(daosVar)).floatValue();
    }
}
