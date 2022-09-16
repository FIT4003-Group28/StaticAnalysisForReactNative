package defpackage;
/* compiled from: PG */
/* renamed from: abfb  reason: default package */
/* loaded from: classes.dex */
public final class abfb extends aaqs {
    public String a;

    public abfb(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/get_offer_details", aaqfVar, afvmVar);
        this.a = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(((asgy) a().mo39build()).d);
    }

    @Override // defpackage.aaqs
    /* renamed from: t */
    public final aopa a() {
        aopa createBuilder = asgy.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asgy asgyVar = (asgy) createBuilder.instance;
        str.getClass();
        asgyVar.b |= 2;
        asgyVar.d = str;
        return createBuilder;
    }
}
