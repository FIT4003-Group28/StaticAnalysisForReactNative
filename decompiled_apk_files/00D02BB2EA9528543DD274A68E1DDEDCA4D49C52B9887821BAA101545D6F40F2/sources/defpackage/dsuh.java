package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* compiled from: PG */
/* renamed from: dsuh  reason: default package */
/* loaded from: classes.dex */
abstract class dsuh {
    final Unsafe a;

    public dsuh(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(long j);

    public abstract byte b(Object obj, long j);

    public abstract void c(Object obj, long j, byte b);

    public abstract boolean d(Object obj, long j);

    public abstract void e(Object obj, long j, boolean z);

    public abstract float f(Object obj, long j);

    public abstract void g(Object obj, long j, float f);

    public abstract double h(Object obj, long j);

    public abstract void i(Object obj, long j, double d);

    public abstract void j(long j, byte[] bArr, long j2);

    public final long k(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final int l(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final void m(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final long n(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final void o(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final Object p(Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final void q(Object obj, long j, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public final int r(Class<?> cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final void s(Class<?> cls) {
        this.a.arrayIndexScale(cls);
    }
}
