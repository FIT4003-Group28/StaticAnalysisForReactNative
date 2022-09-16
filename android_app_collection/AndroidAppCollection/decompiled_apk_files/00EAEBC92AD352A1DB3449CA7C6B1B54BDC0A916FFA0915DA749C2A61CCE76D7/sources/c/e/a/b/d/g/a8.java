package c.e.a.b.d.g;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a8 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4043a = Logger.getLogger(a8.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f4044b = c();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f4045c = o3.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f4046d = d(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f4047e = d(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final c f4048f;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f4049g;

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f4050h;
    private static final long i;
    static final boolean j;

    /* loaded from: classes.dex */
    static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final byte a(Object obj, long j) {
            return a8.j ? a8.k(obj, j) : a8.l(obj, j);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, byte b2) {
            if (a8.j) {
                a8.c(obj, j, b2);
            } else {
                a8.d(obj, j, b2);
            }
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, double d2) {
            a(obj, j, Double.doubleToLongBits(d2));
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, float f2) {
            a(obj, j, Float.floatToIntBits(f2));
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, boolean z) {
            if (a8.j) {
                a8.d(obj, j, z);
            } else {
                a8.e(obj, j, z);
            }
        }

        @Override // c.e.a.b.d.g.a8.c
        public final boolean b(Object obj, long j) {
            return a8.j ? a8.m(obj, j) : a8.n(obj, j);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        @Override // c.e.a.b.d.g.a8.c
        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }
    }

    /* loaded from: classes.dex */
    static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final byte a(Object obj, long j) {
            return a8.j ? a8.k(obj, j) : a8.l(obj, j);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, byte b2) {
            if (a8.j) {
                a8.c(obj, j, b2);
            } else {
                a8.d(obj, j, b2);
            }
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, double d2) {
            a(obj, j, Double.doubleToLongBits(d2));
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, float f2) {
            a(obj, j, Float.floatToIntBits(f2));
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, boolean z) {
            if (a8.j) {
                a8.d(obj, j, z);
            } else {
                a8.e(obj, j, z);
            }
        }

        @Override // c.e.a.b.d.g.a8.c
        public final boolean b(Object obj, long j) {
            return a8.j ? a8.m(obj, j) : a8.n(obj, j);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        @Override // c.e.a.b.d.g.a8.c
        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f4051a;

        c(Unsafe unsafe) {
            this.f4051a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void a(Object obj, long j, byte b2);

        public abstract void a(Object obj, long j, double d2);

        public abstract void a(Object obj, long j, float f2);

        public final void a(Object obj, long j, int i) {
            this.f4051a.putInt(obj, j, i);
        }

        public final void a(Object obj, long j, long j2) {
            this.f4051a.putLong(obj, j, j2);
        }

        public abstract void a(Object obj, long j, boolean z);

        public abstract boolean b(Object obj, long j);

        public abstract float c(Object obj, long j);

        public abstract double d(Object obj, long j);

        public final int e(Object obj, long j) {
            return this.f4051a.getInt(obj, j);
        }

        public final long f(Object obj, long j) {
            return this.f4051a.getLong(obj, j);
        }
    }

    /* loaded from: classes.dex */
    static final class d extends c {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final byte a(Object obj, long j) {
            return this.f4051a.getByte(obj, j);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, byte b2) {
            this.f4051a.putByte(obj, j, b2);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, double d2) {
            this.f4051a.putDouble(obj, j, d2);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, float f2) {
            this.f4051a.putFloat(obj, j, f2);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final void a(Object obj, long j, boolean z) {
            this.f4051a.putBoolean(obj, j, z);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final boolean b(Object obj, long j) {
            return this.f4051a.getBoolean(obj, j);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final float c(Object obj, long j) {
            return this.f4051a.getFloat(obj, j);
        }

        @Override // c.e.a.b.d.g.a8.c
        public final double d(Object obj, long j) {
            return this.f4051a.getDouble(obj, j);
        }
    }

    static {
        c cVar;
        c cVar2 = null;
        if (f4044b != null) {
            if (!o3.a()) {
                cVar2 = new d(f4044b);
            } else if (f4046d) {
                cVar2 = new a(f4044b);
            } else if (f4047e) {
                cVar2 = new b(f4044b);
            }
        }
        f4048f = cVar2;
        f4049g = e();
        f4050h = d();
        i = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field f2 = f();
        if (f2 != null && (cVar = f4048f) != null) {
            cVar.f4051a.objectFieldOffset(f2);
        }
        j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private a8() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(byte[] bArr, long j2) {
        return f4048f.a(bArr, i + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Object obj, long j2) {
        return f4048f.e(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(Class<T> cls) {
        try {
            return (T) f4044b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, double d2) {
        f4048f.a(obj, j2, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, float f2) {
        f4048f.a(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, int i2) {
        f4048f.a(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, long j3) {
        f4048f.a(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, Object obj2) {
        f4048f.f4051a.putObject(obj, j2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j2, boolean z) {
        f4048f.a(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(byte[] bArr, long j2, byte b2) {
        f4048f.a((Object) bArr, i + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f4050h;
    }

    private static int b(Class<?> cls) {
        if (f4050h) {
            return f4048f.f4051a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(Object obj, long j2) {
        return f4048f.f(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return f4049g;
    }

    private static int c(Class<?> cls) {
        if (f4050h) {
            return f4048f.f4051a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new z7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int a2 = a(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a2 & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Object obj, long j2) {
        return f4048f.b(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(Object obj, long j2) {
        return f4048f.c(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j2, boolean z) {
        c(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    private static boolean d() {
        Unsafe unsafe = f4044b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (o3.a()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f4043a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean d(Class<?> cls) {
        if (!o3.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f4045c;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double e(Object obj, long j2) {
        return f4048f.d(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j2, boolean z) {
        d(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    private static boolean e() {
        Unsafe unsafe = f4044b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (f() == null) {
                return false;
            }
            if (o3.a()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f4043a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(Object obj, long j2) {
        return f4048f.f4051a.getObject(obj, j2);
    }

    private static Field f() {
        Field a2;
        if (!o3.a() || (a2 = a(Buffer.class, "effectiveDirectAddress")) == null) {
            Field a3 = a(Buffer.class, "address");
            if (a3 != null && a3.getType() == Long.TYPE) {
                return a3;
            }
            return null;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte k(Object obj, long j2) {
        return (byte) (a(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte l(Object obj, long j2) {
        return (byte) (a(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(Object obj, long j2) {
        return k(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(Object obj, long j2) {
        return l(obj, j2) != 0;
    }
}
