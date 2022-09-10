package defpackage;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: amjd  reason: default package */
/* loaded from: classes.dex */
public final class amjd {
    private final amja a;
    private final amja b;
    private final amja c;
    private final bnsn k;
    private final btrm l;
    private final dzsj<akwt> m;
    private final dbty<Boolean> n;
    private final SparseArray<amjc> d = new SparseArray<>();
    private final Map<amhh, amyh> e = new HashMap();
    private final Map<dmpn, WeakReference<amiz>> i = new WeakHashMap();
    private final List<amjb> j = dchl.a();
    private final Set<amhh> f = dcnm.c();
    private final Set<amhh> g = dcnm.c();
    private final Set<amhh> h = dcnm.c();

    public amjd(bnsn bnsnVar, btrm btrmVar, bnrz bnrzVar, bnrz bnrzVar2, bnrz bnrzVar3, dzsj<akwt> dzsjVar, dbty<Boolean> dbtyVar) {
        this.k = bnsnVar;
        this.l = btrmVar;
        this.m = dzsjVar;
        this.n = dbtyVar;
        amja amjaVar = new amja(this, bnrzVar, 1);
        amjaVar.c();
        this.a = amjaVar;
        amja amjaVar2 = new amja(this, bnrzVar2, 2);
        amjaVar2.c();
        this.b = amjaVar2;
        amja amjaVar3 = new amja(this, bnrzVar3, 3);
        amjaVar3.c();
        this.c = amjaVar3;
        if (!dbtyVar.a().booleanValue()) {
            bnsnVar.h(amjaVar);
            bnsnVar.h(amjaVar2);
            bnsnVar.h(amjaVar3);
        }
    }

    private final aktp f(amhh amhhVar) {
        dmpn a = amhhVar.s().a();
        amiz k = amhhVar.k();
        if (k == null) {
            WeakReference<amiz> weakReference = this.i.get(a);
            k = weakReference == null ? null : weakReference.get();
            if (k == null) {
                k = new amiz(a);
                this.i.put(a, new WeakReference<>(k));
            }
        }
        if (!(k instanceof alsm)) {
            bvoo.f(new IllegalStateException(String.format("%s implements %s but not %s.", k.getClass().getName(), aktd.class.getName(), alsi.class.getName())));
        }
        return k;
    }

    private final Set<amhh> g(amhh amhhVar) {
        return amhhVar.v().c() <= bntl.a.c() ? this.f : amhhVar.v().c() <= bntn.PLACEMARK.c() ? this.g : this.h;
    }

    public final synchronized void a(amhh amhhVar, dbsg<amkh> dbsgVar) {
        amhhVar.w(32);
        if (this.n.a().booleanValue()) {
            int c = amhhVar.v().c();
            amjc amjcVar = this.d.get(c);
            if (amjcVar == null) {
                amjc amjcVar2 = new amjc(amhhVar.v(), !this.m.a().f());
                this.d.put(c, amjcVar2);
                amjcVar = amjcVar2;
            }
            amyh d = amjcVar.d();
            d.j(amhhVar);
            this.e.put(amhhVar, d);
            aktp f = f(amhhVar);
            if (f instanceof alsm) {
                ((alsm) f).H(dbsgVar.f());
            }
            this.k.i(d, f);
            return;
        }
        g(amhhVar).add(amhhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(amhh amhhVar, dbsg<amkh> dbsgVar) {
        aktp f = f(amhhVar);
        if (f instanceof alsm) {
            ((alsm) f).H(dbsgVar.f());
        }
    }

    public final synchronized void c(amhh amhhVar) {
        if (this.n.a().booleanValue()) {
            amyh remove = this.e.remove(amhhVar);
            if (remove != null) {
                this.k.j(remove);
                remove.k();
                amjc amjcVar = this.d.get(amhhVar.v().c());
                if (amjcVar != null) {
                    amjcVar.h(remove);
                }
            }
        } else {
            g(amhhVar).remove(amhhVar);
        }
        amhhVar.x(32);
    }

    public final synchronized void d() {
        for (amhh amhhVar : dcbg.f(this.f, this.g, this.h, this.e.keySet())) {
            amhhVar.x(32);
        }
        for (amyh amyhVar : this.e.values()) {
            this.k.j(amyhVar);
        }
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.j.clear();
        if (this.n.a().booleanValue()) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.valueAt(i).f();
            }
            this.d.clear();
            return;
        }
        this.k.j(this.a);
        this.k.j(this.b);
        this.k.j(this.c);
    }

    public final synchronized boolean e(amxr amxrVar, int i) {
        boolean h;
        h = h(amxrVar, !this.m.a().f(), i);
        this.j.size();
        this.f.size();
        this.g.size();
        this.h.size();
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[Catch: all -> 0x00f9, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000d, B:9:0x0012, B:10:0x0016, B:12:0x001c, B:8:0x0010, B:17:0x002f, B:18:0x0035, B:20:0x003b, B:22:0x004b, B:24:0x0053, B:29:0x006d, B:31:0x0077, B:26:0x005b, B:28:0x0065, B:32:0x007b, B:33:0x0089, B:35:0x008f, B:37:0x009e, B:39:0x00aa, B:40:0x00ad, B:42:0x00b7, B:43:0x00c2, B:45:0x00cc, B:48:0x00dc, B:51:0x00e3, B:53:0x00e8), top: B:63:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: all -> 0x00f9, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000d, B:9:0x0012, B:10:0x0016, B:12:0x001c, B:8:0x0010, B:17:0x002f, B:18:0x0035, B:20:0x003b, B:22:0x004b, B:24:0x0053, B:29:0x006d, B:31:0x0077, B:26:0x005b, B:28:0x0065, B:32:0x007b, B:33:0x0089, B:35:0x008f, B:37:0x009e, B:39:0x00aa, B:40:0x00ad, B:42:0x00b7, B:43:0x00c2, B:45:0x00cc, B:48:0x00dc, B:51:0x00e3, B:53:0x00e8), top: B:63:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: all -> 0x00f9, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000d, B:9:0x0012, B:10:0x0016, B:12:0x001c, B:8:0x0010, B:17:0x002f, B:18:0x0035, B:20:0x003b, B:22:0x004b, B:24:0x0053, B:29:0x006d, B:31:0x0077, B:26:0x005b, B:28:0x0065, B:32:0x007b, B:33:0x0089, B:35:0x008f, B:37:0x009e, B:39:0x00aa, B:40:0x00ad, B:42:0x00b7, B:43:0x00c2, B:45:0x00cc, B:48:0x00dc, B:51:0x00e3, B:53:0x00e8), top: B:63:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8 A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000d, B:9:0x0012, B:10:0x0016, B:12:0x001c, B:8:0x0010, B:17:0x002f, B:18:0x0035, B:20:0x003b, B:22:0x004b, B:24:0x0053, B:29:0x006d, B:31:0x0077, B:26:0x005b, B:28:0x0065, B:32:0x007b, B:33:0x0089, B:35:0x008f, B:37:0x009e, B:39:0x00aa, B:40:0x00ad, B:42:0x00b7, B:43:0x00c2, B:45:0x00cc, B:48:0x00dc, B:51:0x00e3, B:53:0x00e8), top: B:63:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean h(defpackage.amxr r8, boolean r9, int r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amjd.h(amxr, boolean, int):boolean");
    }
}
