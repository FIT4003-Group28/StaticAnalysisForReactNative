package defpackage;

import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: byrt  reason: default package */
/* loaded from: classes4.dex */
public final class byrt implements irw {
    public static final dcqe a = dcqe.c("byrt");
    public final dxio<byqh> b;
    public final ckcw c;
    public final ahth d;
    public final cqat e;
    public final bvjj f;
    public final isa g;
    private final dehp h;

    public byrt(dxio<byqh> dxioVar, ckcw ckcwVar, ahth ahthVar, cqat cqatVar, bvjj bvjjVar, isa isaVar, dehp dehpVar) {
        this.b = dxioVar;
        this.c = ckcwVar;
        this.d = ahthVar;
        this.e = cqatVar;
        this.f = bvjjVar;
        this.g = isaVar;
        this.h = dehpVar;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.c.f(ckhc.COMMUTE_NOTIFICIATION_PROBER_SERVICE);
            dehn<bbx> c = this.h.c(new Callable(this, workerParameters) { // from class: byrp
                private final byrt a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final byrt byrtVar = this.a;
                    WorkerParameters workerParameters2 = this.b;
                    try {
                        dbsg r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: byrs
                            private final String a = "CommuteNotificationProberScheduler";

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return this.a.equals((String) obj);
                            }
                        });
                        if (!r.a()) {
                            return bbx.c();
                        }
                        r.b();
                        bbp bbpVar = workerParameters2.b;
                        if (bbpVar == null) {
                            bvoo.h("CommuteNotificationProberScheduler invoked without input data", new Object[0]);
                            return bbx.c();
                        }
                        try {
                            final dlfb dlfbVar = (dlfb) dsqw.cr(dlfb.h, bbpVar.a("proto"), dsqa.b());
                            int i = dlfbVar.a;
                            if ((i & 1) != 0 && (i & 4) != 0 && (i & 2) != 0) {
                                dlex dlexVar = dlfbVar.c;
                                if (dlexVar == null) {
                                    dlexVar = dlex.e;
                                }
                                if ((dlexVar.a & 1) != 0) {
                                    dlex dlexVar2 = dlfbVar.c;
                                    if (dlexVar2 == null) {
                                        dlexVar2 = dlex.e;
                                    }
                                    if ((dlexVar2.a & 2) != 0) {
                                        dlex dlexVar3 = dlfbVar.c;
                                        if (dlexVar3 == null) {
                                            dlexVar3 = dlex.e;
                                        }
                                        if ((dlexVar3.a & 4) != 0) {
                                            final String str = dlfbVar.b;
                                            if (byrtVar.b().contains(str)) {
                                                byrtVar.c(6);
                                                return bbx.a();
                                            } else if (byrtVar.e.b() >= dlfbVar.d) {
                                                byrtVar.c(3);
                                                return bbx.a();
                                            } else {
                                                final String str2 = (dlfbVar.a & 8) != 0 ? dlfbVar.e : null;
                                                bbx a2 = byrw.a(byrtVar.d, 30L, true, 30L, new byrv(byrtVar, dlfbVar, str, str2) { // from class: byrr
                                                    private final byrt a;
                                                    private final dlfb b;
                                                    private final String c;
                                                    private final String d;

                                                    {
                                                        this.a = byrtVar;
                                                        this.b = dlfbVar;
                                                        this.c = str;
                                                        this.d = str2;
                                                    }

                                                    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
                                                        if (r11.E(r5) > r1.c) goto L18;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
                                                        if (r11.E(r5) <= r1.c) goto L18;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
                                                        r0.c(1);
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
                                                        return r0.b.a().c(r2, r3);
                                                     */
                                                    @Override // defpackage.byrv
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                        To view partially-correct add '--show-bad-code' argument
                                                    */
                                                    public final defpackage.dehn a(com.google.android.apps.gmm.map.model.location.GmmLocation r11) {
                                                        /*
                                                            r10 = this;
                                                            byrt r0 = r10.a
                                                            dlfb r1 = r10.b
                                                            java.lang.String r2 = r10.c
                                                            java.lang.String r3 = r10.d
                                                            dlex r1 = r1.c
                                                            if (r1 != 0) goto Le
                                                            dlex r1 = defpackage.dlex.e
                                                        Le:
                                                            r4 = 2
                                                            if (r11 != 0) goto L12
                                                            goto L5a
                                                        L12:
                                                            dhjz r5 = r1.b
                                                            if (r5 != 0) goto L18
                                                            dhjz r5 = defpackage.dhjz.e
                                                        L18:
                                                            double r6 = r5.c
                                                            double r8 = r5.b
                                                            akra r5 = defpackage.akra.e(r6, r8)
                                                            int r6 = r1.d
                                                            int r6 = defpackage.dlew.a(r6)
                                                            r7 = 1
                                                            if (r6 != 0) goto L2a
                                                            r6 = 1
                                                        L2a:
                                                            int r6 = r6 + (-1)
                                                            if (r6 == r7) goto L3f
                                                            if (r6 == r4) goto L33
                                                            int r11 = r1.d
                                                            goto L5a
                                                        L33:
                                                            float r11 = r11.E(r5)
                                                            int r1 = r1.c
                                                            float r1 = (float) r1
                                                            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                                                            if (r11 <= 0) goto L5a
                                                            goto L4a
                                                        L3f:
                                                            float r11 = r11.E(r5)
                                                            int r1 = r1.c
                                                            float r1 = (float) r1
                                                            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                                                            if (r11 > 0) goto L5a
                                                        L4a:
                                                            r0.c(r7)
                                                            dxio<byqh> r11 = r0.b
                                                            java.lang.Object r11 = r11.a()
                                                            byqh r11 = (defpackage.byqh) r11
                                                            dehn r11 = r11.c(r2, r3)
                                                            goto L63
                                                        L5a:
                                                            r0.c(r4)
                                                            byqf r11 = defpackage.byqf.SUCCESS
                                                            dehn r11 = defpackage.deha.a(r11)
                                                        L63:
                                                            return r11
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.byrr.a(com.google.android.apps.gmm.map.model.location.GmmLocation):dehn");
                                                    }
                                                }, null);
                                                if (!a2.equals(bbx.b())) {
                                                    dcba a3 = dcba.a(20);
                                                    a3.addAll(byrtVar.b());
                                                    a3.add(str);
                                                    byrtVar.f.ah(bvjk.cq, dchl.c(a3));
                                                }
                                                return a2;
                                            }
                                        }
                                    }
                                }
                            }
                            byrtVar.c(5);
                            return bbx.c();
                        } catch (dsrm e) {
                            bvoo.h("Unable to parse CommuteNotificationProberClientData %s", e);
                            byrtVar.c(4);
                            return bbx.c();
                        }
                    } catch (RuntimeException e2) {
                        byrtVar.g.b(4, e2);
                        return bbx.c();
                    }
                }
            });
            c.Pk(new Runnable(this) { // from class: byrq
                private final byrt a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.g(ckhc.COMMUTE_NOTIFICIATION_PROBER_SERVICE);
                }
            }, this.h);
            return c;
        } catch (RuntimeException e) {
            this.g.b(4, e);
            return deha.a(bbx.c());
        }
    }

    public final List<String> b() {
        return this.f.F(bvjk.cq, dcdc.e());
    }

    public final void c(int i) {
        ((ckco) this.c.a(ckht.aK)).a(i - 1);
    }
}
