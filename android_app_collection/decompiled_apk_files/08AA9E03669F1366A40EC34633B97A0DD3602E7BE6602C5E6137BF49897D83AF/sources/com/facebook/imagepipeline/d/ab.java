package com.facebook.imagepipeline.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: StagingArea.java */
/* loaded from: classes.dex */
public class ab {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f2558a = ab.class;

    /* renamed from: b  reason: collision with root package name */
    private Map<com.facebook.b.a.d, com.facebook.imagepipeline.i.d> f2559b = new HashMap();

    private ab() {
    }

    public static ab a() {
        return new ab();
    }

    public synchronized void a(com.facebook.b.a.d dVar, com.facebook.imagepipeline.i.d dVar2) {
        com.facebook.common.d.i.a(dVar);
        com.facebook.common.d.i.a(com.facebook.imagepipeline.i.d.e(dVar2));
        com.facebook.imagepipeline.i.d.d(this.f2559b.put(dVar, com.facebook.imagepipeline.i.d.a(dVar2)));
        c();
    }

    public void b() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f2559b.values());
            this.f2559b.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            com.facebook.imagepipeline.i.d dVar = (com.facebook.imagepipeline.i.d) arrayList.get(i);
            if (dVar != null) {
                dVar.close();
            }
        }
    }

    public synchronized boolean b(com.facebook.b.a.d dVar, com.facebook.imagepipeline.i.d dVar2) {
        com.facebook.common.d.i.a(dVar);
        com.facebook.common.d.i.a(dVar2);
        com.facebook.common.d.i.a(com.facebook.imagepipeline.i.d.e(dVar2));
        com.facebook.imagepipeline.i.d dVar3 = this.f2559b.get(dVar);
        if (dVar3 == null) {
            return false;
        }
        com.facebook.common.h.a<com.facebook.common.g.g> c2 = dVar3.c();
        com.facebook.common.h.a<com.facebook.common.g.g> c3 = dVar2.c();
        if (c2 != null && c3 != null && c2.a() == c3.a()) {
            this.f2559b.remove(dVar);
            com.facebook.common.h.a.c(c3);
            com.facebook.common.h.a.c(c2);
            com.facebook.imagepipeline.i.d.d(dVar3);
            c();
            return true;
        }
        com.facebook.common.h.a.c(c3);
        com.facebook.common.h.a.c(c2);
        com.facebook.imagepipeline.i.d.d(dVar3);
        return false;
    }

    public synchronized com.facebook.imagepipeline.i.d a(com.facebook.b.a.d dVar) {
        com.facebook.imagepipeline.i.d dVar2;
        com.facebook.common.d.i.a(dVar);
        com.facebook.imagepipeline.i.d dVar3 = this.f2559b.get(dVar);
        if (dVar3 != null) {
            synchronized (dVar3) {
                if (!com.facebook.imagepipeline.i.d.e(dVar3)) {
                    this.f2559b.remove(dVar);
                    com.facebook.common.e.a.b(f2558a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(dVar3)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                dVar2 = com.facebook.imagepipeline.i.d.a(dVar3);
            }
        } else {
            dVar2 = dVar3;
        }
        return dVar2;
    }

    public synchronized boolean b(com.facebook.b.a.d dVar) {
        com.facebook.common.d.i.a(dVar);
        if (!this.f2559b.containsKey(dVar)) {
            return false;
        }
        com.facebook.imagepipeline.i.d dVar2 = this.f2559b.get(dVar);
        synchronized (dVar2) {
            if (com.facebook.imagepipeline.i.d.e(dVar2)) {
                return true;
            }
            this.f2559b.remove(dVar);
            com.facebook.common.e.a.b(f2558a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(dVar2)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    private synchronized void c() {
        com.facebook.common.e.a.a(f2558a, "Count = %d", Integer.valueOf(this.f2559b.size()));
    }
}
