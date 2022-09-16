package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxq  reason: default package */
/* loaded from: classes3.dex */
public final class cxq extends axix {
    public int a;
    public cxk b;
    public final List c;

    public cxq() {
        super("trun");
        this.c = new ArrayList();
    }

    @Override // defpackage.axiv
    protected final long h() {
        int r = r();
        long j = 1 != (r & 1) ? 8L : 12L;
        if ((r & 4) == 4) {
            j += 4;
        }
        long j2 = (r & 256) == 256 ? 4L : 0L;
        if ((r & 512) == 512) {
            j2 += 4;
        }
        if ((r & 1024) == 1024) {
            j2 += 4;
        }
        if ((r & 2048) == 2048) {
            j2 += 4;
        }
        return j + (j2 * this.c.size());
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        long I = hy.I(byteBuffer);
        if ((r() & 1) == 1) {
            this.a = axds.p(hy.I(byteBuffer));
        } else {
            this.a = -1;
        }
        if ((r() & 4) == 4) {
            this.b = new cxk(byteBuffer);
        }
        for (int i = 0; i < I; i++) {
            cxp cxpVar = new cxp();
            if ((r() & 256) == 256) {
                cxpVar.a = hy.I(byteBuffer);
            }
            if ((r() & 512) == 512) {
                cxpVar.b = hy.I(byteBuffer);
            }
            if ((r() & 1024) == 1024) {
                cxpVar.c = new cxk(byteBuffer);
            }
            if ((r() & 2048) == 2048) {
                if (s() == 0) {
                    cxpVar.d = hy.I(byteBuffer);
                } else {
                    cxpVar.d = byteBuffer.getInt();
                }
            }
            this.c.add(cxpVar);
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.c.size());
        int r = r();
        if ((r & 1) == 1) {
            hy.y(byteBuffer, this.a);
        }
        if ((r & 4) == 4) {
            this.b.a(byteBuffer);
        }
        for (cxp cxpVar : this.c) {
            if ((r & 256) == 256) {
                hy.y(byteBuffer, cxpVar.a);
            }
            if ((r & 512) == 512) {
                hy.y(byteBuffer, cxpVar.b);
            }
            if ((r & 1024) == 1024) {
                cxpVar.c.a(byteBuffer);
            }
            if ((r & 2048) == 2048) {
                if (s() != 0) {
                    byteBuffer.putInt((int) cxpVar.d);
                } else {
                    hy.y(byteBuffer, cxpVar.d);
                }
            }
        }
    }

    public final long k() {
        return this.c.size();
    }

    public final boolean l() {
        return (r() & 1) == 1;
    }

    public final boolean m() {
        return (r() & 2048) == 2048;
    }

    public final boolean n() {
        return (r() & 256) == 256;
    }

    public final boolean o() {
        return (r() & 1024) == 1024;
    }

    public final boolean p() {
        return (r() & 512) == 512;
    }

    public final String toString() {
        return "TrackRunBox{sampleCount=" + this.c.size() + ", dataOffset=" + this.a + ", dataOffsetPresent=" + l() + ", sampleSizePresent=" + p() + ", sampleDurationPresent=" + n() + ", sampleFlagsPresentPresent=" + o() + ", sampleCompositionTimeOffsetPresent=" + m() + ", firstSampleFlags=" + this.b + '}';
    }
}
