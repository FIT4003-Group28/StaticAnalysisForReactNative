package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anzk  reason: default package */
/* loaded from: classes.dex */
public final class anzk {
    public static int a(int i) {
        return i - 1;
    }

    public static void b(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void c(Object obj) {
        obj.getClass();
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void e(List list) {
        Set<anxw> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                anxn anxnVar = (anxn) it.next();
                anxw anxwVar = new anxw(anxnVar);
                for (Class cls : anxnVar.a) {
                    anxx anxxVar = new anxx(cls, !anxnVar.c());
                    if (!hashMap.containsKey(anxxVar)) {
                        hashMap.put(anxxVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(anxxVar);
                    if (set2.isEmpty() || anxxVar.a) {
                        set2.add(anxwVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                }
            } else {
                for (Set<anxw> set3 : hashMap.values()) {
                    for (anxw anxwVar2 : set3) {
                        for (anxy anxyVar : anxwVar2.a.b) {
                            if (anxyVar.d() && (set = (Set) hashMap.get(new anxx(anxyVar.a, anxyVar.e()))) != null) {
                                for (anxw anxwVar3 : set) {
                                    anxwVar2.b.add(anxwVar3);
                                    anxwVar3.c.add(anxwVar2);
                                }
                            }
                        }
                    }
                }
                HashSet<anxw> hashSet = new HashSet();
                for (Set set4 : hashMap.values()) {
                    hashSet.addAll(set4);
                }
                HashSet hashSet2 = new HashSet();
                for (anxw anxwVar4 : hashSet) {
                    if (anxwVar4.a()) {
                        hashSet2.add(anxwVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    anxw anxwVar5 = (anxw) hashSet2.iterator().next();
                    hashSet2.remove(anxwVar5);
                    i++;
                    for (anxw anxwVar6 : anxwVar5.b) {
                        anxwVar6.c.remove(anxwVar5);
                        if (anxwVar6.a()) {
                            hashSet2.add(anxwVar6);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (anxw anxwVar7 : hashSet) {
                    if (!anxwVar7.a() && !anxwVar7.b.isEmpty()) {
                        arrayList.add(anxwVar7.a);
                    }
                }
                throw new anxz(arrayList);
            }
        }
    }
}
