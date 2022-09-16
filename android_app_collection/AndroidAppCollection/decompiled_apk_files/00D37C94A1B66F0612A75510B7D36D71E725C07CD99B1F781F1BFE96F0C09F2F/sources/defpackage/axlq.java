package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axlq  reason: default package */
/* loaded from: classes2.dex */
public final class axlq extends axkr {
    int a;
    int b;
    boolean c;
    int d;
    long e;
    long f;
    int g;
    int h;
    int i;
    int j;
    int k;

    @Override // defpackage.axkr
    public final String a() {
        return "tscl";
    }

    @Override // defpackage.axkr
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        hy.z(allocate, this.a);
        hy.z(allocate, (this.b << 6) + (true != this.c ? 0 : 32) + this.d);
        hy.y(allocate, this.e);
        long j = this.f & 281474976710655L;
        hy.w(allocate, (int) (j >> 32));
        hy.y(allocate, j & 4294967295L);
        hy.z(allocate, this.g);
        hy.w(allocate, this.h);
        hy.w(allocate, this.i);
        hy.z(allocate, this.j);
        hy.w(allocate, this.k);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // defpackage.axkr
    public final void c(ByteBuffer byteBuffer) {
        this.a = hy.H(byteBuffer);
        int H = hy.H(byteBuffer);
        this.b = (H & 192) >> 6;
        this.c = (H & 32) > 0;
        this.d = H & 31;
        this.e = hy.I(byteBuffer);
        this.f = (hy.F(byteBuffer) << 32) + hy.I(byteBuffer);
        this.g = hy.H(byteBuffer);
        this.h = hy.F(byteBuffer);
        this.i = hy.F(byteBuffer);
        this.j = hy.H(byteBuffer);
        this.k = hy.F(byteBuffer);
    }

    @Override // defpackage.axkr
    public final int d() {
        return 20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axlq axlqVar = (axlq) obj;
        return this.a == axlqVar.a && this.i == axlqVar.i && this.k == axlqVar.k && this.j == axlqVar.j && this.h == axlqVar.h && this.f == axlqVar.f && this.g == axlqVar.g && this.e == axlqVar.e && this.d == axlqVar.d && this.b == axlqVar.b && this.c == axlqVar.c;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        int i3 = this.d;
        long j = this.e;
        long j2 = this.f;
        return (((((((((((((((((((i * 31) + i2) * 31) + (z ? 1 : 0)) * 31) + i3) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        int i3 = this.d;
        long j = this.e;
        long j2 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = this.i;
        int i7 = this.j;
        int i8 = this.k;
        StringBuilder sb = new StringBuilder(369);
        sb.append("TemporalLayerSampleGroup{temporalLayerId=");
        sb.append(i);
        sb.append(", tlprofile_space=");
        sb.append(i2);
        sb.append(", tltier_flag=");
        sb.append(z);
        sb.append(", tlprofile_idc=");
        sb.append(i3);
        sb.append(", tlprofile_compatibility_flags=");
        sb.append(j);
        sb.append(", tlconstraint_indicator_flags=");
        sb.append(j2);
        sb.append(", tllevel_idc=");
        sb.append(i4);
        sb.append(", tlMaxBitRate=");
        sb.append(i5);
        sb.append(", tlAvgBitRate=");
        sb.append(i6);
        sb.append(", tlConstantFrameRate=");
        sb.append(i7);
        sb.append(", tlAvgFrameRate=");
        sb.append(i8);
        sb.append("}");
        return sb.toString();
    }
}
