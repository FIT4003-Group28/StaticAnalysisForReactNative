package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;
/* compiled from: PG */
/* renamed from: dsuf  reason: default package */
/* loaded from: classes.dex */
final class dsuf extends dsuh {
    public dsuf(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.dsuh
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.dsuh
    public final byte b(Object obj, long j) {
        if (!dsui.d) {
            return dsui.t(obj, j);
        }
        return dsui.s(obj, j);
    }

    @Override // defpackage.dsuh
    public final void c(Object obj, long j, byte b) {
        if (!dsui.d) {
            dsui.v(obj, j, b);
        } else {
            dsui.u(obj, j, b);
        }
    }

    @Override // defpackage.dsuh
    public final boolean d(Object obj, long j) {
        if (!dsui.d) {
            return dsui.x(obj, j);
        }
        return dsui.w(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dsuh
    public final void e(Object obj, long j, boolean z) {
        if (dsui.d) {
            dsui.u(obj, j, z);
        } else {
            dsui.v(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.dsuh
    public final float f(Object obj, long j) {
        return Float.intBitsToFloat(l(obj, j));
    }

    @Override // defpackage.dsuh
    public final void g(Object obj, long j, float f) {
        m(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.dsuh
    public final double h(Object obj, long j) {
        return Double.longBitsToDouble(n(obj, j));
    }

    @Override // defpackage.dsuh
    public final void i(Object obj, long j, double d) {
        o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.dsuh
    public final void j(long j, byte[] bArr, long j2) {
        Memory.peekByteArray(j, bArr, 0, (int) j2);
    }
}
