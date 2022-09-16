package defpackage;
/* compiled from: PG */
/* renamed from: abae  reason: default package */
/* loaded from: classes.dex */
public final class abae extends aaqs {
    public byte[] a;

    public abae(aaqf aaqfVar, afvm afvmVar) {
        super("notification/record_interactions", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = aryi.a.createBuilder();
        aoob x = aoob.x(this.a);
        createBuilder.copyOnWrite();
        aryi aryiVar = (aryi) createBuilder.instance;
        aryiVar.b |= 2;
        aryiVar.d = x;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
    }
}
