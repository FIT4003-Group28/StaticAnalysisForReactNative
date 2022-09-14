package com.google.firebase.crashlytics.c.k;

import android.content.Context;
import com.google.firebase.crashlytics.c.h.h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/* loaded from: classes.dex */
public final class b {
    public static byte[] a(File file, Context context) {
        BufferedReader bufferedReader;
        if (file == null || !file.exists()) {
            return new byte[0];
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                byte[] a2 = new a(context, new e()).a(bufferedReader);
                h.a(bufferedReader);
                return a2;
            } catch (Throwable th) {
                th = th;
                h.a(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }
}
