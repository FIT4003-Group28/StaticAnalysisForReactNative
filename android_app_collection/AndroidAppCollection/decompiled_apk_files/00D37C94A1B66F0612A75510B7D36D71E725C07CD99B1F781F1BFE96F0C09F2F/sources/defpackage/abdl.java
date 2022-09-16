package defpackage;
/* compiled from: PG */
/* renamed from: abdl  reason: default package */
/* loaded from: classes.dex */
public final class abdl extends aaqs {
    public asdu a;
    public int b;

    public abdl(aaqf aaqfVar, afvm afvmVar) {
        super("get_survey", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asdv.a.createBuilder();
        asdu asduVar = this.a;
        createBuilder.copyOnWrite();
        asdv asdvVar = (asdv) createBuilder.instance;
        asduVar.getClass();
        asdvVar.d = asduVar;
        asdvVar.b |= 2;
        int i = this.b;
        createBuilder.copyOnWrite();
        asdv asdvVar2 = (asdv) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            asdvVar2.e = i2;
            asdvVar2.b |= 4;
            return createBuilder;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
    }
}
