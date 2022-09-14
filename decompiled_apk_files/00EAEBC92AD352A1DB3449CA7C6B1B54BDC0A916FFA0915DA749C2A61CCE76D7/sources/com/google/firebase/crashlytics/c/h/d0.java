package com.google.firebase.crashlytics.c.h;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
class d0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(File file, List<c0> list) {
        for (c0 c0Var : list) {
            InputStream inputStream = null;
            try {
                inputStream = c0Var.a();
                if (inputStream != null) {
                    a(inputStream, new File(file, c0Var.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                h.a((Closeable) null);
                throw th;
            }
            h.a((Closeable) inputStream);
        }
    }

    private static void a(InputStream inputStream, File file) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        h.a(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    h.a(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
