package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: axiv  reason: default package */
/* loaded from: classes2.dex */
public abstract class axiv implements cvs {
    private static final axlg a = axlg.d(axiv.class);
    private ByteBuffer b;
    private ByteBuffer c;
    protected final String h;
    public byte[] i;
    public cvx j;
    boolean k;
    boolean l;
    long m;
    long n;
    long o;
    axja p;

    /* JADX INFO: Access modifiers changed from: protected */
    public axiv(String str) {
        this.o = -1L;
        this.c = null;
        this.h = str;
        this.l = true;
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public axiv(byte[] bArr) {
        this.o = -1L;
        this.c = null;
        this.h = "uuid";
        this.i = bArr;
        this.l = true;
        this.k = true;
    }

    private final void k(ByteBuffer byteBuffer) {
        if (m()) {
            hy.y(byteBuffer, b());
            byteBuffer.put(cvq.b(this.h));
        } else {
            hy.y(byteBuffer, 1L);
            byteBuffer.put(cvq.b(this.h));
            byteBuffer.putLong(b());
        }
        if ("uuid".equals(this.h)) {
            byteBuffer.put(this.i);
        }
    }

    private final synchronized void l() {
        if (!this.l) {
            try {
                axlg axlgVar = a;
                String str = this.h;
                axlgVar.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.b = this.p.e(this.m, this.o);
                this.l = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private final boolean m() {
        int i = true != "uuid".equals(this.h) ? 8 : 24;
        if (!this.l) {
            return this.o + ((long) i) < 4294967296L;
        } else if (this.k) {
            long h = h();
            ByteBuffer byteBuffer = this.c;
            return (h + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
        } else {
            this.b.limit();
            return true;
        }
    }

    @Override // defpackage.cvs
    public final long a() {
        return this.n;
    }

    @Override // defpackage.cvs
    public final long b() {
        long j;
        int i = 0;
        if (!this.l) {
            j = this.o;
        } else if (this.k) {
            j = h();
        } else {
            ByteBuffer byteBuffer = this.b;
            j = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        long j2 = j + (j >= 4294967288L ? 8 : 0) + 8 + (true != "uuid".equals(this.h) ? 0 : 16);
        ByteBuffer byteBuffer2 = this.c;
        if (byteBuffer2 != null) {
            i = byteBuffer2.limit();
        }
        return j2 + i;
    }

    @Override // defpackage.cvs
    public final cvx c() {
        return this.j;
    }

    @Override // defpackage.cvs
    public final String d() {
        return this.h;
    }

    @Override // defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        int i = 8;
        int i2 = 0;
        int i3 = 16;
        if (!this.l) {
            if (true != m()) {
                i = 16;
            }
            if (true == "uuid".equals(this.h)) {
                i2 = 16;
            }
            ByteBuffer allocate = ByteBuffer.allocate(i + i2);
            k(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            this.p.d(this.m, this.o, writableByteChannel);
        } else if (this.k) {
            ByteBuffer allocate2 = ByteBuffer.allocate(axds.p(b()));
            k(allocate2);
            j(allocate2);
            ByteBuffer byteBuffer = this.c;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                while (this.c.remaining() > 0) {
                    allocate2.put(this.c);
                }
            }
            writableByteChannel.write((ByteBuffer) allocate2.rewind());
        } else {
            if (true != m()) {
                i = 16;
            }
            if (true != "uuid".equals(this.h)) {
                i3 = 0;
            }
            ByteBuffer allocate3 = ByteBuffer.allocate(i + i3);
            k(allocate3);
            writableByteChannel.write((ByteBuffer) allocate3.rewind());
            writableByteChannel.write((ByteBuffer) this.b.position(0));
        }
    }

    @Override // defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
        long b = axjaVar.b();
        this.m = b;
        this.n = b - byteBuffer.remaining();
        this.o = j;
        this.p = axjaVar;
        axjaVar.f(axjaVar.b() + j);
        this.l = false;
        this.k = false;
        q();
    }

    @Override // defpackage.cvs
    public final void g(cvx cvxVar) {
        this.j = cvxVar;
    }

    protected abstract long h();

    protected abstract void i(ByteBuffer byteBuffer);

    protected abstract void j(ByteBuffer byteBuffer);

    public final synchronized void q() {
        l();
        axlg axlgVar = a;
        String str = this.h;
        axlgVar.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            this.k = true;
            byteBuffer.rewind();
            i(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.c = byteBuffer.slice();
            }
            this.b = null;
        }
    }
}
