package com.facebook.h;

import com.facebook.common.d.g;
import com.facebook.common.d.i;
import com.facebook.h.c;
/* compiled from: DefaultImageFormatChecker.java */
/* loaded from: classes.dex */
public class a implements c.a {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f2505b = {-1, -40, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int f2506c = f2505b.length;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f2507d = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final int e = f2507d.length;
    private static final byte[] f = e.a("GIF87a");
    private static final byte[] g = e.a("GIF89a");
    private static final byte[] h = e.a("BM");
    private static final int i = h.length;

    /* renamed from: a  reason: collision with root package name */
    final int f2508a = g.a(21, 20, f2506c, e, 6, i);

    @Override // com.facebook.h.c.a
    public int a() {
        return this.f2508a;
    }

    @Override // com.facebook.h.c.a
    public final c a(byte[] bArr, int i2) {
        i.a(bArr);
        if (com.facebook.common.m.c.b(bArr, 0, i2)) {
            return b(bArr, i2);
        }
        if (c(bArr, i2)) {
            return b.f2509a;
        }
        if (d(bArr, i2)) {
            return b.f2510b;
        }
        if (e(bArr, i2)) {
            return b.f2511c;
        }
        if (f(bArr, i2)) {
            return b.f2512d;
        }
        return c.f2513a;
    }

    private static c b(byte[] bArr, int i2) {
        i.a(com.facebook.common.m.c.b(bArr, 0, i2));
        if (com.facebook.common.m.c.b(bArr, 0)) {
            return b.e;
        }
        if (com.facebook.common.m.c.c(bArr, 0)) {
            return b.f;
        }
        if (com.facebook.common.m.c.a(bArr, 0, i2)) {
            if (com.facebook.common.m.c.a(bArr, 0)) {
                return b.i;
            }
            if (com.facebook.common.m.c.d(bArr, 0)) {
                return b.h;
            }
            return b.g;
        }
        return c.f2513a;
    }

    private static boolean c(byte[] bArr, int i2) {
        return i2 >= f2505b.length && e.a(bArr, f2505b);
    }

    private static boolean d(byte[] bArr, int i2) {
        return i2 >= f2507d.length && e.a(bArr, f2507d);
    }

    private static boolean e(byte[] bArr, int i2) {
        if (i2 < 6) {
            return false;
        }
        return e.a(bArr, f) || e.a(bArr, g);
    }

    private static boolean f(byte[] bArr, int i2) {
        if (i2 < h.length) {
            return false;
        }
        return e.a(bArr, h);
    }
}
