package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: prp  reason: default package */
/* loaded from: classes4.dex */
public abstract class prp extends psb {
    public final long a;
    public final long b;
    public prr c;
    public int[] d;

    public prp(asv asvVar, asy asyVar, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(asvVar, asyVar, format, i, obj, j, j2, j5);
        this.a = j3;
        this.b = j4;
    }

    public final int c(int i) {
        return ((int[]) ptx.b(this.d))[i];
    }

    public final prr d() {
        prr prrVar = this.c;
        ptx.b(prrVar);
        return prrVar;
    }
}
