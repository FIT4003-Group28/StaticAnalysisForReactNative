package defpackage;
/* compiled from: PG */
/* renamed from: aasg  reason: default package */
/* loaded from: classes.dex */
public final class aasg extends aaqs {
    private final artq a;

    public aasg(aaqf aaqfVar, afvm afvmVar, String str, String str2, String str3) {
        super("account/get_profile_card", aaqfVar, afvmVar);
        aopa createBuilder = artq.a.createBuilder();
        createBuilder.copyOnWrite();
        artq artqVar = (artq) createBuilder.instance;
        str.getClass();
        artqVar.b |= 2;
        artqVar.d = str;
        createBuilder.copyOnWrite();
        artq artqVar2 = (artq) createBuilder.instance;
        str2.getClass();
        artqVar2.b |= 4;
        artqVar2.e = str2;
        if (str3 != null) {
            createBuilder.copyOnWrite();
            artq artqVar3 = (artq) createBuilder.instance;
            artqVar3.b |= 8;
            artqVar3.f = str3;
        }
        this.a = (artq) createBuilder.mo39build();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        return this.a.mo52toBuilder();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
