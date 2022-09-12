package defpackage;

import android.app.Application;
import defpackage.aikz;
import defpackage.dssj;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aihb  reason: default package */
/* loaded from: classes2.dex */
public final class aihb<M extends dssj, T extends aikz> {
    public static final dcqe a = dcqe.c("aihb");
    public static final eaow b = eaow.a(30);
    public final dxio<akfa> c;
    public final dxio<cqat> d;
    public final dssr<M> e;
    private final bwrg<ailt> f;

    public aihb(Application application, Executor executor, dxio<cqat> dxioVar, dxio<akfa> dxioVar2, String str, dssr<M> dssrVar) {
        this.d = dxioVar;
        this.c = dxioVar2;
        this.e = dssrVar;
        this.f = new bwrg<>((dssr) ailt.d.cu(7), application, bwre.PERSISTENT_FILE, str, executor);
    }

    public static String a(String str) {
        return String.format("ls_%s_cache.pb", dbqg.UPPER_CAMEL.b(dbqg.b, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(final dbsz<dcdn<dbsg<btlu>, M>> dbszVar) {
        this.f.h(new dbsz(this, dbszVar) { // from class: aiha
            private final aihb a;
            private final dbsz b;

            {
                this.a = this;
                this.b = dbszVar;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                aihb aihbVar = this.a;
                dbsz dbszVar2 = this.b;
                ailt ailtVar = (ailt) obj;
                bvrj.BACKGROUND_THREADPOOL.c();
                dcdg p = dcdn.p();
                if (ailtVar == null) {
                    dbszVar2.NU(p.b());
                } else if (!new eapd(ailtVar.b).e(aihb.b).J(aihbVar.d.a().b())) {
                    for (ailx ailxVar : ailtVar.c) {
                        if (!new eapd(ailxVar.b).e(aihb.b).J(aihbVar.d.a().b())) {
                            Object obj2 = dbpy.a;
                            if ((ailxVar.a & 2) != 0) {
                                btlu n = aihbVar.c.a().n(ailxVar.c);
                                if (n != null) {
                                    obj2 = dbsg.i(n);
                                } else {
                                    String str = ailxVar.c;
                                }
                            }
                            try {
                                try {
                                    p.f(obj2, (dssj) aihbVar.e.l(ailxVar.d));
                                } catch (IllegalArgumentException e) {
                                    bvoo.f(e);
                                }
                            } catch (dsrm unused) {
                                bvoo.h("Failed to parse model state", new Object[0]);
                            }
                        }
                    }
                    dbszVar2.NU(p.b());
                } else {
                    dbszVar2.NU(p.b());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(dcdn<dbsg<String>, M> dcdnVar) {
        ails bZ = ailt.d.bZ();
        dcpd<dbsg<String>> it = dcdnVar.keySet().iterator();
        while (it.hasNext()) {
            dbsg<String> next = it.next();
            ailw bZ2 = ailx.e.bZ();
            long b2 = this.d.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ailx ailxVar = (ailx) bZ2.b;
            ailxVar.a |= 1;
            ailxVar.b = b2;
            if (next.a()) {
                String b3 = next.b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ailx ailxVar2 = (ailx) bZ2.b;
                b3.getClass();
                ailxVar2.a |= 2;
                ailxVar2.c = b3;
            }
            M m = dcdnVar.get(next);
            dbsk.s(m);
            dspd bR = m.bR();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ailx ailxVar3 = (ailx) bZ2.b;
            bR.getClass();
            ailxVar3.a |= 4;
            ailxVar3.d = bR;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ailt ailtVar = (ailt) bZ.b;
            ailx bK = bZ2.bK();
            bK.getClass();
            dsrj<ailx> dsrjVar = ailtVar.c;
            if (!dsrjVar.a()) {
                ailtVar.c = dsqw.cl(dsrjVar);
            }
            ailtVar.c.add(bK);
        }
        long b4 = this.d.a().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ailt ailtVar2 = (ailt) bZ.b;
        ailtVar2.a |= 1;
        ailtVar2.b = b4;
        this.f.e(bZ.bK());
    }
}
