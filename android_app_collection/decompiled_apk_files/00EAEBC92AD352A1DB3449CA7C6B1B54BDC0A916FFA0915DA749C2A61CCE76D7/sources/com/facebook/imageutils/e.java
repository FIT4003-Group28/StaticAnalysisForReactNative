package com.facebook.imageutils;

import java.io.InputStream;
/* loaded from: classes.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f5299a = e.class;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f5300a;

        /* renamed from: b  reason: collision with root package name */
        int f5301b;

        /* renamed from: c  reason: collision with root package name */
        int f5302c;

        private b() {
        }
    }

    e() {
    }

    public static int a(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i == 6) {
            return 90;
        }
        return i != 8 ? 0 : 270;
    }

    public static int a(InputStream inputStream, int i) {
        b bVar = new b();
        int a2 = a(inputStream, i, bVar);
        int i2 = bVar.f5302c - 8;
        if (a2 == 0 || i2 > a2) {
            return 0;
        }
        inputStream.skip(i2);
        return a(inputStream, a(inputStream, a2 - i2, bVar.f5300a, 274), bVar.f5300a);
    }

    private static int a(InputStream inputStream, int i, b bVar) {
        Class<?> cls;
        String str;
        if (i <= 8) {
            return 0;
        }
        bVar.f5301b = d.a(inputStream, 4, false);
        int i2 = i - 4;
        int i3 = bVar.f5301b;
        if (i3 == 1229531648 || i3 == 1296891946) {
            bVar.f5300a = bVar.f5301b == 1229531648;
            bVar.f5302c = d.a(inputStream, 4, bVar.f5300a);
            int i4 = i2 - 4;
            int i5 = bVar.f5302c;
            if (i5 >= 8 && i5 - 8 <= i4) {
                return i4;
            }
            cls = f5299a;
            str = "Invalid offset";
        } else {
            cls = f5299a;
            str = "Invalid TIFF header";
        }
        c.d.d.e.a.a(cls, str);
        return 0;
    }

    private static int a(InputStream inputStream, int i, boolean z) {
        if (i >= 10 && d.a(inputStream, 2, z) == 3 && d.a(inputStream, 4, z) == 1) {
            int a2 = d.a(inputStream, 2, z);
            d.a(inputStream, 2, z);
            return a2;
        }
        return 0;
    }

    private static int a(InputStream inputStream, int i, boolean z, int i2) {
        if (i < 14) {
            return 0;
        }
        int a2 = d.a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = a2 - 1;
            if (a2 <= 0 || i3 < 12) {
                break;
            }
            int i5 = i3 - 2;
            if (d.a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10L);
            i3 = i5 - 10;
            a2 = i4;
        }
        return 0;
    }
}
