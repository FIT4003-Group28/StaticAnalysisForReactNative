package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lkj  reason: default package */
/* loaded from: classes7.dex */
public final class lkj implements atdc {
    final /* synthetic */ lkr a;

    public lkj(lkr lkrVar) {
        this.a = lkrVar;
    }

    @Override // defpackage.atdc
    public final void a(atlq atlqVar) {
        this.a.k(atlqVar);
        this.a.j(atlqVar);
        lkr lkrVar = this.a;
        lkrVar.v = atlqVar;
        crqf crqfVar = atlqVar.m;
        llb llbVar = lkrVar.q;
        if (llbVar != null && crqfVar != null) {
            llbVar.a(crqfVar.g().a);
        }
        kzd kzdVar = this.a.m;
        if (true != atlqVar.b()) {
            atlqVar = null;
        }
        kzdVar.b(atlqVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
        if (r9.m == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
        if (r8.j != false) goto L27;
     */
    @Override // defpackage.atdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.atlq r8, @defpackage.dzsi defpackage.atlq r9) {
        /*
            r7 = this;
            bvrj r0 = defpackage.bvrj.UI_THREAD
            r0.c()
            lkr r0 = r7.a
            liy r0 = r0.t
            r0.Oc(r8, r9)
            lkr r0 = r7.a
            r0.k(r8)
            lkr r0 = r7.a
            r0.j(r8)
            lkr r0 = r7.a
            r0.v = r8
            kzd r0 = r0.m
            if (r8 == 0) goto L26
            boolean r1 = r8.b()
            if (r1 != 0) goto L26
            r1 = 0
            goto L27
        L26:
            r1 = r8
        L27:
            r0.b(r1)
            lkr r0 = r7.a
            amte r1 = r8.r
            r2 = 0
            if (r1 != 0) goto L32
            goto L95
        L32:
            amvh[] r3 = r1.c
            dcdc<ldm> r4 = r0.n
            int r4 = r4.size()
            int r5 = r3.length
            int r5 = r5 + (-1)
            if (r4 != r5) goto L63
            r4 = 0
        L40:
            dcdc<ldm> r5 = r0.n
            int r5 = r5.size()
            if (r4 >= r5) goto L95
            int r5 = r4 + 1
            dcdc<ldm> r6 = r0.n
            java.lang.Object r4 = r6.get(r4)
            ldm r4 = (defpackage.ldm) r4
            amvh r4 = r4.h
            akqi r4 = r4.d
            r6 = r3[r5]
            akqi r6 = r6.d
            boolean r4 = defpackage.dbsd.a(r4, r6)
            if (r4 != 0) goto L61
            goto L63
        L61:
            r4 = r5
            goto L40
        L63:
            cqkj r3 = r0.d
            android.content.Context r3 = r3.d
            android.content.res.Resources r3 = r3.getResources()
            dcdc r3 = defpackage.ldm.i(r1, r3)
            r0.n = r3
            ksr r3 = r0.p
            dcdc<ldm> r4 = r0.n
            java.lang.Object r4 = r4.get(r2)
            ldm r4 = (defpackage.ldm) r4
            ahjq r5 = r0.b
            com.google.android.apps.gmm.map.model.location.GmmLocation r5 = r5.a()
            r3.f(r4, r5, r1)
            crqf r1 = r8.m
            llb r0 = r0.q
            if (r0 == 0) goto L95
            if (r1 == 0) goto L95
            cray r1 = r1.g()
            amub r1 = r1.a
            r0.a(r1)
        L95:
            crqf r8 = r8.m
            r0 = 1
            if (r8 != 0) goto La2
            if (r9 == 0) goto La0
            crqf r8 = r9.m
            if (r8 == 0) goto Lb1
        La0:
            r2 = 1
            goto Lb1
        La2:
            boolean r8 = r8.j
            if (r8 == 0) goto Lbf
            if (r9 == 0) goto La0
            crqf r8 = r9.m
            if (r8 == 0) goto La0
            boolean r8 = r8.j
            if (r8 != 0) goto Lb1
            goto La0
        Lb1:
            if (r2 == 0) goto Lbf
            lkr r8 = r7.a
            java.util.concurrent.Executor r8 = r8.a
            lki r9 = new lki
            r9.<init>(r7)
            r8.execute(r9)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkj.b(atlq, atlq):void");
    }
}
