package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cxo  reason: default package */
/* loaded from: classes3.dex */
public final class cxo extends axix {
    public long a;
    public long b;
    public long c;
    public long d;
    public cxk e;
    private long f;
    private boolean g;
    private boolean s;

    public cxo() {
        super("tfhd");
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
    }

    @Override // defpackage.axiv
    protected final long h() {
        int r = r();
        long j = 1 != (r & 1) ? 8L : 16L;
        if ((r & 2) == 2) {
            j += 4;
        }
        if ((r & 8) == 8) {
            j += 4;
        }
        if ((r & 16) == 16) {
            j += 4;
        }
        return (r & 32) == 32 ? j + 4 : j;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.a = hy.I(byteBuffer);
        if ((r() & 1) == 1) {
            this.b = hy.J(byteBuffer);
        }
        if ((r() & 2) == 2) {
            this.f = hy.I(byteBuffer);
        }
        if ((r() & 8) == 8) {
            this.c = hy.I(byteBuffer);
        }
        if ((r() & 16) == 16) {
            this.d = hy.I(byteBuffer);
        }
        if ((r() & 32) == 32) {
            this.e = new cxk(byteBuffer);
        }
        if ((r() & 65536) == 65536) {
            this.g = true;
        }
        if ((r() & 131072) == 131072) {
            this.s = true;
        }
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.a);
        if ((r() & 1) == 1) {
            byteBuffer.putLong(this.b);
        }
        if ((r() & 2) == 2) {
            hy.y(byteBuffer, this.f);
        }
        if ((r() & 8) == 8) {
            hy.y(byteBuffer, this.c);
        }
        if ((r() & 16) == 16) {
            hy.y(byteBuffer, this.d);
        }
        if ((r() & 32) == 32) {
            this.e.a(byteBuffer);
        }
    }

    public final String toString() {
        return "TrackFragmentHeaderBox{trackId=" + this.a + ", baseDataOffset=" + this.b + ", sampleDescriptionIndex=" + this.f + ", defaultSampleDuration=" + this.c + ", defaultSampleSize=" + this.d + ", defaultSampleFlags=" + this.e + ", durationIsEmpty=" + this.g + ", defaultBaseIsMoof=" + this.s + '}';
    }
}
