package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: aeru  reason: default package */
/* loaded from: classes2.dex */
public final class aeru implements aese, aerz {
    private static final dcqe f = dcqe.c("aeru");
    public final anhi a;
    public final aequ b;
    public final ahjq c;
    public final bvrb d;
    public final crzp<anhh> e;
    private final btrm g;
    private final dxio<ckcw> h;
    private final dcna<aesd, aerz> i;
    @dzsi
    private ckcq k;
    private boolean l = false;
    @dzsi
    private GmmLocation j = null;

    public aeru(btrm btrmVar, aequ aequVar, dxio<ckcw> dxioVar, bvrb bvrbVar, ahjq ahjqVar, anhi anhiVar) {
        this.g = btrmVar;
        this.b = aequVar;
        this.h = dxioVar;
        this.d = bvrbVar;
        this.c = ahjqVar;
        this.a = anhiVar;
        dckk c = dckm.c(aesd.class);
        dbzb.d(2, "expectedValuesPerKey");
        this.i = dckz.a(new dckj(c).a.a(), new dckf());
        this.e = new crzp(this) { // from class: aero
            private final aeru a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                aeru aeruVar = this.a;
                aeruVar.a(aeruVar.b.e());
            }
        };
    }

    private final synchronized void i(aesd aesdVar) {
        p(aesdVar);
        this.b.c(this);
        if (!this.l) {
            this.l = true;
            this.d.b(new Runnable(this) { // from class: aerq
                private final aeru a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aeru aeruVar = this.a;
                    aeruVar.a.b().a(aeruVar.e, dege.a);
                }
            }, bvrj.UI_THREAD);
        }
        btrm btrmVar = this.g;
        dceq a = dcet.a();
        a.b(AndroidLocationEvent.class, new aerv(AndroidLocationEvent.class, this));
        btrmVar.g(this, a.a());
        k(true);
    }

    private final synchronized void j() {
        q();
        k(false);
        try {
            this.g.a(this);
        } catch (bvon unused) {
        }
        if (this.l) {
            this.l = false;
            this.d.b(new Runnable(this) { // from class: aerr
                private final aeru a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aeru aeruVar = this.a;
                    aeruVar.a.b().c(aeruVar.e);
                }
            }, bvrj.UI_THREAD);
        }
        this.b.d(this);
    }

    private final void k(final boolean z) {
        this.d.b(new Runnable(this, z) { // from class: aers
            private final aeru a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aeru aeruVar = this.a;
                aeruVar.c.j(this.b);
            }
        }, bvrj.UI_THREAD);
    }

    private final synchronized void l(aesd aesdVar) {
        ((ckco) this.h.a().a(ckdz.ay)).a(aesdVar.d);
    }

    private final synchronized void m(aesd aesdVar) {
        ((ckco) this.h.a().a(ckdz.az)).a(aesdVar.d);
    }

    private final synchronized void n(aesd aesdVar, int i) {
        if (i <= 0) {
            try {
                o(aesdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            ((ckco) this.h.a().a(ckdz.aA)).a(aesdVar.d);
        }
    }

    private final synchronized void o(aesd aesdVar) {
        ((ckco) this.h.a().a(ckdz.aB)).a(aesdVar.d);
    }

    private final synchronized void p(aesd aesdVar) {
        ((ckco) this.h.a().a(ckdz.aC)).a(aesdVar.d);
        this.k = ((ckcr) this.h.a().a(ckdz.aD)).a();
    }

    private final synchronized void q() {
        ckcq ckcqVar = this.k;
        if (ckcqVar != null) {
            ckcqVar.b();
            this.k = null;
        }
    }

    private final aeui r(aeui aeuiVar) {
        anhh l;
        if (aeuiVar.j() && (l = this.a.b().l()) != null) {
            dbsg<ilo> b = l.b();
            if (!b.a()) {
                return aeuiVar;
            }
            ilo b2 = b.b();
            dtap bZ = dtaq.m.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtaq dtaqVar = (dtaq) bZ.b;
            dtaqVar.b = 1;
            dtaqVar.a = 1 | dtaqVar.a;
            dtaq dtaqVar2 = (dtaq) bZ.b;
            dtaqVar2.c = 48;
            int i = dtaqVar2.a | 2;
            dtaqVar2.a = i;
            dtaqVar2.a = i | 256;
            dtaqVar2.h = 100;
            dtai m = b2.ai().m();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtaq dtaqVar3 = (dtaq) bZ.b;
            m.getClass();
            dtaqVar3.i = m;
            dtaqVar3.a |= 512;
            aeuf i2 = aeuf.i(b2, bZ.bK());
            dbsk.t(i2, "can only be null when placemark is null");
            return i2.equals(aeuiVar.h) ? aeuiVar : new aeui(aeuh.CONFIRMED_CHECKIN, aeuiVar.g, i2, aeuiVar.d(), aeuiVar.e(), aeuiVar.i, aeuiVar.j, aeuiVar.k);
        }
        return aeuiVar;
    }

    @Override // defpackage.aerz
    public final synchronized void a(aeui aeuiVar) {
        dcdc r = dcdc.r(this.i.K());
        int size = r.size();
        for (int i = 0; i < size; i++) {
            ((aerz) r.get(i)).a(r(aeuiVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(AndroidLocationEvent androidLocationEvent) {
        amvs amvsVar = new amvs();
        amvsVar.j(androidLocationEvent.getLocation());
        this.j = amvsVar.d();
        h(3);
    }

    @Override // defpackage.aese
    public final synchronized void c(aesd aesdVar, aerz aerzVar) {
        boolean D = this.i.D();
        if (!this.i.n(aesdVar, aerzVar)) {
            m(aesdVar);
            bvoo.h("Double registration of listener %s for component %s: this new listener would be dropped in production.", aerzVar, aesdVar);
        }
        l(aesdVar);
        if (D) {
            i(aesdVar);
        }
        h(aesdVar.f);
    }

    @Override // defpackage.aese
    public final synchronized void d(aesd aesdVar) {
        n(aesdVar, this.i.e(aesdVar).size());
        if (this.i.D()) {
            j();
        } else {
            this.i.J();
        }
    }

    @Override // defpackage.aese
    public final synchronized void e(aesd aesdVar, aerz aerzVar) {
        n(aesdVar, this.i.G(aesdVar, aerzVar) ? 1 : 0);
        if (this.i.D()) {
            j();
        } else {
            this.i.J();
        }
    }

    @Override // defpackage.aese
    public final aeui f() {
        return r(this.b.e());
    }

    @Override // defpackage.aese
    public final void g(int i) {
        this.b.f(i);
    }

    public final synchronized void h(int i) {
        if (this.j == null) {
            return;
        }
        this.b.g(this.j, dcft.j(this.i.J(), aerp.a) ? aeqt.ACTIVE : aeqt.PASSIVE, i);
    }
}
