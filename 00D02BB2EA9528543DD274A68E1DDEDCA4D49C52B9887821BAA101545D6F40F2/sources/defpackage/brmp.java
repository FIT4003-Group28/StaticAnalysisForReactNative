package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: brmp  reason: default package */
/* loaded from: classes4.dex */
final class brmp {
    private final brmn a;
    private final dvsm b;
    private final akwr c;
    private final List<brod> d = new ArrayList();

    public brmp(brmn brmnVar, dvsm dvsmVar, akwr akwrVar) {
        this.a = brmnVar;
        this.b = dvsmVar;
        this.c = akwrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r0 == 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void c() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.List<brod> r0 = r4.d     // Catch: java.lang.Throwable -> L58
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L58
            r1 = 1
            r2 = 0
            if (r0 <= r1) goto L22
            dvsm r1 = r4.b     // Catch: java.lang.Throwable -> L58
            int r1 = r1.k()     // Catch: java.lang.Throwable -> L58
            int r0 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Throwable -> L58
            brmn r1 = r4.a     // Catch: java.lang.Throwable -> L58
            java.util.List<brod> r3 = r4.d     // Catch: java.lang.Throwable -> L58
            java.util.List r0 = r3.subList(r2, r0)     // Catch: java.lang.Throwable -> L58
            r1.a(r0)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r4)
            return
        L22:
            akwr r3 = r4.c     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3.j()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L3d
            if (r0 <= 0) goto L3d
            java.util.List<brod> r0 = r4.d     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L58
            brod r0 = (defpackage.brod) r0     // Catch: java.lang.Throwable -> L58
            ilo r0 = r0.a     // Catch: java.lang.Throwable -> L58
            boolean r0 = r0.n     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L3b
            goto L3f
        L3b:
            monitor-exit(r4)
            return
        L3d:
            if (r0 != r1) goto L56
        L3f:
            java.util.List<brod> r0 = r4.d     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L58
            brod r0 = (defpackage.brod) r0     // Catch: java.lang.Throwable -> L58
            ilo r0 = r0.a     // Catch: java.lang.Throwable -> L58
            boolean r0 = r0.l     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L56
            brmn r0 = r4.a     // Catch: java.lang.Throwable -> L58
            java.util.List<brod> r1 = r4.d     // Catch: java.lang.Throwable -> L58
            r0.a(r1)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r4)
            return
        L56:
            monitor-exit(r4)
            return
        L58:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brmp.c():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        this.d.clear();
        brmn brmnVar = this.a;
        if (!brmnVar.c.isEmpty()) {
            if (brmnVar.b()) {
                brmnVar.d();
            }
            if (brmnVar.c() && brmnVar.a.d() != 2) {
                brmnVar.b.a().Q("search-results-injection-layer");
            }
            brmnVar.c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(List<brod> list) {
        brod brodVar;
        List<brod> list2 = this.d;
        if (list2.size() == list.size()) {
            for (int i = 0; i < list2.size(); i++) {
                brod brodVar2 = list2.get(i);
                brod brodVar3 = list.get(i);
                if (brodVar2 == null) {
                    if (brodVar3 == null) {
                    }
                } else if (brodVar2.a.cr(brodVar3.a)) {
                }
            }
            return;
        }
        a();
        HashMap hashMap = new HashMap();
        for (brod brodVar4 : list) {
            if (brodVar4 != null) {
                Long valueOf = Long.valueOf(brodVar4.d().c);
                if (!hashMap.containsKey(valueOf) || brodVar4.f()) {
                    hashMap.put(valueOf, brodVar4);
                }
            }
        }
        for (brod brodVar5 : list) {
            if (brodVar5 != null && (brodVar = (brod) hashMap.remove(Long.valueOf(brodVar5.d().c))) != null) {
                this.d.add(brodVar);
            }
        }
        c();
    }
}
