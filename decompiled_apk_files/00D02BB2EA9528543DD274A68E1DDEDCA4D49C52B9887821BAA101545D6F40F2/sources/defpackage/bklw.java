package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bklw  reason: default package */
/* loaded from: classes3.dex */
public final class bklw {
    public final List<bkmi> a = new ArrayList();
    public final List<cqkp> b;
    public final List<Integer> c;
    public final bkoc d;
    public List<bhsl> e;
    public int f;
    private final bhsk g;
    private final bkml h;
    private final Resources i;
    private final bklj j;
    private final bkns k;
    private final bknu l;
    private final bknf m;
    private final bkoj n;
    private final btvo o;
    private final boolean p;
    private final bwrs<ilo> q;

    public bklw(bhsk bhskVar, bkml bkmlVar, bklj bkljVar, bkmz bkmzVar, bkns bknsVar, bknu bknuVar, Resources resources, btvo btvoVar, bkoj bkojVar, bvjj bvjjVar, bkkj bkkjVar, List<ccln> list, bwrs<ilo> bwrsVar, bknf bknfVar, boolean z) {
        int i;
        ilo iloVar;
        String string;
        String string2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f = -1;
        this.q = bwrsVar;
        bkoc bkocVar = new bkoc();
        this.d = bkocVar;
        this.g = bhskVar;
        this.h = bkmlVar;
        this.j = bkljVar;
        this.k = bknsVar;
        this.l = bknuVar;
        this.i = resources;
        this.n = bkojVar;
        this.m = bknfVar;
        this.o = btvoVar;
        boolean m = bvjjVar.m(bvjk.kg, false);
        this.p = m;
        bkojVar.b = bwrsVar;
        bkocVar.f(bwrsVar);
        int size = bkkjVar.a.size();
        if (!list.isEmpty()) {
            boolean z2 = m || btvoVar.getPlaceOfferingsParametersWithoutLogging().i;
            if (z2) {
                string = resources.getString(R.string.RESTAURANT_MENU_HIGHLIGHTS_HEADER);
            } else {
                string = resources.getString(R.string.OFFERING_MENU_DISH_TITLE);
            }
            c(bkmlVar.a(string, bwrsVar));
            if (z2) {
                string2 = resources.getString(R.string.RESTAURANT_MENU_HIGHLIGHTS_HEADER);
            } else {
                string2 = resources.getString(R.string.RESTAURANT_MENU_POPULAR_DISHES_HEADER);
            }
            arrayList.add(bknm.a(string2, true));
            if (list.size() <= 4 || size <= 0) {
                b(list, list.size());
                arrayList.add(bkocVar);
                bkocVar.d();
            } else {
                b(list, 4);
                arrayList.add(bkocVar);
            }
        }
        if (!btvoVar.getPlaceMenuParameters().a() || (iloVar = (ilo) bwrs.b(bwrsVar)) == null) {
            i = 2;
        } else {
            dnpq az = iloVar.az();
            Resources a = bknuVar.a.a();
            bknu.a(a, 1);
            cjqy a2 = bknuVar.b.a();
            bknu.a(a2, 2);
            btvo a3 = bknuVar.c.a();
            bknu.a(a3, 3);
            dxio a4 = ((dxjh) bknuVar.d).a();
            bknu.a(a4, 4);
            i = 2;
            bknt bkntVar = new bknt(a, a2, a3, a4, bwrsVar);
            if (bkojVar.a()) {
                c(bkmlVar.a(resources.getString(R.string.VIEW_THE_MENU_HEADER_TEXT), bwrsVar));
                arrayList.add(bknm.a(resources.getString(R.string.VIEW_THE_MENU_HEADER_TEXT), true));
            }
            ddhj c = bkojVar.c();
            if (c == ddhj.VISIBILITY_VISIBLE) {
                arrayList.add(bkntVar);
            } else if (c == ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL) {
                arrayList.add(new bkoh(dtxv.au));
            }
            ddhj b = bkojVar.b();
            if (b == ddhj.VISIBILITY_VISIBLE) {
                dxio a5 = ((dxjh) bknsVar.a).a();
                bkns.a(a5);
                arrayList.add(new bknr(a5, az));
            } else if (b == ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL) {
                arrayList.add(new bkoh(dtxv.aw));
            }
        }
        boolean z3 = bkkjVar.a.size() == 1;
        for (bkkh bkkhVar : bkkjVar.a) {
            if (bkkhVar.c.size() != 0) {
                if (!z3) {
                    c(this.h.a(bkkhVar.b, this.q));
                    this.b.add(bknm.a(bkkhVar.b, true));
                }
                for (bkkl bkklVar : bkkhVar.c) {
                    if (bkklVar.c.size() != 0) {
                        if (z3) {
                            c(this.h.a(bkklVar.b, this.q));
                        }
                        this.b.add(bknm.a(bkklVar.b, z3));
                        for (int i2 = 0; i2 < bkklVar.c.size(); i2++) {
                            List<cqkp> list2 = this.b;
                            bklj bkljVar2 = this.j;
                            ccln cclnVar = bkklVar.c.get(i2);
                            bvqg bvqgVar = new bvqg(this) { // from class: bklt
                                private final bklw a;

                                {
                                    this.a = this;
                                }

                                @Override // defpackage.bvqg
                                public final void NU(Object obj) {
                                    this.a.a((ccln) obj);
                                }
                            };
                            btvo a6 = bkljVar2.a.a();
                            bklj.a(a6, 1);
                            bklj.a(cclnVar, i);
                            bklj.a(bvqgVar, 3);
                            list2.add(new bkli(a6, cclnVar, bvqgVar));
                        }
                    }
                }
            }
        }
        if (z) {
            ilo c2 = bwrsVar.c();
            dbsk.s(c2);
            if (!c2.aX(btvoVar.getEnableFeatureParameters())) {
                return;
            }
            List<cqkp> list3 = this.b;
            boolean isEmpty = list3.isEmpty();
            btvo a7 = bkmzVar.a.a();
            bkmz.a(a7, 1);
            bhhf a8 = bkmzVar.b.a();
            bkmz.a(a8, i);
            bkmz.a(bknfVar, 3);
            bkmz.a(bwrsVar, 4);
            list3.add(new bkmy(a7, a8, bknfVar, bwrsVar, isEmpty));
        }
    }

    private final void b(List<ccln> list, int i) {
        dcdc<bhsl> b = this.g.b(list, new bvqg(this) { // from class: bkls
            private final bklw a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.a((ccln) obj);
            }
        });
        this.e = b.subList(Math.min(b.size(), i), b.size());
        this.b.addAll(b.subList(0, Math.min(b.size(), i)));
        this.f = this.b.size();
    }

    private final void c(bkmi bkmiVar) {
        this.a.add(bkmiVar);
        this.c.add(Integer.valueOf(this.b.size()));
    }

    public final void a(ccln cclnVar) {
        this.m.aJ(cclnVar);
    }
}
