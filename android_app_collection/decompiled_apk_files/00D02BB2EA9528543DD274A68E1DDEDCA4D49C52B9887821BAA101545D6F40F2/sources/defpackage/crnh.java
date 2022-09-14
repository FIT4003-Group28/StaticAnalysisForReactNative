package defpackage;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: crnh  reason: default package */
/* loaded from: classes5.dex */
public class crnh {
    public final HashMap<crqv, Set<String>> a = new HashMap<>();
    public final Object b = new Object();
    public final List<crla> c = new CopyOnWriteArrayList();
    public final dbsl<crqw> d = new crng(this);

    public crnh(Set<crqv> set) {
        crqv[] values;
        for (crqv crqvVar : crqv.values()) {
            HashSet hashSet = new HashSet();
            if (set.contains(crqvVar)) {
                hashSet.add("Globally Blocked Prompts");
            }
            this.a.put(crqvVar, hashSet);
        }
    }

    private final void c(Set<crqv> set) {
        crqv[] values;
        boolean z;
        synchronized (this.b) {
            z = false;
            for (crqv crqvVar : crqv.values()) {
                Set<String> set2 = this.a.get(crqvVar);
                dbsk.s(set2);
                if (set.contains(crqvVar)) {
                    z |= set2.isEmpty();
                    set2.add("Enroute FAB Tutorial");
                } else if (set2.remove("Enroute FAB Tutorial") && set2.isEmpty()) {
                    z = true;
                }
            }
        }
        if (z) {
            for (crla crlaVar : this.c) {
                synchronized (crlaVar.a) {
                    crlb crlbVar = crlaVar.a;
                    crqw crqwVar = crlbVar.c;
                    if (crqwVar != null && !crlbVar.b.d.a(crqwVar)) {
                        crlaVar.a.h(null);
                    }
                    crlaVar.a.f();
                }
            }
        }
    }

    public final void a() {
        crqv[] values;
        EnumSet noneOf = EnumSet.noneOf(crqv.class);
        HashSet hashSet = new HashSet();
        for (crqv crqvVar : crqv.values()) {
            if (!noneOf.contains(crqvVar)) {
                hashSet.add(crqvVar);
            }
        }
        c(hashSet);
    }

    public final void b() {
        c(EnumSet.noneOf(crqv.class));
    }
}
