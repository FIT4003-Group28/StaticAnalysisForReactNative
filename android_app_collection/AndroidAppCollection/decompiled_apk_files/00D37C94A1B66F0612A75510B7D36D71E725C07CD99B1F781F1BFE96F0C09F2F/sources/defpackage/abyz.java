package defpackage;
/* compiled from: PG */
/* renamed from: abyz  reason: default package */
/* loaded from: classes.dex */
public final class abyz extends aaqs {
    private final aopa a;

    public abyz(aaqf aaqfVar, afvm afvmVar, String str) {
        super("gaming/game_by_package_id", aaqfVar, afvmVar, 3);
        aopa createBuilder = arbo.a.createBuilder();
        createBuilder.copyOnWrite();
        arbo arboVar = (arbo) createBuilder.instance;
        arboVar.b |= 2;
        arboVar.d = str;
        this.a = createBuilder;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y((((arbo) this.a.instance).b & 2) != 0);
    }
}
