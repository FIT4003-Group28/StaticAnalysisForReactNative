package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bhdr  reason: default package */
/* loaded from: classes3.dex */
public class bhdr implements bhdj {
    public static final dnqe a;
    private final Activity b;
    private final Map<dged, cqix<? extends igw>> c = new HashMap();
    private final iic d;
    private final dxio<boxa> e;
    private final dxio<bhje> f;
    private final bhdh g;
    private final dxio<bbut> h;
    private final dxio<aqru> i;
    private final dxio<cklf> j;
    private final dxio<aput> k;
    private final dxio<bkpi> l;
    private final dxio<begg> m;
    private iid n;
    @dzsi
    private bwrs<ilo> o;
    @dzsi
    private bhdi p;

    static {
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.MERCHANT_EXPERIENCE_TASK_CARD;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        a = bZ.bK();
    }

    public bhdr(Activity activity, cqhn cqhnVar, cqhu cqhuVar, bhat bhatVar, dxio<boxa> dxioVar, dxio<bhje> dxioVar2, dxio<bbut> dxioVar3, bhdh bhdhVar, dxio<aqru> dxioVar4, dxio<cklf> dxioVar5, dxio<aput> dxioVar6, dxio<bkpi> dxioVar7, dxio<begg> dxioVar8, dxio<apun> dxioVar9) {
        this.b = activity;
        iic k = iid.k();
        k.e(new ArrayList());
        this.d = k;
        this.n = k.f();
        this.e = dxioVar;
        this.f = dxioVar2;
        this.h = dxioVar3;
        this.g = bhdhVar;
        this.i = dxioVar4;
        this.j = dxioVar5;
        this.k = dxioVar6;
        this.l = dxioVar7;
        this.m = dxioVar8;
    }

    private final boolean q() {
        return ((ilo) bwrs.b(this.o)) != null && w().booleanValue();
    }

    private final void r(ilo iloVar) {
        dobr cy = iloVar.cy();
        if (cy != null) {
            for (dobk dobkVar : cy.f) {
                int a2 = dobj.a(dobkVar.c);
                if (a2 != 0 && a2 == 2 && dobkVar.a == 2) {
                    boxa a3 = this.e.a();
                    bwrs<ilo> bwrsVar = this.o;
                    dbsk.s(bwrsVar);
                    a3.C(bwrsVar, a, dobkVar.a == 2 ? (String) dobkVar.b : "");
                    return;
                }
            }
        }
        bwrs<ilo> bwrsVar2 = this.o;
        dbsk.s(bwrsVar2);
        this.e.a().F(bwrsVar2);
    }

    @Override // defpackage.bhdj
    public iib a() {
        return this.n;
    }

