package com.facebook.i;

import java.io.InputStream;
import org.spongycastle.crypto.tls.CipherSuite;
/* compiled from: TiffUtil.java */
/* loaded from: classes.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f2522a = d.class;

    d() {
    }

    public static int a(int i) {
        if (i != 3) {
            if (i == 6) {
                return 90;
            }
            if (i == 8) {
                return 270;
            }
            switch (i) {
                case 0:
                case 1:
                    return 0;
                default:
                    com.facebook.common.e.a.b(f2522a, "Unsupported orientation");
                    return 0;
            }
        }
        return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
    }

    public static int a(InputStream inputStream, int i) {
        a aVar = new a();
        int a2 = a(inputStream, i, aVar);
        int i2 = aVar.f2525c - 8;
        if (a2 == 0 || i2 > a2) {
            return 0;
        }
        inputStream.skip(i2);
        return a(inputStream, a(inputStream, a2 - i2, aVar.f2523a, 274), aVar.f2523a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TiffUtil.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f2523a;

        /* renamed from: b  reason: collision with root package name */
        int f2524b;

        /* renamed from: c  reason: collision with root package name */
        int f2525c;

        private a() {
        }
    }

    private static int a(InputStream inputStream, int i, a aVar) {
        if (i <= 8) {
            return 0;
        }
        aVar.f2524b = c.a(inputStream, 4, false);
        int i2 = i - 4;
        if (aVar.f2524b != 1229531648 && aVar.f2524b != 1296891946) {
            com.facebook.common.e.a.d(f2522a, "Invalid TIFF header");
            return 0;
        }
        aVar.f2523a = aVar.f2524b == 1229531648;
        aVar.f2525c = c.a(inputStream, 4, aVar.f2523a);
        int i3 = i2 - 4;
        if (aVar.f2525c >= 8 && aVar.f2525c - 8 <= i3) {
            return i3;
        }
        com.facebook.common.e.a.d(f2522a, "Invalid offset");
        return 0;
    }

    private static int a(InputStream inputStream, int i, boolean z, int i2) {
        if (i < 14) {
            return 0;
        }
        int a2 = c.a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = a2 - 1;
            if (a2 <= 0 || i3 < 12) {
                break;
            }
            int i5 = i3 - 2;
            if (c.a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10L);
            i3 = i5 - 10;
            a2 = i4;
        }
        return 0;
    }

    private static int a(InputStream inputStream, int i, boolean z) {
        if (i >= 10 && c.a(inputStream, 2, z) == 3 && c.a(inputStream, 4, z) == 1) {
            int a2 = c.a(inputStream, 2, z);
            c.a(inputStream, 2, z);
            return a2;
        }
        return 0;
    }
}
