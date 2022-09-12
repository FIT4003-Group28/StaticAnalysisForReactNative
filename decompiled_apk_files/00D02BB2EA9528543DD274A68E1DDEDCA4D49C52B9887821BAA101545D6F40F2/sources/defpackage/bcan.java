package defpackage;

import android.net.Uri;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bcan  reason: default package */
/* loaded from: classes3.dex */
public class bcan implements Serializable {
    private static final long serialVersionUID = 1;
    public final dwyd b;
    private final dbsg<String> c;
    private bbud d = null;
    private boolean e = false;
    private boolean f = false;
    private final Map<bcam, String> g = new HashMap();
    private final Set<bcam> h = new HashSet();
    private dcdc<bbtm> i = dcdc.e();
    private final LinkedHashMap<bcam, bbtm> j = new LinkedHashMap<>();
    private final ArrayList<bbtm> k = new ArrayList<>();
    private final Map<bbtm, Float> l = new HashMap();
    private final ArrayList<bbtm> m = new ArrayList<>();
    private final dcgn<String, bbtm> n = dcgn.O();
    private dbsg<Integer> o = dbpy.a;
    public final bcaj a = new bcaj();

    public bcan(dwyd dwydVar, dbsg<String> dbsgVar) {
        this.b = dwydVar;
        this.c = dbsgVar;
    }

    private final synchronized void L(bbtj bbtjVar, String str) {
        this.g.put(bcam.c(bbtjVar), str);
    }

