package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsui  reason: default package */
/* loaded from: classes.dex */
public final class dsui {
    public static final boolean a;
    public static final boolean b;
    static final long c;
    static final boolean d;
    private static final Unsafe e;
    private static final Class<?> f;
    private static final boolean g;
    private static final boolean h;
    private static final dsuh i;
    private static final long j;

    /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsui.<clinit>():void");
    }

    private dsui() {
    }

    private static boolean A(Class<?> cls) {
        if (!dsoi.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field B() {
        Field C;
        if (!dsoi.a() || (C = C(Buffer.class, "effectiveDirectAddress")) == null) {
            Field C2 = C(Buffer.class, "address");
            if (C2 != null && C2.getType() == Long.TYPE) {
                return C2;
            }
            return null;
        }
        return C;
    }

    private static Field C(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void D(Class<?> cls) {
        if (b) {
            i.s(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(Class<T> cls) {
        try {
            return (T) e.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Object obj, long j2) {
        return i.l(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Object obj, long j2, int i2) {
        i.m(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long d(Object obj, long j2) {
        return i.n(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Object obj, long j2, long j3) {
        i.o(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(Object obj, long j2) {
        return i.d(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj, long j2, boolean z) {
        i.e(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float h(Object obj, long j2) {
        return i.f(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Object obj, long j2, float f2) {
        i.g(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double j(Object obj, long j2) {
        return i.h(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(Object obj, long j2, double d2) {
        i.i(obj, j2, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object l(Object obj, long j2) {
        return i.p(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(Object obj, long j2, Object obj2) {
        i.q(obj, j2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte n(byte[] bArr, long j2) {
        return i.b(bArr, c + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(byte[] bArr, long j2, byte b2) {
        i.c(bArr, c + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte p(long j2) {
        return i.a(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long q(ByteBuffer byteBuffer) {
        return i.n(byteBuffer, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe r() {
        try {
            return (Unsafe) AccessController.doPrivileged(new dsud());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte s(Object obj, long j2) {
        return (byte) ((b(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & 255);
    }

    public static byte t(Object obj, long j2) {
        return (byte) ((b(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static void u(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        c(obj, j3, ((b2 & 255) << i2) | (b(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static void v(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        c(obj, j3, ((b2 & 255) << i2) | (b(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static boolean w(Object obj, long j2) {
        return s(obj, j2) != 0;
    }

    public static boolean x(Object obj, long j2) {
        return t(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y(long j2, byte[] bArr, long j3) {
        i.j(j2, bArr, j3);
    }

    private static int z(Class<?> cls) {
        if (b) {
            return i.r(cls);
        }
        return -1;
    }
}
