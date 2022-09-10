package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: dyyq  reason: default package */
/* loaded from: classes.dex */
public final class dyyq {
    static volatile dsqa a = dsqa.b();

    public static void a(dsqa dsqaVar) {
        dbsk.t(dsqaVar, "newRegistry");
        a = dsqaVar;
    }

    public static <T extends dssj> dyhy<T> b(T t) {
        return new dyyo(t);
    }

    public static <T extends dssj> dyhp<T> c(T t) {
        return new dyyp(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long d(InputStream inputStream, OutputStream outputStream) {
        dbsk.t(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }
}
