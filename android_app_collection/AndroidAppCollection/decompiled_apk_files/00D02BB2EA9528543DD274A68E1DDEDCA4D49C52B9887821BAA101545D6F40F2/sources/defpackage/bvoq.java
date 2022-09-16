package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bvoq  reason: default package */
/* loaded from: classes4.dex */
public final class bvoq {
    public static void a() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/sys/fs/file-nr"));
            } catch (IOException unused) {
            }
        } catch (Exception unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                String str = bufferedReader.readLine().trim().split("\t")[0];
                bufferedReader.close();
            } catch (Exception unused3) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                int length = new File("/proc/self/fd").listFiles().length;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
            int length2 = new File("/proc/self/fd").listFiles().length;
        } catch (Exception unused5) {
        }
    }
}
