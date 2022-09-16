package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: depf  reason: default package */
/* loaded from: classes.dex */
public final class depf extends deor {
    public static final desq<Set<Object>> a = depe.a;
    private final depm e;
    private final Map<deow<?>, depn<?>> c = new HashMap();
    private final Map<Class<?>, depn<?>> d = new HashMap();
    public final Map<Class<?>, depn<Set<?>>> b = new HashMap();

    public depf(Executor executor, Iterable<depb> iterable, deow<?>... deowVarArr) {
        Set<depg> set;
        depm depmVar = new depm(executor);
        this.e = depmVar;
        ArrayList<deow> arrayList = new ArrayList();
        arrayList.add(deow.of(depmVar, depm.class, dera.class, deqz.class));
        for (depb depbVar : iterable) {
            arrayList.addAll(depbVar.getComponents());
        }
        for (deow<?> deowVar : deowVarArr) {
            if (deowVar != null) {
                arrayList.add(deowVar);
            }
        }
        HashMap hashMap = new HashMap(arrayList.size());
        for (deow deowVar2 : arrayList) {
            depg depgVar = new depg(deowVar2);
            Iterator it = deowVar2.a.iterator();
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                deph dephVar = new deph(cls, !deowVar2.a());
                if (!hashMap.containsKey(dephVar)) {
                    hashMap.put(dephVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(dephVar);
                if (set2.isEmpty() || dephVar.a) {
                    set2.add(depgVar);
                } else {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
            }
        }
        for (Set<depg> set3 : hashMap.values()) {
            for (depg depgVar2 : set3) {
                for (depi depiVar : depgVar2.a.b) {
                    if (depiVar.b() && (set = (Set) hashMap.get(new deph(depiVar.a, depiVar.a()))) != null) {
                        for (depg depgVar3 : set) {
                            depgVar2.b.add(depgVar3);
                            depgVar3.c.add(depgVar2);
                        }
                    }
                }
            }
        }
        HashSet<depg> hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        HashSet hashSet2 = new HashSet();
        for (depg depgVar4 : hashSet) {
            if (depgVar4.a()) {
                hashSet2.add(depgVar4);
            }
        }
        int i = 0;
        while (!hashSet2.isEmpty()) {
            depg depgVar5 = (depg) hashSet2.iterator().next();
            hashSet2.remove(depgVar5);
            i++;
            for (depg depgVar6 : depgVar5.b) {
                depgVar6.c.remove(depgVar5);
                if (depgVar6.a()) {
                    hashSet2.add(depgVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                final deow<?> deowVar3 = (deow) arrayList.get(i2);
                this.c.put(deowVar3, new depn<>(new desq(this, deowVar3) { // from class: depc
                    private final depf a;
                    private final deow b;

                    {
                        this.a = this;
                        this.b = deowVar3;
                    }

                    @Override // defpackage.desq
                    public final Object a() {
                        depf depfVar = this.a;
                        deow deowVar4 = this.b;
                        return deowVar4.d.a(new depr(deowVar4, depfVar));
                    }
                }));
            }
            for (Map.Entry<deow<?>, depn<?>> entry : this.c.entrySet()) {
                deow<?> key = entry.getKey();
                if (key.a()) {
                    depn<?> value = entry.getValue();
                    for (Class<? super Object> cls2 : key.a) {
                        this.d.put(cls2, value);
                    }
                }
            }
            for (deow<?> deowVar4 : this.c.keySet()) {
                for (depi depiVar2 : deowVar4.b) {
                    if (depiVar2.b == 1 && !this.d.containsKey(depiVar2.a)) {
                        throw new depo(String.format("Unsatisfied dependency for component %s: %s", deowVar4, depiVar2.a));
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<deow<?>, depn<?>> entry2 : this.c.entrySet()) {
                deow<?> key2 = entry2.getKey();
                if (!key2.a()) {
                    depn<?> value2 = entry2.getValue();
                    for (Class<? super Object> cls3 : key2.a) {
                        if (!hashMap2.containsKey(cls3)) {
                            hashMap2.put(cls3, new HashSet());
                        }
                        ((Set) hashMap2.get(cls3)).add(value2);
                    }
                }
            }
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                final Set set5 = (Set) entry3.getValue();
                this.b.put((Class) entry3.getKey(), new depn<>(new desq(set5) { // from class: depd
                    private final Set a;

                    {
                        this.a = set5;
                    }

                    @Override // defpackage.desq
                    public final Object a() {
                        Set<depn> set6 = this.a;
                        HashSet hashSet3 = new HashSet();
                        for (depn depnVar : set6) {
                            hashSet3.add(depnVar.a());
                        }
                        return Collections.unmodifiableSet(hashSet3);
                    }
                }));
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (depg depgVar7 : hashSet) {
            if (!depgVar7.a() && !depgVar7.b.isEmpty()) {
                arrayList2.add(depgVar7.a);
            }
        }
        throw new depj(arrayList2);
    }

    @Override // defpackage.deox
    public final <T> desq<T> b(Class<T> cls) {
        depp.checkNotNull(cls, "Null interface requested.");
        return this.d.get(cls);
    }

    public final void c(boolean z) {
        Queue<deqx<?>> queue;
        for (Map.Entry<deow<?>, depn<?>> entry : this.c.entrySet()) {
            depn<?> value = entry.getValue();
            int i = entry.getKey().c;
            if (i == 1 || (i == 2 && z)) {
                value.a();
            }
        }
        depm depmVar = this.e;
        synchronized (depmVar) {
            queue = depmVar.a;
            if (queue != null) {
                depmVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (deqx<?> deqxVar : queue) {
                depp.checkNotNull(deqxVar);
                synchronized (depmVar) {
                    Queue<deqx<?>> queue2 = depmVar.a;
                    if (queue2 != null) {
                        queue2.add(deqxVar);
                    } else {
                        for (final Map.Entry<deqy<Object>, Executor> entry2 : depmVar.c()) {
                            entry2.getValue().execute(new Runnable(entry2) { // from class: depl
                                private final Map.Entry a;

                                {
                                    this.a = entry2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((deqy) this.a.getKey()).a();
                                }
                            });
                        }
                    }
                }
            }
        }
    }
}
