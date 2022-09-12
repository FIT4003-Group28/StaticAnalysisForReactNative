package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: avqz  reason: default package */
/* loaded from: classes3.dex */
public final class avqz {
    private final avop c;
    private final avol d;
    private final dehq e;
    private final avqf f;
    private final avrd g;
    private final avrg h;
    private final avzj i;
    private final avrh j;
    private final avfj l;
    @dzsi
    avqy a = null;
    @dzsi
    dehn<?> b = null;
    private final List<avqt> k = new ArrayList(1);

    public avqz(avop avopVar, dehq dehqVar, avqf avqfVar, avrd avrdVar, avrg avrgVar, avzj avzjVar, avol avolVar, avrh avrhVar, avfj avfjVar) {
        this.c = avopVar;
        this.e = dehqVar;
        this.f = avqfVar;
        this.g = avrdVar;
        this.h = avrgVar;
        this.i = avzjVar;
        this.d = avolVar;
        this.j = avrhVar;
        this.l = avfjVar;
    }

    @dzsi
    private final dltz f(final avrb avrbVar) {
        dlta dltaVar;
        try {
            btlu c = this.i.c(((avqr) avrbVar).b);
            try {
                avrd avrdVar = this.g;
                avkh avkhVar = ((avqr) avrbVar).a;
                dlsw dlswVar = ((avqr) avrbVar).b;
                int i = ((avqr) avrbVar).d;
                avol avolVar = this.d;
                avze j = avolVar.j();
                boolean z = avrdVar.a.i() && avrdVar.a.e();
                dlsx bZ = dlsy.m.bZ();
                boolean h = avrdVar.b.h(c);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlsy dlsyVar = (dlsy) bZ.b;
                dlsyVar.a |= 1;
                dlsyVar.b = h;
                boolean e = j.e();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlsy dlsyVar2 = (dlsy) bZ.b;
                dlsyVar2.a |= 2;
                dlsyVar2.c = e;
                dvfc a = avrdVar.c.a().a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlsy dlsyVar3 = (dlsy) bZ.b;
                a.getClass();
                dlsyVar3.d = a;
                int i2 = dlsyVar3.a | 4;
                dlsyVar3.a = i2;
                dlsyVar3.e = i - 1;
                int i3 = i2 | 8;
                dlsyVar3.a = i3;
                dlswVar.getClass();
                dlsyVar3.j = dlswVar;
                dlsyVar3.a = i3 | 512;
                int i4 = true != avrdVar.b.f() ? 3 : 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlsy dlsyVar4 = (dlsy) bZ.b;
                dlsyVar4.f = i4 - 1;
                int i5 = dlsyVar4.a | 16;
                dlsyVar4.a = i5;
                int i6 = i5 | 32;
                dlsyVar4.a = i6;
                dlsyVar4.g = z;
                dlsyVar4.a = i6 | 4096;
                dlsyVar4.l = false;
                String b = avkhVar.b();
                if (b != null) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dlsy dlsyVar5 = (dlsy) bZ.b;
                    b.getClass();
                    dlsyVar5.a |= 64;
                    dlsyVar5.h = b;
                }
                if (avrdVar.b.i()) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dlsy dlsyVar6 = (dlsy) bZ.b;
                    dlsyVar6.a |= 128;
                    dlsyVar6.i = true;
                }
                if (avkhVar.c()) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dlsy dlsyVar7 = (dlsy) bZ.b;
                    dlsyVar7.a |= 2048;
                    dlsyVar7.k = true;
                }
                try {
                    dltaVar = (dlta) dsqw.cq(dlta.d, avolVar.c.c(avolVar.b, bZ.bK().bS()));
                } catch (Exception e2) {
                    avolVar.a("prepareUpdate", e2);
                    dltaVar = dlta.d;
                }
                if (!avolVar.k()) {
                    avqf avqfVar = this.f;
                    dvfk dvfkVar = dltaVar.a;
                    if (dvfkVar == null) {
                        dvfkVar = dvfk.a;
                    }
                    avqr avqrVar = (avqr) avrbVar;
                    dehn<dvfo> a2 = avqfVar.a(dvfkVar, avqrVar.b, avqrVar.a.a());
                    avrg avrgVar = this.h;
                    avol avolVar2 = this.d;
                    avrh avrhVar = this.j;
                    avfj avfjVar = this.l;
                    avqu avquVar = new avqu(this);
                    avpr a3 = avrgVar.a.a();
                    avrg.a(a3, 1);
                    bvjj a4 = avrgVar.b.a();
                    avrg.a(a4, 2);
                    awar a5 = avrgVar.c.a();
                    avrg.a(a5, 3);
                    avop a6 = avrgVar.d.a();
                    avrg.a(a6, 4);
                    avrg.a(dltaVar, 5);
                    avrg.a(avolVar2, 6);
                    avrg.a(avrhVar, 7);
                    avrg.a(avfjVar, 8);
                    avrg.a(avquVar, 9);
                    final avqq avqqVar = new avqq(a2, new avrf(a3, a4, a5, a6, dltaVar, avolVar2, avrhVar, avfjVar, avquVar));
                    this.a = avqqVar;
                    avqqVar.a.Pk(new Runnable(this, avqqVar, avrbVar) { // from class: avqv
                        private final avqz a;
                        private final avqy b;
                        private final avrb c;

                        {
                            this.a = this;
                            this.b = avqqVar;
                            this.c = avrbVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b(this.b, this.c);
                        }
                    }, this.e);
                    dltz b2 = dltz.b(dltaVar.c);
                    return b2 == null ? dltz.AUTOMATIC : b2;
                }
                throw new avrc();
            } catch (avrc unused) {
                this.j.d(c());
                return null;
            }
        } catch (avzi unused2) {
            this.j.b(c());
            return null;
        }
    }

    private final boolean g(boolean z) {
        boolean z2;
        boolean z3;
        avqy avqyVar = this.a;
        if (avqyVar != null) {
            this.a = null;
            avqq avqqVar = (avqq) avqyVar;
            avqqVar.a.cancel(false);
            avrf avrfVar = avqqVar.b;
            dloh bZ = dloj.f.bZ();
            dltc dltcVar = avrfVar.a.b;
            if (dltcVar == null) {
                dltcVar = dltc.a;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dloj dlojVar = (dloj) bZ.b;
            dltcVar.getClass();
            dlojVar.b = dltcVar;
            dlojVar.a |= 1;
            dloj dlojVar2 = (dloj) bZ.b;
            dlojVar2.d = 6;
            dlojVar2.a |= 4;
            dloj bK = bZ.bK();
            if (z) {
                avrfVar.c.a(bK);
            } else {
                ((avfm) avrfVar.b).a(bK, avrfVar.d.a());
            }
            z2 = true;
        } else {
            z2 = false;
        }
        dehn<?> dehnVar = this.b;
        if (dehnVar != null) {
            this.b = null;
            dehnVar.cancel(false);
            if (!z) {
                this.j.b(c());
            }
            z3 = true;
        } else {
            z3 = false;
        }
        return z2 || z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[Catch: all -> 0x0049, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:12:0x001d, B:25:0x0036, B:15:0x0023, B:19:0x002b, B:22:0x0031), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b A[Catch: all -> 0x0049, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:12:0x001d, B:25:0x0036, B:15:0x0023, B:19:0x002b, B:22:0x0031), top: B:33:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(defpackage.avrb r3, boolean r4, defpackage.avqt r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List<avqt> r0 = r2.k     // Catch: java.lang.Throwable -> L49
            r0.add(r5)     // Catch: java.lang.Throwable -> L49
            r5 = 1
            boolean r0 = r2.g(r5)     // Catch: java.lang.Throwable -> L49
            dltz r3 = r2.f(r3)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L47
            avop r1 = r2.c     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L1a
            if (r0 == 0) goto L18
            goto L1a
        L18:
            r4 = 0
            goto L1b
        L1a:
            r4 = 1
        L1b:
            if (r4 == 0) goto L2b
            dltz r4 = defpackage.dltz.AUTOMATIC     // Catch: java.lang.Throwable -> L49
            if (r3 != r4) goto L23
            r5 = 4
            goto L36
        L23:
            dltz r4 = defpackage.dltz.DYNAMIC     // Catch: java.lang.Throwable -> L49
            if (r3 != r4) goto L29
            r5 = 6
            goto L36
        L29:
            r5 = 2
            goto L36
        L2b:
            dltz r4 = defpackage.dltz.AUTOMATIC     // Catch: java.lang.Throwable -> L49
            if (r3 != r4) goto L31
            r5 = 3
            goto L36
        L31:
            dltz r4 = defpackage.dltz.DYNAMIC     // Catch: java.lang.Throwable -> L49
            if (r3 != r4) goto L36
            r5 = 5
        L36:
            ckcw r3 = r1.a     // Catch: java.lang.Throwable -> L49
            ckgz r4 = defpackage.ckia.f     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L49
            ckco r3 = (defpackage.ckco) r3     // Catch: java.lang.Throwable -> L49
            int r5 = r5 + (-1)
            r3.a(r5)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r2)
            return
        L47:
            monitor-exit(r2)
            return
        L49:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avqz.a(avrb, boolean, avqt):void");
    }

    public final synchronized void b(avqy avqyVar, final avrb avrbVar) {
        avre a;
        if (this.a == avqyVar) {
            this.a = null;
            try {
                dvfo dvfoVar = (dvfo) deha.r(((avqq) avqyVar).a);
                avrf avrfVar = ((avqq) avqyVar).b;
                int i = ((avqr) avrbVar).c;
                dlos bZ = dlot.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlot dlotVar = (dlot) bZ.b;
                dvfoVar.getClass();
                dlotVar.c = dvfoVar;
                dlotVar.b = 1;
                dltc dltcVar = avrfVar.a.b;
                if (dltcVar == null) {
                    dltcVar = dltc.a;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlot dlotVar2 = (dlot) bZ.b;
                dltcVar.getClass();
                dlotVar2.d = dltcVar;
                dlotVar2.a |= 4;
                a = avrfVar.a(bZ.bK(), i, 0);
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (!(cause instanceof avqe)) {
                    bvqd.b(((avqq) avqyVar).a, this.e);
                    return;
                }
                avqe avqeVar = (avqe) cause;
                avrf avrfVar2 = ((avqq) avqyVar).b;
                int i2 = ((avqr) avrbVar).c;
                Integer num = avqeVar.a;
                dtyo bZ2 = dtyp.d.bZ();
                int intValue = num != null ? num.intValue() : 2;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ((dtyp) bZ2.b).a = intValue;
                for (Map.Entry<String, dspd> entry : avqeVar.b.entrySet()) {
                    dsoj bZ3 = dsok.c.bZ();
                    String key = entry.getKey();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    key.getClass();
                    ((dsok) bZ3.b).a = key;
                    dspd value = entry.getValue();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    value.getClass();
                    ((dsok) bZ3.b).b = value;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dtyp dtypVar = (dtyp) bZ2.b;
                    dsok bK = bZ3.bK();
                    bK.getClass();
                    dsrj<dsok> dsrjVar = dtypVar.c;
                    if (!dsrjVar.a()) {
                        dtypVar.c = dsqw.cl(dsrjVar);
                    }
                    dtypVar.c.add(bK);
                }
                int i3 = avqeVar.c;
                avqeVar.getMessage();
                dlos bZ4 = dlot.e.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dlot dlotVar3 = (dlot) bZ4.b;
                dtyp bK2 = bZ2.bK();
                bK2.getClass();
                dlotVar3.c = bK2;
                dlotVar3.b = 3;
                dltc dltcVar2 = avrfVar2.a.b;
                if (dltcVar2 == null) {
                    dltcVar2 = dltc.a;
                }
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dlot dlotVar4 = (dlot) bZ4.b;
                dltcVar2.getClass();
                dlotVar4.d = dltcVar2;
                dlotVar4.a |= 4;
                a = avrfVar2.a(bZ4.bK(), i2, avqeVar.c);
            }
            if (a != null) {
                avqs avqsVar = (avqs) a;
                final dehu d = this.e.d(avqw.a, ((avqs) a).a, TimeUnit.MILLISECONDS);
                this.b = d;
                d.Pk(new Runnable(this, d, avrbVar) { // from class: avqx
                    private final avqz a;
                    private final dehn b;
                    private final avrb c;

                    {
                        this.a = this;
                        this.b = d;
                        this.c = avrbVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d(this.b, this.c);
                    }
                }, this.e);
            }
        }
    }

    public final synchronized List<avqt> c() {
        dcdc r;
        r = dcdc.r(this.k);
        this.k.clear();
        return r;
    }

    public final synchronized void d(dehn<?> dehnVar, avrb avrbVar) {
        if (this.b == dehnVar) {
            this.b = null;
            f(avrbVar);
        }
    }

    public final synchronized void e() {
        g(false);
    }
}
