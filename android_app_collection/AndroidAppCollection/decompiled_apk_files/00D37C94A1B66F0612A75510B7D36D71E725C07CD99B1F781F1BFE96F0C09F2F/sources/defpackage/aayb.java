package defpackage;
/* compiled from: PG */
/* renamed from: aayb  reason: default package */
/* loaded from: classes.dex */
public final class aayb extends aaqs {
    public String a;

    public aayb(aaqf aaqfVar, afvm afvmVar) {
        super("live/get_broadcast_participant_setup", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arsf.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            arsf arsfVar = (arsf) createBuilder.instance;
            arsfVar.b |= 2;
            arsfVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
