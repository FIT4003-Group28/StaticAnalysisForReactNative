package defpackage;
/* compiled from: PG */
/* renamed from: wvq  reason: default package */
/* loaded from: classes4.dex */
public final class wvq implements wvs {
    public final azqb a;
    public final azqb b;
    public final xei c = new xei();

    public wvq(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar3;
        ((wnk) azqbVar2.get()).b(this);
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.c.e(xekVar.c())) {
            String valueOf = String.valueOf(xekVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wuq(sb.toString());
        } else if (!(xekVar instanceof xed)) {
            String valueOf2 = String.valueOf(xekVar.b());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 82);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(valueOf2);
            sb2.append(" in SurveySubmittedTriggerAdapter");
            throw new wuq(sb2.toString());
        } else {
            this.c.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.c.b(xekVar.c());
    }
}
