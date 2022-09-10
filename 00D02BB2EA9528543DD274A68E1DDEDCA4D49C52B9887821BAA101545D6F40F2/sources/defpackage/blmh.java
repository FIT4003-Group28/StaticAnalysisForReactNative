package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: blmh  reason: default package */
/* loaded from: classes3.dex */
public class blmh implements blkx {
    public final bktc a;
    private final blld b;
    private final Activity c;
    private final btvo d;
    private final blkj e;
    private final dxio<bkpi> f;
    private final bljq g;
    private boolean j;
    @dzsi
    private bwrs<ilo> k;
    @dzsi
    private String l;
    private final boolean o;
    private final boolean p;
    private List<blky> h = dcdc.e();
    private List<bksb> i = dcdc.e();
    @dzsi
    private cjtd m = null;
    @dzsi
    private cjtd n = null;

    public blmh(Activity activity, blle blleVar, btvo btvoVar, bktc bktcVar, dxio<bkpi> dxioVar, blkj blkjVar, bljr bljrVar, boolean z, boolean z2) {
        this.a = bktcVar;
        this.b = blleVar.a();
        this.d = btvoVar;
        this.c = activity;
        this.o = z;
        this.p = z2;
        this.e = blkjVar;
        this.f = dxioVar;
        this.g = bljrVar.a(true != z ? 3 : 2);
    }

    @Override // defpackage.blkx
    public List<blky> a() {
        return this.h;
    }

    @Override // defpackage.blkx
    public blja b() {
        return this.g;
    }

    @Override // defpackage.blkx
    public blku c() {
        return this.b;
    }

    @Override // defpackage.blkx
    public List<bksb> d() {
        return this.i;
    }

    @Override // defpackage.blkx
    public Boolean e() {
        boolean z = false;
        if (!this.j || !this.b.b().booleanValue()) {
            return false;
        }
        boolean z2 = this.e.d() && this.h.isEmpty();
        boolean z3 = z2 && this.d.getUgcParameters().ap().f && this.g.d().booleanValue();
        boolean z4 = z2 && !z3;
        if (!z2 || this.e.e() == 8) {
            z = true;
        }
        if (!this.o) {
            return Boolean.valueOf(z);
        }
        if (this.p) {
            return Boolean.valueOf(z3);
        }
        return Boolean.valueOf(z4);
    }

    @Override // defpackage.blkx
    public cqkl f() {
        if (this.k != null) {
            j(null);
        }
        return cqkl.a;
    }

    @Override // defpackage.blkx
    @dzsi
    public String g() {
        return this.l;
    }

    @Override // defpackage.blkx
    @dzsi
    public cjtd h() {
        cjtd cjtdVar = this.m;
        if (cjtdVar == null) {
            return null;
        }
        cjta c = cjtd.c(cjtdVar);
        c.d = dtxy.eY;
        return c.a();
    }

    @Override // defpackage.blkx
    @dzsi
    public cjtd i() {
        return this.n;
    }

    public final void j(@dzsi djck djckVar) {
        drdk drdkVar;
        bwrs<ilo> bwrsVar = this.k;
        if (bwrsVar == null) {
            return;
        }
        bkpi a = this.f.a();
        if (djckVar == null) {
            drdkVar = null;
        } else {
            drdkVar = djckVar.b;
            if (drdkVar == null) {
                drdkVar = drdk.c;
            }
        }
        a.b(bwrsVar, dbsg.j(drdkVar), dbpy.a, blif.i(), false, dbpy.a);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.k = bwrsVar;
        this.b.l(this.c, bwrsVar);
        final ilo c = bwrsVar.c();
        dbsk.s(c);
        if (this.e.c(c)) {
            dvyv dvyvVar = c.h().aS;
            if (dvyvVar == null) {
                dvyvVar = dvyv.b;
            }
            ArrayList arrayList = new ArrayList(dvyvVar.a.size());
            for (dvyr dvyrVar : dvyvVar.a) {
                arrayList.add(new bllk(dvyrVar, this.c));
            }
            this.h = arrayList;
        } else {
            this.h = dcdc.e();
            this.g.b(bwrsVar, blma.a);
        }
        boolean z = true;
        if (c.by().size() > this.g.a().size()) {
            this.l = this.c.getResources().getString(true != this.g.a().isEmpty() ? R.string.MORE_REVIEWS : R.string.SEE_REVIEWS);
        } else {
            this.l = null;
        }
        final dcep B = dcbg.b(this.g.a()).o(blmb.a).s(blmc.a).B();
        dcdc z2 = dcbg.b(c.bE().a).s(new dbrn(this, c) { // from class: blmd
            private final blmh a;
            private final ilo b;

            {
                this.a = this;
                this.b = c;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final blmh blmhVar = this.a;
                return blmhVar.a.a(this.b, (djck) obj, new bksg(blmhVar) { // from class: blmg
                    private final blmh a;

                    {
                        this.a = blmhVar;
                    }

                    @Override // defpackage.bksg
                    public final void a(djck djckVar) {
                        this.a.j(djckVar);
                    }
                }, dtxy.nv);
            }
        }).o(new dbsl(B) { // from class: blme
            private final dcep a;

            {
                this.a = B;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcep dcepVar = this.a;
                drdk drdkVar = ((bktb) obj).k().b;
                if (drdkVar == null) {
                    drdkVar = drdk.c;
                }
                return !dcepVar.contains(drdkVar);
            }
        }).x(6).s(blmf.a).z();
        if (z2.size() < 3) {
            z2 = dcdc.e();
        }
        this.i = z2;
        if (!this.d.getEnableFeatureParameters().o || !c.cB()) {
            z = false;
        }
        this.j = z;
        this.m = c.bZ();
        cjta c2 = cjtd.c(c.bY());
        c2.d = dtxy.kh;
        this.n = c2.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.k = null;
        this.b.k();
        this.h = dcdc.e();
        this.g.c();
        this.j = false;
        this.l = null;
        this.m = null;
        this.n = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = false;
        if (!e().booleanValue()) {
            return false;
        }
        if (!this.o) {
            return true;
        }
        if (this.e.e() == 8) {
            z = true;
        }
        return Boolean.valueOf(!z);
    }
}
