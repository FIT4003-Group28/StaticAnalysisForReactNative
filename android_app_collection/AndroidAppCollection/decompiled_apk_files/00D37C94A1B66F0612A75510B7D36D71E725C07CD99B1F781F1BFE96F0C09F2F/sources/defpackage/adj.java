package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.hardware.biometrics.BiometricPrompt;
import android.util.Log;
import android.view.View;
import com.google.android.youtube.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: adj  reason: default package */
/* loaded from: classes.dex */
public class adj {
    private static Method a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }

    public float c(View view) {
        throw null;
    }

    public void d(View view, int i, int i2, int i3, int i4) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public void e(View view, float f) {
        throw null;
    }

    public void f(View view, int i) {
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i != 1) {
            if (i != 7) {
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(R.string.fingerprint_error_user_canceled);
                    case 11:
                        return context.getString(R.string.fingerprint_error_no_fingerprints);
                    case 12:
                        return context.getString(R.string.fingerprint_error_hw_not_present);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i);
                        return context.getString(R.string.default_error_msg);
                }
            }
            return context.getString(R.string.fingerprint_error_lockout);
        }
        return context.getString(R.string.fingerprint_error_hw_not_available);
    }
}
