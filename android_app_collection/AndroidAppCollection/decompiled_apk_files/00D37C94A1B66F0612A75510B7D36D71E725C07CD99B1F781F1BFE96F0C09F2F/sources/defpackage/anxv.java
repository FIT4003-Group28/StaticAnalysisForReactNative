package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: anxv  reason: default package */
/* loaded from: classes.dex */
public final class anxv extends anxk implements anym {
    private static final aoaf c = anyh.b;
    private final List f;
    private final anyc g;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    public final AtomicReference b = new AtomicReference();

    public anxv(Executor executor, Iterable iterable, Collection collection) {
        anyc anycVar = new anyc(executor);
        this.g = anycVar;
        ArrayList<anxn> arrayList = new ArrayList();
        arrayList.add(anxn.b(anycVar, anyc.class, anzh.class, anzg.class));
        arrayList.add(anxn.b(this, anym.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            anxn anxnVar = (anxn) it.next();
            if (anxnVar != null) {
                arrayList.add(anxnVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            arrayList2.add(obj);
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    anxq anxqVar = (anxq) ((aoaf) it2.next()).a();
                    if (anxqVar != null) {
                        arrayList.addAll(anxqVar.getComponents());
                        it2.remove();
                    }
                } catch (anyd e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.a.isEmpty()) {
                anzk.e(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.a.keySet());
                arrayList4.addAll(arrayList);
                anzk.e(arrayList4);
            }
            for (final anxn anxnVar2 : arrayList) {
                this.a.put(anxnVar2, new anye(new aoaf() { // from class: anxs
                    @Override // defpackage.aoaf
                    public final Object a() {
                        anxv anxvVar = anxv.this;
                        anxn anxnVar3 = anxnVar2;
                        return anxnVar3.d.a(new anyk(anxnVar3, anxvVar));
                    }
                }));
            }
            ArrayList arrayList5 = new ArrayList();
            for (anxn anxnVar3 : arrayList) {
                if (anxnVar3.c()) {
                    final aoaf aoafVar = (aoaf) this.a.get(anxnVar3);
                    for (Class cls : anxnVar3.a) {
                        if (!this.d.containsKey(cls)) {
                            this.d.put(cls, aoafVar);
                        } else {
                            final anyi anyiVar = (anyi) ((aoaf) this.d.get(cls));
                            arrayList5.add(new Runnable() { // from class: anxu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    anyi anyiVar2 = anyi.this;
                                    aoaf aoafVar2 = aoafVar;
                                    if (anyiVar2.b != anyi.a) {
                                        throw new IllegalStateException("provide() can be called only once.");
                                    }
                                    synchronized (anyiVar2) {
                                        anyiVar2.b = aoafVar2;
                                    }
                                }
                            });
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                anxn anxnVar4 = (anxn) entry.getKey();
                if (!anxnVar4.c()) {
                    aoaf aoafVar2 = (aoaf) entry.getValue();
                    for (Class cls2 : anxnVar4.a) {
                        if (!hashMap.containsKey(cls2)) {
                            hashMap.put(cls2, new HashSet());
                        }
                        ((Set) hashMap.get(cls2)).add(aoafVar2);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (!this.e.containsKey(entry2.getKey())) {
                    this.e.put((Class) entry2.getKey(), anyf.b((Collection) entry2.getValue()));
                } else {
                    final anyf anyfVar = (anyf) this.e.get(entry2.getKey());
                    for (final aoaf aoafVar3 : (Set) entry2.getValue()) {
                        arrayList6.add(new Runnable() { // from class: anxt
                            @Override // java.lang.Runnable
                            public final void run() {
                                anyf.this.c(aoafVar3);
                            }
                        });
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            for (anxn anxnVar5 : this.a.keySet()) {
                for (anxy anxyVar : anxnVar5.b) {
                    if (!anxyVar.e() || this.e.containsKey(anxyVar.a)) {
                        if (this.d.containsKey(anxyVar.a)) {
                            continue;
                        } else if (anxyVar.b == 1) {
                            throw new anyg(String.format("Unsatisfied dependency for component %s: %s", anxnVar5, anxyVar.a));
                        } else {
                            if (!anxyVar.e()) {
                                this.d.put(anxyVar.a, new anyi(anyi.a));
                            }
                        }
                    } else {
                        this.e.put(anxyVar.a, anyf.b(Collections.emptySet()));
                    }
                }
            }
        }
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList3.get(i)).run();
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            d(this.a, bool.booleanValue());
        }
    }

    @Override // defpackage.anxo
    public final synchronized aoaf b(Class cls) {
        return (aoaf) this.d.get(cls);
    }

    @Override // defpackage.anxo
    public final synchronized aoaf c(Class cls) {
        anyf anyfVar = (anyf) this.e.get(cls);
        if (anyfVar != null) {
            return anyfVar;
        }
        return c;
    }

    public final void d(Map map, boolean z) {
        Queue<anze> queue;
        for (Map.Entry entry : map.entrySet()) {
            aoaf aoafVar = (aoaf) entry.getValue();
            int i = ((anxn) entry.getKey()).c;
            if (i == 1 || (i == 2 && z)) {
                aoafVar.a();
            }
        }
        anyc anycVar = this.g;
        synchronized (anycVar) {
            queue = anycVar.a;
            if (queue != null) {
                anycVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (final anze anzeVar : queue) {
                anzk.c(anzeVar);
                synchronized (anycVar) {
                    Queue queue2 = anycVar.a;
                    if (queue2 != null) {
                        queue2.add(anzeVar);
                    } else {
                        for (final Map.Entry entry2 : anycVar.a(anzeVar)) {
                            ((Executor) entry2.getValue()).execute(new Runnable() { // from class: anyb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Map.Entry entry3 = entry2;
                                    ((anzf) entry3.getKey()).a(anzeVar);
                                }
                            });
                        }
                    }
                }
            }
        }
    }
}
