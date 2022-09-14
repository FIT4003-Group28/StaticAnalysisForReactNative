package defpackage;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: crxw  reason: default package */
/* loaded from: classes5.dex */
public final class crxw {
    private final byte[] a;

    public crxw(byte[] bArr) {
        if (bArr == null || bArr.length != 20) {
            throw new IllegalArgumentException("Incorrect fingerprint size");
        }
        this.a = bArr;
    }

    @dzsi
    public static String a(@dzsi InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        crxw b = b(inputStream);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            byte b2 = b.a[i];
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString();
    }

    public static crxw b(InputStream inputStream) {
        byte[] bArr = new byte[8192];
        DigestInputStream digestInputStream = null;
        try {
            try {
                DigestInputStream digestInputStream2 = new DigestInputStream(new BufferedInputStream(inputStream, 8192), MessageDigest.getInstance("SHA-1"));
                do {
                    try {
                    } catch (NoSuchAlgorithmException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    } catch (Throwable th) {
                        th = th;
                        digestInputStream = digestInputStream2;
                        if (digestInputStream != null) {
                            digestInputStream.close();
                        }
                        throw th;
                    }
                } while (digestInputStream2.read(bArr) >= 0);
                crxw crxwVar = new crxw(digestInputStream2.getMessageDigest().digest());
                digestInputStream2.close();
                return crxwVar;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
        }
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof crxw) {
            return Arrays.equals(this.a, ((crxw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
