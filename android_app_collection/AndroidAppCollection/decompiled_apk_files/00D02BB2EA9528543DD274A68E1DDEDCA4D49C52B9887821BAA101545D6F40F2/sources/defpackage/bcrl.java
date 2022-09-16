package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bcrl  reason: default package */
/* loaded from: classes3.dex */
public final class bcrl implements bcrt {
    public final gfw a;
    public final dxio<akfa> b;
    public final akfc c;
    private final boolean d;
    private final bbuu e;
    private final bdfc f;
    private final dxio<bvan> g;
    private final Executor h;

    public bcrl(dxio<akfa> dxioVar, akfc akfcVar, bdfc bdfcVar, dxio<bvan> dxioVar2, Executor executor, bbuu bbuuVar, boolean z, gfw gfwVar) {
        this.d = z;
        this.e = bbuuVar;
        this.a = gfwVar;
        this.b = dxioVar;
        this.c = akfcVar;
        this.f = bdfcVar;
        this.g = dxioVar2;
        this.h = executor;
    }

    @Override // defpackage.bcrt
    @dzsi
    public final bdax a(dwfl dwflVar, int i) {
        if (!this.d || this.e.a(dwflVar) == null) {
            return null;
        }
        bdfc bdfcVar = this.f;
        boolean z = this.d;
        Resources a = bdfcVar.a.a();
        bdfc.a(a, 1);
        bbuu a2 = bdfcVar.b.a();
        bdfc.a(a2, 2);
        bdfc.a(this, 4);
        bdfc.a(dwflVar, 5);
        return new bdfb(a, a2, z, this, dwflVar, i);
    }

    public final void b(dwfl dwflVar, int i, dqjh dqjhVar) {
        dqjh b = dqjh.b(this.e.a(dwflVar).c);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        dpsn dpsnVar = dwflVar.t;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        long j = dpsnVar.b;
        dpsn dpsnVar2 = dwflVar.t;
        if (dpsnVar2 == null) {
            dpsnVar2 = dpsn.d;
        }
        String o = new akqi(j, dpsnVar2.c).o();
        dizq bZ = dizr.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dizr dizrVar = (dizr) bZ.b;
        dizrVar.d = dqjhVar.e;
        dizrVar.a |= 4;
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dggg dgggVar = dizhVar.b;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dizr dizrVar2 = (dizr) bZ.b;
        dgggVar.getClass();
        dizrVar2.b = dgggVar;
        int i2 = dizrVar2.a | 1;
        dizrVar2.a = i2;
        int i3 = i2 | 2;
        dizrVar2.a = i3;
        dizrVar2.c = i;
        o.getClass();
        dizrVar2.a = i3 | 8;
        dizrVar2.e = o;
        this.a.Qn(bdvs.c(dwflVar.d, dqjhVar));
        this.g.a().b(bZ.bK(), new bcrk(this, dwflVar, b), this.h);
    }
}
