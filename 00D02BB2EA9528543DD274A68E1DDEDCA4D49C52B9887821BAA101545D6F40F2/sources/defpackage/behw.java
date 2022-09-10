package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: behw  reason: default package */
/* loaded from: classes3.dex */
public final class behw implements behy {
    private final bwqv a;
    private final Map<bege, List<befz<? extends bega>>> b = new aif();
    private final List<begd> c = new ArrayList();
    private final dxio<behp> d;
    private bwrs<ilo> e;
    @dzsi
    private cqqw f;

    public behw(bwqv bwqvVar, dxio<behp> dxioVar) {
        this.a = bwqvVar;
        this.d = dxioVar;
    }

    @Override // defpackage.behy
    public final List<begd> a() {
        return dcdc.r(this.c);
    }

    @Override // defpackage.behy
    public final List<befz<? extends bega>> b(bege begeVar) {
        if (this.b.containsKey(begeVar)) {
            return dcdc.r(this.b.get(begeVar));
        }
        return new ArrayList();
    }

    @Override // defpackage.behy
    public final List<befz<? extends bega>> c() {
        dccx F = dcdc.F();
        for (Map.Entry<bege, List<befz<? extends bega>>> entry : this.b.entrySet()) {
            F.i(entry.getValue());
        }
        return F.f();
    }

    @Override // defpackage.behy
    public final boolean d() {
        ilo iloVar = (ilo) bwrs.b(this.e);
        return this.c.size() > 1 || (iloVar != null && iloVar.J == 2 && this.c.size() == 1);
    }

    @Override // defpackage.behy
    public final void e(cqqw cqqwVar) {
        this.f = cqqwVar;
    }

    @Override // defpackage.behy
    @dzsi
    public final cqqw f() {
        return this.f;
    }

    @Override // defpackage.behy
    public final void g(bwrs<ilo> bwrsVar, boolean z, boolean z2, boolean z3, boolean z4) {
        ilo iloVar;
        ilo iloVar2 = (ilo) bwrs.b(bwrsVar);
        if (!bwrsVar.equals(this.e) || !(iloVar2 == null || iloVar2.J == 1)) {
            this.c.clear();
            this.b.clear();
            if (iloVar2 == null || !iloVar2.f) {
                return;
            }
            iln ilnVar = iln.GEOCODE;
            int ordinal = iloVar2.be().ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                return;
            }
            behp a = this.d.a();
            bwqv bwqvVar = this.a;
            List<begd> list = this.c;
            Map<bege, List<befz<? extends bega>>> map = this.b;
            ilo c = bwrsVar.c();
            behz behzVar = a.e;
            ArrayList arrayList = new ArrayList();
            a.b.a().a.a().a(arrayList, z, z2, z4);
            behzVar.a(arrayList, bwrsVar, bege.OVERVIEW, list, map);
            ilo iloVar3 = (ilo) bwrs.b(bwrsVar);
            if (iloVar3 != null && iloVar3.bS().a()) {
                list.add(bfso.g(bwqvVar, bwrsVar));
            }
            ilo c2 = bwrsVar.c();
            if (c2 != null && bmmj.a(c2)) {
                Bundle bundle = new Bundle();
                cctq.a(bundle, bwqvVar, bwrsVar);
                bmln bmlnVar = new bmln();
                bmlnVar.B(bundle);
                list.add(bmlnVar);
            }
            if (a.g.a() && bgsf.a(bwrsVar) && bgsf.c(bwrsVar)) {
                list.add(bgqt.g(bwqvVar, bwrsVar));
            }
            cebr cebrVar = a.a;
            if (a.c.g(bwrsVar) || ((iloVar = (ilo) bwrs.b(bwrsVar)) != null && (iloVar.h().d & 256) != 0)) {
                list.add(bgev.g(bwqvVar, bwrsVar, -1));
            }
            if (c != null) {
                bkke bkkeVar = a.f;
                bkkeVar.a.a(bwrsVar);
                ddhj ddhjVar = ddhj.VISIBILITY_VISIBLE;
                int ordinal2 = bkkeVar.b.d(bkkeVar.a).ordinal();
                if (ordinal2 == 0 || ordinal2 == 2) {
                    cjqy cjqyVar = bkkeVar.d;
                    cjsx i = cjsy.i();
                    i.b(ddda.et);
                    cjqyVar.k(i.a());
                }
                int ordinal3 = bkkeVar.b.e(bkkeVar.a).ordinal();
                if (ordinal3 == 0 || ordinal3 == 2) {
                    cjqy cjqyVar2 = bkkeVar.d;
                    cjsx i2 = cjsy.i();
                    i2.b(ddda.es);
                    cjqyVar2.k(i2.a());
                }
                bkke bkkeVar2 = a.f;
                bkkeVar2.a.a(bwrsVar);
                bkoj bkojVar = bkkeVar2.c;
                bkojVar.b = bwrsVar;
                cclp cclpVar = bkkeVar2.a;
                ilo iloVar4 = (ilo) bwrs.b(bkojVar.b);
                if (iloVar4 != null && ((bkojVar.e(iloVar4) || bkojVar.d(iloVar4)) && !bkojVar.a.f(cclpVar) && !iloVar4.aA())) {
                    cjqy cjqyVar3 = bkkeVar2.d;
                    cjsx i3 = cjsy.i();
                    i3.b(ddda.dd);
                    cjqyVar3.k(i3.a());
                }
                if (a.f.a(bwrsVar)) {
                    Bundle bundle2 = new Bundle();
                    cctq.a(bundle2, bwqvVar, bwrsVar);
                    bkkf bkkfVar = new bkkf();
                    bkkfVar.B(bundle2);
                    list.add(bkkfVar);
                }
            }
            if (blkj.a(bwrsVar)) {
                list.add(bloa.g(bwqvVar, bwrsVar, z3, dbpy.a, dbpy.a, dbpy.a, false, dbpy.a));
            }
            ilo iloVar5 = (ilo) bwrs.b(bwrsVar);
            if (iloVar5 != null && iloVar5.aG() > 0) {
                list.add(bccn.w(bwqvVar, bwrsVar, null, bcbn.a, true));
            }
            behz behzVar2 = a.e;
            ArrayList arrayList2 = new ArrayList();
            behk a2 = a.d.a().a.a();
            boolean r = a2.a.getUgcParameters().r();
            arrayList2.add(a2.c.a());
            arrayList2.add(a2.d.a());
            boolean h = a2.b.h();
            if (h) {
                arrayList2.add(a2.g.a().a(biyb.ABOUT_TAB));
                arrayList2.add(a2.h.a());
                arrayList2.add(a2.i.a());
            }
            if (r && !h) {
                arrayList2.add(a2.f.a());
            }
            arrayList2.add(a2.e.a());
            if (!r && !h) {
                arrayList2.add(a2.f.a());
            }
            behzVar2.a(arrayList2, bwrsVar, bege.ABOUT, list, map);
            this.e = bwrsVar;
        }
    }
}
