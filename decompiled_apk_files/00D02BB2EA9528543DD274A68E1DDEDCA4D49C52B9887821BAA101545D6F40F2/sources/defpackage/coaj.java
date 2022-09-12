package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: coaj  reason: default package */
/* loaded from: classes5.dex */
public final class coaj {
    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static byte[] b(String str) {
        String valueOf = String.valueOf(str);
        return (valueOf.length() != 0 ? "ERROR : ".concat(valueOf) : new String("ERROR : ")).getBytes();
    }
}
