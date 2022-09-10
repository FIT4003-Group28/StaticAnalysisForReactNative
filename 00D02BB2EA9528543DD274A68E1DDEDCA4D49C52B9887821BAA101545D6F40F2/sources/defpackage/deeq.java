package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
/* compiled from: PG */
/* renamed from: deeq  reason: default package */
/* loaded from: classes.dex */
final class deeq extends deef {
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
            unsafe = (Unsafe) AccessController.doPrivileged(new deep());
        }
        try {
            c = unsafe.objectFieldOffset(dees.class.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(dees.class.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(dees.class.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(deer.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(deer.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Exception e3) {
            dbue.b(e3);
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.deef
    public final void a(deer deerVar, Thread thread) {
        a.putObject(deerVar, e, thread);
    }

    @Override // defpackage.deef
    public final void b(deer deerVar, deer deerVar2) {
        a.putObject(deerVar, f, deerVar2);
    }

    @Override // defpackage.deef
    public final boolean c(dees<?> deesVar, deer deerVar, deer deerVar2) {
        return a.compareAndSwapObject(deesVar, c, deerVar, deerVar2);
    }

    @Override // defpackage.deef
    public final boolean d(dees<?> deesVar, deej deejVar, deej deejVar2) {
        return a.compareAndSwapObject(deesVar, b, deejVar, deejVar2);
    }

    @Override // defpackage.deef
    public final boolean e(dees<?> deesVar, Object obj, Object obj2) {
        return a.compareAndSwapObject(deesVar, d, obj, obj2);
    }
}
