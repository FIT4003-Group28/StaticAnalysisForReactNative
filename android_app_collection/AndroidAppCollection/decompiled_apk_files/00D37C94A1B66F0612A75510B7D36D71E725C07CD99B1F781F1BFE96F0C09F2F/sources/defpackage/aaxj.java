package defpackage;
/* compiled from: PG */
/* renamed from: aaxj  reason: default package */
/* loaded from: classes.dex */
public final class aaxj extends aaqs {
    public String a;
    public String b;

    public aaxj(aaqf aaqfVar, afvm afvmVar) {
        super("kids/get_share_with_kids_picker", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = ardo.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        ardo ardoVar = (ardo) createBuilder.instance;
        str.getClass();
        ardoVar.b |= 2;
        ardoVar.d = str;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        ardo ardoVar2 = (ardo) createBuilder.instance;
        str2.getClass();
        ardoVar2.b |= 4;
        ardoVar2.e = str2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
        this.b.getClass();
    }
}
