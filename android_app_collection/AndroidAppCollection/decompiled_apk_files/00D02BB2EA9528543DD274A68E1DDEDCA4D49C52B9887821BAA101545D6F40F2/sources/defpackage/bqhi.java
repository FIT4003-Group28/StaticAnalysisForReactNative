package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqhi  reason: default package */
/* loaded from: classes4.dex */
public final class bqhi extends bqgo {
    @Override // defpackage.bqgo
    public final void d(bqhj bqhjVar, bqhs bqhsVar) {
        dpum h = bqhjVar.a().h();
        if (bqhsVar.c) {
            bqhsVar.bF();
            bqhsVar.c = false;
        }
        bqhu bqhuVar = (bqhu) bqhsVar.b;
        bqhu bqhuVar2 = bqhu.f;
        h.getClass();
        bqhuVar.d = h;
        bqhuVar.a |= 1;
    }

    @Override // defpackage.bqgo
    public final void e(bqhj bqhjVar, bqhs bqhsVar) {
        if (bqhjVar.b().a()) {
            long longValue = bqhjVar.b().b().longValue();
            if (bqhsVar.c) {
                bqhsVar.bF();
                bqhsVar.c = false;
            }
            bqhu bqhuVar = (bqhu) bqhsVar.b;
            bqhu bqhuVar2 = bqhu.f;
            bqhuVar.b = 3;
            bqhuVar.c = Long.valueOf(longValue);
        }
    }

    @Override // defpackage.bqgo
    public final void f(bqhj bqhjVar, bqhs bqhsVar) {
        if (bqhjVar.d().a()) {
            bqhr b = bqhjVar.d().b();
            if (bqhsVar.c) {
                bqhsVar.bF();
                bqhsVar.c = false;
            }
            bqhu bqhuVar = (bqhu) bqhsVar.b;
            bqhu bqhuVar2 = bqhu.f;
            b.getClass();
            bqhuVar.c = b;
            bqhuVar.b = 4;
        }
    }

    @Override // defpackage.bqgo
    public final void g(bqhu bqhuVar, bqhh bqhhVar) {
        dpum dpumVar = bqhuVar.d;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        bqhhVar.c(akqq.f(dpumVar));
    }

    @Override // defpackage.bqgo
    public final void h(bqhu bqhuVar, bqhh bqhhVar) {
        if (bqhuVar.b == 3) {
            bqhhVar.d(((Long) bqhuVar.c).longValue());
        }
    }

    @Override // defpackage.bqgo
    public final void i(bqhu bqhuVar, bqhh bqhhVar) {
        if (bqhuVar.b == 4) {
            bqhhVar.e((bqhr) bqhuVar.c);
        }
    }
}
