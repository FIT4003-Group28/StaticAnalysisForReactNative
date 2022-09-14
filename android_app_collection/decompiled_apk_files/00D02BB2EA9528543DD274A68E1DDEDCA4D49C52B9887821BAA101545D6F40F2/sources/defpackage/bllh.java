package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bllh  reason: default package */
/* loaded from: classes3.dex */
public class bllh implements blkv, blhp {
    public final blhs a;
    private final dxio<akfa> b;
    private final blnq c;
    private final btrm d;
    private bwrs<ilo> e;
    @dzsi
    private cqkp f;
    private final bkue h;
    private final acpa i;
    private final cebr j;
    private final btvo k;
    private final List<blla> g = dchl.a();
    private boolean l = false;
    private final View.OnAttachStateChangeListener m = new bllg(this);

    public bllh(blhs blhsVar, gga ggaVar, cqhn cqhnVar, cqhu cqhuVar, dxio<akfa> dxioVar, blnq blnqVar, bkuf bkufVar, btrm btrmVar, cebr cebrVar, btvo btvoVar) {
        this.a = blhsVar;
        this.b = dxioVar;
        this.c = blnqVar;
        bkui a = bkufVar.a.a();
        bkuf.a(a, 1);
        bbut a2 = bkufVar.b.a();
        bkuf.a(a2, 2);
        gga a3 = bkufVar.c.a();
        bkuf.a(a3, 3);
        this.h = new bkue(a, a2, a3);
        this.d = btrmVar;
        this.j = cebrVar;
        this.i = blmj.a(ggaVar, false);
        this.k = btvoVar;
    }

    private final String p() {
        btlu j = this.b.a().j();
        return (j == null || !btlu.i(j).equals(btlt.GOOGLE)) ? "" : j.d;
    }

    private final cqkp q() {
        cqkp cqkpVar = this.f;
        return cqkpVar == null ? this : cqkpVar;
    }

    @Override // defpackage.blhp
    public void a() {
        if (this.l) {
            for (blla bllaVar : this.g) {
                bllaVar.n(this.d);
            }
        }
        this.g.clear();
        this.h.c();
        cqkx.p(q());
    }

    @Override // defpackage.blhp
    public void b(blhy blhyVar) {
        if (this.e == null) {
            return;
        }
        String d = this.a.d();
        dbsg<djck> e = this.a.e();
        dcdc<cdjd> a = blhyVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cdjd cdjdVar = a.get(i);
            blnp a2 = this.c.a(cdjk.PLACESHEET_REVIEWS, true);
            a2.s(cdjdVar, this.e, this.g.size(), d, e);
            if (this.l) {
                a2.m(this.d);
            }
            this.g.add(a2);
        }
        this.h.d(blhyVar.b());
        cqkx.p(q());
    }

    @Override // defpackage.blkv
    public Boolean c() {
        bwrs<ilo> bwrsVar = this.e;
        if (bwrsVar == null) {
            return false;
        }
        ilo c = bwrsVar.c();
        dbsk.s(c);
        List<cdjd> by = c.by();
        if (by.isEmpty()) {
            return false;
        }
        if (by.size() > 1) {
            return true;
        }
        String p = p();
        if (!p.isEmpty() && by.get(0).a().a().a()) {
            return Boolean.valueOf(!by.get(0).a().a().b().equals(p));
        }
        return true;
    }

    @Override // defpackage.blkv
    public Iterable<blla> d() {
        List<blla> list = this.g;
        final String p = p();
        return p.isEmpty() ? list : dcft.i(list, new dbsl(p) { // from class: bllf
            private final String a;

            {
                this.a = p;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !((blla) obj).e().equals(this.a);
            }
        });
    }

    @Override // defpackage.blkv
    public Boolean e() {
        return Boolean.valueOf(this.a.g());
    }

    @Override // defpackage.blkv
    public cqtv f() {
        cqkp cqkpVar = this.f;
        if (cqkpVar instanceof bllb) {
            return ((bllb) cqkpVar).j();
        }
        return cqrp.c(dcyn.a);
    }

    @Override // defpackage.blkv
    public View.OnAttachStateChangeListener g() {
        return this.m;
    }

    @Override // defpackage.blkv
    public acpa h() {
        return this.i;
    }

    @Override // defpackage.blkv
    public bkub i() {
        return this.h;
    }

    @Override // defpackage.blkv
    public Boolean j() {
        boolean z = true;
        if (!this.j.a()) {
            cebr cebrVar = this.j;
            bwrs<ilo> bwrsVar = this.e;
            dbsk.s(bwrsVar);
            ilo c = bwrsVar.c();
            dbsk.s(c);
            if (!cebrVar.c(c)) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blkv
    public Integer k() {
        return Integer.valueOf(this.k.getUgcParameters().aR());
    }

    public void l(btrm btrmVar) {
        if (this.l) {
            return;
        }
        for (blla bllaVar : this.g) {
            bllaVar.m(btrmVar);
        }
        this.l = true;
    }

    public void m(btrm btrmVar) {
        if (!this.l) {
            return;
        }
        for (blla bllaVar : this.g) {
            bllaVar.n(btrmVar);
        }
        this.l = false;
    }

    public void n(bwrs<ilo> bwrsVar) {
        this.e = bwrsVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        blhs blhsVar = this.a;
        blhsVar.c = this;
        blhsVar.a(c);
    }

    public void o(cqkp cqkpVar) {
        this.f = cqkpVar;
    }
}
