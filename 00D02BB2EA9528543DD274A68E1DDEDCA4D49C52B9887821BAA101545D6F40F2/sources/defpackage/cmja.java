package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
/* compiled from: PG */
/* renamed from: cmja  reason: default package */
/* loaded from: classes5.dex */
public final class cmja implements Comparable<cmja> {
    public final boolean a;
    private final String b;
    private final DefaultTrackSelector$Parameters c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;

    public cmja(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        int i2;
        int i3;
        int i4;
        this.c = defaultTrackSelector$Parameters;
        this.b = cmjh.b(format.c);
        int i5 = 0;
        this.d = cmjh.a(i, false);
        int i6 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i6 >= defaultTrackSelector$Parameters.A.size()) {
                i6 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            }
            i3 = cmjh.c(format, defaultTrackSelector$Parameters.A.get(i6), false);
            if (i3 > 0) {
                break;
            }
            i6++;
        }
        this.f = i6;
        this.e = i3;
        boolean z = true;
        this.i = 1 == (format.d & 1);
        this.j = format.y;
        this.k = format.z;
        this.l = format.h;
        int i7 = format.h;
        if ((i7 != -1 && i7 > defaultTrackSelector$Parameters.q) || ((i4 = format.y) != -1 && i4 > defaultTrackSelector$Parameters.p)) {
            z = false;
        }
        this.a = z;
        String[] V = cmny.V();
        int i8 = 0;
        while (true) {
            if (i8 >= V.length) {
                break;
            }
            int c = cmjh.c(format, V[i8], false);
            if (c > 0) {
                i2 = i8;
                i5 = c;
                break;
            }
            i8++;
        }
        this.g = i2;
        this.h = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(cmja cmjaVar) {
        Object c;
        if (!this.a || !this.d) {
            c = cmjh.a.c();
        } else {
            c = cmjh.a;
        }
        dbzx b = dbzx.b.h(this.d, cmjaVar.d).b(Integer.valueOf(this.f), Integer.valueOf(cmjaVar.f), dcmw.a).c(this.e, cmjaVar.e).h(this.a, cmjaVar.a).b(Integer.valueOf(this.l), Integer.valueOf(cmjaVar.l), this.c.v ? cmjh.a.c() : cmjh.b).h(this.i, cmjaVar.i).b(Integer.valueOf(this.g), Integer.valueOf(cmjaVar.g), dcmw.a).c(this.h, cmjaVar.h).b(Integer.valueOf(this.j), Integer.valueOf(cmjaVar.j), c).b(Integer.valueOf(this.k), Integer.valueOf(cmjaVar.k), c);
        Integer valueOf = Integer.valueOf(this.l);
        Integer valueOf2 = Integer.valueOf(cmjaVar.l);
        if (!cmny.b(this.b, cmjaVar.b)) {
            c = cmjh.b;
        }
        return b.b(valueOf, valueOf2, c).i();
    }
}
