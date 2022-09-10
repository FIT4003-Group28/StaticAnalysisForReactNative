package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: ddau  reason: default package */
/* loaded from: classes.dex */
public final class ddau {
    public static ddah a(File file) {
        return new ddat(file);
    }

    public static ddaf b(File file, ddar... ddarVarArr) {
        return new ddas(file, ddarVarArr);
    }

    public static ddal c(File file, Charset charset) {
        return new ddag(a(file), charset);
    }

    public static byte[] d(File file) {
        return a(file).a();
    }

    public static void e(byte[] bArr, File file) {
        ddaf b = b(file, new ddar[0]);
        dbsk.s(bArr);
        ddaq a = ddaq.a();
        try {
            FileOutputStream a2 = ((ddas) b).a();
            a.c(a2);
            a2.write(bArr);
            a2.flush();
        } finally {
        }
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Unable to create parent directories of ");
        sb.append(valueOf);
        throw new IOException(sb.toString());
    }
}
