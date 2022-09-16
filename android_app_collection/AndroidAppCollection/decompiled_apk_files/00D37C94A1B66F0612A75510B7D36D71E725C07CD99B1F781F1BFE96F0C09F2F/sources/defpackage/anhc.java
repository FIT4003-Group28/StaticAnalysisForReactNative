package defpackage;

import java.io.File;
import java.io.FileOutputStream;
/* compiled from: PG */
/* renamed from: anhc  reason: default package */
/* loaded from: classes.dex */
public class anhc {
    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static void d(byte[] bArr, File file, amvn amvnVar) {
        bArr.getClass();
        anep a = anep.a();
        try {
            FileOutputStream e = e(file, amvnVar);
            a.c(e);
            e.write(bArr);
            e.flush();
        } finally {
        }
    }

    public static FileOutputStream e(File file, amvn amvnVar) {
        return new FileOutputStream(file, amvnVar.contains(aner.a));
    }
}
