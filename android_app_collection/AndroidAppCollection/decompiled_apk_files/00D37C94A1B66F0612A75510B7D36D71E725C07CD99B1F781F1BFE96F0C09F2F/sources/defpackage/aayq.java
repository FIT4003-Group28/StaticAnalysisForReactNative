package defpackage;
/* compiled from: PG */
/* renamed from: aayq  reason: default package */
/* loaded from: classes.dex */
public final class aayq extends aaqs {
    public asqk a;
    private String b;

    public aayq(aaqf aaqfVar, afvm afvmVar) {
        super("live_chat/get_live_chat_replay", aaqfVar, afvmVar);
        this.b = "";
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arwa.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        arwa arwaVar = (arwa) createBuilder.instance;
        str.getClass();
        arwaVar.b |= 4;
        arwaVar.d = str;
        asqk asqkVar = this.a;
        if (asqkVar != null) {
            createBuilder.copyOnWrite();
            arwa arwaVar2 = (arwa) createBuilder.instance;
            arwaVar2.e = asqkVar;
            arwaVar2.b |= 8;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }

    public final void t(ajfz ajfzVar) {
        this.b = g(ajfzVar.b());
        k(ajfzVar.d());
    }
}
