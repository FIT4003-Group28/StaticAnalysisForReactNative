package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: aykp  reason: default package */
/* loaded from: classes2.dex */
public final class aykp {
    public static final aykl a = new aykn(new byte[0], 0, 0);

    public static aykl a(ByteBuffer byteBuffer) {
        return new ayko(byteBuffer);
    }

    public static String b(aykl ayklVar, Charset charset) {
        charset.getClass();
        int f = ayklVar.f();
        byte[] bArr = new byte[f];
        ayklVar.k(bArr, 0, f);
        return new String(bArr, charset);
    }

    public static InputStream c(aykl ayklVar) {
        return new aykm(ayklVar);
    }
}
