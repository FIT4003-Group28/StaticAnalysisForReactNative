package defpackage;
/* compiled from: PG */
/* renamed from: aaue  reason: default package */
/* loaded from: classes.dex */
public class aaue extends aaqs {
    private final afvn a;
    public String c;

    /* JADX INFO: Access modifiers changed from: protected */
    public aaue(aaqf aaqfVar, afvn afvnVar) {
        super("channel_edit/update_channel_page_settings", aaqfVar, afvnVar.c());
        this.a = afvnVar;
        i();
    }

    @Override // defpackage.aaqs
    public /* bridge */ /* synthetic */ aoqt a() {
        throw null;
    }

    @Override // defpackage.aapd
    public void c() {
        aqxo.y(this.a.t());
        zgh.m(this.c);
    }

    public final aopa t() {
        aopa createBuilder = asem.a.createBuilder();
        String str = this.c;
        createBuilder.copyOnWrite();
        asem asemVar = (asem) createBuilder.instance;
        str.getClass();
        asemVar.b |= 2;
        asemVar.d = str;
        return createBuilder;
    }
}
