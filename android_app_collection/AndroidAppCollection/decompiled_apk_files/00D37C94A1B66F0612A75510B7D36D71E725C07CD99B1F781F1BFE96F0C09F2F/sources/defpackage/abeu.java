package defpackage;
/* compiled from: PG */
/* renamed from: abeu  reason: default package */
/* loaded from: classes.dex */
public final class abeu extends aaqs {
    public String a;
    public long b;

    public abeu(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/pause_subscription", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = aryt.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aryt arytVar = (aryt) createBuilder.instance;
        str.getClass();
        arytVar.b |= 2;
        arytVar.d = str;
        long j = this.b;
        createBuilder.copyOnWrite();
        aryt arytVar2 = (aryt) createBuilder.instance;
        arytVar2.b |= 4;
        arytVar2.e = j;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
        aqxo.z(this.b > 0, "resume time must be specified");
    }
}
