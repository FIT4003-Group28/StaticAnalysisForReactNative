package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;
/* compiled from: PG */
/* renamed from: pjs  reason: default package */
/* loaded from: classes4.dex */
public final class pjs {
    public static final ppz r = new ppz(new Object());
    public final pkt a;
    public final long b;
    public final long c;
    public final int d;
    public final phr e;
    public final boolean f;
    public final TrackGroupArray g;
    public final pvo h;
    public final List i;
    public final boolean j;
    public final int k;
    public final pjt l;
    public final boolean m;
    public final boolean n;
    public volatile long o;
    public volatile long p;
    public volatile long q;
    public final ppz s;
    public final ppz t;

    public pjs(pkt pktVar, ppz ppzVar, long j, long j2, int i, phr phrVar, boolean z, TrackGroupArray trackGroupArray, pvo pvoVar, List list, ppz ppzVar2, boolean z2, int i2, pjt pjtVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.a = pktVar;
        this.s = ppzVar;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = phrVar;
        this.f = z;
        this.g = trackGroupArray;
        this.h = pvoVar;
        this.i = list;
        this.t = ppzVar2;
        this.j = z2;
        this.k = i2;
        this.l = pjtVar;
        this.o = j3;
        this.p = j4;
        this.q = j5;
        this.m = z3;
        this.n = z4;
    }

    public static pjs g(pvo pvoVar) {
        pkt pktVar = pkt.c;
        ppz ppzVar = r;
        return new pjs(pktVar, ppzVar, -9223372036854775807L, 0L, 1, null, false, TrackGroupArray.a, pvoVar, amuk.q(), ppzVar, false, 0, pjt.a, 0L, 0L, 0L, false, false);
    }

    public final pjs a(boolean z) {
        return new pjs(this.a, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.j, this.k, this.l, this.o, this.p, this.q, z, this.n);
    }

    public final pjs b(boolean z, int i) {
        return new pjs(this.a, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, z, i, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pjs c(phr phrVar) {
        return new pjs(this.a, this.s, this.b, this.c, this.d, phrVar, this.f, this.g, this.h, this.i, this.t, this.j, this.k, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pjs d(pjt pjtVar) {
        return new pjs(this.a, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.j, this.k, pjtVar, this.o, this.p, this.q, this.m, this.n);
    }

    public final pjs e(int i) {
        return new pjs(this.a, this.s, this.b, this.c, i, this.e, this.f, this.g, this.h, this.i, this.t, this.j, this.k, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pjs f(pkt pktVar) {
        return new pjs(pktVar, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.j, this.k, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pjs h(ppz ppzVar) {
        return new pjs(this.a, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ppzVar, this.j, this.k, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pjs i(ppz ppzVar, long j, long j2, long j3, long j4, TrackGroupArray trackGroupArray, pvo pvoVar, List list) {
        return new pjs(this.a, ppzVar, j2, j3, this.d, this.e, this.f, trackGroupArray, pvoVar, list, this.t, this.j, this.k, this.l, this.o, j4, j, this.m, this.n);
    }
}
