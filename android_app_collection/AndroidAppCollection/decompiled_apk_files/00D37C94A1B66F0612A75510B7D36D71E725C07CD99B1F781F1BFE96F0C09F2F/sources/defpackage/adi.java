package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adi  reason: default package */
/* loaded from: classes.dex */
public final class adi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }

    public static boolean c(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, R.array.hide_fingerprint_instantly_prefixes);
    }

    public static Path e(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }
}
