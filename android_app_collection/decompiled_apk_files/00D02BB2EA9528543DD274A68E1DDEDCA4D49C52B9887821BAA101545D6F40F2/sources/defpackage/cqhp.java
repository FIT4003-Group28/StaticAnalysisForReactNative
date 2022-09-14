package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cqhp  reason: default package */
/* loaded from: classes.dex */
public final class cqhp {
    @dzsi
    cqjb<?, ?> b;
    int e;
    int h;
    int i;
    cqmj<? extends cqkp> k;
    final cqhq a = new cqhq();
    final cqhq c = new cqhq();
    final List<cqnm<?>> d = dchl.a();
    cqnf<?> f = null;
    @dzsi
    Integer g = null;
    @dzsi
    cqnj<?> j = null;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r5 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(defpackage.cqnf<?> r4, boolean r5) {
        /*
            r3 = this;
            cqku r0 = r4.b()
            cqhq r1 = r3.a
            boolean r1 = r1.c(r0)
            if (r1 != 0) goto L14
            if (r5 == 0) goto L19
            cqhq r5 = r3.c
            r5.c(r0)
            goto L16
        L14:
            if (r5 == 0) goto L19
        L16:
            cqhq r5 = r3.c
            goto L1b
        L19:
            cqhq r5 = r3.a
        L1b:
            java.util.List<cqnf<?>> r0 = r5.a
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            aim<cqku, java.lang.Integer> r1 = r5.b
            cqku r2 = r4.b()
            r1.put(r2, r0)
            boolean r0 = r4.c()
            if (r0 == 0) goto L3b
            int r0 = r5.d
            int r0 = r0 + 1
            r5.d = r0
            goto L41
        L3b:
            int r0 = r5.e
            int r0 = r0 + 1
            r5.e = r0
        L41:
            java.util.List<cqnf<?>> r5 = r5.a
            r5.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqhp.d(cqnf, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(cqmp<?>[] cqmpVarArr, boolean z) {
        for (cqmp<?> cqmpVar : cqmpVarArr) {
            if (cqmpVar != null && cqmpVar != cqmp.e) {
                if (cqmpVar instanceof cqnm) {
                    if (!z) {
                        this.d.add((cqnm) cqmpVar);
                    } else {
                        String valueOf = String.valueOf(cqmpVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                        sb.append("Can't handle view node in child layout: ");
                        sb.append(valueOf);
                        throw new RuntimeException(sb.toString());
                    }
                } else if (cqmpVar instanceof cqmv) {
                    this.i = ((cqmv) cqmpVar).a;
                } else if (cqmpVar instanceof cqmu) {
                    this.h = ((cqmu) cqmpVar).a;
                } else if (cqmpVar instanceof cqnk) {
                    this.g = Integer.valueOf(((cqnk) cqmpVar).a);
                } else if (cqmpVar instanceof cqnl) {
                    cqnl cqnlVar = (cqnl) cqmpVar;
                } else if (cqmpVar instanceof cqnj) {
                    cqnj<?> cqnjVar = (cqnj) cqmpVar;
                    if (!cqnjVar.b) {
                        this.j = cqnjVar;
                        cqnf<?> cqnfVar = cqnjVar.d;
                        if (cqnfVar != null) {
                            d(cqnfVar, z);
                        }
                    }
                } else if (cqmpVar instanceof cqnf) {
                    cqnf<?> cqnfVar2 = (cqnf) cqmpVar;
                    if (cqnfVar2.b() == cqfe.ID) {
                        this.f = cqnfVar2;
                        d(cqnfVar2, z);
                    } else {
                        d(cqnfVar2, z);
                    }
                } else if (cqmpVar instanceof cqmn) {
                    b(((cqmn) cqmpVar).a, z);
                } else {
                    String valueOf2 = String.valueOf(cqmpVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                    sb2.append("Can't handle node: ");
                    sb2.append(valueOf2);
                    throw new RuntimeException(sb2.toString());
                }
            }
        }
    }

    public final cqjg c() {
        return this.k.c();
    }
}
