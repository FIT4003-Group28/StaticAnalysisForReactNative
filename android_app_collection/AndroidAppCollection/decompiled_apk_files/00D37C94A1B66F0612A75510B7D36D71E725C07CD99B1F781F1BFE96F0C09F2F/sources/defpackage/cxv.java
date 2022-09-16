package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: cxv  reason: default package */
/* loaded from: classes3.dex */
public final class cxv extends cxt {
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public byte[] l;
    private int x;
    private long y;

    public cxv(String str) {
        super(str);
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final long b() {
        int i = this.e;
        int i2 = 0;
        int i3 = 16;
        int i4 = (i == 1 ? 16 : 0) + 28;
        if (i == 2) {
            i2 = 36;
        }
        long u = i4 + i2 + u();
        if (!this.o && 8 + u < 4294967296L) {
            i3 = 8;
        }
        return u + i3;
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        int i = this.e;
        int i2 = 0;
        int i3 = (i == 1 ? 16 : 0) + 28;
        if (i == 2) {
            i2 = 36;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3 + i2);
        allocate.position(6);
        hy.w(allocate, this.a);
        hy.w(allocate, this.e);
        hy.w(allocate, this.x);
        hy.y(allocate, this.y);
        hy.w(allocate, this.b);
        hy.w(allocate, this.c);
        hy.w(allocate, this.f);
        hy.w(allocate, this.g);
        if (!this.n.equals("mlpa")) {
            hy.y(allocate, this.d << 16);
        } else {
            hy.y(allocate, this.d);
        }
        if (this.e == 1) {
            hy.y(allocate, this.h);
            hy.y(allocate, this.i);
            hy.y(allocate, this.j);
            hy.y(allocate, this.k);
        }
        if (this.e == 2) {
            hy.y(allocate, this.h);
            hy.y(allocate, this.i);
            hy.y(allocate, this.j);
            hy.y(allocate, this.k);
            allocate.put(this.l);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        ByteBuffer allocate = ByteBuffer.allocate(28);
        axjaVar.a(allocate);
        allocate.position(6);
        this.a = hy.F(allocate);
        this.e = hy.F(allocate);
        this.x = hy.F(allocate);
        this.y = hy.I(allocate);
        this.b = hy.F(allocate);
        this.c = hy.F(allocate);
        this.f = hy.F(allocate);
        this.g = hy.F(allocate);
        this.d = hy.I(allocate);
        int i = 16;
        if (!this.n.equals("mlpa")) {
            this.d >>>= 16;
        }
        if (this.e == 1) {
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            axjaVar.a(allocate2);
            allocate2.rewind();
            this.h = hy.I(allocate2);
            this.i = hy.I(allocate2);
            this.j = hy.I(allocate2);
            this.k = hy.I(allocate2);
        }
        int i2 = 36;
        if (this.e == 2) {
            ByteBuffer allocate3 = ByteBuffer.allocate(36);
            axjaVar.a(allocate3);
            allocate3.rewind();
            this.h = hy.I(allocate3);
            this.i = hy.I(allocate3);
            this.j = hy.I(allocate3);
            this.k = hy.I(allocate3);
            byte[] bArr = new byte[20];
            this.l = bArr;
            allocate3.get(bArr);
        }
        if ("owma".equals(this.n)) {
            System.err.println("owma");
            long j2 = j - 28;
            int i3 = this.e;
            if (i3 != 1) {
                i = 0;
            }
            long j3 = j2 - i;
            if (i3 != 2) {
                i2 = 0;
            }
            long j4 = j3 - i2;
            ByteBuffer allocate4 = ByteBuffer.allocate(axds.p(j4));
            axjaVar.a(allocate4);
            w(new cxu(this, j4, allocate4));
            return;
        }
        long j5 = j - 28;
        int i4 = this.e;
        if (i4 != 1) {
            i = 0;
        }
        long j6 = j5 - i;
        if (i4 != 2) {
            i2 = 0;
        }
        t(axjaVar, j6 - i2, cvoVar);
    }

    @Override // defpackage.axiz
    public final String toString() {
        long j = this.k;
        long j2 = this.j;
        long j3 = this.i;
        long j4 = this.h;
        int i = this.g;
        int i2 = this.f;
        int i3 = this.e;
        long j5 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        String valueOf = String.valueOf(i());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 333);
        sb.append("AudioSampleEntry{bytesPerSample=");
        sb.append(j);
        sb.append(", bytesPerFrame=");
        sb.append(j2);
        sb.append(", bytesPerPacket=");
        sb.append(j3);
        sb.append(", samplesPerPacket=");
        sb.append(j4);
        sb.append(", packetSize=");
        sb.append(i);
        sb.append(", compressionId=");
        sb.append(i2);
        sb.append(", soundVersion=");
        sb.append(i3);
        sb.append(", sampleRate=");
        sb.append(j5);
        sb.append(", sampleSize=");
        sb.append(i4);
        sb.append(", channelCount=");
        sb.append(i5);
        sb.append(", boxes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
