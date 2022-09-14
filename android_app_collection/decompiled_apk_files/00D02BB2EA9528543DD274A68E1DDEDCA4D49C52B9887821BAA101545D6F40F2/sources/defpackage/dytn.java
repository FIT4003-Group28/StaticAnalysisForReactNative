package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dytn  reason: default package */
/* loaded from: classes6.dex */
public final class dytn {
    static {
        new dytl(new byte[0], 0, 0);
    }

    public static dytj a(ByteBuffer byteBuffer) {
        return new dytm(byteBuffer);
    }

    public static String b(dytj dytjVar, Charset charset) {
        dbsk.t(charset, "charset");
        int c = dytjVar.c();
        byte[] bArr = new byte[c];
        dytjVar.e(bArr, 0, c);
        return new String(bArr, charset);
    }

    public static InputStream c(dytj dytjVar) {
        return new dytk(dytjVar);
    }
}
