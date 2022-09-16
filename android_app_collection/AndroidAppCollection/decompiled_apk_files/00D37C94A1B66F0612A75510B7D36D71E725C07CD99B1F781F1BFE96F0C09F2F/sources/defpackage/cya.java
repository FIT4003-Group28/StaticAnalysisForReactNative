package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: cya  reason: default package */
/* loaded from: classes3.dex */
public final class cya extends cxt {
    private long b;
    private int c;
    private int d;
    private int[] e;
    private cxy f;
    private cxz g;

    public cya() {
        super("tx3g");
        this.e = new int[4];
        this.f = new cxy();
        this.g = new cxz();
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final long b() {
        long u = u() + 38;
        int i = 16;
        if (!this.o && u < 4294967296L) {
            i = 8;
        }
        return u + i;
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(s());
        ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        hy.w(allocate, this.a);
        hy.y(allocate, this.b);
        hy.z(allocate, this.c);
        hy.z(allocate, this.d);
        hy.z(allocate, this.e[0]);
        hy.z(allocate, this.e[1]);
        hy.z(allocate, this.e[2]);
        hy.z(allocate, this.e[3]);
        cxy cxyVar = this.f;
        hy.w(allocate, cxyVar.a);
        hy.w(allocate, cxyVar.b);
        hy.w(allocate, cxyVar.c);
        hy.w(allocate, cxyVar.d);
        cxz cxzVar = this.g;
        hy.w(allocate, cxzVar.a);
        hy.w(allocate, cxzVar.b);
        hy.w(allocate, cxzVar.c);
        hy.z(allocate, cxzVar.d);
        hy.z(allocate, cxzVar.e);
        hy.z(allocate, cxzVar.f[0]);
        hy.z(allocate, cxzVar.f[1]);
        hy.z(allocate, cxzVar.f[2]);
        hy.z(allocate, cxzVar.f[3]);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        k(writableByteChannel);
    }

    @Override // defpackage.axiw, defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        ByteBuffer allocate = ByteBuffer.allocate(38);
        axjaVar.a(allocate);
        allocate.position(6);
        this.a = hy.F(allocate);
        this.b = hy.I(allocate);
        this.c = hy.H(allocate);
        this.d = hy.H(allocate);
        int[] iArr = new int[4];
        this.e = iArr;
        iArr[0] = hy.H(allocate);
        this.e[1] = hy.H(allocate);
        this.e[2] = hy.H(allocate);
        this.e[3] = hy.H(allocate);
        cxy cxyVar = new cxy();
        this.f = cxyVar;
        cxyVar.a = hy.F(allocate);
        cxyVar.b = hy.F(allocate);
        cxyVar.c = hy.F(allocate);
        cxyVar.d = hy.F(allocate);
        cxz cxzVar = new cxz();
        this.g = cxzVar;
        cxzVar.a = hy.F(allocate);
        cxzVar.b = hy.F(allocate);
        cxzVar.c = hy.F(allocate);
        cxzVar.d = hy.H(allocate);
        cxzVar.e = hy.H(allocate);
        cxzVar.f = new int[4];
        cxzVar.f[0] = hy.H(allocate);
        cxzVar.f[1] = hy.H(allocate);
        cxzVar.f[2] = hy.H(allocate);
        cxzVar.f[3] = hy.H(allocate);
        t(axjaVar, j - 38, cvoVar);
    }

    @Override // defpackage.axiz
    public final String toString() {
        return "TextSampleEntry";
    }

    public cya(String str) {
        super(str);
        this.e = new int[4];
        this.f = new cxy();
        this.g = new cxz();
    }
}
