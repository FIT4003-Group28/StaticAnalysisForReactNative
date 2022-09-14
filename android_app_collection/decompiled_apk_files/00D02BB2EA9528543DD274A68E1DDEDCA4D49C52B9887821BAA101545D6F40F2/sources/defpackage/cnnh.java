package defpackage;

import java.security.MessageDigest;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnnh  reason: default package */
/* loaded from: classes5.dex */
public class cnnh {
    public static final cnnh a = new cnnh(true);
    public final boolean b;

    public cnnh(boolean z) {
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cnnh a(Callable<String> callable) {
        return new cnng();
    }

    public static cnnh b(String str) {
        return new cnnh(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str, cnmx cnmxVar, boolean z, boolean z2) {
        Object[] objArr = new Object[5];
        objArr[0] = true != z2 ? "not allowed" : "debug cert rejected";
        objArr[1] = str;
        MessageDigest a2 = cnxh.a("SHA-1");
        cnwc.a(a2);
        byte[] digest = a2.digest(((cnmy) cnmxVar).a);
        char[] cArr = cnxq.a;
        int length = digest.length;
        char[] cArr2 = new char[length + length];
        int i = 0;
        for (byte b : digest) {
            int i2 = b & 255;
            int i3 = i + 1;
            cArr2[i] = cnxq.b[i2 >>> 4];
            i = i3 + 1;
            cArr2[i3] = cnxq.b[i2 & 15];
        }
        objArr[2] = new String(cArr2);
        objArr[3] = Boolean.valueOf(z);
        StringBuilder sb = new StringBuilder(17);
        sb.append(cnnl.b);
        sb.append(".");
        sb.append(false);
        objArr[4] = sb.toString();
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cnnh d(String str) {
        return new cnnh(false);
    }
}
