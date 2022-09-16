package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: psb  reason: default package */
/* loaded from: classes4.dex */
public abstract class psb extends pru {
    public final long n;

    public psb(asv asvVar, asy asyVar, Format format, int i, Object obj, long j, long j2, long j3) {
        super(asvVar, asyVar, 1, format, i, obj, j, j2);
        ptx.a(format);
        this.n = j3;
    }

    public long f() {
        long j = this.n;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean h();
}
