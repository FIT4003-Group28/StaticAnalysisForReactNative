package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqbn  reason: default package */
/* loaded from: classes2.dex */
public final class aqbn implements bvqg, degu {
    private final ckcw a;
    private final bvjj b;
    private final WeakReference<aqbo> c;

    public aqbn(ckcw ckcwVar, bvjj bvjjVar, aqbo aqboVar) {
        this.a = ckcwVar;
        this.b = bvjjVar;
        this.c = new WeakReference<>(aqboVar);
    }

    @Override // defpackage.bvqg
    public final /* bridge */ /* synthetic */ void NU(Object obj) {
        dcdc dcdcVar = (dcdc) obj;
        final aqbo aqboVar = this.c.get();
        if (aqboVar == null) {
            return;
        }
        deha.q(deha.j(dcbg.b(dcdcVar).o(aqbl.a).s(new dbrn(aqboVar) { // from class: aqbm
            private final aqbo a;

            {
                this.a = aqboVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj2) {
                return deew.g(this.a.c((ctyy) obj2), aqbk.a, dege.a);
            }
        }).z()), this, dege.a);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ((ckcm) this.a.a(ckgs.O)).a(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        this.b.S(bvjk.jv, true);
        ((ckcm) this.a.a(ckgs.O)).a(true);
    }
}
