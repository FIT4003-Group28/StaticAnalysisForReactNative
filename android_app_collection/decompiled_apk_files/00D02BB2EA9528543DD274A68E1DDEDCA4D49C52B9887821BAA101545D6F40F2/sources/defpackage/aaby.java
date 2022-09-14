package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aaby  reason: default package */
/* loaded from: classes2.dex */
public class aaby implements aabu {
    public static final dcqe a = dcqe.c("aaby");
    public static final String b = aaby.class.getSimpleName();
    public final bwqv c;
    public final aadt d;
    public final aacj e;
    private final akla g;
    private final aadf i;
    private final bsne j;
    private final cbdz k;
    private final cbqg l;
    private final aacw m;
    @dzsi
    private bsmy o;
    private final aabv h = new aabv(this);
    private final List<cqix<? extends aklb>> n = new ArrayList();
    public final List<List<dhxz>> f = new ArrayList();
    private int p = -1;

    public aaby(bwqv bwqvVar, akla aklaVar, aadg aadgVar, cbea cbeaVar, cbqg cbqgVar, aacj aacjVar, bsne bsneVar, aadt aadtVar, aacw aacwVar) {
        this.c = bwqvVar;
        this.g = aklaVar;
        this.e = aacjVar;
        this.d = aadtVar;
        this.j = bsneVar;
        achc achcVar = achc.EXPERIENCE_CATEGORICAL_LIST;
        dxio a2 = ((dxjh) aadgVar.a).a();
        aadg.a(a2, 1);
        aadg.a(achcVar, 2);
        this.i = new aadf(a2, achcVar);
        this.k = cbeaVar.a(dtxo.br, dtxo.bs);
        this.l = cbqgVar;
        this.m = aacwVar;
    }

    @Override // defpackage.aabu
    public List<cqix<? extends aklb>> a() {
        return this.n;
    }

    @Override // defpackage.aabu
    public cqqw b() {
        return this.h;
    }

    @Override // defpackage.aabu
    public Boolean c() {
        return Boolean.valueOf(this.d.c());
    }

    @Override // defpackage.aabu
    public aadp d() {
        return this.e;
    }

    @Override // defpackage.aabu
    public cbro e() {
        return this.k;
    }

    @Override // defpackage.aabu
    public Boolean f() {
        return Boolean.valueOf(this.l.a());
    }

    @Override // defpackage.aabu
    @dzsi
    public bsmy g() {
        return this.o;
    }

    @Override // defpackage.aabu
    public int h() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(bsjm bsjmVar) {
        this.e.b = bsjmVar.f();
    }

    public final void j() {
        aag aagVar = this.h.a;
        if (aagVar != null) {
            aagVar.O(0);
        }
        this.n.clear();
        this.o = null;
        this.p = -1;
        this.i.a.clear();
        this.f.clear();
    }

    public final void k(aaco aacoVar) {
        dbsg<djrs> dbsgVar;
        if (!aacoVar.b().a()) {
            return;
        }
        dilu b2 = aacoVar.b().b();
        if ((b2.a & 2) != 0) {
            djrs djrsVar = b2.d;
            if (djrsVar == null) {
                djrsVar = djrs.g;
            }
            dbsgVar = dbsg.i(djrsVar);
        } else {
            dbsgVar = dbpy.a;
        }
        ArrayList arrayList = new ArrayList(b2.b.size());
        for (dhyd dhydVar : b2.b) {
            dhxz dhxzVar = dhydVar.d;
            if (dhxzVar == null) {
                dhxzVar = dhxz.c;
            }
            arrayList.add(dhxzVar);
            aadf aadfVar = this.i;
            aadfVar.a.add(dhydVar.b);
        }
        l(arrayList, dbsgVar);
    }

    public final void l(List<dhxz> list, dbsg<djrs> dbsgVar) {
        this.f.add(list);
        CharSequence d = this.m.d();
        if (!bvpb.c(d)) {
            aaan g = aaao.g();
            ((aaaj) g).d = d.toString();
            dbsg.i(g.a());
        }
        List<cqix<? extends aklb>> list2 = this.n;
        akla aklaVar = this.g;
        dhxv bZ = dhxw.d.bZ();
        dpwr dpwrVar = dpwr.EXPERIENCE_CATEGORICAL_RESULTS;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhxw dhxwVar = (dhxw) bZ.b;
        dhxwVar.b = dpwrVar.r;
        dhxwVar.a |= 1;
        dhxw dhxwVar2 = (dhxw) bZ.b;
        dhxwVar2.b();
        dsod.bv(list, dhxwVar2.c);
        list2.addAll(aklaVar.d(bZ.bK()));
        if (dbsgVar.a()) {
            this.o = this.j.a(dbsgVar.b(), dtyb.ey, dtyb.ez, false);
            this.p = dbsgVar.b().c;
        }
    }
}
