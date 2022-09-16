package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: pph  reason: default package */
/* loaded from: classes4.dex */
public final class pph extends ppl {
    private final pqb d;
    private final long e;
    private final long f;
    private final ArrayList g;
    private final pks h;
    private ppf i;
    private ppg j;
    private long k;
    private long l;

    public pph(pqb pqbVar, long j, long j2) {
        ptx.c(j >= 0);
        this.d = pqbVar;
        this.e = j;
        this.f = j2;
        this.g = new ArrayList();
        this.h = new pks();
    }

    private final void A(pkt pktVar) {
        long j;
        pktVar.y(0, this.h);
        long j2 = this.h.q;
        long j3 = Long.MIN_VALUE;
        if (this.i == null || this.g.isEmpty()) {
            long j4 = this.e;
            long j5 = this.f;
            this.k = j2 + j4;
            if (j5 != Long.MIN_VALUE) {
                j3 = j2 + j5;
            }
            this.l = j3;
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                ((ppe) this.g.get(i)).n(this.k, this.l);
            }
            j = j4;
            j3 = j5;
        } else {
            long j6 = this.k - j2;
            if (this.f != Long.MIN_VALUE) {
                j3 = this.l - j2;
            }
            j = j6;
        }
        try {
            ppf ppfVar = new ppf(pktVar, j, j3);
            this.i = ppfVar;
            rF(ppfVar);
        } catch (ppg e) {
            this.j = e;
        }
    }

    @Override // defpackage.pqb
    public final pjc r() {
        return ((prb) this.d).d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl, defpackage.ppa
    public final void rA() {
        super.rA();
        this.j = null;
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl, defpackage.ppa
    public final void rz(atk atkVar) {
        super.rz(atkVar);
        x(null, this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl
    public final /* bridge */ /* synthetic */ void t(Object obj, pqb pqbVar, pkt pktVar) {
        Void r1 = (Void) obj;
        if (this.j != null) {
            return;
        }
        A(pktVar);
    }

    @Override // defpackage.pqb
    public final void u(ppy ppyVar) {
        ptx.e(this.g.remove(ppyVar));
        this.d.u(((ppe) ppyVar).a);
        if (this.g.isEmpty()) {
            ppf ppfVar = this.i;
            ptx.a(ppfVar);
            A(ppfVar.a);
        }
    }

    @Override // defpackage.pqb
    public final ppy v(ppz ppzVar, axf axfVar, long j) {
        ppe ppeVar = new ppe(this.d.v(ppzVar, axfVar, j), true, this.k, this.l);
        this.g.add(ppeVar);
        return ppeVar;
    }

    @Override // defpackage.ppl, defpackage.pqb
    public final void s() {
        ppg ppgVar = this.j;
        if (ppgVar != null) {
            throw ppgVar;
        }
        super.s();
    }
}
