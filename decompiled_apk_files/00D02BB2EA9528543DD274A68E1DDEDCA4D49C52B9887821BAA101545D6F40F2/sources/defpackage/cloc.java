package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;
/* compiled from: PG */
/* renamed from: cloc  reason: default package */
/* loaded from: classes5.dex */
public final class cloc {
    public static final cmeh a = new cmeh(new Object());
    public final clpb b;
    public final cmeh c;
    public final long d;
    public final int e;
    public final cllz f;
    public final boolean g;
    public final TrackGroupArray h;
    public final cmjr i;
    public final List<Metadata> j;
    public final cmeh k;
    public final boolean l;
    public final int m;
    public final clod n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public cloc(clpb clpbVar, cmeh cmehVar, long j, int i, cllz cllzVar, boolean z, TrackGroupArray trackGroupArray, cmjr cmjrVar, List<Metadata> list, cmeh cmehVar2, boolean z2, int i2, clod clodVar, long j2, long j3, long j4, boolean z3, boolean z4) {
        this.b = clpbVar;
        this.c = cmehVar;
        this.d = j;
        this.e = i;
        this.f = cllzVar;
        this.g = z;
        this.h = trackGroupArray;
        this.i = cmjrVar;
        this.j = list;
        this.k = cmehVar2;
        this.l = z2;
        this.m = i2;
        this.n = clodVar;
        this.q = j2;
        this.r = j3;
        this.s = j4;
        this.o = z3;
        this.p = z4;
    }

    public static cloc a(cmjr cmjrVar) {
        clpb clpbVar = clpb.c;
        cmeh cmehVar = a;
        return new cloc(clpbVar, cmehVar, -9223372036854775807L, 1, null, false, TrackGroupArray.a, cmjrVar, dcdc.e(), cmehVar, false, 0, clod.a, 0L, 0L, 0L, false, false);
    }

    public final cloc b(cmeh cmehVar, long j, long j2, long j3, TrackGroupArray trackGroupArray, cmjr cmjrVar, List<Metadata> list) {
        return new cloc(this.b, cmehVar, j2, this.e, this.f, this.g, trackGroupArray, cmjrVar, list, this.k, this.l, this.m, this.n, this.q, j3, j, this.o, this.p);
    }

    public final cloc c(clpb clpbVar) {
        return new cloc(clpbVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final cloc d(int i) {
        return new cloc(this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final cloc e(cllz cllzVar) {
        return new cloc(this.b, this.c, this.d, this.e, cllzVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final cloc f(cmeh cmehVar) {
        return new cloc(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, cmehVar, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final cloc g(boolean z, int i) {
        return new cloc(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final cloc h(boolean z) {
        return new cloc(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, z, this.p);
    }
}
