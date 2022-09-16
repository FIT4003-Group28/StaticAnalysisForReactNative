package defpackage;

import android.os.StrictMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: csga  reason: default package */
/* loaded from: classes5.dex */
public final class csga {
    public final dehp a;
    public final Set<cskd> b;
    public final csfw c;
    private final dzsj<Set<csgb<?>>> d;
    private final cqat e;
    private final Executor f;
    private volatile dcdn<Class<?>, List<csgb<?>>> g;

    public csga(dehp dehpVar, dzsj<Set<csgb<?>>> dzsjVar, Set<cskd> set, csfw csfwVar, cqat cqatVar) {
        this.a = dehpVar;
        this.d = dzsjVar;
        this.b = set;
        this.c = csfwVar;
        this.e = cqatVar;
        this.f = dehx.b(dehpVar);
        dbsk.m(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static dehn<Void> c(csge<?> csgeVar, csgb<?> csgbVar) {
        return csgbVar.a(csgeVar);
    }

    private final void d(dehn<Void> dehnVar) {
        dcpd it = ((dcnn) this.b).iterator();
        while (it.hasNext()) {
            cskd cskdVar = (cskd) it.next();
            deha.q(dehnVar, new cskc(), dege.a);
        }
    }

    public final void a(csfz csfzVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            long c = this.e.c();
            final csgd csgdVar = new csgd();
            final List<csgc> a = csfzVar.a();
            if (a == null || a.isEmpty()) {
                return;
            }
            final deig d = deig.d();
            d(deha.f(dazv.f(new deff(this, a, d, csgdVar) { // from class: csfx
                private final csga a;
                private final List b;
                private final deig c;
                private final csgd d;

                {
                    this.a = this;
                    this.b = a;
                    this.c = d;
                    this.d = csgdVar;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    csga csgaVar = this.a;
                    List<csgc> list = this.b;
                    final deig deigVar = this.c;
                    final csgd csgdVar2 = this.d;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    ArrayList arrayList2 = new ArrayList(size + size + 1);
                    arrayList2.add(deigVar);
                    for (csgc csgcVar : list) {
                        try {
                            dehn<csfs> a2 = csgaVar.c.a(csgcVar);
                            csge csgeVar = new csge(csgcVar, a2);
                            arrayList.add(csgeVar);
                            List<csgb<?>> b = csgaVar.b(csgeVar.a.getClass());
                            List<csgb<?>> b2 = csgaVar.b(csgc.class);
                            ArrayList arrayList3 = new ArrayList(b.size() + b2.size());
                            for (csgb<?> csgbVar : b) {
                                arrayList3.add(csga.c(csgeVar, csgbVar));
                            }
                            for (csgb<?> csgbVar2 : b2) {
                                arrayList3.add(csga.c(csgeVar, csgbVar2));
                            }
                            arrayList2.add(deew.h(deha.j(arrayList3), dbrs.b(null), dege.a));
                            arrayList2.add(a2);
                        } catch (Throwable th) {
                            arrayList2.add(deha.b(th));
                        }
                    }
                    final dehn b3 = deha.n(arrayList2).b(defi.a(), dege.a);
                    dcpd it = ((dcnn) csgaVar.b).iterator();
                    while (it.hasNext()) {
                        cskd cskdVar = (cskd) it.next();
                    }
                    return deha.l(arrayList2).a(new deff(csgdVar2, deigVar, b3) { // from class: csfy
                        private final csgd a;
                        private final deig b;
                        private final dehn c;

                        {
                            this.a = csgdVar2;
                            this.b = deigVar;
                            this.c = b3;
                        }

                        @Override // defpackage.deff
                        public final dehn a() {
                            csgd csgdVar3 = this.a;
                            deig deigVar2 = this.b;
                            dehn dehnVar = this.c;
                            long longValue = ((Long) deha.r(deigVar2)).longValue();
                            dbsk.m(csgdVar3.a == -1, "Duration set more than once");
                            csgdVar3.a = longValue;
                            return dehnVar;
                        }
                    }, csgaVar.a);
                }
            }), this.f));
            d.j(Long.valueOf(this.e.c() - c));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final List<csgb<?>> b(Class<?> cls) {
        dcdn<Class<?>, List<csgb<?>>> dcdnVar = this.g;
        if (dcdnVar == null) {
            synchronized (this) {
                dcdnVar = this.g;
                if (dcdnVar == null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (csgb<?> csgbVar : this.d.a()) {
                        if (csgbVar.b().isEmpty()) {
                            arrayList.add(csgbVar);
                        }
                        for (Class<? extends Object> cls2 : csgbVar.b()) {
                            List list = (List) hashMap.get(cls2);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(cls2, list);
                            }
                            list.add(csgbVar);
                        }
                    }
                    hashMap.put(csgc.class, arrayList);
                    dcdnVar = dcdn.r(hashMap);
                    this.g = dcdnVar;
                }
            }
        }
        return dcdnVar.getOrDefault(cls, dcdc.e());
    }
}
