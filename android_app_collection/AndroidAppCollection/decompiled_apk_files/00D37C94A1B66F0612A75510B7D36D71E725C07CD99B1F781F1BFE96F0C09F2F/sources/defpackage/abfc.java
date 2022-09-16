package defpackage;
/* compiled from: PG */
/* renamed from: abfc  reason: default package */
/* loaded from: classes.dex */
public final class abfc extends aaqs {
    public String a;

    public abfc(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/get_tip_module", aaqfVar, afvmVar);
        this.a = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(((ashs) a().mo39build()).d);
    }

    @Override // defpackage.aaqs
    /* renamed from: t */
    public final aopa a() {
        aopa createBuilder = ashs.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        ashs ashsVar = (ashs) createBuilder.instance;
        str.getClass();
        ashsVar.b |= 2;
        ashsVar.d = str;
        return createBuilder;
    }
}
