package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: arzo  reason: default package */
/* loaded from: classes2.dex */
public final class arzo<T> extends btrh<T> {
    private final int d;

    public arzo(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            final arzl arzlVar = (arzl) this.a;
            final crhp crhpVar = (crhp) obj;
            if (!crhpVar.b()) {
                arzn arznVar = arzlVar.a;
                arznVar.b.o = -1;
                arzg arzgVar = arznVar.c;
                arzgVar.g = null;
                arzgVar.f = null;
                arzgVar.b.b();
            }
            if (!arzlVar.a.e.T()) {
                arzlVar.a(crhpVar);
            } else {
                arzlVar.a.d.execute(new Runnable(arzlVar, crhpVar) { // from class: arzk
                    private final arzl a;
                    private final crhp b;

                    {
                        this.a = arzlVar;
                        this.b = crhpVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a(this.b);
                    }
                });
            }
        } else if (i != 1) {
            if (i != 2) {
                GmmCarProjectionStateEvent gmmCarProjectionStateEvent = (GmmCarProjectionStateEvent) obj;
                ((arzl) this.a).a.c.a();
                return;
            }
            arzl arzlVar2 = (arzl) this.a;
            ascc asccVar = (ascc) obj;
            arzn arznVar2 = arzlVar2.a;
            arznVar2.f = asccVar.e;
            arzg arzgVar2 = arznVar2.c;
            boolean z = asccVar.d;
            arzgVar2.i = z;
            if (z) {
                arzgVar2.j = 0L;
            }
            arzgVar2.a();
            arzn arznVar3 = arzlVar2.a;
            if (!arznVar3.f) {
                return;
            }
            arzs arzsVar = arznVar3.b;
            arzsVar.j.post(arzsVar.q);
        } else {
            cqzy cqzyVar = (cqzy) obj;
            arzg arzgVar3 = ((arzl) this.a).a.c;
            amut amutVar = cqzyVar.a;
            arzgVar3.f = amutVar;
            if (arzgVar3.i) {
                return;
            }
            if (amutVar.a != doxu.ACT && cqzyVar.a.a != doxu.PREPARE) {
                return;
            }
            arzgVar3.j = arzgVar3.a.e();
            arzgVar3.k = cqzyVar.a.a();
            if (((mwo) arzgVar3.d).a) {
                arzgVar3.a();
                return;
            }
            arzgVar3.b.q = true;
            arzgVar3.h = true;
            arzgVar3.a();
            arzgVar3.e.removeCallbacks(arzgVar3.l);
            arzgVar3.e.postDelayed(arzgVar3.l, 10000L);
            arzgVar3.e.removeCallbacks(arzgVar3.m);
            arzgVar3.e.postDelayed(arzgVar3.m, 1000L);
        }
    }
}
