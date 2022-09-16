package defpackage;
/* compiled from: PG */
/* renamed from: wvh  reason: default package */
/* loaded from: classes4.dex */
public final class wvh implements wvs {
    public final azqb a;
    public final xei b = new xei();

    public wvh(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.b.e(xekVar.c())) {
            String valueOf = String.valueOf(xekVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wuq(sb.toString());
        } else if (!(xekVar instanceof xdh)) {
            String valueOf2 = String.valueOf(xekVar.b());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(valueOf2);
            sb2.append(" in InterruptCanceledTriggerAdapter");
            throw new wuq(sb2.toString());
        } else {
            this.b.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.b.b(xekVar.c());
    }
}
