package defpackage;
/* compiled from: PG */
/* renamed from: aaym  reason: default package */
/* loaded from: classes.dex */
public final class aaym extends aaqs {
    public String a;

    public aaym(aaqf aaqfVar, afvm afvmVar) {
        super("live/update_broadcast_participant", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asef.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            asef asefVar = (asef) createBuilder.instance;
            asefVar.b |= 2;
            asefVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
