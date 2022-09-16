package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: aymw  reason: default package */
/* loaded from: classes2.dex */
public final class aymw {
    public static volatile aoos a = aoos.a();

    public static long a(InputStream inputStream, OutputStream outputStream) {
        outputStream.getClass();
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

    public static ayav b(aoqu aoquVar) {
        return new aymv(aoquVar);
    }

    public static void c(aoos aoosVar) {
        aoosVar.getClass();
        a = aoosVar;
    }
}
