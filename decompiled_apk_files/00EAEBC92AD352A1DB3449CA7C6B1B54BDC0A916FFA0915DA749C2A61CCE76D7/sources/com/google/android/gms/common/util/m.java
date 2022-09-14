package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static String f7108a;

    /* renamed from: b  reason: collision with root package name */
    private static int f7109b;

    private static BufferedReader a(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static String a() {
        if (f7108a == null) {
            if (f7109b == 0) {
                f7109b = Process.myPid();
            }
            f7108a = a(f7109b);
        }
        return f7108a;
    }

    private static String a(int i) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        r0 = null;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = a(sb.toString());
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            str = bufferedReader.readLine().trim();
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            bufferedReader2 = bufferedReader;
            th = th2;
            k.a(bufferedReader2);
            throw th;
        }
        k.a(bufferedReader);
        return str;
    }
}
