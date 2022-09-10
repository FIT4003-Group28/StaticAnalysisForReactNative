package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: vml  reason: default package */
/* loaded from: classes7.dex */
public final class vml {
    public final Activity a;
    public final eeu b;
    public final avij c;
    public final vmo d;
    public final bvjj e;
    public final bvrb f;
    public final cztz g;
    public final avzm h;
    private final btpc i;
    private final vwv j;
    private final dxio<akfa> k;

    public vml(Activity activity, eeu eeuVar, avij avijVar, bvrb bvrbVar, btpc btpcVar, vwv vwvVar, vmo vmoVar, bvjj bvjjVar, cztz cztzVar, dxio<akfa> dxioVar, avzm avzmVar) {
        this.a = activity;
        this.b = eeuVar;
        this.c = avijVar;
        this.f = bvrbVar;
        this.i = btpcVar;
        this.j = vwvVar;
        this.g = cztzVar;
        this.d = vmoVar;
        this.e = bvjjVar;
        this.k = dxioVar;
        this.h = avzmVar;
    }

    public static boolean a(akrp akrpVar) {
        return akrpVar.n() > 0 && akrpVar.m() > 0;
    }

    @dzsi
    public static bvjk e(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return bvjk.aj;
            }
            return null;
        }
        return bvjk.ak;
    }

    public final void b(int i) {
        this.f.b(new vmk(this, i), bvrj.UI_THREAD);
    }

    @dzsi
    public final akrk c(amte amteVar) {
        amub b;
        if (amteVar.a.n() <= 0 || (b = amteVar.b(amteVar.i, this.a)) == null) {
            return null;
        }
        return b.l;
    }

    public final int d(amte amteVar) {
        amsy amsyVar = amteVar.a;
        if (amsyVar.n() == 0) {
            return 1;
        }
        amve m = amsyVar.m(amsyVar.o());
        btlu j = this.k.a().j();
        if (amteVar.d() == dqvj.DRIVE && this.i.e() && j != null && j.u() && !amsyVar.d() && m != null) {
            if (this.j.b && m.g() > 1) {
                return 2;
            }
            if (this.j.c > 0) {
                dowb dowbVar = m.b().d;
                if (dowbVar == null) {
                    dowbVar = dowb.d;
                }
                if (dowbVar.b > this.j.c * 1000) {
                    return 3;
                }
            }
        }
        return 1;
    }
}
