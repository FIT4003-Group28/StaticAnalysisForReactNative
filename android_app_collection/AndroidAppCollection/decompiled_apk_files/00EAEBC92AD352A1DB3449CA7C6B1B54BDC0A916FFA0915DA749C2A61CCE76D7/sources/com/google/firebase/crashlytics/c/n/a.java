package com.google.firebase.crashlytics.c.n;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9058a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f9059b = 0;

    static {
        new a(new byte[0]);
    }

    private a(byte[] bArr) {
        this.f9058a = bArr;
    }

    public static a a(String str) {
        try {
            return new a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported.", e2);
        }
    }

    public static a a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static a a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new a(bArr2);
    }

    public InputStream a() {
        return new ByteArrayInputStream(this.f9058a);
    }

    public void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f9058a, i, bArr, i2, i3);
    }

    public int b() {
        return this.f9058a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.f9058a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).f9058a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f9059b;
        if (i == 0) {
            byte[] bArr = this.f9058a;
            int length = bArr.length;
            for (byte b2 : bArr) {
                length = (length * 31) + b2;
            }
            i = length == 0 ? 1 : length;
            this.f9059b = i;
        }
        return i;
    }
}
