package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: UnsafeUtil.java */
/* loaded from: classes.dex */
final class aw {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4397a = Logger.getLogger(aw.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f4398b = d();

    /* renamed from: c  reason: collision with root package name */
    private static final b f4399c = e();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f4400d = h();
    private static final boolean e = f();
    private static final boolean f = g();
    private static final long g = j();
    private static final long h = a(i());

    private aw() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return f4400d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long c() {
        return g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(Object obj, long j) {
        return f4399c.a(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j, byte b2) {
        f4399c.a(obj, j, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(Object obj, long j) {
        return f4399c.b(obj, j);
    }

    private static Unsafe d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.protobuf.aw.1
                @Override // java.security.PrivilegedExceptionAction
                /* renamed from: a */
                public Unsafe run() {
                    Field[] declaredFields;
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    private static b e() {
        if (f4398b == null) {
            return null;
        }
        return new a(f4398b);
    }

    private static boolean f() {
        if (f4398b == null) {
            return false;
        }
        try {
            Class<?> cls = f4398b.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
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
            Logger logger = f4397a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean g() {
        if (f4398b == null) {
            return false;
        }
        try {
            f4398b.getClass().getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable unused) {
            f4397a.log(Level.WARNING, "copyMemory is missing from platform - proto runtime falling back to safer methods.");
            return false;
        }
    }

    private static boolean h() {
        if (f4398b == null) {
            return false;
        }
        try {
            Class<?> cls = f4398b.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f4397a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static Field i() {
        return a(Buffer.class, "address");
    }

    private static int j() {
        if (e) {
            return f4399c.a(byte[].class);
        }
        return -1;
    }

    private static long a(Field field) {
        if (field == null || f4399c == null) {
            return -1L;
        }
        return f4399c.a(field);
    }

    private static Field a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f4401a;

        public abstract byte a(Object obj, long j);

        public abstract void a(Object obj, long j, byte b2);

        b(Unsafe unsafe) {
            this.f4401a = unsafe;
        }

        public final long a(Field field) {
            return this.f4401a.objectFieldOffset(field);
        }

        public final long b(Object obj, long j) {
            return this.f4401a.getLong(obj, j);
        }

        public final int a(Class<?> cls) {
            return this.f4401a.arrayBaseOffset(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static final class a extends b {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.aw.b
        public byte a(Object obj, long j) {
            return this.f4401a.getByte(obj, j);
        }

        @Override // com.google.protobuf.aw.b
        public void a(Object obj, long j, byte b2) {
            this.f4401a.putByte(obj, j, b2);
        }
    }
}
