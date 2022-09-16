package defpackage;
/* compiled from: PG */
/* renamed from: aavj  reason: default package */
/* loaded from: classes.dex */
public final class aavj extends aaqs {
    public String a;
    private String b;

    public aavj(aaqf aaqfVar, afvm afvmVar) {
        super("comment/update_comment_reply", aaqfVar, afvmVar);
        this.a = "";
        this.b = "";
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = aroc.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aroc arocVar = (aroc) createBuilder.instance;
        str.getClass();
        arocVar.b |= 2;
        arocVar.d = str;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        aroc arocVar2 = (aroc) createBuilder.instance;
        str2.getClass();
        arocVar2.b |= 4;
        arocVar2.e = str2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.a);
        zgh.m(this.b);
    }

    public final void t(String str) {
        this.b = g(str);
    }
}
