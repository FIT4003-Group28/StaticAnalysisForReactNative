package com.google.android.gms.common.util;

import android.util.Base64;
/* loaded from: classes.dex */
public final class c {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }
}
