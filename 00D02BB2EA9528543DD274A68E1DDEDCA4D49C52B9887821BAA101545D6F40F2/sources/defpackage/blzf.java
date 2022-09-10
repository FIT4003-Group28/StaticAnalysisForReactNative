package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: blzf  reason: default package */
/* loaded from: classes3.dex */
public class blzf implements blvz {
    public blwa a;
    @dzsi
    public blxo b;
    public boolean c;
    public int d;
    @dzsi
    private blyv e;
    @dzsi
    private final cqkf<blwr> f;

    public blzf(blwa blwaVar, blxp blxpVar, blyw blywVar, @dzsi cqkj cqkjVar, @dzsi String str, @dzsi akqi akqiVar, blpk blpkVar, @dzsi blxm blxmVar, @dzsi blyz blyzVar, boolean z, boolean z2, String str2) {
        this.d = z2 ? 3 : 2;
        this.a = blwaVar;
        blwaVar.b = this;
        blvu a = blwaVar.a();
        blyw.a(this, 1);
        blyw.a(blpkVar, 5);
        blyw.a(str2, 6);
        Activity activity = (Activity) ((dxjd) blywVar.a).a;
        blyw.a(activity, 7);
        blzs a2 = blywVar.b.a();
        blyw.a(a2, 8);
        blye a3 = blywVar.c.a();
        blyw.a(a3, 9);
        angp a4 = blywVar.d.a();
        blyw.a(a4, 10);
        blpg a5 = blywVar.e.a();
        blyw.a(a5, 11);
        dzsj<akfa> dzsjVar = blywVar.f;
        cjqy a6 = blywVar.g.a();
        blyw.a(a6, 13);
        bvrb a7 = blywVar.h.a();
        blyw.a(a7, 14);
        dzsj<blpp> dzsjVar2 = blywVar.i;
        cqat a8 = blywVar.j.a();
        blyw.a(a8, 16);
        bqji a9 = blywVar.k.a();
        blyw.a(a9, 17);
        blwk a10 = blywVar.l.a();
        blyw.a(a10, 18);
        blyv blyvVar = new blyv(this, a, str, akqiVar, blpkVar, str2, activity, a2, a3, a4, a5, dzsjVar, a6, a7, dzsjVar2, a8, a9, a10);
        this.e = blyvVar;
        blxp.a(this, 1);
        blxp.a(blyvVar, 2);
        blxp.a(blyzVar, 4);
        blxp.a(blpkVar, 6);
        blxp.a(str2, 7);
        ff ffVar = (ff) ((dxjd) blxpVar.a).a;
        blxp.a(ffVar, 8);
        blwm a11 = blxpVar.b.a();
        blxp.a(a11, 9);
        btrm a12 = blxpVar.c.a();
        blxp.a(a12, 10);
        btvo a13 = blxpVar.d.a();
        blxp.a(a13, 11);
        bvjj a14 = blxpVar.e.a();
        blxp.a(a14, 12);
        anhg a15 = blxpVar.f.a();
        blxp.a(a15, 13);
        bvrb a16 = blxpVar.g.a();
        blxp.a(a16, 14);
        cjqy a17 = blxpVar.h.a();
        blxp.a(a17, 15);
        cjqq a18 = blxpVar.i.a();
        blxp.a(a18, 16);
        dzsj<blpp> dzsjVar3 = blxpVar.j;
        dzsj<ccif> dzsjVar4 = blxpVar.k;
        cqat a19 = blxpVar.l.a();
        blxp.a(a19, 19);
        blxo blxoVar = new blxo(this, blyvVar, blxmVar, blyzVar, z, blpkVar, str2, ffVar, a11, a12, a13, a14, a15, a16, a17, a18, dzsjVar3, dzsjVar4, a19);
        this.b = blxoVar;
        if (z2) {
            blxoVar.S();
        }
        if (cqkjVar != null) {
            cqkf<blwr> c = cqkjVar.c(new blqt(), null);
            this.f = c;
            c.e(this.b);
        } else {
            this.f = null;
        }
        this.c = false;
    }

    @Override // defpackage.blvz
    public final void a(blvu blvuVar, boolean z) {
        this.e.an(blvuVar, z);
        this.c = false;
    }

    @Override // defpackage.blvz
    public final void b() {
        this.e.an(null, false);
        if (!this.c && this.a.h) {
            this.b.T();
        }
        if (h().booleanValue()) {
            this.c = false;
        }
    }

    @dzsi
    public final View c() {
        return this.f.c();
    }

    public final void d(blvu blvuVar, boolean z) {
        this.a.e(blvuVar);
        if (z) {
            this.b.D(blvuVar.n);
        } else {
            this.b.C(blvuVar.n, blvuVar.p);
        }
    }

    public final void e() {
        dcdn<Object, Object> dcdnVar;
        boolean z;
        List<blvu> list;
        blwa blwaVar = this.a;
        if (blwaVar.g() && (list = blwaVar.a) != null) {
            blvv blvvVar = blwaVar.d;
            bvrj.UI_THREAD.c();
            blvvVar.a.clear();
            blvvVar.b(list);
            blvvVar.d = blvvVar.b;
            blwaVar.a = null;
            z = true;
            blwaVar.h = true;
        } else if (blwaVar.d() <= 0) {
            return;
        } else {
            blvu a = blwaVar.a();
            if (a == null) {
                dcdnVar = dcmn.a;
            } else {
                dcdnVar = dcdn.k(a.b, Integer.valueOf(blwaVar.d()));
            }
            blwaVar.c = dcdnVar;
            z = false;
        }
        blwaVar.h(z);
    }

    @dzsi
    public final blvu f() {
        return this.a.c();
    }

    public final Boolean g() {
        return Boolean.valueOf(this.a.c() != null);
    }

    public final Boolean h() {
        return Boolean.valueOf(this.a.a() != null);
    }

    public final boolean i() {
        return this.a.g();
    }

    public final int j(String str) {
        blwa blwaVar = this.a;
        if (!blwaVar.c.containsKey(str)) {
            return 0;
        }
        return blwaVar.c.get(str).intValue();
    }

    @dzsi
    public final blvu k() {
        return this.a.a();
    }

    @dzsi
    public final dbsg<dgci> l() {
        return this.a.b() == null ? dbpy.a : this.a.b().c();
    }

    public final int m() {
        return this.a.d();
    }

    public final void n() {
        this.b.M();
    }

    public final void o(dvrh dvrhVar) {
        this.b.Q(dvrhVar);
    }

    public final void p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.b.E();
        } else if (i2 == 1) {
            this.b.F();
        } else if (i2 == 2) {
            this.b.G();
        } else if (i2 != 3) {
            d(k(), true);
        } else {
            q(1);
        }
    }

    public final void q(int i) {
        blvu k = k();
        if (i == 2) {
            this.a.f();
        } else {
            this.a.e(k);
        }
        this.b.C(k.n, k.p);
    }
}
