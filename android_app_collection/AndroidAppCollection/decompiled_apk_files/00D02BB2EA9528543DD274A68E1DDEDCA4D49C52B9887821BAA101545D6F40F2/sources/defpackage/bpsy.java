package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
@Deprecated
/* renamed from: bpsy  reason: default package */
/* loaded from: classes4.dex */
public final class bpsy {
    public final akox a;
    public final bptd b;
    public final HashMap<String, Boolean> d;
    @dzsi
    public dodb e;
    @dzsi
    public bpar f;
    private final ges g;
    private final dxio<boxa> h;
    private final bowu j;
    public final bpsx c = new bpsx();
    private final HashMap<String, Integer> i = new HashMap<>();
    private int k = 20;

    public bpsy(akox akoxVar, dxio<boxa> dxioVar, bpte bpteVar, ges gesVar, List<ilo> list, @dzsi dodb dodbVar, bowu bowuVar, Map<String, Boolean> map) {
        this.g = gesVar;
        this.a = akoxVar;
        this.h = dxioVar;
        this.b = bpteVar.a(gesVar);
        for (ilo iloVar : list) {
            this.c.d(iloVar);
        }
        for (ilo iloVar2 : this.c.b()) {
            k(this.i, iloVar2, true);
        }
        this.j = bowuVar;
        this.e = dodbVar;
        this.d = new HashMap<>(map);
    }

    public static akqi i(akqi akqiVar) {
        return new akqi(akqiVar.b, akqiVar.c & (-2));
    }

    private final void j(ilo iloVar, boolean z) {
        k(this.i, iloVar, z);
    }

    private static void k(HashMap<String, Integer> hashMap, ilo iloVar, boolean z) {
        for (dodb dodbVar : l(iloVar)) {
            String str = dodbVar.b;
            int intValue = ((Integer) dbsc.a(hashMap.get(str), 0)).intValue();
            hashMap.put(str, Integer.valueOf(Math.max(z ? intValue + 1 : intValue - 1, 0)));
        }
    }

    private static List<dodb> l(ilo iloVar) {
        dodc dodcVar = iloVar.cd().e;
        if (dodcVar == null) {
            dodcVar = dodc.i;
        }
        return dodcVar.f;
    }

    public final Collection<ilo> a() {
        return this.c.b();
    }

    public final boolean b() {
        return this.e != null;
    }

    public final boolean c(ilo iloVar) {
        if (this.c.a(iloVar)) {
            ilo remove = this.c.a.remove(i(iloVar.ai()));
            if (remove == null) {
                return true;
            }
            j(remove, false);
            this.b.f(remove.ai());
            return true;
        }
        return false;
    }

    public final void d(final ilo iloVar) {
        bpar bparVar;
        if (this.e == null || !l(iloVar).contains(this.e)) {
            if (c(iloVar) || g()) {
                return;
            }
            List<dodb> e = e(iloVar);
            if ((this.e != null || e.isEmpty()) && (bparVar = this.f) != null) {
                dodb dodbVar = (dodb) dcft.r(l(iloVar), null);
                dodb dodbVar2 = this.e;
                dcdc r = dcdc.r(this.c.b());
                final bpax bpaxVar = bparVar.a;
                if (dodbVar2 != null || r.size() > 1) {
                    bpbr bpbrVar = new bpbr();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("key_segment", iloVar);
                    if (dodbVar != null) {
                        bvrs.k(bundle, "key_route", dodbVar);
                    }
                    bpbrVar.B(bundle);
                    bpbrVar.Nz(bpaxVar);
                    bpbrVar.aJ(bpaxVar.J());
                } else if (!r.isEmpty()) {
                    final ilo iloVar2 = (ilo) dcft.c(r);
                    bpaxVar.az.c(iloVar2);
                    View view = bpaxVar.P;
                    if (view != null) {
                        Object[] objArr = new Object[1];
                        objArr[0] = dodbVar != null ? dodbVar.c : bpaxVar.Rp(R.string.UNNAMED_ROAD);
                        dafk a = ckos.a(view, bpaxVar.Rq(R.string.SWITCH_PARENT_ROUTE_NEW_ROAD_SELECTED, objArr), 0);
                        a.t(R.string.UNDO, new View.OnClickListener(bpaxVar, iloVar2, iloVar) { // from class: bpat
                            private final bpax a;
                            private final ilo b;
                            private final ilo c;

                            {
                                this.a = bpaxVar;
                                this.b = iloVar2;
                                this.c = iloVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                bpax bpaxVar2 = this.a;
                                ilo iloVar3 = this.b;
                                ilo iloVar4 = this.c;
                                if (bpaxVar2.aD) {
                                    bpaxVar2.ag = iloVar3;
                                    bpaxVar2.az.c(iloVar4);
                                    bpaxVar2.az.d(iloVar3);
                                    bpaxVar2.bs();
                                }
                            }
                        });
                        a.c();
                    }
                }
            }
            akqi ai = iloVar.ai();
            this.c.d(iloVar);
            j(iloVar, true);
            this.b.e(ai);
            if (this.c.c() < 2 || e.isEmpty() || this.j == bowu.ROAD_CLOSURE) {
                return;
            }
            ArrayList arrayList = new ArrayList(e.size());
            for (dodb dodbVar3 : e) {
                if (!Boolean.TRUE.equals(this.d.get(dodbVar3.b))) {
                    arrayList.add(dodbVar3);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.h.a().l(arrayList, this.g);
            return;
        }
        f();
    }

    public final List<dodb> e(ilo iloVar) {
        ArrayList arrayList = new ArrayList();
        int c = this.c.c();
        for (dodb dodbVar : l(iloVar)) {
            if (((Integer) dbsc.a(this.i.get(dodbVar.b), 0)).intValue() == c) {
                arrayList.add(dodbVar);
            }
        }
        return arrayList;
    }

    public final void f() {
        this.e = null;
        this.c.a.clear();
        this.i.clear();
        this.d.clear();
        h();
    }

    public final boolean g() {
        return this.c.c() >= this.k;
    }

    public final void h() {
        this.b.g();
    }
}
