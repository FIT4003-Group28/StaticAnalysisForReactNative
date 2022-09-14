package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aoup  reason: default package */
/* loaded from: classes2.dex */
public final class aoup<K extends Comparable<? super K>, D extends Serializable> implements angq<K, D> {
    private final bvrb a;
    private final anif<K> c;
    private final Map<K, aouv<K, D>> b = new HashMap();
    private final AtomicInteger d = new AtomicInteger(0);

    public aoup(bvrb bvrbVar, anif<K> anifVar) {
        this.a = bvrbVar;
        this.c = anifVar;
        anifVar.b.add(new aouo(this));
    }

    public static <K extends Comparable<? super K>, D extends Serializable> aoup<K, D> c(bvrb bvrbVar, int i) {
        return new aoup<>(bvrbVar, new anif(i));
    }

    private final synchronized aouv<K, D> k(K k) {
        if (!this.b.containsKey(k)) {
            this.b.put(k, new aouv<>(this.a, k, angs.d()));
        }
        return this.b.get(k);
    }

    private final synchronized void l(K k, angs<D> angsVar) {
        angr angrVar = angr.SUCCESS;
        int ordinal = ((angf) angsVar).a.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            this.c.b(k);
        } else {
            anif<K> anifVar = this.c;
            int andIncrement = this.d.getAndIncrement();
            anifVar.b(k);
            anifVar.a.add(new anie<>(k, andIncrement));
            anifVar.a(anifVar.c);
        }
        aouv<K, D> k2 = k(k);
        k2.c = angsVar;
        for (angt<K, D> angtVar : k2.a) {
            k2.e(angtVar);
        }
    }

    @Override // defpackage.angq
    public final synchronized angu<K, D> a(K k) {
        return k(k);
    }

    @Override // defpackage.angq
    public final synchronized void b() {
        this.c.a(0);
        this.d.set(0);
    }

    public final synchronized void d(K k, D d) {
        l(k, angs.c(dbsg.i(d), angr.SUCCESS));
    }

    public final synchronized void e(K k, D d, angr angrVar) {
        l(k, angs.c(dbsg.i(d), angrVar));
    }

    public final synchronized void f(K k) {
        l(k, angs.c(dbpy.a, angr.ERROR));
    }

    public final synchronized void g(K k) {
        l(k, k(k).c.g(angr.PENDING_DIRTY_OR_ABSENT_DATA));
    }

    public final synchronized void h(K k) {
        angs<D> angsVar = k(k).c;
        if (angsVar.e()) {
            l(k, angsVar.g(angr.PENDING_PARTIAL_DATA));
        } else {
            l(k, angsVar.g(angr.PENDING_DIRTY_OR_ABSENT_DATA));
        }
    }

    public final synchronized dcdc<angu<K, D>> i() {
        return dcdc.r(this.b.values());
    }

    public final synchronized void j(K k) {
        l(k, angs.d());
    }
}
