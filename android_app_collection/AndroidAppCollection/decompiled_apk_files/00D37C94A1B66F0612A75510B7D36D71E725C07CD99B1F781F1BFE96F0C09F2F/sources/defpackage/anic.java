package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
/* compiled from: PG */
/* renamed from: anic  reason: default package */
/* loaded from: classes.dex */
final class anic extends anhr {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new anib());
        }
        try {
            c = unsafe.objectFieldOffset(anie.class.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(anie.class.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(anie.class.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(anid.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(anid.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Exception e3) {
            amqs.f(e3);
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.anhr
    public final void a(anid anidVar, anid anidVar2) {
        a.putObject(anidVar, f, anidVar2);
    }

    @Override // defpackage.anhr
    public final void b(anid anidVar, Thread thread) {
        a.putObject(anidVar, e, thread);
    }

    @Override // defpackage.anhr
    public final boolean c(anie anieVar, anhv anhvVar, anhv anhvVar2) {
        return a.compareAndSwapObject(anieVar, b, anhvVar, anhvVar2);
    }

    @Override // defpackage.anhr
    public final boolean d(anie anieVar, Object obj, Object obj2) {
        return a.compareAndSwapObject(anieVar, d, obj, obj2);
    }

    @Override // defpackage.anhr
    public final boolean e(anie anieVar, anid anidVar, anid anidVar2) {
        return a.compareAndSwapObject(anieVar, c, anidVar, anidVar2);
    }
}
