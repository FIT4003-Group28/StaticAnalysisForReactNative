package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dcuq  reason: default package */
/* loaded from: classes5.dex */
final class dcuq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return (byte) (read & 255);
        }
        throw new IOException("EOF");
    }
}
