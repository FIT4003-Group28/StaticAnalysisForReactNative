package com.google.firebase.crashlytics.c.k;

import com.google.firebase.crashlytics.c.h.h;
import com.google.firebase.crashlytics.c.k.a;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
class e implements a.InterfaceC0183a {
    private static String a(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String a2 = h.a((InputStream) bufferedInputStream2);
                h.a((Closeable) bufferedInputStream2);
                return a2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                h.a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.firebase.crashlytics.c.k.a.InterfaceC0183a
    public String a(File file) {
        return a(file.getPath());
    }
}
