package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Binder;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vqw  reason: default package */
/* loaded from: classes4.dex */
public class vqw {
    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String hexString = Integer.toHexString(glGetError);
        StringBuilder sb = new StringBuilder(str.length() + 14 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(": GL error: 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }

    public static void c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String hexString = Integer.toHexString(glGetError);
            StringBuilder sb = new StringBuilder(str.length() + 14 + String.valueOf(hexString).length());
            sb.append(str);
            sb.append(": GL error: 0x");
            sb.append(hexString);
            vqy.b(sb.toString());
        }
    }

    public static String e(Context context, long j) {
        int i = (int) (j / 60000);
        int i2 = ((int) (j / 1000)) % 60;
        String quantityString = context.getResources().getQuantityString(R.plurals.duration_seconds, i2, Integer.valueOf(i2));
        if (i == 0) {
            return quantityString;
        }
        return context.getResources().getString(R.string.duration_content_description, context.getResources().getQuantityString(R.plurals.duration_minutes, i, Integer.valueOf(i)), quantityString);
    }

    public static String f(Context context, long j, boolean z) {
        return g(context, true != z ? R.string.time_minutes_seconds : R.string.time_minutes_seconds_millis, j);
    }

    public static String g(Context context, int i, long j) {
        int i2 = (int) (j % 1000);
        return context.getResources().getString(i, Integer.valueOf((int) (j / 60000)), Integer.valueOf(((int) (j / 1000)) % 60), Integer.valueOf(i2), Integer.valueOf(i2 / 100));
    }

    public static Object h(vbb vbbVar) {
        try {
            return vbbVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return vbbVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
