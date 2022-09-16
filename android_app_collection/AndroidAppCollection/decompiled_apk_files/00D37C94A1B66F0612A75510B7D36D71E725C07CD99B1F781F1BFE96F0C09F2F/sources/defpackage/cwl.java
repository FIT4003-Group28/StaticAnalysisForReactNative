package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;
/* compiled from: PG */
/* renamed from: cwl  reason: default package */
/* loaded from: classes3.dex */
public final class cwl extends axix {
    public Date a;
    public Date b;
    public long c;
    public axlh d;
    public long e;
    private long f;
    private double g;
    private float s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    public cwl() {
        super("mvhd");
        this.g = 1.0d;
        this.s = 1.0f;
        this.d = axlh.a;
    }

    @Override // defpackage.axiv
    protected final long h() {
        return (s() == 1 ? 32L : 20L) + 80;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (s() == 1) {
            this.a = axds.o(hy.J(byteBuffer));
            this.b = axds.o(hy.J(byteBuffer));
            this.c = hy.I(byteBuffer);
            this.f = hy.J(byteBuffer);
        } else {
            this.a = axds.o(hy.I(byteBuffer));
            this.b = axds.o(hy.I(byteBuffer));
            this.c = hy.I(byteBuffer);
            this.f = hy.I(byteBuffer);
        }
        this.g = hy.C(byteBuffer);
        this.s = hy.D(byteBuffer);
        hy.F(byteBuffer);
        hy.I(byteBuffer);
        hy.I(byteBuffer);
        this.d = axlh.a(byteBuffer);
        this.t = byteBuffer.getInt();
        this.u = byteBuffer.getInt();
        this.v = byteBuffer.getInt();
        this.w = byteBuffer.getInt();
        this.x = byteBuffer.getInt();
        this.y = byteBuffer.getInt();
        this.e = hy.I(byteBuffer);
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (s() == 1) {
            byteBuffer.putLong(axds.n(this.a));
            byteBuffer.putLong(axds.n(this.b));
            hy.y(byteBuffer, this.c);
            byteBuffer.putLong(this.f);
        } else {
            hy.y(byteBuffer, axds.n(this.a));
            hy.y(byteBuffer, axds.n(this.b));
            hy.y(byteBuffer, this.c);
            hy.y(byteBuffer, this.f);
        }
        hy.u(byteBuffer, this.g);
        hy.v(byteBuffer, this.s);
        hy.w(byteBuffer, 0);
        hy.y(byteBuffer, 0L);
        hy.y(byteBuffer, 0L);
        this.d.b(byteBuffer);
        byteBuffer.putInt(this.t);
        byteBuffer.putInt(this.u);
        byteBuffer.putInt(this.v);
        byteBuffer.putInt(this.w);
        byteBuffer.putInt(this.x);
        byteBuffer.putInt(this.y);
        hy.y(byteBuffer, this.e);
    }

    public final void k(Date date) {
        this.a = date;
        if (axds.n(date) >= 4294967296L) {
            this.q = 1;
        }
    }

    public final void l(long j) {
        this.f = j;
        if (j >= 4294967296L) {
            this.q = 1;
        }
    }

    public final void m(Date date) {
        this.b = date;
        if (axds.n(date) >= 4294967296L) {
            this.q = 1;
        }
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.a + ";modificationTime=" + this.b + ";timescale=" + this.c + ";duration=" + this.f + ";rate=" + this.g + ";volume=" + this.s + ";matrix=" + this.d + ";nextTrackId=" + this.e + "]";
    }
}
