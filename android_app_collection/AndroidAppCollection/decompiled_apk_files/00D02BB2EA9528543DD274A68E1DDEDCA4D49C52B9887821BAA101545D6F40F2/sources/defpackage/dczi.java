package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
/* compiled from: PG */
/* renamed from: dczi  reason: default package */
/* loaded from: classes5.dex */
enum dczi implements dczg {
    UNSAFE_LITTLE_ENDIAN,
    UNSAFE_BIG_ENDIAN;
    
    private static final Unsafe c;
    private static final int d;

    static {
        Unsafe d2 = d();
        c = d2;
        d = d2.arrayBaseOffset(byte[].class);
        if (d2.arrayIndexScale(byte[].class) == 1) {
            return;
        }
        throw new AssertionError();
    }

    public static final long b(byte[] bArr, int i) {
        return c.getLong(bArr, i + d);
    }

    public static final long c(byte[] bArr, int i) {
        return Long.reverseBytes(c.getLong(bArr, i + d));
    }

    private static Unsafe d() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new dczh());
        }
    }

    @Override // defpackage.dczg
    public final /* synthetic */ long a(byte[] bArr, int i) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw null;
            }
            return c(bArr, i);
        }
        return b(bArr, i);
    }
}
