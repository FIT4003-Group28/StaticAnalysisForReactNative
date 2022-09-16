package com.facebook.h;

import com.facebook.common.d.i;
import java.io.UnsupportedEncodingException;
/* compiled from: ImageFormatCheckerUtils.java */
/* loaded from: classes.dex */
public class e {
    public static byte[] a(String str) {
        i.a(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        i.a(bArr);
        i.a(bArr2);
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
