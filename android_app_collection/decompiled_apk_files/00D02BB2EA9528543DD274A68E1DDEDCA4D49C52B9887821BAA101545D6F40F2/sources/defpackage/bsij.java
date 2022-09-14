package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bsij  reason: default package */
/* loaded from: classes4.dex */
final class bsij implements ikd {
    final /* synthetic */ bsim a;

    public bsij(bsim bsimVar) {
        this.a = bsimVar;
    }

    @Override // defpackage.ikd
    public final void a(int i, int i2, boolean z) {
        if (!z) {
            return;
        }
        this.a.a = Integer.valueOf(i);
        this.a.b = Integer.valueOf(i2);
        cqkx.p(this.a);
    }

    @Override // defpackage.ikd
    public final void b(ikc ikcVar) {
        int ordinal = ikcVar.ordinal();
        if (ordinal == 0) {
            bsim bsimVar = this.a;
            cjql cjqlVar = bsimVar.d;
            if (cjqlVar != null) {
                bsimVar.g.n(cjqlVar, new cjte(deaf.DRAG), bsim.v());
            } else {
                dcqe.b.u(TimeUnit.MINUTES);
            }
        } else if (ordinal != 1) {
        } else {
            bsim bsimVar2 = this.a;
            cjql cjqlVar2 = bsimVar2.e;
            if (cjqlVar2 != null) {
                bsimVar2.g.n(cjqlVar2, new cjte(deaf.DRAG), bsim.w());
            } else {
                dcqe.b.u(TimeUnit.MINUTES);
            }
        }
    }
}
