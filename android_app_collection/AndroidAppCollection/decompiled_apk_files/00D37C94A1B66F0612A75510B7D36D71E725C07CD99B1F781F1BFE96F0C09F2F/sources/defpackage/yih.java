package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: yih  reason: default package */
/* loaded from: classes4.dex */
public final class yih {
    public static File a(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null || str == null) {
            return externalCacheDir;
        }
        File file = new File(externalCacheDir, str);
        file.mkdir();
        return file;
    }

    public static File b(String str, File file) {
        if (file == null || file.isDirectory()) {
            return file;
        }
        String path = file.getPath();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(path).length());
        sb.append(str);
        sb.append(": ");
        sb.append(path);
        sb.append(" is not a directory or does not exist.");
        zep.b(sb.toString());
        return null;
    }

    public static boolean c(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static boolean d(int i) {
        return i == 1;
    }
}
