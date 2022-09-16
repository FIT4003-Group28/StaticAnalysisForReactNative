package defpackage;

import java.security.SecureRandom;
/* compiled from: PG */
/* renamed from: anum  reason: default package */
/* loaded from: classes.dex */
public final class anum {
    private static final ThreadLocal a = new anul();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
