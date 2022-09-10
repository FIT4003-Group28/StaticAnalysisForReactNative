package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dts  reason: default package */
/* loaded from: classes6.dex */
public final class dts implements czw {
    public final dtm a;
    public final Object b = new Object();
    public dtm c;
    private final czkm<dtm> d;

    public dts(Application application, final bvjj bvjjVar, czkq czkqVar, final Executor executor) {
        final long c = bvoc.c(application);
        dtl bZ = dtm.g.bZ();
        dtd bZ2 = dte.w.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dte dteVar = (dte) bZ2.b;
        dteVar.a |= 1;
        dteVar.b = c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtm dtmVar = (dtm) bZ.b;
        dte bK = bZ2.bK();
        bK.getClass();
        dtmVar.b = bK;
        dtmVar.a |= 1;
        dtm bK2 = bZ.bK();
        this.a = bK2;
        this.c = bK2;
        czkn i = czko.i();
        czik a = czil.a(application);
        a.c("augmentedreality");
        a.d("ArSettings.pb");
        i.e(a.a());
        i.d(dtm.g);
        czkm<dtm> a2 = czkqVar.a(i.a());
        this.d = a2;
        a2.a(new defg(this, bvjjVar, c, executor) { // from class: dtn
            private final dts a;
            private final bvjj b;
            private final long c;
            private final Executor d;

            {
                this.a = this;
                this.b = bvjjVar;
                this.c = c;
                this.d = executor;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final dts dtsVar = this.a;
                final bvjj bvjjVar2 = this.b;
                final long j = this.c;
                Executor executor2 = this.d;
                czmk czmkVar = (czmk) obj;
                dbrn dbrnVar = new dbrn(dtsVar, bvjjVar2, j) { // from class: dtq
                    private final dts a;
                    private final bvjj b;
                    private final long c;

                    {
                        this.a = dtsVar;
                        this.b = bvjjVar2;
                        this.c = j;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
                        if ((r1.a & 1) == 0) goto L25;
                     */
                    @Override // defpackage.dbrn
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object a(java.lang.Object r9) {
                        /*
                            r8 = this;
                            dts r0 = r8.a
                            bvjj r1 = r8.b
                            long r2 = r8.c
                            dtm r9 = (defpackage.dtm) r9
                            bvjk r4 = defpackage.bvjk.it
                            boolean r4 = r1.i(r4)
                            r5 = 5
                            if (r4 == 0) goto L40
                            java.lang.Object r4 = r9.cu(r5)
                            dsqp r4 = (defpackage.dsqp) r4
                            r4.bC(r9)
                            dtl r4 = (defpackage.dtl) r4
                            bvjk r9 = defpackage.bvjk.it
                            dtm r6 = defpackage.dtm.g
                            r7 = 7
                            java.lang.Object r6 = r6.cu(r7)
                            dssr r6 = (defpackage.dssr) r6
                            dtm r7 = defpackage.dtm.g
                            dssj r9 = r1.L(r9, r6, r7)
                            dtm r9 = (defpackage.dtm) r9
                            r4.bC(r9)
                            dsqw r9 = r4.bK()
                            dtm r9 = (defpackage.dtm) r9
                            bvjk r4 = defpackage.bvjk.it
                            r1.P(r4)
                            r1.aq()
                        L40:
                            dte r1 = r9.b
                            if (r1 != 0) goto L46
                            dte r1 = defpackage.dte.w
                        L46:
                            long r6 = r1.b
                            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                            if (r1 != 0) goto L58
                            dte r1 = r9.b
                            if (r1 != 0) goto L52
                            dte r1 = defpackage.dte.w
                        L52:
                            int r1 = r1.a
                            r1 = r1 & 1
                            if (r1 != 0) goto La5
                        L58:
                            java.lang.Object r1 = r9.cu(r5)
                            dsqp r1 = (defpackage.dsqp) r1
                            r1.bC(r9)
                            dtl r1 = (defpackage.dtl) r1
                            dte r9 = defpackage.dte.w
                            dsqp r9 = r9.bZ()
                            dtd r9 = (defpackage.dtd) r9
                            boolean r4 = r9.c
                            r5 = 0
                            if (r4 == 0) goto L75
                            r9.bF()
                            r9.c = r5
                        L75:
                            MessageType extends dsqw<MessageType, BuilderType> r4 = r9.b
                            dte r4 = (defpackage.dte) r4
                            int r6 = r4.a
                            r6 = r6 | 1
                            r4.a = r6
                            r4.b = r2
                            boolean r2 = r1.c
                            if (r2 == 0) goto L8a
                            r1.bF()
                            r1.c = r5
                        L8a:
                            MessageType extends dsqw<MessageType, BuilderType> r2 = r1.b
                            dtm r2 = (defpackage.dtm) r2
                            dsqw r9 = r9.bK()
                            dte r9 = (defpackage.dte) r9
                            r9.getClass()
                            r2.b = r9
                            int r9 = r2.a
                            r9 = r9 | 1
                            r2.a = r9
                            dsqw r9 = r1.bK()
                            dtm r9 = (defpackage.dtm) r9
                        La5:
                            java.lang.Object r1 = r0.b
                            monitor-enter(r1)
                            r0.c = r9     // Catch: java.lang.Throwable -> Lac
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lac
                            return r9
                        Lac:
                            r9 = move-exception
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lac
                            throw r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtq.a(java.lang.Object):java.lang.Object");
                    }
                };
                czmkVar.a.e.a();
                return czmkVar.a(dazv.h(new defg(dbrnVar) { // from class: czmj
                    private final dbrn a;

                    {
                        this.a = dbrnVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        return deha.a(this.a.a(obj2));
                    }
                }), executor2);
            }
        });
        deha.q(a2.b(), new dtr(), dege.a);
    }

    @Override // defpackage.czw
    public final dtm a() {
        dtm dtmVar;
        synchronized (this.b) {
            dtmVar = this.c;
        }
        return dtmVar;
    }

    @Override // defpackage.czw
    public final dehn<dtm> b() {
        return this.d.b();
    }

    @Override // defpackage.czw
    public final dehn<Void> c(final dbrn<dtm, dtm> dbrnVar, Executor executor) {
        return this.d.c(new dbrn(this, dbrnVar) { // from class: dto
            private final dts a;
            private final dbrn b;

            {
                this.a = this;
                this.b = dbrnVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dtm dtmVar;
                dts dtsVar = this.a;
                dbrn dbrnVar2 = this.b;
                dtm dtmVar2 = (dtm) obj;
                synchronized (dtsVar.b) {
                    dtsVar.c = (dtm) dbrnVar2.a(dtmVar2);
                    dtmVar = dtsVar.c;
                }
                return dtmVar;
            }
        }, executor);
    }

    @Override // defpackage.czw
    public final dehn<Void> d() {
        return c(new dbrn(this) { // from class: dtp
            private final dts a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dtm dtmVar = (dtm) obj;
                return this.a.a;
            }
        }, dege.a);
    }
}
