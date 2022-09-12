package defpackage;

import sun.misc.Unsafe;
/* compiled from: PG */
/* renamed from: dsug  reason: default package */
/* loaded from: classes6.dex */
final class dsug extends dsuh {
    public dsug(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.dsuh
    public final byte a(long j) {
        return this.a.getByte(j);
    }

    @Override // defpackage.dsuh
    public final byte b(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    @Override // defpackage.dsuh
    public final void c(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // defpackage.dsuh
    public final boolean d(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    @Override // defpackage.dsuh
    public final void e(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // defpackage.dsuh
    public final float f(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    @Override // defpackage.dsuh
    public final void g(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // defpackage.dsuh
    public final double h(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    @Override // defpackage.dsuh
    public final void i(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // defpackage.dsuh
    public final void j(long j, byte[] bArr, long j2) {
        this.a.copyMemory((Object) null, j, bArr, dsui.c, j2);
    }
}
