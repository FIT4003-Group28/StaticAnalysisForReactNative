package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dzd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzd implements aypv {
    public final /* synthetic */ dzs a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzd(dzs dzsVar) {
        this.a = dzsVar;
    }

    public /* synthetic */ dzd(dzs dzsVar, int i) {
        this.b = i;
        this.a = dzsVar;
    }

    @Override // defpackage.aypv
    public final void a() {
        switch (this.b) {
            case 0:
                ((agak) this.a.aM.get()).a();
                return;
            case 1:
                ((aggc) this.a.H.get()).b();
                return;
            case 2:
                ((xyt) this.a.W.get()).a();
                return;
            case 3:
                ((acrr) this.a.aF.get()).b();
                return;
            case 4:
                dzs dzsVar = this.a;
                ((dyz) dzsVar.bc).i(dzsVar.aL);
                return;
            case 5:
                ((gtu) this.a.f199J.get()).a();
                return;
            case 6:
                dzs dzsVar2 = this.a;
                if (!eog.aH((aacz) dzsVar2.at.get())) {
                    return;
                }
                ((grx) dzsVar2.aN.get()).a();
                return;
            case 7:
                dzs dzsVar3 = this.a;
                if (eog.bc((aacz) dzsVar3.at.get())) {
                    dzsVar3.aV.get();
                    return;
                } else {
                    ((Executor) dzsVar3.al.get()).execute(new dzo(dzsVar3, 9));
                    return;
                }
            case 8:
                ((fbj) this.a.N.get()).b();
                return;
            case 9:
                this.a.e(true);
                return;
            case 10:
                this.a.d(true);
                return;
            case 11:
                this.a.b(anjk.a);
                return;
            case 12:
                this.a.aS.get();
                return;
            case 13:
                ((jnp) this.a.O.get()).a();
                return;
            case 14:
                ((ite) this.a.e.get()).n();
                return;
            default:
                ((ajgq) this.a.aW.get()).b();
                return;
        }
    }
}
