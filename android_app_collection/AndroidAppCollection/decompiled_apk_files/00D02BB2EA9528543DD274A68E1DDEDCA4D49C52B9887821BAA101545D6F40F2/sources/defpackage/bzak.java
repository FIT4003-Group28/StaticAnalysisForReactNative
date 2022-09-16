package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzak  reason: default package */
/* loaded from: classes4.dex */
public final class bzak implements bzch {
    private final bzcb a;

    public bzak(bzcb bzcbVar) {
        this.a = bzcbVar;
    }

    @Override // defpackage.bzch
    public final void a(Intent intent) {
        if (bzaj.f(intent)) {
            bzcb bzcbVar = this.a;
            final int h = bzaj.h(intent);
            int c = bzaj.c(intent);
            final byzg b = bzaj.b(intent);
            bzem bzemVar = bzcbVar.c;
            if (bzemVar == null) {
                return;
            }
            final bzfg bzfgVar = (bzfg) bzemVar;
            final bzdg b2 = bzdg.b(bzfgVar.k(), c, bzfgVar.o.f, bzfgVar.z);
            if (c > 0) {
                if (b == byzg.WALK) {
                    b2 = b2.B();
                } else if (b == byzg.ARRIVE) {
                    b2 = b2.B();
                    if (!b2.D()) {
                        b2 = b2.B();
                    }
                }
            }
            bzfgVar.p(new Runnable(bzfgVar, h, b2, b) { // from class: bzeq
                private final bzfg a;
                private final bzdg b;
                private final byzg c;
                private final int d;

                {
                    this.a = bzfgVar;
                    this.d = h;
                    this.b = b2;
                    this.c = b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byzg byzgVar;
                    byzh byzhVar;
                    bzfg bzfgVar2 = this.a;
                    int i = this.d;
                    bzdg bzdgVar = this.b;
                    byzg byzgVar2 = this.c;
                    bzaf bzafVar = bzfgVar2.e;
                    bzel.a();
                    boolean z = true;
                    if (i - 1 != 0) {
                        byzi byziVar = bzafVar.d;
                        if (bzdgVar.E() && byzgVar2 != byzg.RIDE && byzgVar2 != byzg.WALK) {
                            z = false;
                        }
                        dbsk.a(z);
                        if (byzgVar2 != byzg.RIDE && byzgVar2 != byzg.GET_OFF && (!bzdgVar.E() || byzgVar2 != byzg.WALK)) {
                            bzdgVar = bzdgVar.C();
                        }
                        byzhVar = new byzh(bzdgVar, bzdgVar.c() == dqvj.TRANSIT ? (byzgVar2 == byzg.RIDE || byzgVar2 == byzg.GET_OFF) ? byzg.TAKE : byzg.RIDE : byzg.WALK);
                    } else {
                        byzi byziVar2 = bzafVar.d;
                        dbsk.a(!bzdgVar.D());
                        if (byzgVar2 != byzg.TAKE) {
                            bzdgVar = bzdgVar.B();
                        }
                        if (bzdgVar.c() != dqvj.TRANSIT) {
                            byzgVar = bzdgVar.D() ? byzg.ARRIVE : byzg.WALK;
                        } else {
                            byzgVar = byzgVar2 == byzg.TAKE ? byzg.RIDE : byzg.TAKE;
                        }
                        byzhVar = new byzh(bzdgVar, byzgVar);
                    }
                    if (bzafVar.b(byzhVar)) {
                        bzafVar.i = new bzae(byzhVar);
                    }
                }
            });
        } else if (!bzaj.e(intent)) {
        } else {
            this.a.f(bzdd.b);
        }
    }

    @Override // defpackage.bzch
    public final boolean b(Intent intent) {
        return bzaj.d(intent);
    }
}
