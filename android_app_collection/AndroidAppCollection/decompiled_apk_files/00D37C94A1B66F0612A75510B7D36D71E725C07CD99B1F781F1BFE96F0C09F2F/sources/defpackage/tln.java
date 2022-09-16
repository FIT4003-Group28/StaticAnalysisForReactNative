package defpackage;

import android.os.StrictMode;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tln  reason: default package */
/* loaded from: classes4.dex */
public final class tln {
    public final ankw a;
    public final tli b;
    private final azqb c;
    private final Set d;
    private final snc e;
    private final Executor f;
    private volatile amup g;

    public tln(ankw ankwVar, azqb azqbVar, Set set, tli tliVar, snc sncVar) {
        this.a = ankwVar;
        this.c = azqbVar;
        this.d = set;
        this.b = tliVar;
        this.e = sncVar;
        this.f = anlz.g(ankwVar);
        aqxo.z(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static ankt a(tlr tlrVar, tlo tloVar) {
        try {
            return tloVar.a(tlrVar);
        } catch (Throwable th) {
            return anlz.p(th);
        }
    }

    private final void d(ankt anktVar) {
        amzs it = ((amyt) this.d).iterator();
        while (it.hasNext()) {
            tok tokVar = (tok) it.next();
            anlz.A(anktVar, new sle(2), anjk.a);
        }
    }

    public final List b(Class cls) {
        amup amupVar = this.g;
        if (amupVar == null) {
            synchronized (this) {
                amupVar = this.g;
                if (amupVar == null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (tlo tloVar : (Set) this.c.get()) {
                        if (tloVar.b().isEmpty()) {
                            arrayList.add(tloVar);
                        } else {
                            amzs it = ((amyt) tloVar.b()).iterator();
                            while (it.hasNext()) {
                                Class cls2 = (Class) it.next();
                                List list = (List) hashMap.get(cls2);
                                if (list == null) {
                                    list = new ArrayList();
                                    hashMap.put(cls2, list);
                                }
                                list.add(tloVar);
                            }
                        }
                    }
                    hashMap.put(tlp.class, arrayList);
                    amupVar = amup.j(hashMap);
                    this.g = amupVar;
                }
            }
        }
        return (List) amupVar.getOrDefault(cls, amuk.q());
    }

    public final void c(tlm tlmVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            long f = this.e.f();
            final tlq tlqVar = new tlq();
            final List a = tlmVar.a();
            if (a == null || a.isEmpty()) {
                return;
            }
            final SettableFuture f2 = SettableFuture.f();
            d(anii.i(anlz.u(ammo.g(new Callable() { // from class: tll
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    tln tlnVar = tln.this;
                    List<tlp> list = a;
                    ArrayList arrayList = new ArrayList(list.size());
                    for (tlp tlpVar : list) {
                        arrayList.add(new tlr(tlpVar, tlnVar.b.a(tlpVar)));
                    }
                    return arrayList;
                }
            }), this.f), ammo.c(new anir() { // from class: tlk
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    tln tlnVar = tln.this;
                    final SettableFuture settableFuture = f2;
                    final tlq tlqVar2 = tlqVar;
                    List<tlr> list = (List) obj;
                    int size = list.size();
                    ArrayList arrayList = new ArrayList(size + size + 1);
                    arrayList.add(settableFuture);
                    for (tlr tlrVar : list) {
                        try {
                            List<tlo> b = tlnVar.b(tlrVar.a.getClass());
                            List<tlo> b2 = tlnVar.b(tlp.class);
                            ArrayList arrayList2 = new ArrayList(b.size() + b2.size());
                            for (tlo tloVar : b) {
                                arrayList2.add(tln.a(tlrVar, tloVar));
                            }
                            for (tlo tloVar2 : b2) {
                                arrayList2.add(tln.a(tlrVar, tloVar2));
                            }
                            arrayList.add(anii.h(anlz.n(arrayList2), akzj.e(), anjk.a));
                            arrayList.add(tlrVar.b);
                        } catch (Throwable th) {
                            arrayList.add(anlz.p(th));
                        }
                    }
                    final ankt a2 = anlz.l(arrayList).a(almu.o(), anjk.a);
                    return anlz.j(arrayList).b(new aniq() { // from class: tlj
                        @Override // defpackage.aniq
                        public final ankt a() {
                            tlq tlqVar3 = tlq.this;
                            SettableFuture settableFuture2 = settableFuture;
                            ankt anktVar = a2;
                            long longValue = ((Long) anlz.y(settableFuture2)).longValue();
                            aqxo.z(tlqVar3.a == -1, "Duration set more than once");
                            tlqVar3.a = longValue;
                            return anktVar;
                        }
                    }, tlnVar.a);
                }
            }), this.f));
            f2.o(Long.valueOf(this.e.f() - f));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