    private final synchronized boolean M(String str) {
        ArrayList<bbtm> arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bbtm bbtmVar = arrayList.get(i);
            if (bbtmVar.r().a() && bbtmVar.r().b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private synchronized void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public final synchronized void A(bbtj bbtjVar) {
        if (q(bbtjVar)) {
            H(bbtjVar);
        } else {
            z(bbtjVar);
        }
    }

    public final synchronized boolean B(bbtj bbtjVar, float f) {
        bbtm q = bbtjVar.q();
        if (!q.r().a() || !M(q.r().b())) {
            this.k.add(q);
            this.l.put(q, Float.valueOf(f));
            return true;
        }
        return false;
    }

    public final synchronized void C(bbtj bbtjVar) {
        this.k.remove(bbtjVar.q());
    }

    public final synchronized void D() {
        this.k.clear();
    }

    public final synchronized void E(bbtj bbtjVar) {
        this.m.add(bbtjVar.q());
    }

    public final synchronized void F(@dzsi String str, bbtj bbtjVar) {
        this.n.n(dbsj.e(str), bbtjVar.q());
    }

    public final synchronized void G(Iterable<bbtj> iterable) {
        for (bbtj bbtjVar : iterable) {
            z(bbtjVar);
        }
    }

    public final synchronized void H(bbtj bbtjVar) {
        this.j.remove(bcam.c(bbtjVar));
    }

    public final synchronized void I() {
        this.j.clear();
    }

    public final synchronized void J(bbtj bbtjVar) {
        bbtm q = bbtjVar.q();
        if (!q.r().a() || !M(q.r().b())) {
            this.k.add(q);
        }
    }

    public final synchronized void K(bbtm bbtmVar) {
        this.l.get(bbtmVar);
    }

    public final synchronized void a(bbud bbudVar) {
        this.d = bbudVar;
    }

    public final synchronized void b(dbsg<Integer> dbsgVar) {
        this.o = dbsgVar;
    }

    public final synchronized dbsg<Integer> c() {
        return this.o;
    }

    public final synchronized boolean d() {
        return ((Boolean) this.o.h(new dbrn(this) { // from class: bcak
            private final bcan a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Boolean.valueOf(this.a.l().size() < ((Integer) obj).intValue());
            }
        }).c(true)).booleanValue();
    }

    public final synchronized void e(boolean z) {
        this.e = z;
    }

    @dzsi
    public final synchronized bbud f() {
        return this.d;
    }

    public final synchronized boolean g() {
        return this.e;
    }

    public final synchronized void h() {
        this.f = true;
    }

    public final synchronized boolean i() {
        return this.f;
    }

    public final synchronized boolean j() {
        return this.j.isEmpty();
    }

    public final synchronized dcdc<bbtm> k() {
        return this.i;
    }

    public final synchronized dcdc<bbtm> l() {
        return dcdc.r(this.j.values());
    }

    public final synchronized dcdc<bbtm> m() {
        return dcdc.r(this.k);
    }

    public final synchronized List<bbtm> n() {
        return this.m;
    }

    public final synchronized dcka<String, bbtm> o() {
        return this.n;
    }

    public final synchronized bbuf p() {
        bbsq bbsqVar;
        bbsqVar = new bbsq();
        bbsqVar.a("");
        dcdc<bbtm> l = l();
        if (l != null) {
            bbsqVar.a = l;
            if (this.c.a()) {
                bbsqVar.a(this.c.b());
            }
            String str = bbsqVar.a == null ? " photoMetadata" : "";
            if (bbsqVar.b == null) {
                str = str.concat(" photosLabel");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
        } else {
            throw new NullPointerException("Null photoMetadata");
        }
        return new bbsr(bbsqVar.a, bbsqVar.b);
    }

    public final synchronized boolean q(bbtj bbtjVar) {
        return this.j.containsKey(bcam.c(bbtjVar));
    }

    @dzsi
    public final synchronized bbtm r(bbtj bbtjVar) {
        return this.j.get(bcam.c(bbtjVar));
    }

    public final synchronized bbtj s(bbtj bbtjVar, @dzsi Uri uri, String str) {
        if (!q(bbtjVar)) {
            return bbtjVar;
        }
        bbtj n = bbtjVar.n(str);
        if (n.m().contains(dwye.CAPTION)) {
            L(n, str);
        }
        if (uri != null) {
            n = n.o(uri);
        }
        if (n.equals(bbtjVar)) {
            return bbtjVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.j);
        this.j.clear();
        bcam c = bcam.c(bbtjVar);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            bcam bcamVar = (bcam) entry.getKey();
            if (bcamVar.equals(c)) {
                this.j.put(bcam.c(n), n.q());
            } else {
                this.j.put(bcamVar, (bbtm) entry.getValue());
            }
        }
        return n;
    }

    public final synchronized void t() {
        this.h.clear();
    }

    public final synchronized String toString() {
        StringBuilder sb;
        int size = this.j.size();
        sb = new StringBuilder(46);
        sb.append("PhotoSelectionContext with ");
        sb.append(size);
        sb.append(" photos.");
        return sb.toString();
    }

    public final synchronized void u(bbtj bbtjVar, boolean z) {
        if (bbtjVar.b() != bbti.VIDEO) {
            return;
        }
        bcam c = bcam.c(bbtjVar);
        if (z) {
            this.h.add(c);
        } else {
            this.h.remove(c);
        }
    }

    public final synchronized Set<bbtm> v() {
        dcen N;
        N = dcep.N();
        for (bcam bcamVar : this.h) {
            bbtm bbtmVar = this.j.get(bcamVar);
            if (bbtmVar != null) {
                N.b(bbtmVar);
            }
        }
        return N.f();
    }

    public final synchronized Boolean w(bbtj bbtjVar) {
        return Boolean.valueOf(this.h.contains(bcam.c(bbtjVar)));
    }

    @dzsi
    public final synchronized String x(bbtj bbtjVar) {
        return this.g.get(bcam.c(bbtjVar));
    }

    public final synchronized void y(Iterable<bbtj> iterable) {
        this.i = dcdc.r(dcbg.b(iterable).s(bcal.a).z());
    }

    public final synchronized void z(bbtj bbtjVar) {
        bcam c = bcam.c(bbtjVar);
        if (((bcai) c).a != null) {
            this.j.remove(new bcai(bbtjVar.q().A(), null));
        }
        this.j.put(c, bbtjVar.q());
    }
}
