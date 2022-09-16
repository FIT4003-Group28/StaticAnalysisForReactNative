package defpackage;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bssc  reason: default package */
/* loaded from: classes4.dex */
final class bssc extends cqqw {
    final /* synthetic */ bsse a;

    public bssc(bsse bsseVar) {
        this.a = bsseVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        final bsse bsseVar = this.a;
        bsseVar.R = recyclerView;
        if (i2 == 0) {
            return;
        }
        if (bsseVar.Q == null) {
            bsseVar.Q = bsseVar.F.a(bsseVar.M, new Runnable(bsseVar) { // from class: bsrw
                private final bsse a;

                {
                    this.a = bsseVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bsse bsseVar2 = this.a;
                    if (bsseVar2.O == 0) {
                        return;
                    }
                    bsseVar2.B();
                }
            });
        }
        int abs = bsseVar.O + Math.abs(i2);
        bsseVar.O = abs;
        bsseVar.P += i2;
        if (bsseVar.N) {
            new Handler().post(new Runnable(bsseVar) { // from class: bsrx
                private final bsse a;

                {
                    this.a = bsseVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    brcj brcjVar;
                    bsse bsseVar2 = this.a;
                    bsseVar2.A(ckjw.D);
                    bqze bqzeVar = bsseVar2.S;
                    if (bqzeVar != null) {
                        cjqm B = bsseVar2.B();
                        bqzm bqzmVar = bqzeVar.a;
                        if (!bqzmVar.aD || (brcjVar = bqzmVar.bj) == null) {
                            return;
                        }
                        brcjVar.g(B);
                    }
                }
            });
            bsseVar.N = false;
        } else if (jmj.e(bsseVar.x, abs) <= 100) {
        } else {
            bvpy bvpyVar = bsseVar.Q;
            dbsk.s(bvpyVar);
            bvpyVar.a(1000L);
        }
    }
}
