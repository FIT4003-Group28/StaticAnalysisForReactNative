package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: bnw  reason: default package */
/* loaded from: classes3.dex */
public final class bnw {
    public static final File b(InputStream inputStream, bnv bnvVar, Context context, String str) {
        File file = new File(context.getCacheDir(), a(str, bnvVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    public static String a(String str, bnv bnvVar, boolean z) {
        String str2;
        String replaceAll = str.replaceAll("\\W+", "");
        if (z) {
            String valueOf = String.valueOf(bnvVar.c);
            str2 = valueOf.length() != 0 ? ".temp".concat(valueOf) : new String(".temp");
        } else {
            str2 = bnvVar.c;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(replaceAll).length() + 13 + String.valueOf(str2).length());
        sb.append("lottie_cache_");
        sb.append(replaceAll);
        sb.append(str2);
        return sb.toString();
    }
}
