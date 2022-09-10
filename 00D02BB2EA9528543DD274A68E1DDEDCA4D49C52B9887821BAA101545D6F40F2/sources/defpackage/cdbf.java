package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdbf  reason: default package */
/* loaded from: classes4.dex */
public class cdbf implements Serializable {
    public final String a;
    public final dwyd f;
    public final ArrayList<cdfa> b = new ArrayList<>();
    public final HashSet<String> c = new HashSet<>();
    public final dccg<Integer, String> d = dccg.O();
    public final dccg<Integer, String> e = dccg.O();
    private final HashMap<String, String> g = new HashMap<>();
    private final AtomicInteger h = new AtomicInteger(0);

    public cdbf(dwnf dwnfVar, dwyd dwydVar) {
        this.f = dwydVar;
        this.a = dwnfVar.b;
        m(dwnfVar.d);
    }

    public final String a(int i) {
        return this.b.get(i).f();
    }

    @Deprecated
    public final void b(int i, cdhl cdhlVar) {
        ArrayList<cdfa> arrayList = this.b;
        cdez h = this.b.get(i).h();
        h.d(cdhlVar.a);
        h.f(false);
        arrayList.set(i, h.a());
    }

    public final int c() {
        ArrayList<cdfa> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += arrayList.get(i2).k().size();
        }
        return i - this.c.size();
    }

    public final ilo d(int i) {
        return this.b.get(i).b();
    }

    public final List<dwfl> e(int i) {
        return dcdc.r(this.b.get(i).k());
    }

    public final Boolean f(String str) {
        return Boolean.valueOf(this.c.contains(str));
    }

    public final void g(String str, boolean z) {
        if (z) {
            this.c.add(str);
            return;
        }
        this.c.remove(str);
        i(str, "");
    }

    public final String h(String str) {
        return dbsj.e(this.g.get(str));
    }

    public final void i(String str, String str2) {
        this.g.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect return type in method signature: (Ldcep<Ljava/lang/String;>;)Ljava/lang/Object; */
    public final int j(dcep dcepVar) {
        int i = 1;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            cdfa cdfaVar = this.b.get(i2);
            ArrayList arrayList = new ArrayList();
            dcdc<dwfl> k = cdfaVar.k();
            int size = k.size();
            for (int i3 = 0; i3 < size; i3++) {
                dwfl dwflVar = k.get(i3);
                if (!dcepVar.contains(dwflVar.d) && !dcepVar.contains(dwflVar.q)) {
                    arrayList.add(dwflVar);
                    i = 2;
                }
            }
            ArrayList<cdfa> arrayList2 = this.b;
            cdez h = cdfaVar.h();
            h.g(arrayList);
            arrayList2.set(i2, h.a());
        }
        this.c.removeAll(dcepVar);
        return i;
    }

    public final void k(int i, int i2) {
        ArrayList<cdfa> arrayList = this.b;
        cdez h = this.b.get(i).h();
        h.c(i2);
        arrayList.set(i, h.a());
    }

    public final int l(int i) {
        return this.b.get(i).i();
    }

    public final void m(List<dwmx> list) {
        bvrj.UI_THREAD.c();
        for (dwmx dwmxVar : list) {
            dvyw dvywVar = dwmxVar.c;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ily ilyVar = new ily();
            ilyVar.k(dvywVar.g);
            ilyVar.F(dvywVar.i);
            dvyw dvywVar2 = dwmxVar.c;
            if (dvywVar2 == null) {
                dvywVar2 = dvyw.bv;
            }
            if ((dvywVar2.b & 536870912) != 0) {
                dvyw dvywVar3 = dwmxVar.c;
                if (dvywVar3 == null) {
                    dvywVar3 = dvyw.bv;
                }
                ilyVar.x = dvywVar3.am;
            }
            dhjz dhjzVar = dvywVar.e;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqq j = akqq.j(dhjzVar);
            if (j != null) {
                ilyVar.q(j);
            }
            dvyf dvyfVar = dvywVar.aw;
            if (dvyfVar == null) {
                dvyfVar = dvyf.c;
            }
            boolean contains = new dsrh(dvyfVar.a, dvyf.b).contains(dvye.INITIAL_PHOTO_CONTRIBUTION_NOTIFICATION);
            ArrayList arrayList = new ArrayList();
            int andIncrement = this.h.getAndIncrement();
            if (dwmxVar.g.isEmpty()) {
                arrayList.addAll(dwmxVar.h);
            } else {
                for (dwmz dwmzVar : dwmxVar.g) {
                    dwfl dwflVar = dwmzVar.b;
                    if (dwflVar == null) {
                        dwflVar = dwfl.w;
                    }
                    eaol a = cdfi.a(dwflVar);
                    if (a != null) {
                        long j2 = a.a;
                    }
                    dwfl dwflVar2 = dwmzVar.b;
                    if (dwflVar2 == null) {
                        dwflVar2 = dwfl.w;
                    }
                    arrayList.add(dwflVar2);
                    dwfl dwflVar3 = dwmzVar.b;
                    if (dwflVar3 == null) {
                        dwflVar3 = dwfl.w;
                    }
                    String str = dwflVar3.d;
                    if (dwmzVar.c) {
                        this.c.add(str);
                    }
                    this.e.n(Integer.valueOf(andIncrement), str);
                }
            }
            ArrayList<cdfa> arrayList2 = this.b;
            cdad cdadVar = new cdad();
            cdadVar.b(false);
            cdadVar.a = Integer.valueOf(andIncrement);
            cdadVar.b = ilyVar.d();
            int a2 = dwmw.a(dwmxVar.e);
            if (a2 == 0) {
                a2 = 1;
            }
            cdadVar.f = a2;
            cdadVar.g(arrayList);
            cdadVar.e = 1;
            cdadVar.f(contains);
            cdadVar.c = false;
            String str2 = dwmxVar.b;
            if (str2 != null) {
                cdadVar.d = str2;
                arrayList2.add(cdadVar.a());
            } else {
                throw new NullPointerException("Null placeVed");
            }
        }
    }

    public cdbf(String str, dwyd dwydVar) {
        this.f = dwydVar;
        this.a = str;
    }
}
