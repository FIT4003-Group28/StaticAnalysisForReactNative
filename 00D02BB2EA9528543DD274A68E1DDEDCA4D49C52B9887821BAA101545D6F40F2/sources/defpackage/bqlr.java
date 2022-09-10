package defpackage;

import android.app.Application;
import android.widget.Toast;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqlr  reason: default package */
/* loaded from: classes4.dex */
public final class bqlr implements bvbb {
    public final Application a;
    public final bvjj b;
    public final chhs c;
    private final bvrb d;
    private final Executor e;

    public bqlr(Application application, bvjj bvjjVar, bvrb bvrbVar, Executor executor, chht chhtVar) {
        this.a = application;
        this.b = bvjjVar;
        this.d = bvrbVar;
        this.e = executor;
        this.c = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
    }

    private final Runnable e() {
        return new Runnable(this) { // from class: bqln
            private final bqlr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bqlr bqlrVar = this.a;
                Toast.makeText(bqlrVar.a, bqlrVar.d(), 1).show();
            }
        };
    }

    private final Runnable f(final dvqj dvqjVar, final btzi<dvqj, dvqr> btziVar) {
        return new Runnable(this, dvqjVar, btziVar) { // from class: bqlo
            private final bqlr a;
            private final dvqj b;
            private final btzi c;

            {
                this.a = this;
                this.b = dvqjVar;
                this.c = btziVar;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [dvqj, I] */
            @Override // java.lang.Runnable
            public final void run() {
                bqlr bqlrVar = this.a;
                ?? r1 = this.b;
                btzi btziVar2 = this.c;
                btzw btzwVar = new btzw(null);
                btzq a = btzr.a();
                a.a = r1;
                btzq.b(1);
                a.e = btzwVar;
                btzr a2 = a.a();
                djgl a3 = bqlrVar.c.a();
                dsqp dsqpVar = (dsqp) a3.cu(5);
                dsqpVar.bC(a3);
                djgl bK = ((djgk) dsqpVar).bK();
                dvqk bZ = dvqr.g.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvqr dvqrVar = (dvqr) bZ.b;
                dvqrVar.b = 0;
                dvqrVar.a |= 1;
                docg docgVar = docg.M;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvqr dvqrVar2 = (dvqr) bZ.b;
                docgVar.getClass();
                dvqrVar2.c = docgVar;
                int i = dvqrVar2.a | 4;
                dvqrVar2.a = i;
                bK.getClass();
                dvqrVar2.d = bK;
                dvqrVar2.a = i | 16;
                if (bqlrVar.b.m(bvjk.fX, false)) {
                    int i2 = 0;
                    while (true) {
                        dvqg dvqgVar = r1.h;
                        if (dvqgVar == null) {
                            dvqgVar = dvqg.d;
                        }
                        if (i2 >= dvqgVar.b) {
                            break;
                        }
                        dvql bZ2 = dvqm.c.bZ();
                        StringBuilder sb = new StringBuilder(28);
                        sb.append("fakeUgcsContentId");
                        sb.append(i2);
                        String sb2 = sb.toString();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dvqm dvqmVar = (dvqm) bZ2.b;
                        sb2.getClass();
                        dvqmVar.a |= 1;
                        dvqmVar.b = sb2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dvqr dvqrVar3 = (dvqr) bZ.b;
                        dvqm bK2 = bZ2.bK();
                        bK2.getClass();
                        dsrj<dvqm> dsrjVar = dvqrVar3.e;
                        if (!dsrjVar.a()) {
                            dvqrVar3.e = dsqw.cl(dsrjVar);
                        }
                        dvqrVar3.e.add(bK2);
                        i2++;
                    }
                }
                btziVar2.QZ(a2, bZ.bK());
            }
        };
    }

    @Override // defpackage.btzp
    public final /* bridge */ /* synthetic */ btzc a(dvqj dvqjVar, btzi<dvqj, dvqr> btziVar, bvrj bvrjVar) {
        this.d.b(e(), bvrj.UI_THREAD);
        this.d.a(f(dvqjVar, btziVar), bvrjVar, 3000L);
        return new bqlp();
    }

    @Override // defpackage.btzp
    public final /* bridge */ /* synthetic */ btzc b(dvqj dvqjVar, btzi<dvqj, dvqr> btziVar, Executor executor) {
        this.e.execute(e());
        executor.execute(f(dvqjVar, btziVar));
        return new bqlq();
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dvqj, dvqr>> c(dvqj dvqjVar) {
        throw null;
    }

    public final String d() {
        return this.a.getString(bqio.FAKE_REVIEW_NOT_UPLOADED_TEXT);
    }
}
