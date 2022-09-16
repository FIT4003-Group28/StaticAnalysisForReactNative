package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayqp  reason: default package */
/* loaded from: classes3.dex */
public class ayqp implements aymp {
    public final gga a;
    public final bwqv b;
    public final axwy c;
    public final cztz d;
    public final batm e;
    public final String f;
    public final isd g;
    @dzsi
    protected final bnju h;
    private final bvsl i;
    private final begg j;
    private final int k;
    private final azxk l;
    private final ayrc m;
    private final axwg n;
    private final batz o;
    private final dxio<axwo> p;
    @dzsi
    private final Integer q;
    private final ayqe r;

    public ayqp(gga ggaVar, bwqv bwqvVar, axwy axwyVar, begg beggVar, bvsl bvslVar, cztz cztzVar, batm batmVar, ayqe ayqeVar, ayrc ayrcVar, axwg axwgVar, batz batzVar, dxio<axwo> dxioVar, isd isdVar, azxk azxkVar, String str, int i, @dzsi bnju bnjuVar, @dzsi Integer num) {
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = axwyVar;
        this.j = beggVar;
        this.i = bvslVar;
        this.d = cztzVar;
        this.e = batmVar;
        this.l = azxkVar;
        this.f = str;
        this.k = i;
        this.h = bnjuVar;
        this.q = num;
        this.r = ayqeVar;
        this.m = ayrcVar;
        this.n = axwgVar;
        this.o = batzVar;
        this.p = dxioVar;
        this.g = isdVar;
    }

    @Override // defpackage.aymp
    public Boolean a() {
        boolean z = false;
        if (this.h != null && !this.l.u()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aymp
    public Boolean b() {
        return true;
    }

    @Override // defpackage.aymp
    public Boolean c() {
        return false;
    }

    @Override // defpackage.aymp
    public Boolean d() {
        return false;
    }

    @Override // defpackage.aymp
    public Boolean e() {
        return false;
    }

    @Override // defpackage.aymp
    public String f() {
        if (akqi.d(this.l.b())) {
            return this.l.e(null);
        }
        return this.a.getString(R.string.DROPPED_PIN);
    }

    @Override // defpackage.aymp
    public String g() {
        if (akqi.d(this.l.b())) {
            return this.l.c();
        }
        return this.l.d().b();
    }

    @Override // defpackage.aymp
    public String h() {
        return batx.b(this.q, this.i);
    }

    @Override // defpackage.aymp
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.aymp
    @dzsi
    public aymo j() {
        return null;
    }

    @Override // defpackage.aymp
    public cqkl k() {
        ilo u = u();
        if (u != null) {
            this.o.c(this.f, drcs.PRIVATE, this.k, u, this.j);
        }
        return cqkl.a;
    }

    @Override // defpackage.aymp
    public cqkl l() {
        if (!this.a.aZ) {
            return cqkl.a;
        }
        ilo u = u();
        if (u != null) {
            ily g = u.g();
            g.C(true);
            bwrs<ilo> a = bwrs.a(g.d());
            this.b.g(a, new ayqo(this, u, a));
            this.c.f(a);
        }
        return cqkl.a;
    }

    @Override // defpackage.aymp
    public cqkl m() {
        return cqkl.a;
    }

    @Override // defpackage.aymp
    @dzsi
    public bfkm n() {
        bnju x = x();
        if (x != null) {
            return x.ah();
        }
        return null;
    }

    @Override // defpackage.aymp
    public cqtv o() {
        return cqrp.d(dcyn.a);
    }

    @Override // defpackage.aymp
    public View.OnClickListener p() {
        return new View.OnClickListener(this) { // from class: ayqi
            private final ayqp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ayqp ayqpVar = this.a;
                isc a = ayqpVar.g.a(view);
                a.a(ayqpVar.q().b());
                a.show();
            }
        };
    }

    @Override // defpackage.aymp
    public jht q() {
        jhu h = jhv.h();
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.REMOVE_PLACE_OVERFLOW_MENU_TEXT;
        jhmVar.a = this.a.getText(R.string.REMOVE_PLACE_OVERFLOW_MENU_TEXT);
        jhmVar.f = cjtd.b;
        jhmVar.d(new View.OnClickListener(this) { // from class: ayqj
            private final ayqp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l();
            }
        });
        h.d(jhmVar.c());
        return h.b();
    }

    @Override // defpackage.aymp
    @dzsi
    public cqkp r() {
        bnju x = x();
        if (x == null) {
            return null;
        }
        return this.r.a(x.aK(), new Runnable(this) { // from class: ayqk
            private final ayqp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        }, dtxy.el);
    }

    @Override // defpackage.aymp
    @dzsi
    public aymy s() {
        bnju x = x();
        if (x == null || !this.n.c()) {
            return null;
        }
        return this.m.a(x.aK(), new Runnable(this) { // from class: ayql
            private final ayqp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        }, dtxy.el, this);
    }

    @Override // defpackage.aymp
    @dzsi
    public aymx t() {
        return null;
    }

    @Override // defpackage.aymp
    @dzsi
    public ilo u() {
        return batz.a(this.l.c(), this.l.b(), this.l.d());
    }

    @Override // defpackage.aymp
    @dzsi
    public izx v() {
        return null;
    }

    @Override // defpackage.aymp
    @dzsi
    public View.OnAttachStateChangeListener w() {
        ilo u = u();
        if (u == null) {
            return null;
        }
        return aybb.a(this.p.a(), u);
    }

    @dzsi
    public bnju x() {
        if (this.h == null) {
            return null;
        }
        begh beghVar = new begh();
        beghVar.e = true;
        bnjs aK = this.h.aK();
        aK.b(true);
        aK.o = beghVar;
        return aK.a();
    }
}
