package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ayyp  reason: default package */
/* loaded from: classes3.dex */
public class ayyp extends ayyj {
    public final befw c;
    public final bwqv d;
    private final ayyh g;
    private final bnjv h;
    private final btrg i;
    private final bvrb j;
    private final bvqg<ilo> k;
    private final cjtd l;
    public final LinkedHashMap<akqi, bwrs<ilo>> e = new LinkedHashMap<>();
    public final Set<akqi> f = new HashSet();
    private final Set<akqi> m = new HashSet();

    public ayyp(ayyh ayyhVar, bnjv bnjvVar, cqhn cqhnVar, btrg btrgVar, befw befwVar, bwqv bwqvVar, bvrb bvrbVar, bvqg<ilo> bvqgVar, cjtd cjtdVar) {
        this.g = ayyhVar;
        this.h = bnjvVar;
        this.i = btrgVar;
        this.c = befwVar;
        this.d = bwqvVar;
        this.j = bvrbVar;
        this.k = bvqgVar;
        this.l = cjtdVar;
    }

    public static bwrs<ilo> n(dpqu dpquVar) {
        ily ilyVar = new ily();
        dpsn dpsnVar = dpquVar.a;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        ilyVar.j(o(dpsnVar));
        return bwrs.a(ilyVar.d());
    }

    public static akqi o(dpsn dpsnVar) {
        return p(new akqi(dpsnVar.b, dpsnVar.c));
    }

    private static akqi p(akqi akqiVar) {
        return new akqi(akqiVar.c);
    }

    @Override // defpackage.ayyj, defpackage.ayyi
    public void a() {
        this.c.a();
    }

    @Override // defpackage.ayyj, defpackage.ayyi
    public void b() {
        this.c.b();
    }

    @Override // defpackage.ayyi
    public void c(Collection<bwrs<ilo>> collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (bwrs<ilo> bwrsVar : collection) {
            ilo c = bwrsVar.c();
            if (c != null) {
                this.m.add(p(c.ai()));
                dppq bZ = dppt.e.bZ();
                dpsn a = axys.a(c.ai());
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dppt dpptVar = (dppt) bZ.b;
                a.getClass();
                dpptVar.c = a;
                dpptVar.b = 2;
                arrayList.add(bZ.bK());
            }
        }
        deha.q(this.i.b(arrayList), bvqj.b(new bvqg(this) { // from class: ayyk
            private final ayyp a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ayyp ayypVar = this.a;
                for (dpqu dpquVar : ((dibm) obj).a) {
                    dpsn dpsnVar = dpquVar.a;
                    if (dpsnVar == null) {
                        dpsnVar = dpsn.d;
                    }
                    akqi o = ayyp.o(dpsnVar);
                    if (!ayypVar.e.containsKey(o)) {
                        ayypVar.e.put(o, ayyp.n(dpquVar));
                    }
                }
                ayypVar.l(false);
            }
        }), dege.a);
    }

    @Override // defpackage.ayyi
    public void d(Collection<bwrs<ilo>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        HashSet hashSet = new HashSet(this.m);
        this.m.clear();
        boolean z = false;
        for (bwrs<ilo> bwrsVar : collection) {
            ilo c = bwrsVar.c();
            if (c != null) {
                akqi p = p(c.ai());
                if (this.a.containsKey(p)) {
                    this.a.remove(p);
                    z = true;
                } else if (this.e.containsKey(p)) {
                    this.e.remove(p);
                }
                if (!hashSet.contains(p)) {
                    dppq bZ = dppt.e.bZ();
                    dpsn a = axys.a(c.ai());
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dppt dpptVar = (dppt) bZ.b;
                    a.getClass();
                    dpptVar.c = a;
                    dpptVar.b = 2;
                    arrayList.add(bZ.bK());
                }
                this.m.add(p);
            }
        }
        deha.q(this.i.b(arrayList), bvqj.b(new bvqg(this) { // from class: ayyl
            private final ayyp a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ayyp ayypVar = this.a;
                for (dpqu dpquVar : ((dibm) obj).a) {
                    dpsn dpsnVar = dpquVar.a;
                    if (dpsnVar == null) {
                        dpsnVar = dpsn.d;
                    }
                    akqi o = ayyp.o(dpsnVar);
                    if (!ayypVar.e.containsKey(o) && !ayypVar.f.contains(o)) {
                        ayypVar.e.put(o, ayyp.n(dpquVar));
                    }
                }
                if (ayypVar.a.size() < 3) {
                    ayypVar.l(false);
                }
            }
        }), dege.a);
        if (z) {
            l(false);
        }
    }

    @Override // defpackage.ayyj, defpackage.ayyi
    public /* bridge */ /* synthetic */ List e() {
        return super.e();
    }

    @Override // defpackage.ayyj, defpackage.ayyi
    public /* bridge */ /* synthetic */ cqkl f() {
        return super.f();
    }

    @Override // defpackage.ayyi
    public Boolean g() {
        return Boolean.valueOf(!this.e.isEmpty());
    }

    @Override // defpackage.ayyj, defpackage.ayyi
    public /* bridge */ /* synthetic */ cqkl h() {
        return super.h();
    }

    @Override // defpackage.ayyj, defpackage.ayyi
    public /* bridge */ /* synthetic */ Boolean i() {
        return super.i();
    }

    @Override // defpackage.ayyi
    public Boolean j() {
        boolean z = false;
        if (this.a.isEmpty() && !g().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayyj, defpackage.ayyi
    public /* bridge */ /* synthetic */ Boolean k() {
        return super.k();
    }

    public final synchronized void m(List<ilo> list) {
        this.b = false;
        int size = 3 - this.a.size();
        for (ilo iloVar : list) {
            this.e.remove(iloVar.ai());
        }
        ArrayList arrayList = new ArrayList(this.e.keySet());
        int i = 0;
        for (int i2 = 0; i < size && i2 < arrayList.size(); i2++) {
            akqi akqiVar = (akqi) arrayList.get(i2);
            bwrs<ilo> remove = this.e.remove(akqiVar);
            dbsk.s(remove);
            ilo c = remove.c();
            dbsk.s(c);
            if (!c.f) {
                break;
            }
            if (!c.an()) {
                this.a.put(akqiVar, this.g.a(this.h.a(c), c, this.k, this.l));
                this.f.add(akqiVar);
                i++;
            }
        }
        if (i < size && !this.e.isEmpty()) {
            l(false);
        }
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayyj
    public final synchronized void l(boolean z) {
        int i = 3;
        if (!z) {
            i = 3 - this.a.size();
        }
        int i2 = i + i;
        if (z) {
            this.b = true;
            this.a.clear();
            cqkx.p(this);
        }
        ArrayList arrayList = new ArrayList(this.e.keySet());
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2 && i3 < arrayList.size(); i3++) {
            bwrs<ilo> bwrsVar = this.e.get(arrayList.get(i3));
            dbsk.s(bwrsVar);
            arrayList2.add(bwrsVar);
        }
        this.j.b(new ayyo(this, arrayList2, new bvqg(this) { // from class: ayym
            private final ayyp a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.m((List) obj);
            }
        }), bvrj.UI_THREAD);
    }
}
