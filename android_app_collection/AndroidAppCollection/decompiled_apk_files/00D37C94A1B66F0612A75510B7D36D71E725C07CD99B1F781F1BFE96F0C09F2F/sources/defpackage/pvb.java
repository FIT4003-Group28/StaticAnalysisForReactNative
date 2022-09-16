package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
/* compiled from: PG */
/* renamed from: pvb  reason: default package */
/* loaded from: classes4.dex */
public final class pvb implements Comparable {
    public final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;

    public pvb(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i, String str) {
        amuk amukVar;
        int i2;
        boolean z = false;
        this.b = pvd.e(i, false);
        int i3 = format.d & (defaultTrackSelector$Parameters.b ^ (-1));
        this.c = 1 == (i3 & 1);
        this.d = (i3 & 2) != 0;
        if (defaultTrackSelector$Parameters.E.isEmpty()) {
            amukVar = amuk.r("");
        } else {
            amukVar = defaultTrackSelector$Parameters.E;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= amukVar.size()) {
                i4 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            i2 = pvd.c(format, (String) amukVar.get(i4), defaultTrackSelector$Parameters.G);
            if (i2 > 0) {
                break;
            }
            i4++;
        }
        this.e = i4;
        this.f = i2;
        int bitCount = Integer.bitCount(format.e & defaultTrackSelector$Parameters.F);
        this.g = bitCount;
        this.i = (format.e & 1088) != 0;
        int c = pvd.c(format, str, pvd.d(str) == null);
        this.h = c;
        if (i2 > 0 || ((defaultTrackSelector$Parameters.E.isEmpty() && bitCount > 0) || this.c || (this.d && c > 0))) {
            z = true;
        }
        this.a = z;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(pvb pvbVar) {
        amsu b = amsu.b.e(this.b, pvbVar.b).d(Integer.valueOf(this.e), Integer.valueOf(pvbVar.e), amyi.a).b(this.f, pvbVar.f).b(this.g, pvbVar.g).e(this.c, pvbVar.c).d(Boolean.valueOf(this.d), Boolean.valueOf(pvbVar.d), this.f == 0 ? amxo.a : amyi.a).b(this.h, pvbVar.h);
        if (this.g == 0) {
            b = b.f(this.i, pvbVar.i);
        }
        return b.a();
    }
}
