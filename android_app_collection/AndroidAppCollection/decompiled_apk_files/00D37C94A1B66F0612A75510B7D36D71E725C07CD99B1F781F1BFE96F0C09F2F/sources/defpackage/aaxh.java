package defpackage;
/* compiled from: PG */
/* renamed from: aaxh  reason: default package */
/* loaded from: classes.dex */
public final class aaxh extends aaqs {
    public arvh a;
    public String b;

    public aaxh(aaqf aaqfVar, afvm afvmVar) {
        super("kids/get_kids_blocklist_picker", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = ardk.a.createBuilder();
        arvh arvhVar = this.a;
        createBuilder.copyOnWrite();
        ardk ardkVar = (ardk) createBuilder.instance;
        arvhVar.getClass();
        ardkVar.d = arvhVar;
        ardkVar.b |= 2;
        String str = this.b;
        createBuilder.copyOnWrite();
        ardk ardkVar2 = (ardk) createBuilder.instance;
        str.getClass();
        ardkVar2.b |= 4;
        ardkVar2.e = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
        this.b.getClass();
    }
}
