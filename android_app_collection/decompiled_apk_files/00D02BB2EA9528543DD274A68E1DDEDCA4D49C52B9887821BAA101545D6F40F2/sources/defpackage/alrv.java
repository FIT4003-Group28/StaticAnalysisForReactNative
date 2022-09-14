package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: alrv  reason: default package */
/* loaded from: classes.dex */
public final class alrv implements akvz, alwi, amgl, amyb {
    static final aktg b;
    static final akuh c;
    static final alrq d;
    public static final /* synthetic */ int r = 0;
    final alwc e;
    public final alrz f;
    public final Map<Integer, akvx> h;
    public final alrk i;
    public final alrk j;
    public final alru k;
    public dmyo l;
    public final List<akvy> m;
    public int n;
    @dzsi
    public alxs o;
    @dzsi
    public alwz p;
    public final Object q;
    private final boolean s;
    private final boolean t;
    private final SparseArray<ally> u;
    private final dbyy<alrm, amgj> v;
    public final AtomicInteger a = new AtomicInteger(3);
    public final Object g = new Object();

    static {
        alrl alrlVar = new alrl();
        b = alrlVar;
        c = alrlVar;
        d = new alrq();
    }

    public alrv(alwc alwcVar, akpq akpqVar, amfi amfiVar, boolean z, boolean z2, boolean z3) {
        HashMap d2 = dcjz.d();
        this.h = d2;
        this.u = new SparseArray<>();
        this.m = Collections.synchronizedList(dchl.a());
        this.q = new Object();
        this.v = dccf.a();
        this.e = alwcVar;
        this.f = new alrz(akpqVar, amfiVar);
        this.t = z;
        this.s = z2;
        this.l = z3 ? dmyo.ROADMAP_DARK : dmyo.ROADMAP;
        alrr alrrVar = new alrr(this, z);
        this.j = alrrVar;
        d2.put(0, alrrVar);
        alrk alrkVar = new alrk(this, "GMM-CLIENT-INJECTED-STYLE-NAMESPACE", 1, z);
        this.i = alrkVar;
        d2.put(1, alrkVar);
        alru alruVar = new alru(this);
        this.k = alruVar;
        d2.put(2, alruVar);
    }

    @dzsi
    private final amgj z(@dzsi Bitmap bitmap, amgk amgkVar) {
        amgj amgjVar;
        synchronized (this.g) {
            amgjVar = bitmap == null ? null : this.v.get(alrm.c(bitmap, amgkVar));
        }
        return amgjVar;
    }

