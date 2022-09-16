package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
/* compiled from: PG */
/* renamed from: pux  reason: default package */
/* loaded from: classes4.dex */
public final class pux implements Comparable {
    public final boolean a;
    private final String b;
    private final DefaultTrackSelector$Parameters c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;

    public pux(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.c = defaultTrackSelector$Parameters;
        this.b = pvd.d(format.c);
        int i6 = 0;
        this.d = pvd.e(i, false);
        int i7 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i7 >= defaultTrackSelector$Parameters.z.size()) {
                i7 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            }
            i3 = pvd.c(format, (String) defaultTrackSelector$Parameters.z.get(i7), false);
            if (i3 > 0) {
                break;
            }
            i7++;
        }
        this.f = i7;
        this.e = i3;
        this.g = Integer.bitCount(format.e & defaultTrackSelector$Parameters.A);
        boolean z = true;
        this.j = 1 == (format.d & 1);
        this.k = format.y;
        this.l = format.z;
        this.m = format.h;
        int i8 = format.h;
        if ((i8 != -1 && i8 > defaultTrackSelector$Parameters.C) || ((i4 = format.y) != -1 && i4 > defaultTrackSelector$Parameters.B)) {
            z = false;
        }
        this.a = z;
        String[] Y = pxi.Y();
        int i9 = 0;
        while (true) {
            if (i9 >= Y.length) {
                i9 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = pvd.c(format, Y[i9], false);
            if (i5 > 0) {
                break;
            }
            i9++;
        }
        this.h = i9;
        this.i = i5;
        while (true) {
            if (i6 < defaultTrackSelector$Parameters.D.size()) {
                String str = format.l;
                if (str != null && str.equals(defaultTrackSelector$Parameters.D.get(i6))) {
                    i2 = i6;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        this.n = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(pux puxVar) {
        amxr a;
        if (!this.a || !this.d) {
            a = pvd.a.a();
        } else {
            a = pvd.a;
        }
        amsu d = amsu.b.e(this.d, puxVar.d).d(Integer.valueOf(this.f), Integer.valueOf(puxVar.f), amyi.a).b(this.e, puxVar.e).b(this.g, puxVar.g).e(this.a, puxVar.a).d(Integer.valueOf(this.n), Integer.valueOf(puxVar.n), amyi.a).d(Integer.valueOf(this.m), Integer.valueOf(puxVar.m), this.c.H ? pvd.a.a() : pvd.b).e(this.j, puxVar.j).d(Integer.valueOf(this.h), Integer.valueOf(puxVar.h), amyi.a).b(this.i, puxVar.i).d(Integer.valueOf(this.k), Integer.valueOf(puxVar.k), a).d(Integer.valueOf(this.l), Integer.valueOf(puxVar.l), a);
        Integer valueOf = Integer.valueOf(this.m);
        Integer valueOf2 = Integer.valueOf(puxVar.m);
        if (!pxi.M(this.b, puxVar.b)) {
            a = pvd.b;
        }
        return d.d(valueOf, valueOf2, a).a();
    }
}
