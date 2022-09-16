package defpackage;
/* compiled from: PG */
/* renamed from: abao  reason: default package */
/* loaded from: classes.dex */
public final class abao extends aaqs {
    public aoob a;

    public abao(aaqf aaqfVar, afvm afvmVar, aoob aoobVar) {
        super("live_chat/get_live_chat_super_sticker_buy_flow", aaqfVar, afvmVar);
        this.a = null;
        if (aoobVar != null) {
            j(aoobVar);
        } else {
            i();
        }
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arti.a.createBuilder();
        aoob aoobVar = this.a;
        if (aoobVar != null) {
            createBuilder.copyOnWrite();
            arti artiVar = (arti) createBuilder.instance;
            artiVar.b |= 2;
            artiVar.d = aoobVar;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
