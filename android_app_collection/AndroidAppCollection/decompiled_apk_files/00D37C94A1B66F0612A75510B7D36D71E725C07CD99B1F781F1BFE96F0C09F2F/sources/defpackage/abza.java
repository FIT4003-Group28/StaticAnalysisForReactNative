package defpackage;
/* compiled from: PG */
/* renamed from: abza  reason: default package */
/* loaded from: classes.dex */
public final class abza extends aaqs {
    private final aopa a;

    public abza(aaqf aaqfVar, afvm afvmVar, String str) {
        super("gaming/game_title", aaqfVar, afvmVar, 3);
        aopa createBuilder = arbu.a.createBuilder();
        createBuilder.copyOnWrite();
        arbu arbuVar = (arbu) createBuilder.instance;
        str.getClass();
        arbuVar.b |= 2;
        arbuVar.d = str;
        this.a = createBuilder;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y((((arbu) this.a.instance).b & 2) != 0);
    }
}
