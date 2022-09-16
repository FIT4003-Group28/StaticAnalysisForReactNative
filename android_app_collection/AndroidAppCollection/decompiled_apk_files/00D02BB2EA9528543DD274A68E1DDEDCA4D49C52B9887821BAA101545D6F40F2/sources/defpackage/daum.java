package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: daum  reason: default package */
/* loaded from: classes5.dex */
public final class daum {
    public static long a(dauw dauwVar) {
        datv datvVar = new datv();
        try {
            dauwVar.e(datvVar);
            datvVar.close();
            return datvVar.a;
        } catch (Throwable th) {
            datvVar.close();
            throw th;
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) {
        try {
            dbsk.s(inputStream);
            dbsk.s(outputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            inputStream.close();
        }
    }
}
