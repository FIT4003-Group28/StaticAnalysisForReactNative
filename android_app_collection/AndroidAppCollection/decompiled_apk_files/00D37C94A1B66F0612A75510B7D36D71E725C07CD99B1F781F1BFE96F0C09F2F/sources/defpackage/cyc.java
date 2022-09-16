package defpackage;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: cyc  reason: default package */
/* loaded from: classes3.dex */
public final class cyc extends cxt implements cvx {
    public int b;
    public int c;
    public double d;
    public double e;
    public int f;
    public String g;
    public int h;
    private final long[] i;

    public cyc() {
        super("avc1");
        this.d = 72.0d;
        this.e = 72.0d;
        this.f = 1;
        this.g = "";
        this.h = 24;
        this.i = new long[3];
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final long b() {
        long u = u();
        long j = 78 + u;
        int i = 16;
        if (!this.o && u + 86 < 4294967296L) {
            i = 8;
        }
        return j + i;
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        hy.w(allocate, this.a);
        hy.w(allocate, 0);
        hy.w(allocate, 0);
        hy.y(allocate, this.i[0]);
        hy.y(allocate, this.i[1]);
        hy.y(allocate, this.i[2]);
        hy.w(allocate, this.b);
        hy.w(allocate, this.c);
        hy.u(allocate, this.d);
        hy.u(allocate, this.e);
        hy.y(allocate, 0L);
        hy.w(allocate, this.f);
        hy.z(allocate, hx.i(this.g));
        allocate.put(hx.k(this.g));
        int i = hx.i(this.g);
        while (i < 31) {
            i++;
            allocate.put((byte) 0);
        }
        hy.w(allocate, this.h);
        hy.w(allocate, 65535);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        long b = axjaVar.b() + j;
        ByteBuffer allocate = ByteBuffer.allocate(78);
        axjaVar.a(allocate);
        allocate.position(6);
        this.a = hy.F(allocate);
        hy.F(allocate);
        hy.F(allocate);
        this.i[0] = hy.I(allocate);
        this.i[1] = hy.I(allocate);
        this.i[2] = hy.I(allocate);
        this.b = hy.F(allocate);
        this.c = hy.F(allocate);
        this.d = hy.C(allocate);
        this.e = hy.C(allocate);
        hy.I(allocate);
        this.f = hy.F(allocate);
        int H = hy.H(allocate);
        if (H > 31) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder(53);
            sb.append("invalid compressor name displayable data: ");
            sb.append(H);
            printStream.println(sb.toString());
            H = 31;
        }
        byte[] bArr = new byte[H];
        allocate.get(bArr);
        this.g = hx.j(bArr);
        if (H < 31) {
            allocate.get(new byte[31 - H]);
        }
        this.h = hy.F(allocate);
        hy.F(allocate);
        t(new cyb(b, axjaVar), j - 78, cvoVar);
    }

    public cyc(String str) {
        super(str);
        this.d = 72.0d;
        this.e = 72.0d;
        this.f = 1;
        this.g = "";
        this.h = 24;
        this.i = new long[3];
    }
}
