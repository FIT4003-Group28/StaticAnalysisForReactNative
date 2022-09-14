package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.offline.paint.OfflinePerAccountPaintControllerImpl;
import com.google.android.apps.gmm.offline.routing.OfflineRoutingControllerImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aver  reason: default package */
/* loaded from: classes.dex */
public final class aver implements avsn {
    public final Executor a;
    public final dxio<avtn> b;
    public final dxio<avtj> c;
    public final Map<dluy, avyy> d;
    public final dxio<akfa> e;
    public final awfh f;
    public final ckcw g;
    private final Map<avze, awdd> h;
    private final Map<avze, awce> i;
    private final Map<avze, awbq> j;
    private final Map<avze, avel> k;
    private final Map<avze, avsa> l;
    private final avpn m;
    private final dxio<avom> n;
    private final dxio<avem> o;
    private final dxio<avry> p;
    private final dxio<avsb> q;
    private final bvkx r;
    private final avzj s;
    private final afec t;
    private final aves u;
    private final awdf v;

    public aver(Executor executor, awdf awdfVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, avpn avpnVar, aves avesVar, dxio dxioVar5, dxio dxioVar6, Map map, dxio dxioVar7, bvkx bvkxVar, awfh awfhVar, avzj avzjVar, afec afecVar, ckcw ckcwVar) {
        dchm dchmVar = new dchm();
        dchmVar.j();
        this.h = dchmVar.e();
        dchm dchmVar2 = new dchm();
        dchmVar2.j();
        this.i = dchmVar2.e();
        dchm dchmVar3 = new dchm();
        dchmVar3.j();
        this.j = dchmVar3.e();
        dchm dchmVar4 = new dchm();
        dchmVar4.j();
        this.k = dchmVar4.e();
        dchm dchmVar5 = new dchm();
        dchmVar5.j();
        this.l = dchmVar5.e();
        this.a = executor;
        this.p = dxioVar;
        this.v = awdfVar;
        this.b = dxioVar5;
        this.n = dxioVar2;
        this.o = dxioVar3;
        this.c = dxioVar4;
        this.m = avpnVar;
        this.u = avesVar;
        this.q = dxioVar6;
        this.d = map;
        this.e = dxioVar7;
        this.r = bvkxVar;
        this.f = awfhVar;
        this.s = avzjVar;
        this.t = afecVar;
        this.g = ckcwVar;
    }

