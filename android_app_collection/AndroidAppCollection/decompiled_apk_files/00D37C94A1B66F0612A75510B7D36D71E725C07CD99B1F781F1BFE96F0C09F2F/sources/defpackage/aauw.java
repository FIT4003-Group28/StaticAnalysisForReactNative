package defpackage;
/* compiled from: PG */
/* renamed from: aauw  reason: default package */
/* loaded from: classes.dex */
public final class aauw extends aaqs {
    public arnf a;
    public arnd b;

    public aauw(aaqf aaqfVar, afvm afvmVar) {
        super("share/send_share", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arnb.a.createBuilder();
        arnf arnfVar = this.a;
        if (arnfVar != null) {
            createBuilder.copyOnWrite();
            arnb arnbVar = (arnb) createBuilder.instance;
            arnbVar.e = arnfVar;
            arnbVar.b |= 16;
        }
        arnd arndVar = this.b;
        if (arndVar != null) {
            createBuilder.copyOnWrite();
            arnb arnbVar2 = (arnb) createBuilder.instance;
            arnbVar2.d = arndVar;
            arnbVar2.b |= 2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        aqxo.z(this.a != null, "Only ShareToContacts is allowed to have a missing SharedObjectParams!");
        if (this.b == null) {
            z = false;
        }
        aqxo.y(z);
    }
}
