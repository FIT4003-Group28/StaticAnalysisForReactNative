package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* compiled from: PG */
/* renamed from: afbj  reason: default package */
/* loaded from: classes.dex */
public final class afbj {
    private static final pks j = new pks();
    public final afbi a;
    public int b;
    public auz c;
    public boolean d;
    public boolean e;
    public volatile boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private boolean k;

    public afbj(afbi afbiVar) {
        this.a = afbiVar;
    }

    private final void e(auz auzVar, boolean z, int i) {
        long d;
        afbi afbiVar;
        afhh g = this.a.g();
        if (auzVar.b.z()) {
            d = -9223372036854775807L;
        } else {
            pkt pktVar = auzVar.b;
            int i2 = auzVar.c;
            pks pksVar = j;
            pktVar.y(i2, pksVar);
            d = phk.d(pksVar.q);
        }
        long b = afbz.b(d, auzVar.g);
        boolean z2 = false;
        if (i == 2) {
            if (z) {
                this.a.b.d();
            } else {
                this.a.b.n();
            }
            long e = ((aewx) this.a.e).d.e();
            aewx aewxVar = (aewx) this.a.e;
            FormatStreamModel l = aewxVar.l();
            FormatStreamModel k = aewxVar.k();
            long j2 = l != null ? l.f : 0L;
            if (k != null) {
                j2 += k.f;
            }
            if (g.l(b, e, j2)) {
                afbi afbiVar2 = this.a;
                afbiVar2.e.X(afbiVar2);
            }
        } else if (i != 3) {
            if (i == 4) {
                afbi afbiVar3 = this.a;
                afbiVar3.e.Z(afbiVar3, false);
                this.a.b.f();
            }
        } else if (z) {
            if (g.m()) {
                afbi afbiVar4 = this.a;
                afbiVar4.e.X(afbiVar4);
            } else {
                afbi afbiVar5 = this.a;
                if (!afbiVar5.B || afbiVar5.D) {
                    afbiVar5.b.q();
                    z2 = true;
                } else {
                    afbiVar5.C = true;
                }
                if (this.i && b >= this.a.b().d && (afbiVar = this.a.z) != null) {
                    afbiVar.B = true;
                }
            }
        } else if (!this.i || b < this.a.b().d) {
            this.a.b.m();
            g.g();
        } else {
            this.a.b.f();
            afbi afbiVar6 = this.a;
            afbiVar6.e.Z(afbiVar6, true);
        }
        this.f = z2;
    }

    public final void a() {
        if (this.d || this.e || !this.g) {
            return;
        }
        this.g = false;
        e(this.c, this.k, this.b);
    }

    public final void b() {
        if (this.e) {
            this.e = false;
            a();
        }
    }

    public final void c(auz auzVar, boolean z, int i) {
        if (this.b == 2 && i != 2) {
            this.h = true;
        }
        if (i == 3 && this.a.L.ab() && this.d) {
            this.d = false;
            afbi afbiVar = this.a;
            afbiVar.b.u(afbiVar.f);
        }
        this.b = i;
        this.k = z;
        this.c = auzVar;
        boolean z2 = this.e;
        if (z2) {
            this.g = true;
        }
        if (this.d || z2) {
            return;
        }
        e(auzVar, z, i);
    }

    public final void d() {
        this.h = false;
        this.d = true;
    }
}
