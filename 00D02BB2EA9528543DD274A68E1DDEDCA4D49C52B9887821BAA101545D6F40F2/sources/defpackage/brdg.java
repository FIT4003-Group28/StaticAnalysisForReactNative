package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: brdg  reason: default package */
/* loaded from: classes4.dex */
public final class brdg implements brda {
    public final Executor a;
    deig<dilm> b = null;
    public final jzn c;
    public final cqat d;
    public final bvjj e;
    public final butp f;

    public brdg(butp butpVar, Executor executor, jzn jznVar, cqat cqatVar, bvjj bvjjVar) {
        this.f = butpVar;
        this.a = executor;
        this.c = jznVar;
        this.d = cqatVar;
        this.e = bvjjVar;
    }

    @Override // defpackage.brda
    public final dehn<brde> a() {
        return deha.o(deew.h(b(), new dbrn() { // from class: brdb
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dccx dccxVar = new dccx();
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                for (dhwy dhwyVar : ((dilm) obj).a) {
                    dhwx dhwxVar = dhwyVar.a;
                    if (dhwxVar == null) {
                        dhwxVar = dhwx.b;
                    }
                    int i = dhwxVar.a;
                    dccxVar.g(Integer.valueOf(i));
                    sparseArray.put(i, dhwyVar.b);
                    sparseArray2.put(i, dhwyVar.c);
                }
                return new brde(sparseArray, sparseArray2, dccxVar.f());
            }
        }, this.a));
    }

    public final dehn<dilm> b() {
        dilm dilmVar;
        long b = this.d.b();
        long w = this.e.w(bvjk.jW, 0L);
        dilm dilmVar2 = null;
        if (w > 0 && b >= w && b <= TimeUnit.HOURS.toMillis(24L) + w && (dilmVar = (dilm) this.e.L(bvjk.jX, (dssr) dilm.b.cu(7), null)) != null) {
            TimeUnit.MILLISECONDS.toMinutes((w + TimeUnit.HOURS.toMillis(24L)) - b);
            dilmVar2 = dilmVar;
        }
        if (dilmVar2 != null) {
            return deha.a(dilmVar2);
        }
        deig<dilm> deigVar = this.b;
        if (deigVar != null && !deigVar.isDone()) {
            return this.b;
        }
        this.b = deig.d();
        this.a.execute(new Runnable(this) { // from class: brdc
            private final brdg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int[] b2;
                brdg brdgVar = this.a;
                deig<dilm> deigVar2 = brdgVar.b;
                dbsk.s(deigVar2);
                bvrj.UI_THREAD.d();
                final deig d = deig.d();
                ArrayList arrayList = new ArrayList();
                for (int i : brdgVar.c.b()) {
                    dili bZ = dilj.c.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dilj diljVar = (dilj) bZ.b;
                    diljVar.a |= 1;
                    diljVar.b = i;
                    arrayList.add(bZ.bK());
                }
                butp butpVar = brdgVar.f;
                dilh bZ2 = dilk.b.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dilk dilkVar = (dilk) bZ2.b;
                dsrj<dilj> dsrjVar = dilkVar.a;
                if (!dsrjVar.a()) {
                    dilkVar.a = dsqw.cl(dsrjVar);
                }
                dsod.bv(arrayList, dilkVar.a);
                final btzc b3 = butpVar.b(bZ2.bK(), new brdf(brdgVar, d), brdgVar.a);
                d.Pk(new Runnable(d, b3) { // from class: brdd
                    private final deig a;
                    private final btzc b;

                    {
                        this.a = d;
                        this.b = b3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        deig deigVar3 = this.a;
                        btzc btzcVar = this.b;
                        if (deigVar3.isCancelled()) {
                            btzcVar.a();
                        }
                    }
                }, brdgVar.a);
                deigVar2.p(d);
            }
        });
        return this.b;
    }
}
