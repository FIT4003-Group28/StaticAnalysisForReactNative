package defpackage;
/* compiled from: PG */
/* renamed from: aayp  reason: default package */
/* loaded from: classes.dex */
public final class aayp extends aaqs {
    public aoob a;
    public assu b;

    public aayp(aaqf aaqfVar, afvm afvmVar) {
        super("live_chat/get_live_chat_message_buy_flow", aaqfVar, afvmVar);
        this.a = aoob.b;
        this.b = null;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arvx.a.createBuilder();
        aoob aoobVar = this.a;
        createBuilder.copyOnWrite();
        arvx arvxVar = (arvx) createBuilder.instance;
        aoobVar.getClass();
        arvxVar.b |= 2;
        arvxVar.d = aoobVar;
        assu assuVar = this.b;
        if (assuVar != null) {
            createBuilder.copyOnWrite();
            arvx arvxVar2 = (arvx) createBuilder.instance;
            arvxVar2.e = assuVar;
            arvxVar2.b |= 4;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
