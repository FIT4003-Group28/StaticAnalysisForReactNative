package defpackage;
/* compiled from: PG */
/* renamed from: aben  reason: default package */
/* loaded from: classes.dex */
public final class aben extends aaqs {
    public String a;

    public aben(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/get_offline_upsell", aaqfVar, afvmVar);
        this.a = "";
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asha.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asha ashaVar = (asha) createBuilder.instance;
        str.getClass();
        ashaVar.b |= 2;
        ashaVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.a);
    }
}
