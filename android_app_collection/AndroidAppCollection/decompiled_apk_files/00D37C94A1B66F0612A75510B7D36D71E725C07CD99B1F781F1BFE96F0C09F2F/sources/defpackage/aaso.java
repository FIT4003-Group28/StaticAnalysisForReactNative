package defpackage;
/* compiled from: PG */
/* renamed from: aaso  reason: default package */
/* loaded from: classes.dex */
public final class aaso extends aaqs {
    public Long a;
    public String b;

    public aaso(aaqf aaqfVar, afvm afvmVar) {
        super("account/validate_verification_code", aaqfVar, afvmVar);
        i();
        this.i = true;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asfy.a.createBuilder();
        long longValue = this.a.longValue();
        createBuilder.copyOnWrite();
        asfy asfyVar = (asfy) createBuilder.instance;
        asfyVar.b |= 2;
        asfyVar.d = longValue;
        String str = this.b;
        createBuilder.copyOnWrite();
        asfy asfyVar2 = (asfy) createBuilder.instance;
        str.getClass();
        asfyVar2.b |= 4;
        asfyVar2.e = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
        zgh.m(this.b);
    }
}
