package defpackage;
/* compiled from: PG */
/* renamed from: abaq  reason: default package */
/* loaded from: classes.dex */
public final class abaq extends aaqs {
    public aoob a;

    public abaq(aaqf aaqfVar, afvm afvmVar) {
        super("pdg/get_pdg_buy_flow", aaqfVar, afvmVar);
        this.a = null;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arto.a.createBuilder();
        aoob aoobVar = this.a;
        if (aoobVar != null) {
            createBuilder.copyOnWrite();
            arto artoVar = (arto) createBuilder.instance;
            artoVar.b |= 2;
            artoVar.d = aoobVar;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
