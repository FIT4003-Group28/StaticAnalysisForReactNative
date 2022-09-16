package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: cnxj  reason: default package */
/* loaded from: classes5.dex */
public final class cnxj {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
