package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;
/* compiled from: PG */
/* renamed from: aose  reason: default package */
/* loaded from: classes.dex */
final class aose extends aosf {
    public aose(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.aosf
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.aosf
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(l(obj, j));
    }

    @Override // defpackage.aosf
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(k(obj, j));
    }

    @Override // defpackage.aosf
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aosf
    public final void e(Object obj, long j, boolean z) {
        if (aosg.d) {
            aosg.p(obj, j, z);
        } else {
            aosg.q(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.aosf
    public final void f(Object obj, long j, byte b) {
        if (!aosg.d) {
            aosg.q(obj, j, b);
        } else {
            aosg.p(obj, j, b);
        }
    }

    @Override // defpackage.aosf
    public final void g(Object obj, long j, double d) {
        p(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.aosf
    public final void h(Object obj, long j, float f) {
        o(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.aosf
    public final boolean i(Object obj, long j) {
        if (!aosg.d) {
            return aosg.z(obj, j);
        }
        return aosg.y(obj, j);
    }
}
