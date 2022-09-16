package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wsb  reason: default package */
/* loaded from: classes7.dex */
public final class wsb implements degu<dopk> {
    final /* synthetic */ wsc a;
    @dzsi
    private final Set<qdi> b;

    public wsb(wsc wscVar) {
        this.a = wscVar;
        this.b = null;
    }

    public wsb(@dzsi wsc wscVar, Set<qdi> set) {
        this.a = wscVar;
        this.b = set;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.T(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dopk dopkVar) {
        dopk dopkVar2 = dopkVar;
        if (dopkVar2 != null) {
            ckcq ckcqVar = this.a.c;
            if (ckcqVar != null) {
                ckcqVar.b();
                this.a.c = null;
            }
            this.a.g.a(xcs.b(dcdc.f(dopkVar2)), ckkm.A, ckkm.B);
            wsc wscVar = this.a;
            Set<qdi> set = this.b;
            wscVar.i.e();
            wscVar.s = false;
            long e = wscVar.e();
            if (!wscVar.q) {
                wscVar.J(dopkVar2, set, true);
            } else {
                wscVar.l = wse.a(dopkVar2);
                if (set != null) {
                    wscVar.N(dopkVar2, set, true);
                }
            }
            if (e != wscVar.e()) {
                wscVar.c();
            }
            wscVar.o = wscVar.U(ckkl.LOADED_STATION);
            cqkx.p(wscVar);
        } else {
            a(new NullPointerException());
        }
        this.a.u = null;
    }
}
