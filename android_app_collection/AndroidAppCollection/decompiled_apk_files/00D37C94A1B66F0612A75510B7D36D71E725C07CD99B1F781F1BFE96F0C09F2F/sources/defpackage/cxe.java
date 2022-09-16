package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
/* compiled from: PG */
/* renamed from: cxe  reason: default package */
/* loaded from: classes3.dex */
public final class cxe extends axix {
    public long a;
    public int b;
    public int c;
    public float d;
    public axlh e;
    public double f;
    public double g;
    private Date s;
    private Date t;
    private long u;

    public cxe() {
        super("tkhd");
        this.e = axlh.a;
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (s() == 1 ? 36L : 24L) + 60;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (s() == 1) {
            this.s = axds.o(hy.J(byteBuffer));
            this.t = axds.o(hy.J(byteBuffer));
            this.a = hy.I(byteBuffer);
            hy.I(byteBuffer);
            long j = byteBuffer.getLong();
            this.u = j;
            if (j < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.s = axds.o(hy.I(byteBuffer));
            this.t = axds.o(hy.I(byteBuffer));
            this.a = hy.I(byteBuffer);
            hy.I(byteBuffer);
            this.u = hy.I(byteBuffer);
        }
        hy.I(byteBuffer);
        hy.I(byteBuffer);
        this.b = hy.F(byteBuffer);
        this.c = hy.F(byteBuffer);
        this.d = hy.D(byteBuffer);
        hy.F(byteBuffer);
        this.e = axlh.a(byteBuffer);
        this.f = hy.C(byteBuffer);
        this.g = hy.C(byteBuffer);
    }

    @Override // defpackage.axiv
    public final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (s() == 1) {
            byteBuffer.putLong(axds.n(this.s));
            byteBuffer.putLong(axds.n(this.t));
            hy.y(byteBuffer, this.a);
            hy.y(byteBuffer, 0L);
            byteBuffer.putLong(this.u);
        } else {
            hy.y(byteBuffer, axds.n(this.s));
            hy.y(byteBuffer, axds.n(this.t));
            hy.y(byteBuffer, this.a);
            hy.y(byteBuffer, 0L);
            hy.y(byteBuffer, this.u);
        }
        hy.y(byteBuffer, 0L);
        hy.y(byteBuffer, 0L);
        hy.w(byteBuffer, this.b);
        hy.w(byteBuffer, this.c);
        hy.v(byteBuffer, this.d);
        hy.w(byteBuffer, 0);
        this.e.b(byteBuffer);
        hy.u(byteBuffer, this.f);
        hy.u(byteBuffer, this.g);
    }

    public final void k(Date date) {
        this.s = date;
        if (axds.n(date) >= 4294967296L) {
            this.q = 1;
        }
    }

    public final void l(long j) {
        this.u = j;
        if (j >= 4294967296L) {
            this.r = 1;
        }
    }

    public final void m(boolean z) {
        if (z) {
            this.r = r() | 1;
        } else {
            this.r = r() & (-2);
        }
    }

    public final void n(boolean z) {
        if (z) {
            this.r = r() | 2;
        } else {
            this.r = r() & (-3);
        }
    }

    public final void o(Date date) {
        this.t = date;
        if (axds.n(date) >= 4294967296L) {
            this.q = 1;
        }
    }

    public final String toString() {
        return "TrackHeaderBox[creationTime=" + this.s + ";modificationTime=" + this.t + ";trackId=" + this.a + ";duration=" + this.u + ";layer=" + this.b + ";alternateGroup=" + this.c + ";volume=" + this.d + ";matrix=" + this.e + ";width=" + this.f + ";height=" + this.g + "]";
    }
}
