package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: alva  reason: default package */
/* loaded from: classes.dex */
public final class alva extends alvf {
    private final LinkedHashSet<alyh> f;
    private final aksj g;
    private float h;
    private int i;
    private final akrp j;

    public alva(akry akryVar, alyx alyxVar) {
        super(akryVar, alyxVar);
        this.f = dcnm.h();
        this.g = aksj.c(new akrp(new akra(), new akra()));
        this.h = -1.0f;
        this.i = -1;
        this.j = new akrp(new akra(), new akra());
    }

    private final long i(List<alyh> list) {
        list.addAll(this.f);
        return this.b;
    }

    @Override // defpackage.alvb
    public final synchronized long d(akzh akzhVar, List<alyh> list) {
        return e(akzhVar, list, false);
    }

    public final synchronized long e(akzh akzhVar, List<alyh> list, boolean z) {
        list.clear();
        bnrs f = akzhVar.f();
        boolean z2 = !this.f.isEmpty();
        alad p = akzhVar.p();
        int f2 = f(p.k, akzhVar.g());
        if (z2 && f == this.d && f2 == this.i) {
            return i(list);
        }
        aksi r = akzhVar.r();
        int i = 0;
        if (p.l != 0.0f || p.m != 0.0f) {
            alyh.k(r.c, f2, list, null);
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                alyh alyhVar = list.get(i3);
                alyhVar.i(this.j);
                if (r.o(this.j)) {
                    list.set(i2, alyhVar);
                    i2++;
                }
            }
            while (true) {
                size--;
                if (size < i2) {
                    break;
                }
                list.remove(size);
            }
            if (z) {
                aksi r2 = akzhVar.r();
                akra q = akzhVar.q();
                if (!r2.j(q)) {
                    aksi aksiVar = new aksi(new akra[]{q, q, r2.d(), r2.c()});
                    ArrayList arrayList = new ArrayList();
                    alyh.k(aksiVar.c, f(akzhVar.p().k, akzhVar.g()), arrayList, null);
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        alyh alyhVar2 = (alyh) arrayList.get(i4);
                        alyhVar2.i(this.j);
                        if (!r2.o(this.j) && aksiVar.o(this.j)) {
                            list.add(alyhVar2);
                        }
                    }
                }
            }
            this.h = -1.0f;
        } else {
            if (z2 && this.h == p.k && this.i == f2 && this.g.j(r.f(0)) && this.g.j(r.f(2))) {
                return i(list);
            }
            alyh.k(r.c, f2, list, this.g);
            this.h = p.k;
        }
        h(list, akzhVar.p().j);
        int size3 = list.size();
        while (true) {
            if (i >= size3) {
                break;
            } else if (!this.f.contains(list.get(i))) {
                this.b++;
                break;
            } else {
                i++;
            }
        }
        this.f.clear();
        this.f.addAll(list);
        this.d = f;
        this.i = f2;
        return this.b;
    }

    protected final int f(float f, akra akraVar) {
        alyv b = this.e.b(akraVar, this.a);
        return b != null ? b.b(f) : (int) f;
    }
}