    @Override // defpackage.amyb
    public final void Pw() {
        synchronized (this.h) {
            for (akvx akvxVar : this.h.values()) {
                if (akvxVar instanceof alrk) {
                    alrk alrkVar = (alrk) akvxVar;
                    synchronized (alrkVar.a) {
                        for (alow alowVar : alrkVar.a.values()) {
                            if (alowVar instanceof alls) {
                                alls allsVar = (alls) alowVar;
                                synchronized (allsVar) {
                                    alrv alrvVar = allsVar.a;
                                    if (alrvVar != null) {
                                        allsVar.g = false;
                                        alrvVar.s(allsVar, true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.akvz
    public final akuh a(dmqc dmqcVar) {
        return b(dmqcVar.oE);
    }

    @Override // defpackage.akvz
    public final akuh b(long j) {
        return this.k.a(j);
    }

    @Override // defpackage.akvz
    public final aktg c(dmqx dmqxVar) {
        return this.i.b(dmqxVar);
    }

    @Override // defpackage.akvz
    public final akuh d(Bitmap bitmap) {
        return this.i.c(bitmap);
    }

    @Override // defpackage.akvz
    public final akuh e(List<dbsi<Integer, Bitmap>> list) {
        alrk alrkVar = this.i;
        int andIncrement = alrkVar.b.getAndIncrement();
        alxo[] alxoVarArr = new alxo[list.size()];
        byte[] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            dbsi<Integer, Bitmap> dbsiVar = list.get(i);
            Integer num = dbsiVar.a;
            Bitmap bitmap = dbsiVar.b;
            if (num == null || bitmap == null) {
                return c;
            }
            alxn m = alxo.m(andIncrement);
            m.p = new alwe(bitmap);
            alxoVarArr[i] = m.a();
            bArr[i] = num.byteValue();
        }
        alow alowVar = new alow(alrkVar, new alxp(0L, alxoVarArr, bArr, null, false), andIncrement);
        synchronized (alrkVar.a) {
            alrkVar.a.put(Long.valueOf(alowVar.f), alowVar);
        }
        return alowVar;
    }

    @Override // defpackage.akvz
    public final akuh f(int i, List<aksw> list) {
        bnrd a;
        amgj c2;
        dbsk.b(!list.isEmpty(), "There should be at least one bitmap line definition");
        dbsk.b(list.size() < 4, String.format(Locale.US, "There should be less than %d bitmap line definitions", 4));
        synchronized (this.g) {
            dcen dcenVar = new dcen();
            for (aksw akswVar : list) {
                Bitmap b2 = akswVar.b();
                if (b2 != null) {
                    dcenVar.b(alrm.c(b2, amgk.WRAP_T));
                }
                Bitmap c3 = akswVar.c();
                if (c3 != null) {
                    dcenVar.b(alrm.c(c3, amgk.NO_WRAP));
                }
                Bitmap d2 = akswVar.d();
                if (d2 != null) {
                    dcenVar.b(alrm.c(d2, amgk.NO_WRAP));
                }
            }
            dcpd it = dcenVar.f().iterator();
            while (it.hasNext()) {
                alrm alrmVar = (alrm) it.next();
                synchronized (this.g) {
                    if (alrmVar.b() == amgk.WRAP_T) {
                        Bitmap a2 = alrmVar.a();
                        if (!this.s) {
                            a2 = bntv.e(a2, Bitmap.Config.ARGB_8888, true);
                        }
                        a = bnrh.a(a2);
                    } else {
                        a = bnrh.a(alrmVar.a());
                    }
                    if (this.v.containsKey(alrmVar)) {
                        c2 = this.f.d(this.v.get(alrmVar), a);
                    } else {
                        c2 = this.f.c(alrmVar.b(), a);
                    }
                    this.v.put(alrmVar, c2);
                }
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        synchronized (this.g) {
            for (aksw akswVar2 : list) {
                arrayList.add(new aljv(akswVar2.a(), z(akswVar2.b(), amgk.WRAP_T), z(akswVar2.c(), amgk.NO_WRAP), z(akswVar2.d(), amgk.NO_WRAP)));
            }
        }
        alrk alrkVar = this.i;
        dcen N = dcep.N();
        int andIncrement = alrkVar.b.getAndIncrement();
        alxl[] alxlVarArr = new alxl[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            aljz aljzVar = (aljz) arrayList.get(i2);
            alxl d3 = alxl.d(aljzVar.a());
            amgj b3 = aljzVar.b();
            if (b3 != null) {
                d3.h = b3;
                N.b(b3);
            }
            amgj c4 = aljzVar.c();
            if (c4 != null) {
                d3.i = c4;
                N.b(c4);
            }
            amgj d4 = aljzVar.d();
            if (d4 != null) {
                d3.j = d4;
                N.b(d4);
            }
            alxlVarArr[i2] = d3;
        }
        alxn m = alxo.m(andIncrement);
        m.l = alxlVarArr;
        m.v = i;
        alow j = alrkVar.j(m.a(), andIncrement, N.f());
        j.j(true);
        return j;
    }

    @Override // defpackage.akvz
    public final akvx g() {
        return this.i;
    }

    @Override // defpackage.akvz
    public final akvx h(String str, dmqz dmqzVar) {
        dsrj<dmqx> dsrjVar = dmqzVar.a;
        int andIncrement = this.a.getAndIncrement();
        alrk alrkVar = new alrk(this, str, andIncrement, this.t);
        synchronized (this.h) {
            this.h.put(Integer.valueOf(andIncrement), alrkVar);
        }
        for (dmqx dmqxVar : dsrjVar) {
            alrkVar.b(dmqxVar);
        }
        return alrkVar;
    }

    @Override // defpackage.akvz
    public final void i(akvx akvxVar) {
        alrk alrkVar = (alrk) akvxVar;
        if (alrkVar != null) {
            w(akvxVar);
            synchronized (alrkVar.a) {
                for (alow alowVar : alrkVar.a.values()) {
                    alowVar.h();
                }
                alrkVar.a.clear();
            }
        }
    }

    @Override // defpackage.akvz
    public final void j(akuh akuhVar) {
        if (akuhVar instanceof alow) {
            alow alowVar = (alow) akuhVar;
            synchronized (this.g) {
                dcpd<amgj> it = alowVar.l(dcmr.a).iterator();
                while (it.hasNext()) {
                    amgj next = it.next();
                    if (this.f.e(next)) {
                        dbyy<alrm, amgj> dbyyVar = this.v;
                        dbyyVar.remove(dbyyVar.i().get(next));
                    }
                }
            }
            alowVar.d.d(akuhVar);
        }
    }

    @Override // defpackage.akvz
    public final void k(akvy akvyVar) {
        this.m.add(akvyVar);
        synchronized (this.q) {
            akvyVar.q(this.l);
        }
    }

    @Override // defpackage.akvz
    public final void l(akvy akvyVar) {
        this.m.remove(akvyVar);
    }

    @Override // defpackage.akvz
    public final akuh m(bnrd bnrdVar, int i) {
        amgj c2;
        synchronized (this.g) {
            c2 = this.f.c(amgk.NO_WRAP, bnrdVar);
        }
        alrk alrkVar = this.i;
        int andIncrement = alrkVar.b.getAndIncrement();
        alxn m = alxo.m(andIncrement);
        m.c = true;
        m.v = i;
        dcen N = dcep.N();
        m.b = true;
        m.A = c2;
        N.b(c2);
        alow j = alrkVar.j(m.a(), andIncrement, N.f());
        alrkVar.e.s(j, false);
        return j;
    }

    @Override // defpackage.akvz
    public final akuh n(int i) {
        ally allyVar;
        synchronized (this.u) {
            allyVar = this.u.get(1);
            if (allyVar == null) {
                allyVar = new ally(1);
                this.u.put(1, allyVar);
            }
        }
        return allyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alxp o(int i, int i2) {
        alxs y = y(i2);
        if (y != null) {
            return y.b(i);
        }
        return alxp.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alxp p(long j) {
        synchronized (this.q) {
            alxs alxsVar = this.o;
            if (alxsVar == null) {
                return alxp.e;
            }
            return alxsVar.a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alwn q() {
        alwn a;
        synchronized (this.q) {
            a = alwn.a(this.l);
        }
        return a;
    }

    @Override // defpackage.amgl
    @dzsi
    public final bnva r(amgj amgjVar) {
        bnva a;
        synchronized (this.g) {
            a = this.f.a(amgjVar);
        }
        if (!amgjVar.d() && a == null) {
            amgjVar.a();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(alow alowVar, boolean z) {
        dcep<amgj> k = alowVar.k();
        if (z) {
            alowVar.j(false);
        }
        if (k.isEmpty()) {
            alowVar.j(true);
            return;
        }
        alro alroVar = new alro(this, alowVar, k.size());
        synchronized (this.g) {
            dcpd<amgj> it = k.iterator();
            while (it.hasNext()) {
                amgj next = it.next();
                if (z) {
                    this.f.b(next);
                }
                this.f.f(next, alroVar);
            }
            dcpd<amgj> it2 = alowVar.l(k).iterator();
            while (it2.hasNext()) {
                this.f.e(it2.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alxa t(int i) {
        synchronized (this.h) {
            Map<Integer, akvx> map = this.h;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                return d;
            }
            akvx akvxVar = this.h.get(valueOf);
            if (akvxVar instanceof alxa) {
                return (alxa) akvxVar;
            }
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Long v(Long l, dcep<Integer> dcepVar, int i) {
        alwz i2;
        alyb alybVar = null;
        if (this.e.g(i) && (i2 = this.e.i(i)) != null) {
            alybVar = i2.a;
        }
        return alybVar == null ? l : alybVar.a(l, dcepVar);
    }

    public final void w(akvx akvxVar) {
        synchronized (this.h) {
            this.h.remove(Integer.valueOf(akvxVar.e()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int x() {
        int i;
        synchronized (this.q) {
            i = this.n;
        }
        return i;
    }

    @dzsi
    public final alxs y(int i) {
        synchronized (this.q) {
            if (i == this.n) {
                return this.o;
            }
            alwn a = alwn.a(this.l);
            if (!this.e.f(i, a)) {
                return null;
            }
            return this.e.h(i, a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long u(Long l, dcep<Integer> dcepVar) {
        synchronized (this.q) {
            alwz alwzVar = this.p;
            if (alwzVar == null) {
                return l;
            }
            return alwzVar.a.a(l, dcepVar);
        }
    }
}
