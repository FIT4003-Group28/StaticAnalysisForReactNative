package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: thw  reason: default package */
/* loaded from: classes7.dex */
public final class thw implements tgo {
    public final tmb a;
    public final xcs b;
    @dzsi
    public cryz<Map<qdv, dopk>> c;
    private final qdx d;
    private final vwv e;
    private final Executor f;
    private final AtomicBoolean g = new AtomicBoolean(false);

    public thw(tmb tmbVar, qdx qdxVar, xcs xcsVar, vwv vwvVar, Executor executor) {
        this.a = tmbVar;
        this.d = qdxVar;
        this.b = xcsVar;
        this.e = vwvVar;
        this.f = executor;
    }

    @Override // defpackage.tgo
    public final dehn<Boolean> a(btlu btluVar, amsy amsyVar, int i, boolean z, boolean z2, boolean z3) {
        dcdc<qdv> b;
        cryz<Map<qdv, dopk>> cryzVar = this.c;
        if (cryzVar != null && !cryzVar.d()) {
            this.c.c();
            this.c = null;
        }
        boolean z4 = true;
        boolean z5 = z && this.e.d();
        if (z) {
            b = zat.a(amsyVar.m(i), amsyVar.F(), z5);
        } else {
            b = zat.b(amsyVar, amsyVar.F(), z5);
        }
        if (b.isEmpty()) {
            return deha.a(false);
        }
        deig d = deig.d();
        if (!z3 || (!this.g.getAndSet(false) && !z2)) {
            z4 = false;
        }
        this.c = new cryz<>(new thv(this, btluVar, z5, d));
        dehn<Map<qdv, dopk>> b2 = this.d.b(b, z4);
        cryz<Map<qdv, dopk>> cryzVar2 = this.c;
        dbsk.s(cryzVar2);
        deha.q(b2, cryzVar2, this.f);
        return d;
    }

    @Override // defpackage.tgo
    public final void b() {
        cryz<Map<qdv, dopk>> cryzVar = this.c;
        if (cryzVar == null || cryzVar.d()) {
            return;
        }
        this.c.c();
        this.c = null;
    }
}
