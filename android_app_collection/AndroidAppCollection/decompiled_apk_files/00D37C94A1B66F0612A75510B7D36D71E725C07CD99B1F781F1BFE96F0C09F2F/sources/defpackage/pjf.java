package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: pjf  reason: default package */
/* loaded from: classes4.dex */
final class pjf {
    public final ppy a;
    public final Object b;
    public final pri[] c;
    public boolean d;
    public boolean e;
    public pjg f;
    public boolean g;
    public pjf h;
    public TrackGroupArray i = TrackGroupArray.a;
    public pvo j;
    public long k;
    private final boolean[] l;
    private final pke[] m;
    private final pvn n;
    private final pjp o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [ppe] */
    public pjf(pke[] pkeVarArr, long j, pvn pvnVar, axf axfVar, pjp pjpVar, pjg pjgVar, pvo pvoVar) {
        this.m = pkeVarArr;
        this.k = j;
        this.n = pvnVar;
        this.o = pjpVar;
        this.b = pjgVar.i.a;
        this.f = pjgVar;
        this.j = pvoVar;
        int length = pkeVarArr.length;
        this.c = new pri[length];
        this.l = new boolean[length];
        ppz ppzVar = pjgVar.i;
        long j2 = pjgVar.a;
        long j3 = pjgVar.c;
        Object i = phc.i(ppzVar.a);
        ppz b = ppzVar.b(phc.h(ppzVar.a));
        pjn pjnVar = (pjn) pjpVar.c.get(i);
        ptx.a(pjnVar);
        pjpVar.h.add(pjnVar);
        pjm pjmVar = (pjm) pjpVar.g.get(pjnVar);
        if (pjmVar != null) {
            pjmVar.a.rC(pjmVar.b);
        }
        pjnVar.c.add(b);
        pps v = pjnVar.a.v(b, axfVar, j2);
        pjpVar.b.put(v, pjnVar);
        pjpVar.c();
        this.a = j3 != -9223372036854775807L ? new ppe(v, true, 0L, j3) : v;
    }

    private final void n() {
        if (l()) {
            int i = 0;
            while (true) {
                pvo pvoVar = this.j;
                if (i >= pvoVar.a) {
                    return;
                }
                boolean b = pvoVar.b(i);
                pvf pvfVar = this.j.c[i];
                if (b && pvfVar != null) {
                    pvfVar.f();
                }
                i++;
            }
        }
    }

    private final void o() {
        if (l()) {
            int i = 0;
            while (true) {
                pvo pvoVar = this.j;
                if (i >= pvoVar.a) {
                    return;
                }
                boolean b = pvoVar.b(i);
                pvf pvfVar = this.j.c[i];
                if (b && pvfVar != null) {
                    pvfVar.g();
                }
                i++;
            }
        }
    }

    public final long a(pvo pvoVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= pvoVar.a) {
                break;
            }
            boolean[] zArr2 = this.l;
            if (z || !pvoVar.a(this.j, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            pke[] pkeVarArr = this.m;
            if (i2 >= pkeVarArr.length) {
                break;
            }
            pkeVarArr[i2].R();
            i2++;
        }
        n();
        this.j = pvoVar;
        o();
        long h = this.a.h(pvoVar.c, this.l, this.c, zArr, j);
        int i3 = 0;
        while (true) {
            pke[] pkeVarArr2 = this.m;
            if (i3 >= pkeVarArr2.length) {
                break;
            }
            pkeVarArr2[i3].R();
            i3++;
        }
        this.e = false;
        int i4 = 0;
        while (true) {
            pri[] priVarArr = this.c;
            if (i4 < priVarArr.length) {
                if (priVarArr[i4] != null) {
                    ptx.e(pvoVar.b(i4));
                    this.m[i4].R();
                    this.e = true;
                } else {
                    ptx.e(pvoVar.c[i4] == null);
                }
                i4++;
            } else {
                return h;
            }
        }
    }

    public final long b() {
        if (!this.d) {
            return this.f.a;
        }
        long d = this.e ? this.a.d() : Long.MIN_VALUE;
        return d == Long.MIN_VALUE ? this.f.d : d;
    }

    public final long c() {
        if (!this.d) {
            return 0L;
        }
        return this.a.e();
    }

    public final long d() {
        return this.f.a + this.k;
    }

    public final long e(long j) {
        return j - this.k;
    }

    public final long f(long j) {
        return j + this.k;
    }

    public final pvo g(float f, pkt pktVar) {
        pvf[] pvfVarArr;
        pvo b = this.n.b(this.m, this.i, this.f.i, pktVar);
        for (pvf pvfVar : b.c) {
            if (pvfVar != null) {
                pvfVar.h(f);
            }
        }
        return b;
    }

    public final void h() {
        n();
        pjp pjpVar = this.o;
        ppy ppyVar = this.a;
        try {
            if (ppyVar instanceof ppe) {
                pjpVar.e(((ppe) ppyVar).a);
            } else {
                pjpVar.e(ppyVar);
            }
        } catch (RuntimeException e) {
            pns.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void i(pjf pjfVar) {
        if (pjfVar == this.h) {
            return;
        }
        n();
        this.h = pjfVar;
        o();
    }

    public final void j() {
        ppy ppyVar = this.a;
        if (ppyVar instanceof ppe) {
            long j = this.f.c;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((ppe) ppyVar).n(0L, j);
        }
    }

    public final boolean k() {
        return this.d && (!this.e || this.a.d() == Long.MIN_VALUE);
    }

    public final boolean l() {
        return this.h == null;
    }

    public final long m(pvo pvoVar, long j) {
        return a(pvoVar, j, false, new boolean[this.m.length]);
    }
}
