package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
/* compiled from: PG */
/* renamed from: cmjf  reason: default package */
/* loaded from: classes5.dex */
public final class cmjf implements Comparable<cmjf> {
    public final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;

    public cmjf(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i, String str) {
        dcdc<String> dcdcVar;
        int i2;
        boolean z = false;
        this.b = cmjh.a(i, false);
        int i3 = format.d & (defaultTrackSelector$Parameters.E ^ (-1));
        this.c = 1 == (i3 & 1);
        this.d = (i3 & 2) != 0;
        if (defaultTrackSelector$Parameters.B.isEmpty()) {
            dcdcVar = dcdc.f("");
        } else {
            dcdcVar = defaultTrackSelector$Parameters.B;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= dcdcVar.size()) {
                i4 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            i2 = cmjh.c(format, dcdcVar.get(i4), defaultTrackSelector$Parameters.D);
            if (i2 > 0) {
                break;
            }
            i4++;
        }
        this.e = i4;
        this.f = i2;
        int bitCount = Integer.bitCount(format.e & defaultTrackSelector$Parameters.C);
        this.g = bitCount;
        this.i = (format.e & 1088) != 0;
        int c = cmjh.c(format, str, cmjh.b(str) == null);
        this.h = c;
        if (i2 > 0 || ((defaultTrackSelector$Parameters.B.isEmpty() && bitCount > 0) || this.c || (this.d && c > 0))) {
            z = true;
        }
        this.a = z;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(cmjf cmjfVar) {
        dbzx c = dbzx.b.h(this.b, cmjfVar.b).b(Integer.valueOf(this.e), Integer.valueOf(cmjfVar.e), dcmw.a).c(this.f, cmjfVar.f).c(this.g, cmjfVar.g).h(this.c, cmjfVar.c).b(Boolean.valueOf(this.d), Boolean.valueOf(cmjfVar.d), this.f == 0 ? dcln.a : dcmw.a).c(this.h, cmjfVar.h);
        if (this.g == 0) {
            c = c.g(this.i, cmjfVar.i);
        }
        return c.i();
    }
}
