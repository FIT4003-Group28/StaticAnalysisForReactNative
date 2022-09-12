package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dato  reason: default package */
/* loaded from: classes5.dex */
public final class dato {
    public static String a(byte[] bArr) {
        Charset charset = datk.a;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }
}
