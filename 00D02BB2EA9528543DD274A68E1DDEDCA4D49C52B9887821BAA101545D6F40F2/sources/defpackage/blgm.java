package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: blgm  reason: default package */
/* loaded from: classes3.dex */
public class blgm implements blgj {
    private static final ddho d = dtxy.cR;
    @dzsi
    public cext b;
    public Runnable c;
    private final btrm f;
    private final blly g;
    private final cebr h;
    private final cexu i;
    private final blnq j;
    private final cdjk k;
    private blla m;
    private final blgl e = new blgl(this);
    private boolean l = false;

    public blgm(blly bllyVar, blnq blnqVar, cexu cexuVar, cqhn cqhnVar, btrm btrmVar, cebr cebrVar, btvo btvoVar, cdjk cdjkVar) {
        this.g = bllyVar;
        this.j = blnqVar;
        this.i = cexuVar;
        this.f = btrmVar;
        this.h = cebrVar;
        this.k = cdjkVar;
    }

    @Override // defpackage.blgj
    @dzsi
    public ceta a() {
        return this.b;
    }

    @Override // defpackage.blgj
    @dzsi
    public blla b() {
        return this.m;
    }

    @Override // defpackage.blgj
    @dzsi
    public blkw c() {
        blla bllaVar = this.m;
        if (bllaVar != null) {
            return bllaVar.a();
        }
        return null;
    }

    @Override // defpackage.blgj
    public Runnable d() {
        return new Runnable(this) { // from class: blgk
            private final blgm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                blgm blgmVar = this.a;
                blgmVar.j();
                Runnable runnable = blgmVar.c;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
    }

    @Override // defpackage.blgj
    public cqkl e() {
        blgh blghVar = null;
        for (View view : cqkx.n(this)) {
            if (view instanceof blgh) {
                blghVar = (blgh) view;
            }
        }
        if (blghVar != null) {
            blghVar.a(-blghVar.a.getResources().getDisplayMetrics().heightPixels, 200L, null, blghVar.b);
        }
        return cqkl.a;
    }

    @Override // defpackage.blgj
    public boolean f() {
        return false;
    }

    public void g(bwrs<ilo> bwrsVar, bwrs<cdjd> bwrsVar2, boolean z) {
        h(bwrsVar, bwrsVar2, "", dbpy.a, z, true, false);
    }

    public void h(bwrs<ilo> bwrsVar, bwrs<cdjd> bwrsVar2, String str, dbsg<djck> dbsgVar, boolean z, boolean z2, boolean z3) {
        j();
        boolean z4 = false;
        if (z2) {
            bllx a = this.g.a(this.k, d);
            a.G(bwrsVar, bwrsVar2, str, dbsgVar);
            this.m = a;
        } else {
            blnp a2 = this.j.a(this.k, false);
            a2.r(bwrsVar2, bwrsVar, 0, str, dbsgVar);
            this.m = a2;
        }
        btrm btrmVar = this.f;
        blgl blglVar = this.e;
        dceq a3 = dcet.a();
        a3.b(cdjh.class, new blgo(0, cdjh.class, blglVar, bvrj.UI_THREAD));
        a3.b(bkpe.class, new blgo(1, bkpe.class, blglVar, bvrj.UI_THREAD));
        btrmVar.g(blglVar, a3.a());
        this.m.m(this.f);
        this.l = true;
        if (z) {
            cexu cexuVar = this.i;
            cebr cebrVar = this.h;
            cdjd c = bwrsVar2.c();
            if (c != null && cebrVar.a() && cebu.a(c)) {
                z4 = true;
            }
            this.b = cexuVar.a(bwrsVar, bwrsVar2, null, z4);
        } else {
            this.b = null;
        }
        cqkx.p(this);
    }

    public void i(Runnable runnable) {
        this.c = runnable;
    }

    public final void j() {
        if (this.l) {
            this.f.a(this.e);
            blla bllaVar = this.m;
            if (bllaVar != null) {
                bllaVar.n(this.f);
            }
            this.l = false;
        }
    }
}