    private final avsa g(avze avzeVar, final avzc avzcVar) {
        final avsa avsaVar;
        avry a = this.p.a();
        synchronized (this.l) {
            avsaVar = this.l.get(avzeVar);
            if (avsaVar == null) {
                avpn a2 = a.a.a();
                avry.a(a2, 1);
                avsb a3 = a.b.a();
                avry.a(a3, 2);
                Map<dluy, avyy> a4 = a.c.a();
                avry.a(a4, 3);
                dxio a5 = ((dxjh) a.d).a();
                avry.a(a5, 4);
                Executor a6 = a.e.a();
                avry.a(a6, 5);
                avzj a7 = a.f.a();
                avry.a(a7, 6);
                avry.a(avzeVar, 7);
                avsaVar = new avsa(a2, a3, a4, a5, a6, a7, avzeVar);
                this.l.put(avzeVar, avsaVar);
                final afec afecVar = this.t;
                this.r.k(new Runnable(this, avsaVar, avzcVar, afecVar) { // from class: avep
                    private final aver a;
                    private final avsa b;
                    private final avzc c;
                    private final afec d;

                    {
                        this.a = this;
                        this.b = avsaVar;
                        this.c = avzcVar;
                        this.d = afecVar;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:207:0x04f9 A[Catch: RuntimeException -> 0x058d, TRY_ENTER, TryCatch #9 {RuntimeException -> 0x058d, blocks: (B:3:0x000a, B:8:0x004c, B:11:0x0054, B:13:0x005a, B:15:0x00bd, B:16:0x00c2, B:18:0x00d6, B:20:0x00f1, B:22:0x00f8, B:24:0x0104, B:25:0x0109, B:27:0x0118, B:28:0x011e, B:29:0x0129, B:31:0x0134, B:48:0x0176, B:50:0x017d, B:52:0x018e, B:53:0x0192, B:55:0x0198, B:57:0x01aa, B:59:0x01bb, B:60:0x01c1, B:62:0x01dc, B:63:0x01e2, B:65:0x01fb, B:67:0x0205, B:69:0x0213, B:71:0x0219, B:72:0x021f, B:74:0x0237, B:76:0x023f, B:77:0x0245, B:79:0x025c, B:80:0x0262, B:82:0x027e, B:84:0x0288, B:86:0x0290, B:87:0x0296, B:89:0x02a9, B:117:0x0326, B:130:0x036b, B:133:0x0375, B:135:0x0383, B:137:0x0387, B:138:0x038d, B:140:0x03a1, B:142:0x03a9, B:143:0x03af, B:145:0x03c8, B:146:0x03ce, B:148:0x03e6, B:150:0x03ee, B:151:0x03f0, B:153:0x0402, B:155:0x0406, B:156:0x040c, B:157:0x0413, B:159:0x0419, B:161:0x041d, B:162:0x0423, B:163:0x042a, B:165:0x0435, B:167:0x0443, B:169:0x0447, B:170:0x044d, B:171:0x0463, B:173:0x046d, B:174:0x0473, B:176:0x0482, B:177:0x0488, B:120:0x0342, B:122:0x0358, B:101:0x02c7, B:103:0x02cb, B:104:0x02d1, B:105:0x02df, B:107:0x02e3, B:108:0x02e9, B:109:0x02f7, B:111:0x02fb, B:112:0x0301, B:113:0x030f, B:115:0x0313, B:116:0x0319, B:181:0x04a0, B:182:0x04a1, B:207:0x04f9, B:209:0x04fd, B:210:0x0503, B:211:0x0512, B:222:0x054a, B:228:0x0558, B:230:0x056d, B:231:0x0579, B:234:0x0580, B:214:0x051f, B:221:0x0545, B:185:0x04ac, B:188:0x04c4, B:201:0x04ed, B:33:0x013a, B:41:0x0164, B:47:0x0173, B:19:0x00db, B:6:0x0046, B:186:0x04be, B:190:0x04c8, B:192:0x04d4, B:195:0x04de, B:200:0x04e5, B:204:0x04f3, B:34:0x014a, B:35:0x014f, B:37:0x0155, B:39:0x015c, B:40:0x0160, B:46:0x016c, B:215:0x0521, B:217:0x0529, B:218:0x0538, B:121:0x0350, B:127:0x0360), top: B:253:0x000a }] */
                    /* JADX WARN: Removed duplicated region for block: B:213:0x051e  */
                    /* JADX WARN: Removed duplicated region for block: B:214:0x051f A[Catch: RuntimeException -> 0x058d, TRY_LEAVE, TryCatch #9 {RuntimeException -> 0x058d, blocks: (B:3:0x000a, B:8:0x004c, B:11:0x0054, B:13:0x005a, B:15:0x00bd, B:16:0x00c2, B:18:0x00d6, B:20:0x00f1, B:22:0x00f8, B:24:0x0104, B:25:0x0109, B:27:0x0118, B:28:0x011e, B:29:0x0129, B:31:0x0134, B:48:0x0176, B:50:0x017d, B:52:0x018e, B:53:0x0192, B:55:0x0198, B:57:0x01aa, B:59:0x01bb, B:60:0x01c1, B:62:0x01dc, B:63:0x01e2, B:65:0x01fb, B:67:0x0205, B:69:0x0213, B:71:0x0219, B:72:0x021f, B:74:0x0237, B:76:0x023f, B:77:0x0245, B:79:0x025c, B:80:0x0262, B:82:0x027e, B:84:0x0288, B:86:0x0290, B:87:0x0296, B:89:0x02a9, B:117:0x0326, B:130:0x036b, B:133:0x0375, B:135:0x0383, B:137:0x0387, B:138:0x038d, B:140:0x03a1, B:142:0x03a9, B:143:0x03af, B:145:0x03c8, B:146:0x03ce, B:148:0x03e6, B:150:0x03ee, B:151:0x03f0, B:153:0x0402, B:155:0x0406, B:156:0x040c, B:157:0x0413, B:159:0x0419, B:161:0x041d, B:162:0x0423, B:163:0x042a, B:165:0x0435, B:167:0x0443, B:169:0x0447, B:170:0x044d, B:171:0x0463, B:173:0x046d, B:174:0x0473, B:176:0x0482, B:177:0x0488, B:120:0x0342, B:122:0x0358, B:101:0x02c7, B:103:0x02cb, B:104:0x02d1, B:105:0x02df, B:107:0x02e3, B:108:0x02e9, B:109:0x02f7, B:111:0x02fb, B:112:0x0301, B:113:0x030f, B:115:0x0313, B:116:0x0319, B:181:0x04a0, B:182:0x04a1, B:207:0x04f9, B:209:0x04fd, B:210:0x0503, B:211:0x0512, B:222:0x054a, B:228:0x0558, B:230:0x056d, B:231:0x0579, B:234:0x0580, B:214:0x051f, B:221:0x0545, B:185:0x04ac, B:188:0x04c4, B:201:0x04ed, B:33:0x013a, B:41:0x0164, B:47:0x0173, B:19:0x00db, B:6:0x0046, B:186:0x04be, B:190:0x04c8, B:192:0x04d4, B:195:0x04de, B:200:0x04e5, B:204:0x04f3, B:34:0x014a, B:35:0x014f, B:37:0x0155, B:39:0x015c, B:40:0x0160, B:46:0x016c, B:215:0x0521, B:217:0x0529, B:218:0x0538, B:121:0x0350, B:127:0x0360), top: B:253:0x000a }] */
                    /* JADX WARN: Type inference failed for: r1v22 */
                    /* JADX WARN: Type inference failed for: r1v52 */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 1426
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.avep.run():void");
                    }
                }, this.a, bvkw.ON_STARTUP_FULLY_COMPLETE);
            }
        }
        return avsaVar;
    }

    @Override // defpackage.avsn
    public final awbq a(avze avzeVar, avzc avzcVar) {
        awbq awbqVar;
        synchronized (this.j) {
            awbqVar = this.j.get(avzeVar);
            if (awbqVar == null) {
                awbqVar = new OfflinePerAccountPaintControllerImpl(g(avzeVar, avzcVar));
                this.j.put(avzeVar, awbqVar);
                this.u.b();
            }
        }
        return awbqVar;
    }

    public final awdd b(avze avzeVar, avzc avzcVar) {
        awdd awddVar;
        synchronized (this.h) {
            awddVar = this.h.get(avzeVar);
            if (awddVar == null) {
                awdf awdfVar = this.v;
                avsa g = g(avzeVar, avzcVar);
                awdb a = awdfVar.a.a();
                awdf.a(a, 1);
                awdf.a(g, 2);
                awdg awdgVar = new awdg(a, g);
                this.h.put(avzeVar, awdgVar);
                awddVar = awdgVar;
            }
            this.u.b();
        }
        return awddVar;
    }

    public final awce c(avze avzeVar, avzc avzcVar) {
        awce awceVar;
        synchronized (this.i) {
            awceVar = this.i.get(avzeVar);
            if (awceVar == null) {
                awceVar = new OfflineRoutingControllerImpl(g(avzeVar, avzcVar));
                this.i.put(avzeVar, awceVar);
            }
            this.u.b();
        }
        return awceVar;
    }

    public final avel d(avze avzeVar, avzc avzcVar) {
        avem a = this.o.a();
        avom a2 = this.n.a();
        synchronized (this.k) {
            avel avelVar = this.k.get(avzeVar);
            if (avelVar != null) {
                return avelVar;
            }
            avsa g = g(avzeVar, avzcVar);
            avoj a3 = a2.a.a();
            avom.a(a3, 1);
            avop a4 = a2.b.a();
            avom.a(a4, 2);
            avpo a5 = a2.c.a();
            avom.a(a5, 3);
            avpn a6 = a2.d.a();
            avom.a(a6, 4);
            avom.a(a2.e.a(), 5);
            Context a7 = a2.f.a();
            avom.a(a7, 6);
            avom.a(g, 7);
            avol avolVar = new avol(a3, a4, a5, a6, a7, g);
            awfh a8 = a.a.a();
            avem.a(a8, 1);
            cqat a9 = a.b.a();
            avem.a(a9, 2);
            dxio a10 = ((dxjh) a.c).a();
            avem.a(a10, 3);
            dxio a11 = ((dxjh) a.d).a();
            avem.a(a11, 4);
            avpn a12 = a.e.a();
            avem.a(a12, 5);
            dxio a13 = ((dxjh) a.f).a();
            avem.a(a13, 6);
            dxio a14 = ((dxjh) a.g).a();
            avem.a(a14, 7);
            dehq a15 = a.h.a();
            avem.a(a15, 8);
            Executor a16 = a.i.a();
            avem.a(a16, 9);
            dehq a17 = a.j.a();
            avem.a(a17, 10);
            avhd a18 = a.k.a();
            avem.a(a18, 11);
            avpo a19 = a.l.a();
            avem.a(a19, 12);
            avzo a20 = a.m.a();
            avem.a(a20, 13);
            avzm a21 = a.n.a();
            avem.a(a21, 14);
            avzr a22 = a.o.a();
            avem.a(a22, 15);
            awhl a23 = a.p.a();
            avem.a(a23, 16);
            avpz a24 = a.q.a();
            avem.a(a24, 17);
            dxio a25 = ((dxjh) a.r).a();
            avem.a(a25, 18);
            avem.a(avolVar, 19);
            final avel avelVar2 = new avel(a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, avolVar);
            this.k.put(avzeVar, avelVar2);
            this.u.b();
            avelVar2.p = new crzp(avelVar2) { // from class: avdv
                private final avel a;

                {
                    this.a = avelVar2;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    final avel avelVar3 = this.a;
                    if (avelVar3.k()) {
                        return;
                    }
                    avelVar3.g.Pk(new Runnable(avelVar3) { // from class: avdw
                        private final avel a;

                        {
                            this.a = avelVar3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            dlrq b;
                            avfn a26 = this.a.e.a();
                            avbe avbeVar = a26.a;
                            avol avolVar2 = a26.c;
                            try {
                                b = (dlrq) dsqw.cq(dlrq.q, avolVar2.c.j(avolVar2.b));
                            } catch (Exception e) {
                                avolVar2.a("defaultDownloadConnectivityRequirementChanged", e);
                                b = avol.b();
                            }
                            avbeVar.a(b);
                        }
                    }, avelVar3.i);
                }
            };
            avelVar2.b.f.b(avelVar2.p, avelVar2.h);
            return avelVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        avpn avpnVar = this.m;
        ArrayList a = dchl.a();
        dlrk bZ = dlrl.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlrl dlrlVar = (dlrl) bZ.b;
        dlrlVar.a |= 1;
        dlrlVar.b = "notLoggedInAccount";
        a.add(bZ.bK());
        String e = avpnVar.e();
        if (e != null) {
            dlrk bZ2 = dlrl.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dlrl dlrlVar2 = (dlrl) bZ2.b;
            int i = dlrlVar2.a | 1;
            dlrlVar2.a = i;
            dlrlVar2.b = "notLoggedInAccount";
            e.getClass();
            dlrlVar2.a = i | 2;
            dlrlVar2.c = e;
            a.add(bZ2.bK());
        }
        f(a);
    }

    public final void f(Collection<dlrl> collection) {
        synchronized (this.l) {
            for (dlrl dlrlVar : collection) {
                if (this.q.a().c(dlrlVar.bS(), this.m.c().getPath(), Long.toString(this.s.a()))) {
                    for (avyy avyyVar : this.d.values()) {
                        avyyVar.d(dlrlVar);
                    }
                }
            }
        }
    }
}
