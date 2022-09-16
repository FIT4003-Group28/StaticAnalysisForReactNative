package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: aeyj  reason: default package */
/* loaded from: classes.dex */
public abstract class aeyj extends prp {
    protected long o;
    protected asy p;
    protected long q;
    protected long r;

    public aeyj(asv asvVar, asy asyVar, Format format, int i, Object obj, long j, long j2, long j3, long j4) {
        super(asvVar, asyVar, format, i, obj, j == -9223372036854775807L ? 0L : j, j2 == -9223372036854775807L ? 0L : j2, j3, -9223372036854775807L, j4);
        this.p = this.f;
        this.o = j4;
        this.q = j;
        this.r = j2;
    }

    public final synchronized long g() {
        return this.r;
    }

    public final synchronized long i() {
        return this.o;
    }

    public final synchronized long j() {
        return this.q;
    }

    public final synchronized asy k() {
        return this.p;
    }
}
