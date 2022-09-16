package defpackage;
/* compiled from: PG */
/* renamed from: aaxz  reason: default package */
/* loaded from: classes.dex */
public final class aaxz extends aaqs {
    public String a;

    public aaxz(aaqf aaqfVar, afvm afvmVar) {
        super("live/add_broadcast_participant", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arks.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            arks arksVar = (arks) createBuilder.instance;
            arksVar.b |= 2;
            arksVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