    @Override // defpackage.bhdj
    public void b(dged dgedVar) {
        bhdi bhdiVar;
        if (this.c.containsKey(dgedVar)) {
            cqix<? extends igw> cqixVar = this.c.get(dgedVar);
            int indexOf = this.n.a().indexOf(cqixVar);
            if (!this.n.a().remove(cqixVar)) {
                return;
            }
            bhdh bhdhVar = this.g;
            bwrs<ilo> bwrsVar = this.o;
            dbsk.s(bwrsVar);
            ilo c = bwrsVar.c();
            dbsk.s(c);
            String cQ = c.cQ();
            dgef b = dgef.b(dgedVar.a);
            if (b == null) {
                b = dgef.UNKNOWN_RECOMMENDATION_TYPE;
            }
            if (!bhdhVar.c.m(bvjk.jr, false)) {
                bvdl bvdlVar = bhdhVar.f;
                dhvv bZ = dhvw.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhvw dhvwVar = (dhvw) bZ.b;
                cQ.getClass();
                dhvwVar.a |= 8;
                dhvwVar.d = cQ;
                dnqg bZ2 = dnqh.p.bZ();
                dnmu dnmuVar = dnmu.PROPERTY_GMM;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ2.b;
                dnqhVar.l = dnmuVar.ap;
                dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                int i = ddda.cu.b;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ2.b;
                dnqhVar2.a |= 64;
                dnqhVar2.g = i;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhvw dhvwVar2 = (dhvw) bZ.b;
                dnqh bK = bZ2.bK();
                bK.getClass();
                dhvwVar2.b = bK;
                dhvwVar2.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhvw dhvwVar3 = (dhvw) bZ.b;
                dhvwVar3.c = b.x;
                dhvwVar3.a |= 4;
                bvdlVar.b(bZ.bK(), new bhdg(), bhdhVar.b);
            }
            cqkx.p(this);
            if (!this.n.a().isEmpty() || (bhdiVar = this.p) == null) {
                if (indexOf == this.n.a().size()) {
                    indexOf--;
                }
                cqix<? extends igw> cqixVar2 = this.n.a().get(indexOf);
                if (cqixVar2 != null) {
                    Iterator<View> it = cqkx.n((bhdk) cqixVar2.b()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            final View a2 = cqhu.a(it.next(), bhdk.a);
                            if (a2 != null) {
                                a2.postDelayed(new Runnable(a2) { // from class: bhdq
                                    private final View a;

                                    {
                                        this.a = a2;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        View view = this.a;
                                        dnqe dnqeVar = bhdr.a;
                                        view.sendAccessibilityEvent(8);
                                    }
                                }, 700L);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else {
                cqkx.p(bhdiVar);
                bhdi bhdiVar2 = this.p;
                dbsk.s(bhdiVar2);
                Iterator<View> it2 = cqkx.n(bhdiVar2).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        final View a3 = cqhu.a(it2.next(), bhaw.a);
                        if (a3 != null) {
                            a3.postDelayed(new Runnable(a3) { // from class: bhdp
                                private final View a;

                                {
                                    this.a = a3;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    View view = this.a;
                                    dnqe dnqeVar = bhdr.a;
                                    view.sendAccessibilityEvent(8);
                                }
                            }, 500L);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.c.remove(dgedVar);
        }
    }

    @Override // defpackage.bhdj
    public void c(String str) {
        this.f.a().b(str);
    }

    @Override // defpackage.bhdj
    public void d() {
        ilo iloVar = (ilo) bwrs.b(this.o);
        if (iloVar == null || !w().booleanValue()) {
            return;
        }
        r(iloVar);
    }

    @Override // defpackage.bhdj
    public void e() {
        ilo iloVar = (ilo) bwrs.b(this.o);
        if (iloVar == null || !w().booleanValue()) {
            return;
        }
        r(iloVar);
    }

    @Override // defpackage.bhdj
    public void f() {
        if (((ilo) bwrs.b(this.o)) == null || !w().booleanValue()) {
            return;
        }
        bwrs<ilo> bwrsVar = this.o;
        dbsk.s(bwrsVar);
        this.e.a().B(bwrsVar, a, bomu.BUSINESS_HOURS);
    }

    @Override // defpackage.bhdj
    public void g(String str) {
        this.f.a().a(str);
    }

    @Override // defpackage.bhdj
    public void h() {
        if (!q()) {
            return;
        }
        bbuz m = bbve.m();
        m.b(bbuy.SHOW_PLACESHEET_PHOTOS_TAB_AND_MERCHANT_MODE_SNACKBAR);
        m.e(dwyd.MERCHANT_EXPERIENCE_TASK_CARDS);
        ((bbsu) m).b = (ilo) bwrs.b(this.o);
        this.h.a().j(m.a());
    }

    @Override // defpackage.bhdj
    public void i(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        this.f.a().c(Intent.createChooser(intent, str2));
    }

    @Override // defpackage.bhdj
    public void j(String str) {
        this.j.a().b(str, "com.google.android.apps.vega");
    }

    @Override // defpackage.bhdj
    public void k(String str) {
        if (!q()) {
            return;
        }
        bwrs<ilo> bwrsVar = this.o;
        dbsk.s(bwrsVar);
        this.k.a().e(bwrsVar, str, this.b.getString(R.string.REPLY_TO_REVIEW_PAGE_TITLE), false);
    }

    @Override // defpackage.bhdj
    public void l() {
        if (!q()) {
            return;
        }
        bwrs<ilo> bwrsVar = this.o;
        dbsk.s(bwrsVar);
        this.l.a().b(bwrsVar, dbpy.a, dbpy.a, dbsg.i(djuu.NEWEST_FIRST), false, dbpy.a);
    }

    @Override // defpackage.bhdj
    public void m() {
        this.m.a().k(bege.PHOTOS);
    }

    @Override // defpackage.bhdj
    public void n() {
        if (!q()) {
            return;
        }
        aqru a2 = this.i.a();
        bwrs<ilo> bwrsVar = this.o;
        dbsk.s(bwrsVar);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        String cQ = c.cQ();
        a2.b(cQ, new aqrt(a2.c.a(), cQ));
    }

    @Override // defpackage.bhdj
    public String o(dged dgedVar) {
        dgec dgecVar = dgedVar.b;
        if (dgecVar == null) {
            dgecVar = dgec.i;
        }
        dgdw dgdwVar = dgecVar.d;
        if (dgdwVar == null) {
            dgdwVar = dgdw.g;
        }
        String str = dgdwVar.b;
        if (dbsj.d(str)) {
            return this.b.getString(R.string.TASK_CARDS_OVERFLOW_MENU_GENERIC_CONTENT_DESCRIPTION);
        }
        return this.b.getString(R.string.TASK_CARDS_OVERFLOW_MENU_CONTENT_DESCRIPTION, new Object[]{str});
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(java.util.List<defpackage.dged> r7, defpackage.bhdi r8) {
        /*
            r6 = this;
            r6.p = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0 = 0
        L8:
            int r1 = r7.size()
            if (r0 >= r1) goto Lab
            java.lang.Object r1 = r7.get(r0)
            dged r1 = (defpackage.dged) r1
            bwrs<ilo> r2 = r6.o
            java.io.Serializable r2 = defpackage.bwrs.b(r2)
            ilo r2 = (defpackage.ilo) r2
            dgdr r3 = defpackage.dgdr.UNKNOWN_CTA_INTENT
            dgef r3 = defpackage.dgef.UNKNOWN_RECOMMENDATION_TYPE
            int r3 = r1.a
            dgef r3 = defpackage.dgef.b(r3)
            if (r3 != 0) goto L2a
            dgef r3 = defpackage.dgef.UNKNOWN_RECOMMENDATION_TYPE
        L2a:
            int r3 = r3.ordinal()
            r4 = 11
            r5 = 0
            if (r3 == r4) goto L8c
            switch(r3) {
                case 1: goto L7a;
                case 2: goto L8c;
                case 3: goto L8c;
                case 4: goto L37;
                case 5: goto L8c;
                case 6: goto L7a;
                case 7: goto L37;
                default: goto L36;
            }
        L36:
            goto L9d
        L37:
            dgec r3 = r1.b
            if (r3 != 0) goto L3d
            dgec r3 = defpackage.dgec.i
        L3d:
            int r3 = r3.a
            r3 = r3 & 2
            if (r3 == 0) goto L68
            dgec r3 = r1.b
            if (r3 != 0) goto L49
            dgec r3 = defpackage.dgec.i
        L49:
            java.lang.String r3 = r3.c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L68
            bhds r2 = defpackage.bhde.a(r1, r6, r2, r0)
            r3 = r2
            bhdl r3 = (defpackage.bhdl) r3
            r3.f = r5
            bhbn r3 = new bhbn
            r3.<init>()
            bhdt r2 = r2.a()
            cqix r5 = defpackage.cqgr.fT(r3, r2)
            goto L9d
        L68:
            bhby r3 = new bhby
            r3.<init>()
            bhds r2 = defpackage.bhde.b(r1, r6, r2, r0)
            bhdt r2 = r2.a()
            cqix r5 = defpackage.cqgr.fT(r3, r2)
            goto L9d
        L7a:
            bhbn r3 = new bhbn
            r3.<init>()
            bhds r2 = defpackage.bhde.a(r1, r6, r2, r0)
            bhdt r2 = r2.a()
            cqix r5 = defpackage.cqgr.fT(r3, r2)
            goto L9d
        L8c:
            bhby r3 = new bhby
            r3.<init>()
            bhds r2 = defpackage.bhde.b(r1, r6, r2, r0)
            bhdt r2 = r2.a()
            cqix r5 = defpackage.cqgr.fT(r3, r2)
        L9d:
            if (r5 == 0) goto La7
            r8.add(r5)
            java.util.Map<dged, cqix<? extends igw>> r2 = r6.c
            r2.put(r1, r5)
        La7:
            int r0 = r0 + 1
            goto L8
        Lab:
            iic r7 = r6.d
            r7.e(r8)
            iic r7 = r6.d
            iid r7 = r7.f()
            r6.n = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhdr.p(java.util.List, bhdi):void");
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.o = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.o = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.c.isEmpty());
    }
}
